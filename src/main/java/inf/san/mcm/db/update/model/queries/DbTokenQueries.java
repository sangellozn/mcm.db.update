package inf.san.mcm.db.update.model.queries;

public final class DbTokenQueries {

	public static final String EXISTS_BY_UUID = """
			select 
			    case 
			        when exists (
					    select 1 from tokens t where uuid = ?
					) then true
					else false
				end
			as exist
			""";
	
	public static final String EXISTS_TOKEN_BY_UUID = """
			select 
			    case 
			        when exists (
					    select 1 from tokenIdentifiers ti where uuid = ?
					) then true
					else false
				end
			as exist
			""";
	
	public static final String SELECT_UUID = """
			SELECT uuid
			FROM tokens
			""";
	
	public static final String DELETE = """
			DELETE FROM tokens 
			WHERE uuid = ?
			""";
	
	public static final String DELETE_TOKEN_IDENTIFIERS = """
			DELETE FROM tokenIdentifiers
			WHERE uuid = ?
			""";
	
	public static final String SELECT = """
			SELECT artist, 
				artistIds, 
				asciiName, 
				availability, 
				boosterTypes, 
				borderColor, 
				colorIdentity, 
				colors, 
				edhrecSaltiness, 
				faceName, 
				finishes, 
				flavorText, frameEffects,
				frameVersion,
				hasFoil,
				hasNonFoil,
				isFullArt,
				isFunny,
				isPromo,
				isReprint,
				isTextless,
				keywords,
				"language",
				layout,
				name,
				"number",
				orientation,
				originalText,
				originalType,
				otherFaceIds,
				power,
				promoTypes,
				relatedCards,
				reverseRelated,
				securityStamp,
				setCode,
				side,
				signature,
				subtypes,
				supertypes,
				"text",
				toughness,
				"type",
				types,
				uuid,
				watermark
			FROM tokens
			""";
	
	public static final String INSERT = """
			INSERT INTO tokens (
				artist, 
				artistIds, 
				asciiName, 
				availability, 
				boosterTypes, 
				borderColor, 
				colorIdentity, 
				colors, 
				edhrecSaltiness, 
				faceName, 
				finishes, 
				flavorText, 
				frameEffects, 
				frameVersion, 
				hasFoil, 
				hasNonFoil, 
				isFullArt, 
				isFunny, 
				isPromo, 
				isReprint, 
				isTextless, 
				keywords, 
				"language", 
				layout, 
				name, 
				"number", 
				orientation, 
				originalText, 
				originalType, 
				otherFaceIds, 
				power, 
				promoTypes, 
				relatedCards, 
				reverseRelated, 
				securityStamp, 
				setCode, 
				side, 
				signature, 
				subtypes, 
				supertypes, 
				"text", 
				toughness, 
				"type", 
				types, 
				uuid, 
				watermark
			) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 
				?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);
			""";
	
	public static final String UPDATE = """
			UPDATE tokens
			SET artist = ?, 
				artistIds = ?, 
				asciiName = ?, 
				availability = ?, 
				boosterTypes = ?, 
				borderColor = ?, 
				colorIdentity = ?, 
				colors = ?, 
				edhrecSaltiness = ?, 
				faceName = ?, 
				finishes = ?, 
				flavorText = ?, 
				frameEffects = ?, 
				frameVersion = ?, 
				hasFoil = ?, 
				hasNonFoil = ?, 
				isFullArt = ?, 
				isFunny = ?, 
				isPromo = ?, 
				isReprint = ?, 
				isTextless = ?, 
				keywords = ?, 
				"language" = ?, 
				layout = ?, 
				name = ?, 
				"number" = ?, 
				orientation = ?, 
				originalText = ?, 
				originalType = ?, 
				otherFaceIds = ?, 
				power = ?, 
				promoTypes = ?, 
				relatedCards = ?, 
				reverseRelated = ?, 
				securityStamp = ?, 
				setCode = ?, 
				side = ?, 
				signature = ?, 
				subtypes = ?, 
				supertypes = ?, 
				"text" = ?, 
				toughness = ?, 
				"type" = ?, 
				types = ?, 
				watermark = ?
			where uuid = ?
			""";

	public static final String SELECT_TOKEN_IDENTIFIERS = """
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
			FROM tokenIdentifiers
			""";

	public static final String UPDATE_TOKEN_IDENTIFIERS = """
			UPDATE tokenIdentifiers
			SET cardKingdomEtchedId = ?, 
				cardKingdomFoilId = ?, 
				cardKingdomId = ?, 
				cardsphereId = ?, 
				mcmId = ?, 
				mcmMetaId = ?, 
				mtgArenaId = ?, 
				mtgjsonFoilVersionId = ?, 
				mtgjsonNonFoilVersionId = ?, 
				mtgjsonV4Id = ?, 
				mtgoFoilId = ?, 
				mtgoId = ?, 
				multiverseId = ?, 
				scryfallId = ?, 
				scryfallIllustrationId = ?, 
				scryfallOracleId = ?, 
				tcgplayerEtchedProductId = ?, 
				tcgplayerProductId = ?
			WHERE uuid = ?
			""";

	public static final String INSERT_TOKEN_IDENTIFIERS = """
			INSERT INTO tokenIdentifiers (cardKingdomEtchedId, 
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
			uuid) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
			""";
	
	private DbTokenQueries() {
		// Nothing.
	}
	
}
