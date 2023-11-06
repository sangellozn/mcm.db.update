package inf.san.mcm.db.update.model.queries;

public class DbSetBoosterContentsQueries {
	
	public static final String DELETE_ALL = """
			delete from setBoosterContents
			""";
	
	public static final String SELECT = """
			SELECT boosterIndex, 
				boosterName, 
				setCode, 
				sheetName, 
				sheetPicks
			FROM setBoosterContents
			""";
	
	public static final String INSERT = """
			INSERT INTO setBoosterContents (
				boosterIndex, 
				boosterName, 
				setCode, 
				sheetName, 
				sheetPicks
			) VALUES (?, ?, ?, ?, ?)
			""";
	
	public static final String INSERT_BASE = """
			INSERT INTO setBoosterContents (
				boosterIndex, 
				boosterName, 
				setCode, 
				sheetName, 
				sheetPicks
			) VALUES
			""";

	public static final String VALUES_BASE = "(?, ?, ?, ?, ?)";

}
