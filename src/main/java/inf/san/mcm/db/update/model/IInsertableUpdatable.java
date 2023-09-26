package inf.san.mcm.db.update.model;

public interface IInsertableUpdatable {
	
	Object[] forUpdate();
	
	Object[] forInsert();

}
