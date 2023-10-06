package inf.san.mcm.db.update.model;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CardRulingsDb implements IInsertableUpdatable {
	
	private LocalDate date;
	private String text;
	private String uuid;
	
	@Override
	public Object[] forUpdate() {
		return new Object[] {
				this.date,
				this.text,
				this.uuid
		};
	}

	@Override
	public Object[] forInsert() {
		return new Object[] {
				this.date,
				this.text,
				this.uuid
		};
	}

}
