package inf.san.mcm.db.update.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CardLegalitiesDb implements IInsertableUpdatable {
	
	private String alchemy;
	private String brawl;
	private String commander;
	private String duel;
	private String explorer;
	private String future;
	private String gladiator;
	private String historic;
	private String historicbrawl;
	private String legacy;
	private String modern;
	private String oathbreaker;
	private String oldschool;
	private String pauper;
	private String paupercommander;
	private String penny;
	private String pioneer;
	private String predh;
	private String premodern;
	private String standard;
	private String uuid;
	private String vintage;
	
	@Override
	public Object[] forUpdate() {
		return new Object[] {
				this.alchemy,
				this.brawl,
				this.commander,
				this.duel,
				this.explorer,
				this.future,
				this.gladiator,
				this.historic,
				this.historicbrawl,
				this.legacy,
				this.modern,
				this.oathbreaker,
				this.oldschool,
				this.pauper,
				this.paupercommander,
				this.penny,
				this.pioneer,
				this.predh,
				this.premodern,
				this.standard,
				this.vintage,
				this.uuid
		};
	}

	@Override
	public Object[] forInsert() {
		return new Object[] {
				this.alchemy,
				this.brawl,
				this.commander,
				this.duel,
				this.explorer,
				this.future,
				this.gladiator,
				this.historic,
				this.historicbrawl,
				this.legacy,
				this.modern,
				this.oathbreaker,
				this.oldschool,
				this.pauper,
				this.paupercommander,
				this.penny,
				this.pioneer,
				this.predh,
				this.premodern,
				this.standard,
				this.uuid,
				this.vintage
		};
	}

}
