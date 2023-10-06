package inf.san.mcm.db.update.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SetBoosterContentsDb implements IInsertableUpdatable {
	
	private Integer boosterIndex;
	private String boosterName;
	private String setCode;
	private String sheetName;
	private Integer sheetPicks;
	
	@Override
	public Object[] forUpdate() {
		return new Object[] {
				boosterIndex,
				boosterName,
				sheetName,
				sheetPicks,
				setCode
		};
	}

	@Override
	public Object[] forInsert() {
		return new Object[] {
				boosterIndex,
				boosterName,
				setCode,
				sheetName,
				sheetPicks
		};
	}

}
