package inf.san.mcm.db.update.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CardsDb implements IInsertableUpdatable {
	
	@Override
	public Object[] forUpdate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] forInsert() {
		// TODO Auto-generated method stub
		return null;
	}

}
