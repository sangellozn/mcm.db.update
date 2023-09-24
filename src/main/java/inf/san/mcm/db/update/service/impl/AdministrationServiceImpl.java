package inf.san.mcm.db.update.service.impl;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import inf.san.mcm.db.update.mapper.row.SetsDbRowMapper;
import inf.san.mcm.db.update.model.DbUpdateQueries;
import inf.san.mcm.db.update.model.SetsDb;
import inf.san.mcm.db.update.service.IAdministrationService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class AdministrationServiceImpl implements IAdministrationService {
	
	private final JdbcTemplate masterJdbcTemplate;
	
	private final JdbcTemplate liveJdbcTemplate;
	
	public AdministrationServiceImpl(@Qualifier("masterJdbcTemplate") JdbcTemplate masterJdbcTemplate, 
			@Qualifier("liveJdbcTemplate") JdbcTemplate liveJdbcTemplate) {
		this.masterJdbcTemplate = masterJdbcTemplate;
		this.liveJdbcTemplate = liveJdbcTemplate;
	}

	@Override
	@Transactional
	public void updateDataBase() {
		downloadNewMaster();
		updateSets();
		updateSetsTranslations();
		updateSetsBoosterSheets();
		updateSetsBoosterSheetCards();
		updateSetsBoosterContentWeights();
		updateSetsBoosterContents();
		updateTokens();
		updateTokenIdentifiers();
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

	private void updateTokenIdentifiers() {
		// TODO Auto-generated method stub
		
	}

	private void updateTokens() {
		// TODO Auto-generated method stub
		
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

	private void updateSetsTranslations() {
		// TODO Auto-generated method stub
		
	}

	private void downloadNewMaster() {
		// TODO
	}

	private void updateSets() {
		try (Stream<SetsDb> setsStream = masterJdbcTemplate.queryForStream(DbUpdateQueries.SELECT_SETS, new SetsDbRowMapper())) {
			setsStream.forEach(setsDb -> {
				if (liveJdbcTemplate.queryForObject(DbUpdateQueries.EXISTS_BY_CODE_SETS, Boolean.class, setsDb.getCode())) {
					log.info("Mise à jour du sets code = {}", setsDb.getCode());
					liveJdbcTemplate.update(DbUpdateQueries.UPDATE_SETS, setsDb.forUpdate());
				} else {
					log.info("Création d'un nouveau sets avec code = {}", setsDb.getCode());
					liveJdbcTemplate.update(DbUpdateQueries.INSERT_SETS, setsDb.forInsert());
				}
			});
		}
	}

}
