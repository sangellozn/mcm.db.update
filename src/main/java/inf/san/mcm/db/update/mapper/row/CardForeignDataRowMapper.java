package inf.san.mcm.db.update.mapper.row;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import inf.san.mcm.db.update.model.CardForeignDataDb;

public class CardForeignDataRowMapper extends AbstractDbRowMapper implements RowMapper<CardForeignDataDb> {

	@Override
	public CardForeignDataDb mapRow(ResultSet rs, int rowNum) throws SQLException {
		CardForeignDataDb result = new CardForeignDataDb();
		
		result.setFaceName(rs.getString("faceName"));
		result.setFlavorText(rs.getString("flavorText"));
		result.setLanguage(rs.getString("language"));
		result.setMultiverseId(getIntOrNull(rs, "multiverseId"));
		result.setName(rs.getString("name"));
		result.setText(rs.getString("text"));
		result.setType(rs.getString("type"));
		result.setUuid(rs.getString("uuid"));
		
		return result;
	}

}
