package inf.san.mcm.db.update.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CardForeignDataDb implements IInsertableUpdatable {
	
	private String faceName;
	private String flavorText;
	private String language;
	private Integer multiverseId;
	private String name;
	private String text;
	private String type;
	private String uuid;
	
	@Override
	public Object[] forUpdate() {
		return new Object[] {
				this.faceName,
				this.flavorText,
				this.language,
				this.multiverseId,
				this.name,
				this.text,
				this.type,
				this.uuid
		};
	}

	@Override
	public Object[] forInsert() {
		return new Object[] {
				this.faceName,
				this.flavorText,
				this.language,
				this.multiverseId,
				this.name,
				this.text,
				this.type,
				this.uuid
		};
	}

}
