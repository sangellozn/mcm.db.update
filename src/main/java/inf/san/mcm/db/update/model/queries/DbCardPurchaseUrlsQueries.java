package inf.san.mcm.db.update.model.queries;

public class DbCardPurchaseUrlsQueries {

	public static final String DELETE_ALL = "DELETE FROM cardPurchaseUrls";
	
	public static final String SELECT = """
			SELECT cardKingdom, 
				cardKingdomEtched, 
				cardKingdomFoil, 
				cardmarket, 
				tcgplayer, 
				tcgplayerEtched, 
				uuid
			FROM cardPurchaseUrls
			""";

	public static final String INSERT_BASE = """
			INSERT INTO cardPurchaseUrls (
				cardKingdom, 
				cardKingdomEtched, 
				cardKingdomFoil, 
				cardmarket, 
				tcgplayer, 
				tcgplayerEtched, 
				uuid
			) VALUES
			""";

	public static final String VALUES_BASE = "(?, ?, ?, ?, ?, ?, ?)";

	
}
