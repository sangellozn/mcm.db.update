package inf.san.mcm.db.update.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CardPurchaseUrlsDb implements IInsertableUpdatable {
	
	private String cardKingdom;
	private String cardKingdomEtched;
	private String cardKingdomFoil;
	private String cardmarket;
	private String tcgplayer;
	private String tcgplayerEtched;
	private String uuid;
	
	@Override
	public Object[] forUpdate() {
		return new Object[] {
				this.cardKingdom,
				this.cardKingdomEtched,
				this.cardKingdomFoil,
				this.cardmarket,
				this.tcgplayer,
				this.tcgplayerEtched,
				this.uuid
		};
	}

	@Override
	public Object[] forInsert() {
		return new Object[] {
				this.cardKingdom,
				this.cardKingdomEtched,
				this.cardKingdomFoil,
				this.cardmarket,
				this.tcgplayer,
				this.tcgplayerEtched,
				this.uuid
		};
	}

}
