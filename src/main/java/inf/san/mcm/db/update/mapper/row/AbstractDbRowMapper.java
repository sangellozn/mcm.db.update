package inf.san.mcm.db.update.mapper.row;

import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class AbstractDbRowMapper {
	
	protected static Integer getIntOrNull(ResultSet rs, String field) throws SQLException {
		Integer result = rs.getInt(field);
		
		if (rs.wasNull()) {
			result = null;
		}
		
		return result;
	}
	
	protected static Boolean getBooleanOrNull(ResultSet rs, String field) throws SQLException {
		Boolean result = rs.getBoolean(field);
		
		if (rs.wasNull()) {
			result = null;
		}
		
		return result;
	}

}
