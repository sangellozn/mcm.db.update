package inf.san.mcm.db.update.model.queries;

public final class DbMetaQueries {

	public static final String DELETE_ALL = "DELETE FROM meta";
	
	public static final String INSERT = "INSERT INTO meta (date, version) VALUES(?, ?)";
	
	public static final String SELECT = "SELECT date, version FROM meta";
	
	private DbMetaQueries() {
		// Nothing.
	}
	
}
