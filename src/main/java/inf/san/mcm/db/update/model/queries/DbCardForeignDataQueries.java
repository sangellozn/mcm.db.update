package inf.san.mcm.db.update.model.queries;

public class DbCardForeignDataQueries {

	public static final String DELETE_ALL = "DELETE FROM cardForeignData";
	
	public static final String SELECT = """
			SELECT faceName, 
				flavorText, 
				"language", 
				multiverseId, 
				name, 
				"text", 
				"type", 
				uuid
			FROM cardForeignData
			""";

	public static final String INSERT_BASE = """
			INSERT INTO cardForeignData (faceName, 
				flavorText, 
				"language", 
				multiverseId, 
				name, 
				"text", 
				"type", 
				uuid
			) VALUES
			""";

	public static final String VALUES_BASE = "(?, ?, ?, ?, ?, ?, ?, ?)";

}
