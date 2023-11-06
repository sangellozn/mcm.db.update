package inf.san.mcm.db.update.mapper.row;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import inf.san.mcm.db.update.model.CardPurchaseUrlsDb;

public class CardPurchaseUrlsRowMapper extends AbstractDbRowMapper implements RowMapper<CardPurchaseUrlsDb> {

	@Override
	public CardPurchaseUrlsDb mapRow(ResultSet rs, int rowNum) throws SQLException {
		CardPurchaseUrlsDb result = new CardPurchaseUrlsDb();
		
		result.setCardKingdom(rs.getString("cardKingdom"));
		result.setCardKingdomEtched(rs.getString("cardKingdomEtched"));
		result.setCardKingdomFoil(rs.getString("cardKingdomFoil"));
		result.setCardmarket(rs.getString("cardmarket"));
		result.setTcgplayer(rs.getString("tcgplayer"));
		result.setTcgplayerEtched(rs.getString("tcgplayerEtched"));
		result.setUuid(rs.getString("uuid"));
		
		return result;
	}

}
