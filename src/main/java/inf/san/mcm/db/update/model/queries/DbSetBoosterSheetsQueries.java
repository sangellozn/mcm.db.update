package inf.san.mcm.db.update.model.queries;

public class DbSetBoosterSheetsQueries {
	
	public static final String DELETE_ALL = """
			delete from setBoosterSheets
			""";
	
	public static final String SELECT = """
			SELECT boosterName, 
				setCode, 
				sheetHasBalanceColors, 
				sheetIsFoil, 
				sheetName
				FROM setBoosterSheets
			""";
	
	public static final String INSERT_BASE = """
			INSERT INTO setBoosterSheets (
				boosterName, 
				setCode, 
				sheetHasBalanceColors, 
				sheetIsFoil, 
				sheetName
			) VALUES
			""";
	
	public static final String INSERT = """
			INSERT INTO setBoosterSheets (
				boosterName, 
				setCode, 
				sheetHasBalanceColors, 
				sheetIsFoil, 
				sheetName
			) VALUES (?, ?, ?, ?, ?)
			""";

	public static final String VALUES_BASE = "(?, ?, ?, ?, ?)";

}
