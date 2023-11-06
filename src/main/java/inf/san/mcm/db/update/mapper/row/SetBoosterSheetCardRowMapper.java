package inf.san.mcm.db.update.mapper.row;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import inf.san.mcm.db.update.model.SetBoosterSheetCardsDb;

public class SetBoosterSheetCardRowMapper extends AbstractDbRowMapper implements RowMapper<SetBoosterSheetCardsDb> {

	@Override
	public SetBoosterSheetCardsDb mapRow(ResultSet rs, int rowNum) throws SQLException {
		SetBoosterSheetCardsDb result = new SetBoosterSheetCardsDb();
		
		result.setBoosterName(rs.getString("boosterName"));
		result.setCardUuid(rs.getString("cardUuid"));
		result.setCardWeight(rs.getLong("cardWeight"));
		result.setSetCode(rs.getString("setCode"));
		result.setSheetName(rs.getString("sheetName"));
		
		return result;
	}

}
