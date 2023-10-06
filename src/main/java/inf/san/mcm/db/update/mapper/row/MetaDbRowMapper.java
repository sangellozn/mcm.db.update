package inf.san.mcm.db.update.mapper.row;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import org.springframework.jdbc.core.RowMapper;

import inf.san.mcm.db.update.model.MetaDb;

public class MetaDbRowMapper extends AbstractDbRowMapper implements RowMapper<MetaDb> {

	@Override
	public MetaDb mapRow(ResultSet rs, int rowNum) throws SQLException {
		MetaDb result = new MetaDb();
		
		result.setDate(LocalDate.parse(rs.getString("date")));
		result.setVersion(rs.getString("version"));
		
		return result;
	}

}
