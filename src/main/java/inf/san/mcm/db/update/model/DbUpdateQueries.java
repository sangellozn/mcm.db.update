package inf.san.mcm.db.update.model;

public final class DbUpdateQueries {
	
	public static final String EXISTS_BY_CODE_SETS = """
			select 
			    case 
			        when exists (
					    select 1 from "sets" s where code = ?
					) then true
					else false
				end
			as exist
			""";

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
	
	public static final String INSERT_SETS = """
			INSERT INTO "sets" (baseSetSize, 
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
			) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
			""";
	
	public static final String UPDATE_SETS = """
			UPDATE "sets"
			SET baseSetSize = ?, 
				block = ?, 
				cardsphereSetId = ?, 
				isFoilOnly = ?, 
				isForeignOnly = ?, 
				isNonFoilOnly = ?, 
				isOnlineOnly = ?, 
				isPartialPreview = ?, 
				keyruneCode = ?, 
				languages = ?, 
				mcmId = ?, 
				mcmIdExtras = ?, 
				mcmName = ?, 
				mtgoCode = ?, 
				name = ?, 
				parentCode = ?, 
				releaseDate = ?, 
				tcgplayerGroupId = ?, 
				tokenSetCode = ?, 
				totalSetSize = ?, 
				"type" = ?
				WHERE code = ?
			""";
	
	private DbUpdateQueries() {
		// Nothing.
	}
	
}
