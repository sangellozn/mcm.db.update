package inf.san.mcm.db.update.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TokenIndentifiersDb implements IInsertableUpdatable {

	private String cardKingdomEtchedId;
	private String cardKingdomFoilId;
	private String cardKingdomId;
	private String cardsphereId;
	private String mcmId;
	private String mcmMetaId;
	private String mtgArenaId;
	private String mtgjsonFoilVersionId;
	private String mtgjsonNonFoilVersionId;
	private String mtgjsonV4Id;
	private String mtgoFoilId;
	private String mtgoId;
	private String multiverseId;
	private String scryfallId;
	private String scryfallIllustrationId;
	private String scryfallOracleId;
	private String tcgplayerEtchedProductId;
	private String tcgplayerProductId;
	private String uuid;
	
	@Override
	public Object[] forUpdate() {
		return new Object[] {
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
		};
	}
	@Override
	public Object[] forInsert() {
		return new Object[] {
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
		};
	}

}
