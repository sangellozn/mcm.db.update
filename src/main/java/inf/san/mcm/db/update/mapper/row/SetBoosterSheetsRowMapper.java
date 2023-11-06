package inf.san.mcm.db.update.mapper.row;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import inf.san.mcm.db.update.model.SetBoosterSheetsDb;

public class SetBoosterSheetsRowMapper extends AbstractDbRowMapper implements RowMapper<SetBoosterSheetsDb> {
	
	@Override
	public SetBoosterSheetsDb mapRow(ResultSet rs, int rowNum) throws SQLException {
		SetBoosterSheetsDb result = new SetBoosterSheetsDb();
		
		result.setBoosterName(rs.getString("boosterName"));
		result.setSetCode(rs.getString("setCode"));
		result.setSheetHasBalanceColors(getBooleanOrNull(rs, "sheetHasBalanceColors"));
		result.setSheetIsFoil(getBooleanOrNull(rs, "sheetIsFoil"));
		result.setSheetName(rs.getString("sheetName"));
		
		return result;
	}

}
