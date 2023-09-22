package inf.san.mcm.db.update.model;

public final class DbUpdateQueries {

	public static final String SELECT_SETS = """
			SELECT baseSetSize, 
				block, 
				cardsphereSetId, 
				code, 
				isFoilOnly, 
				isForeignOnly, 
				isNonFoilOnly, 
				isOnlineOnly, 
				isPartialPreview, 
				keyruneCode, 
				languages, 
				mcmId, 
				mcmIdExtras, 
				mcmName, 
				mtgoCode, 
				name, 
				parentCode, 
				releaseDate, 
				tcgplayerGroupId, 
				tokenSetCode, 
				totalSetSize, 
				"type"
			FROM "sets"
			""";
	
	private DbUpdateQueries() {
		// Nothing.
	}
	
}
