package inf.san.mcm.db.update.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CardIdentifiersDb implements IInsertableUpdatable {
	
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
				this.cardKingdomEtchedId,
				this.cardKingdomFoilId,
				this.cardKingdomId,
				this.cardsphereId,
				this.mcmId,
				this.mcmMetaId,
				this.mtgArenaId,
				this.mtgjsonFoilVersionId,
				this.mtgjsonNonFoilVersionId,
				this.mtgjsonV4Id,
				this.mtgoFoilId,
				this.mtgoId,
				this.multiverseId,
				this.scryfallId,
				this.scryfallIllustrationId,
				this.scryfallOracleId,
				this.tcgplayerEtchedProductId,
				this.tcgplayerProductId,
				this.uuid
		};
	}

	@Override
	public Object[] forInsert() {
		return new Object[] {
				this.cardKingdomEtchedId,
				this.cardKingdomFoilId,
				this.cardKingdomId,
				this.cardsphereId,
				this.mcmId,
				this.mcmMetaId,
				this.mtgArenaId,
				this.mtgjsonFoilVersionId,
				this.mtgjsonNonFoilVersionId,
				this.mtgjsonV4Id,
				this.mtgoFoilId,
				this.mtgoId,
				this.multiverseId,
				this.scryfallId,
				this.scryfallIllustrationId,
				this.scryfallOracleId,
				this.tcgplayerEtchedProductId,
				this.tcgplayerProductId,
				this.uuid
		};
	}

}
