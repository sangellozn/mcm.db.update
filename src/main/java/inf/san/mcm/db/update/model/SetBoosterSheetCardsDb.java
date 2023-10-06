package inf.san.mcm.db.update.model;

import java.math.BigInteger;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SetBoosterSheetCardsDb implements IInsertableUpdatable {
	
	private String boosterName;
	private String cardUuid;
	private BigInteger cardWeight;
	private String setCode;
	private String sheetName;
	
	@Override
	public Object[] forUpdate() {
		return new Object[] {
				boosterName,
				cardUuid,
				cardWeight,
				sheetName,
				setCode
		};
	}

	@Override
	public Object[] forInsert() {
		return new Object[] {
				boosterName,
				cardUuid,
				cardWeight,
				setCode,
				sheetName
		};
	}

}
