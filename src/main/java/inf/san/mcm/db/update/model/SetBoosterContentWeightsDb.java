package inf.san.mcm.db.update.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SetBoosterContentWeightsDb implements IInsertableUpdatable {
	
	private Integer boosterIndex;
	private String boosterName;
	private Integer boosterWeight;
	private String setCode;
	
	@Override
	public Object[] forUpdate() {
		return new Object[] {
				boosterIndex,
				boosterName,
				boosterWeight,
				setCode
		};
	}

	@Override
	public Object[] forInsert() {
		return new Object[] {
				boosterIndex,
				boosterName,
				boosterWeight,
				setCode
		};
	}

}
