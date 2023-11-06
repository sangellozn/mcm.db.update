package inf.san.mcm.db.update.mapper.row;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import inf.san.mcm.db.update.model.SetBoosterContentWeightsDb;

public class SetBoosterContentWeightsRowMapper extends AbstractDbRowMapper implements RowMapper<SetBoosterContentWeightsDb> {

	@Override
	public SetBoosterContentWeightsDb mapRow(ResultSet rs, int rowNum) throws SQLException {
		SetBoosterContentWeightsDb result = new SetBoosterContentWeightsDb();
		
		result.setBoosterIndex(rs.getInt("boosterIndex"));
		result.setBoosterName(rs.getString("boosterName"));
		result.setBoosterWeight(rs.getInt("boosterWeight"));
		result.setSetCode(rs.getString("setCode"));
		
		return result;
	}

}
