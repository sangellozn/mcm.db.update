package inf.san.mcm.db.update.mapper.row;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import inf.san.mcm.db.update.model.SetBoosterContentsDb;

public class SetBoosterContentsRowMapper extends AbstractDbRowMapper implements RowMapper<SetBoosterContentsDb> {

	@Override
	public SetBoosterContentsDb mapRow(ResultSet rs, int rowNum) throws SQLException {
		SetBoosterContentsDb result = new SetBoosterContentsDb();

		result.setBoosterIndex(rs.getInt("boosterIndex"));
		result.setBoosterName(rs.getString("boosterName"));
		result.setSetCode(rs.getString("setCode"));
		result.setSheetName(rs.getString("sheetName"));
		result.setSheetPicks(rs.getInt("sheetPicks"));
		
		return result;
	}

}
