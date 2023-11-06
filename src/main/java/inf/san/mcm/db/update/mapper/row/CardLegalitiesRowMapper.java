package inf.san.mcm.db.update.mapper.row;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import inf.san.mcm.db.update.model.CardLegalitiesDb;

public class CardLegalitiesRowMapper extends AbstractDbRowMapper implements RowMapper<CardLegalitiesDb> {

	@Override
	public CardLegalitiesDb mapRow(ResultSet rs, int rowNum) throws SQLException {
		CardLegalitiesDb result = new CardLegalitiesDb();
		
		result.setAlchemy(rs.getString("alchemy"));
		result.setBrawl(rs.getString("brawl"));
		result.setCommander(rs.getString("commander"));
		result.setDuel(rs.getString("duel"));
		result.setExplorer(rs.getString("explorer"));
		result.setFuture(rs.getString("future"));
		result.setGladiator(rs.getString("gladiator"));
		result.setHistoric(rs.getString("historic"));
		result.setHistoricbrawl(rs.getString("historicbrawl"));
		result.setLegacy(rs.getString("legacy"));
		result.setModern(rs.getString("modern"));
		result.setOathbreaker(rs.getString("oathbreaker"));
		result.setOldschool(rs.getString("oldschool"));
		result.setPauper(rs.getString("pauper"));
		result.setPaupercommander(rs.getString("paupercommander"));
		result.setPenny(rs.getString("penny"));
		result.setPioneer(rs.getString("pioneer"));
		result.setPredh(rs.getString("predh"));
		result.setPremodern(rs.getString("premodern"));
		result.setStandard(rs.getString("standard"));
		result.setUuid(rs.getString("uuid"));
		result.setVintage(rs.getString("vintage"));
		
		return result;
	}

}
