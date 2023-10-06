package inf.san.mcm.db.update.model;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MetaDb implements IInsertableUpdatable {
	
	private LocalDate date;
	private String version;
	
	@Override
	public Object[] forUpdate() {
		return new Object[] {
				date,
				version
		};
	}

	@Override
	public Object[] forInsert() {
		return new Object[] {
				date,
				version
		};
	}

}
