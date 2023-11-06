package inf.san.mcm.db.update.model.queries;

public class DbSetBoosterSheetCardsQueries {
	
	public static final String DELETE_ALL = """
			delete from setBoosterSheetCards
			""";
	
	public static final String SELECT = """
			SELECT boosterName, 
				cardUuid, 
				cardWeight, 
				setCode, 
				sheetName
			FROM setBoosterSheetCards
			""";
	
	public static final String INSERT_BASE = """
			INSERT INTO setBoosterSheetCards (
				boosterName, 
				cardUuid, 
				cardWeight, 
				setCode, 
				sheetName
			) VALUES
			""";
	
	public static final String VALUES_BASE = "(?, ?, ?, ?, ?)";
	
	public static final String INSERT = """
			INSERT INTO setBoosterSheetCards (
				boosterName, 
				cardUuid, 
				cardWeight, 
				setCode, 
				sheetName
			) VALUES (?, ?, ?, ?, ?)
			""";

}
