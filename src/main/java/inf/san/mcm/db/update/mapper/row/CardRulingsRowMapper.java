package inf.san.mcm.db.update.mapper.row;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import org.springframework.jdbc.core.RowMapper;

import inf.san.mcm.db.update.model.CardRulingsDb;

public class CardRulingsRowMapper extends AbstractDbRowMapper implements RowMapper<CardRulingsDb> {

	@Override
	public CardRulingsDb mapRow(ResultSet rs, int rowNum) throws SQLException {
		CardRulingsDb result = new CardRulingsDb();
		
		result.setDate(LocalDate.parse(rs.getString("date")));
		result.setText(rs.getString("text"));
		result.setUuid(rs.getString("uuid"));
		
		return result;
	}

}
