package inf.san.mcm.db.update.service.impl;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import inf.san.mcm.db.update.mapper.row.SetsDbRowMapper;
import inf.san.mcm.db.update.mapper.row.TokenDbRowMapper;
import inf.san.mcm.db.update.model.SetsDb;
import inf.san.mcm.db.update.model.TokensDb;
import inf.san.mcm.db.update.model.queries.DbUpdateSetsQueries;
import inf.san.mcm.db.update.model.queries.DbUpdateTokenQueries;
import inf.san.mcm.db.update.service.IAdministrationService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class AdministrationServiceImpl implements IAdministrationService {
	
	private final JdbcTemplate masterJdbcTemplate;
	
	private final JdbcTemplate liveJdbcTemplate;
	
	private final String masterDownloadUrl;
	
	private final String masterFullPath;
	
	public AdministrationServiceImpl(@Qualifier("masterJdbcTemplate") JdbcTemplate masterJdbcTemplate, 
			@Qualifier("liveJdbcTemplate") JdbcTemplate liveJdbcTemplate, @Value("${db.update.master.dl.url}") String masterDownloadUrl, 
			@Value("${db.update.master.fullpath}") String masterFullPath) {
		this.masterJdbcTemplate = masterJdbcTemplate;
		this.liveJdbcTemplate = liveJdbcTemplate;
		this.masterDownloadUrl = masterDownloadUrl;
		this.masterFullPath = masterFullPath;
	}

	@Override
	@Transactional
	public void updateDataBase() {
		//downloadNewMaster(); FIXME décommenter une fois les tests terminés.
		updateSets();
		updateSetsBoosterSheets();
		updateSetsBoosterSheetCards();
		updateSetsBoosterContentWeights();
		updateSetsBoosterContents();
		updateTokens();
		updateMeta();
		updateCards();
		updateCardRulings();
		updateCardPurchaseUrls();
		updateCardLegalities();
		updateCardIdentifiers();
		updateCardForeignData();
	}
	
	private void updateCardForeignData() {
		// TODO Auto-generated method stub
		
	}

	private void updateCardIdentifiers() {
		// TODO Auto-generated method stub
		
	}

	private void updateCardLegalities() {
		// TODO Auto-generated method stub
		
	}

	private void updateCardPurchaseUrls() {
		// TODO Auto-generated method stub
		
	}

	private void updateCardRulings() {
		// TODO Auto-generated method stub
		
	}

	private void updateCards() {
		// TODO Auto-generated method stub
		
	}

	private void updateMeta() {
		// TODO Auto-generated method stub
		
	}

	private void updateTokens() {
		try (Stream<TokensDb> tokensStream = masterJdbcTemplate.queryForStream(DbUpdateTokenQueries.SELECT, new TokenDbRowMapper())) {
			tokensStream.forEach(tokenDb -> {
				if (liveJdbcTemplate.queryForObject(DbUpdateTokenQueries.EXISTS_BY_UUID, Boolean.class, tokenDb.getUuid())) {
					log.info("Mise à jour du token uuid = {}", tokenDb.getUuid());
					liveJdbcTemplate.update(DbUpdateTokenQueries.UPDATE, tokenDb.forUpdate());
				} else {
					log.info("Création d'un nouveau token avec uuid = {}", tokenDb.getUuid());
					liveJdbcTemplate.update(DbUpdateTokenQueries.INSERT, tokenDb.forInsert());
				}
			});
		}
		
		// Suppression des tokens n'existant plus dans le master
		for (String uuid : liveJdbcTemplate.queryForList(DbUpdateTokenQueries.SELECT_UUID, String.class)) {
			if (!masterJdbcTemplate.queryForObject(DbUpdateTokenQueries.EXISTS_BY_UUID, Boolean.class, uuid)) {
				log.info("Token avec uuid = {} n'existe plus dans la base master, suppression du token et des ses relations.", uuid);
				liveJdbcTemplate.update(DbUpdateTokenQueries.DELETE, uuid);
				liveJdbcTemplate.update(DbUpdateTokenQueries.DELETE_TOKEN_IDENTIFIERS, uuid);
			}
		}
		
		// FIXME Mise à jour des tokens identifiers ici
		
	}

	private void updateSetsBoosterContents() {
		// TODO Auto-generated method stub
		
	}

	private void updateSetsBoosterContentWeights() {
		// TODO Auto-generated method stub
		
	}

	private void updateSetsBoosterSheetCards() {
		// TODO Auto-generated method stub
		
	}

	private void updateSetsBoosterSheets() {
		// TODO Auto-generated method stub
		
	}

	private void downloadNewMaster() {
		try (InputStream in = new URL(this.masterDownloadUrl).openStream()) {
			Files.copy(in, Paths.get(masterFullPath), StandardCopyOption.REPLACE_EXISTING);
		} catch (MalformedURLException e) {
			throw new IllegalStateException(e);
		} catch (IOException e) {
			throw new IllegalStateException(e);
		}
	}

	private void updateSets() {
		try (Stream<SetsDb> setsStream = masterJdbcTemplate.queryForStream(DbUpdateSetsQueries.SELECT, new SetsDbRowMapper())) {
			setsStream.forEach(setsDb -> {
				if (liveJdbcTemplate.queryForObject(DbUpdateSetsQueries.EXISTS_BY_CODE, Boolean.class, setsDb.getCode())) {
					log.info("Mise à jour du sets code = {}", setsDb.getCode());
					liveJdbcTemplate.update(DbUpdateSetsQueries.UPDATE, setsDb.forUpdate());
				} else {
					log.info("Création d'un nouveau sets avec code = {}", setsDb.getCode());
					liveJdbcTemplate.update(DbUpdateSetsQueries.INSERT, setsDb.forInsert());
				}
			});
		}
	}

}
