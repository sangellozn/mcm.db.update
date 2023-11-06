package inf.san.mcm.db.update.model.queries;

public class DbCardRulingsQueries {

	public static final String DELETE_ALL = "DELETE FROM cardRulings";
	
	public static final String SELECT = """
			SELECT date, 
				"text", 
				uuid
			FROM cardRulings
			""";

	public static final String INSERT_BASE = """
			INSERT INTO cardRulings (
				date, 
				"text", 
				uuid
			) VALUES
			""";

	public static final String VALUES_BASE = "(?, ?, ?)";
	

}
