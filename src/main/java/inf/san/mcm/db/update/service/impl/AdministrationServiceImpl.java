package inf.san.mcm.db.update.service.impl;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import inf.san.mcm.db.update.mapper.row.MetaDbRowMapper;
import inf.san.mcm.db.update.mapper.row.SetBoosterContentWeightsRowMapper;
import inf.san.mcm.db.update.mapper.row.SetBoosterContentsRowMapper;
import inf.san.mcm.db.update.mapper.row.SetBoosterSheetCardRowMapper;
import inf.san.mcm.db.update.mapper.row.SetBoosterSheetsRowMapper;
import inf.san.mcm.db.update.mapper.row.SetsDbRowMapper;
import inf.san.mcm.db.update.mapper.row.TokenDbRowMapper;
import inf.san.mcm.db.update.mapper.row.TokenIdentifiersDbRowMapper;
import inf.san.mcm.db.update.model.IInsertableUpdatable;
import inf.san.mcm.db.update.model.MetaDb;
import inf.san.mcm.db.update.model.SetBoosterContentWeightsDb;
import inf.san.mcm.db.update.model.SetBoosterContentsDb;
import inf.san.mcm.db.update.model.SetBoosterSheetCardsDb;
import inf.san.mcm.db.update.model.SetBoosterSheetsDb;
import inf.san.mcm.db.update.model.SetsDb;
import inf.san.mcm.db.update.model.TokenIndentifiersDb;
import inf.san.mcm.db.update.model.TokensDb;
import inf.san.mcm.db.update.model.queries.DbMetaQueries;
import inf.san.mcm.db.update.model.queries.DbSetBoosterContentWeightsQueries;
import inf.san.mcm.db.update.model.queries.DbSetBoosterContentsQueries;
import inf.san.mcm.db.update.model.queries.DbSetBoosterSheetCardsQueries;
import inf.san.mcm.db.update.model.queries.DbSetBoosterSheetsQueries;
import inf.san.mcm.db.update.model.queries.DbSetsQueries;
import inf.san.mcm.db.update.model.queries.DbTokenQueries;
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

	@Async
	@Override
	@Transactional
	public void updateDataBase() {
		log.info("Début de la mise à jour de la base de données...");
		
		log.info("Téléchargement de la base master...");
		downloadNewMaster();
		log.info("Base master téléchargée !");
		
		log.info("Mise à jour des sets...");
		updateSets();
		log.info("Mise à jour des booster sheets.");
		updateSetsBoosterSheets();
		log.info("Mise à jour des booster sheet cards.");
		updateSetsBoosterSheetCards();
		log.info("Mise à jour des booster content weights.");
		updateSetsBoosterContentWeights();
		log.info("Mise à jour des booster contents.");
		updateSetsBoosterContents();
		log.info("Sets mis à jour !");
		
		log.info("Mise à jour des tokens...");
		updateTokens();
		log.info("Tokens mis à jour !");
		
		log.info("Mise à jour des méta data...");
		updateMeta();
		log.info("Méta data mises à jour !");
		
		log.info("Mise à jour des cartes...");
		updateCards();
		updateCardRulings();
		updateCardPurchaseUrls();
		updateCardLegalities();
		updateCardIdentifiers();
		updateCardForeignData();
		log.info("Cartes mises à jour !");
		
		log.info("Mise à jour terminée !");
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
		liveJdbcTemplate.execute(DbMetaQueries.DELETE_ALL);
		
		try (Stream<MetaDb> metaStream = masterJdbcTemplate.queryForStream(DbMetaQueries.SELECT, new MetaDbRowMapper())) {
			metaStream.forEach(metaDb -> {
				liveJdbcTemplate.update(DbMetaQueries.INSERT, metaDb.forInsert());
			});
		}
		
	}

	private void updateTokens() {
		try (Stream<TokensDb> tokensStream = masterJdbcTemplate.queryForStream(DbTokenQueries.SELECT, new TokenDbRowMapper())) {
			tokensStream.forEach(tokenDb -> {
				if (liveJdbcTemplate.queryForObject(DbTokenQueries.EXISTS_BY_UUID, Boolean.class, tokenDb.getUuid())) {
					log.info("Mise à jour du token uuid = {}", tokenDb.getUuid());
					liveJdbcTemplate.update(DbTokenQueries.UPDATE, tokenDb.forUpdate());
				} else {
					log.info("Création d'un nouveau token avec uuid = {}", tokenDb.getUuid());
					liveJdbcTemplate.update(DbTokenQueries.INSERT, tokenDb.forInsert());
				}
			});
		}
		
		try (Stream<TokenIndentifiersDb> tokenIdentifiersStream = masterJdbcTemplate.queryForStream(DbTokenQueries.SELECT_TOKEN_IDENTIFIERS, new TokenIdentifiersDbRowMapper())) {
			tokenIdentifiersStream.forEach(tokenIdentifiersDb -> {
				if (liveJdbcTemplate.queryForObject(DbTokenQueries.EXISTS_TOKEN_BY_UUID, Boolean.class, tokenIdentifiersDb.getUuid())) {
					log.info("Mise à jour du token identifiers uuid = {}", tokenIdentifiersDb.getUuid());
					liveJdbcTemplate.update(DbTokenQueries.UPDATE_TOKEN_IDENTIFIERS, tokenIdentifiersDb.forUpdate());
				} else {
					log.info("Création d'un nouveau token identifiers avec uuid = {}", tokenIdentifiersDb.getUuid());
					liveJdbcTemplate.update(DbTokenQueries.INSERT_TOKEN_IDENTIFIERS, tokenIdentifiersDb.forInsert());
				}
			});
		}
		
		// Suppression des tokens n'existant plus dans le master
		for (String uuid : liveJdbcTemplate.queryForList(DbTokenQueries.SELECT_UUID, String.class)) {
			if (!masterJdbcTemplate.queryForObject(DbTokenQueries.EXISTS_BY_UUID, Boolean.class, uuid)) {
				log.info("Token avec uuid = {} n'existe plus dans la base master, suppression du token et des ses relations.", uuid);
				liveJdbcTemplate.update(DbTokenQueries.DELETE, uuid);
				liveJdbcTemplate.update(DbTokenQueries.DELETE_TOKEN_IDENTIFIERS, uuid);
			}
		}
		
	}

	private void updateSetsBoosterContents() {
		liveJdbcTemplate.update(DbSetBoosterContentsQueries.DELETE_ALL);
		try (Stream<SetBoosterContentsDb> stream = masterJdbcTemplate.queryForStream(DbSetBoosterContentsQueries.SELECT, new SetBoosterContentsRowMapper())) {
			stream.forEach(item -> {
				liveJdbcTemplate.update(DbSetBoosterContentsQueries.INSERT, item.forInsert());
			});
		}
	}

	private void updateSetsBoosterContentWeights() {
		liveJdbcTemplate.update(DbSetBoosterContentWeightsQueries.DELETE_ALL);
		try (Stream<SetBoosterContentWeightsDb> stream = masterJdbcTemplate.queryForStream(DbSetBoosterContentWeightsQueries.SELECT, new SetBoosterContentWeightsRowMapper())) {
			stream.forEach(item -> {
				liveJdbcTemplate.update(DbSetBoosterContentWeightsQueries.INSERT, item.forInsert());
			});
		}
		
	}

	private void updateSetsBoosterSheetCards() {
		liveJdbcTemplate.update(DbSetBoosterSheetCardsQueries.DELETE_ALL);
		try (Stream<SetBoosterSheetCardsDb> stream = masterJdbcTemplate.queryForStream(DbSetBoosterSheetCardsQueries.SELECT, new SetBoosterSheetCardRowMapper())) {
			List<Object[]> data = stream.map(IInsertableUpdatable::forInsert).toList();
			
			liveJdbcTemplate.batchUpdate(DbSetBoosterSheetCardsQueries.INSERT, data, 100, (ps, argument) -> {
				ps.setString(1, (String) argument[0]);
				ps.setString(2, (String) argument[1]);
				ps.setLong(3, (long) argument[2]);
				ps.setString(4, (String) argument[3]);
				ps.setString(5, (String) argument[4]);
			});
		}
	}

	private void updateSetsBoosterSheets() {
		liveJdbcTemplate.update(DbSetBoosterSheetsQueries.DELETE_ALL);
		try (Stream<SetBoosterSheetsDb> stream = masterJdbcTemplate.queryForStream(DbSetBoosterSheetsQueries.SELECT, new SetBoosterSheetsRowMapper())) {
			stream.forEach(item -> {
				liveJdbcTemplate.update(DbSetBoosterSheetsQueries.INSERT, item.forInsert());
			});
		}
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
		try (Stream<SetsDb> setsStream = masterJdbcTemplate.queryForStream(DbSetsQueries.SELECT, new SetsDbRowMapper())) {
			setsStream.forEach(setsDb -> {
				if (liveJdbcTemplate.queryForObject(DbSetsQueries.EXISTS_BY_CODE, Boolean.class, setsDb.getCode())) {
					log.info("Mise à jour du sets code = {}", setsDb.getCode());
					liveJdbcTemplate.update(DbSetsQueries.UPDATE, setsDb.forUpdate());
				} else {
					log.info("Création d'un nouveau sets avec code = {}", setsDb.getCode());
					liveJdbcTemplate.update(DbSetsQueries.INSERT, setsDb.forInsert());
				}
			});
		}
	}

}
