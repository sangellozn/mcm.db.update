package inf.san.mcm.db.update.service.imp;

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
		updateSets();
		// TODO Finish
		
	}

	private void updateSets() {
		try (Stream<SetsDb> setsStream = masterJdbcTemplate.queryForStream(DbUpdateQueries.SELECT_SETS, new SetsDbRowMapper())) {
			setsStream.forEach(setsDb -> {
				log.info("{}", setsDb);
			});
		}
	}

}
