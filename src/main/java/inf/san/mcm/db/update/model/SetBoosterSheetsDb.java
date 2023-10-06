package inf.san.mcm.db.update.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SetBoosterSheetsDb implements IInsertableUpdatable {
	
	private String boosterName;
	private String setCode;
	private Boolean sheetHasBalanceColors;
	private Boolean sheetIsFoil;
	private String sheetName;
	
	@Override
	public Object[] forUpdate() {
		return new Object[] {
				boosterName,
				sheetHasBalanceColors,
				sheetIsFoil,
				sheetName,			
				setCode
		};
	}

	@Override
	public Object[] forInsert() {
		return new Object[] {
				boosterName,
				setCode,
				sheetHasBalanceColors,
				sheetIsFoil,
				sheetName			
		};
	}

}
