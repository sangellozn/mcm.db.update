package inf.san.mcm.db.update.mapper.row;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import inf.san.mcm.db.update.model.CardIdentifiersDb;

public class CardIdentifiersRowMapper extends AbstractDbRowMapper implements RowMapper<CardIdentifiersDb> {

	@Override
	public CardIdentifiersDb mapRow(ResultSet rs, int rowNum) throws SQLException {
		CardIdentifiersDb result = new CardIdentifiersDb();
		
		result.setCardKingdomEtchedId(rs.getString("cardKingdomEtchedId"));
		result.setCardKingdomFoilId(rs.getString("cardKingdomFoilId"));
		result.setCardKingdomId(rs.getString("cardKingdomId"));
		result.setCardsphereId(rs.getString("cardsphereId"));
		result.setMcmId(rs.getString("mcmId"));
		result.setMcmMetaId(rs.getString("mcmMetaId"));
		result.setMtgArenaId(rs.getString("mtgArenaId"));
		result.setMtgjsonFoilVersionId(rs.getString("mtgjsonFoilVersionId"));
		result.setMtgjsonNonFoilVersionId(rs.getString("mtgjsonNonFoilVersionId"));
		result.setMtgjsonV4Id(rs.getString("mtgjsonV4Id"));
		result.setMtgoFoilId(rs.getString("mtgoFoilId"));
		result.setMtgoId(rs.getString("mtgoId"));
		result.setMultiverseId(rs.getString("multiverseId"));
		result.setScryfallId(rs.getString("scryfallId"));
		result.setScryfallIllustrationId(rs.getString("scryfallIllustrationId"));
		result.setScryfallOracleId(rs.getString("scryfallOracleId"));
		result.setTcgplayerEtchedProductId(rs.getString("tcgplayerEtchedProductId"));
		result.setTcgplayerProductId(rs.getString("tcgplayerProductId"));
		result.setUuid(rs.getString("uuid"));

		return result;
	}

}
