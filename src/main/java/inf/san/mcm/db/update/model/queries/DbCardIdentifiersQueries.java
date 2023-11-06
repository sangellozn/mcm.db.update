package inf.san.mcm.db.update.model.queries;

public class DbCardIdentifiersQueries {

	public static final String DELETE_ALL = "DELETE FROM cardIdentifiers";
	
	public static final String SELECT = """
			SELECT cardKingdomEtchedId, 
				cardKingdomFoilId, 
				cardKingdomId, 
				cardsphereId, 
				mcmId, 
				mcmMetaId, 
				mtgArenaId, 
				mtgjsonFoilVersionId, 
				mtgjsonNonFoilVersionId, 
				mtgjsonV4Id, 
				mtgoFoilId, 
				mtgoId, 
				multiverseId, 
				scryfallId, 
				scryfallIllustrationId, 
				scryfallOracleId, 
				tcgplayerEtchedProductId, 
				tcgplayerProductId, 
				uuid
			FROM cardIdentifiers
			""";

	public static final String INSERT_BASE = """
			INSERT INTO cardIdentifiers (
				cardKingdomEtchedId, 
				cardKingdomFoilId, 
				cardKingdomId, 
				cardsphereId, 
				mcmId, 
				mcmMetaId, 
				mtgArenaId, 
				mtgjsonFoilVersionId, 
				mtgjsonNonFoilVersionId, 
				mtgjsonV4Id, 
				mtgoFoilId, 
				mtgoId, 
				multiverseId, 
				scryfallId, 
				scryfallIllustrationId, 
				scryfallOracleId, 
				tcgplayerEtchedProductId, 
				tcgplayerProductId, 
				uuid
			) VALUES
			""";

	public static final String VALUES_BASE = " (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

}
