package inf.san.mcm.db.update.model.queries;

public class DbCardLegalitiesQueries {

	public static final String DELETE_ALL = "DELETE FROM cardLegalities";
	
	public static final String SELECT = """
			SELECT alchemy, 
				brawl, 
				commander, 
				duel, 
				explorer, 
				future, 
				gladiator, 
				historic, 
				historicbrawl, 
				legacy, 
				modern, 
				oathbreaker, 
				oldschool, 
				pauper, 
				paupercommander, 
				penny, 
				pioneer, 
				predh, 
				premodern, 
				standard, 
				uuid, 
				vintage
			FROM cardLegalities
			""";

	public static final String INSERT_BASE = """
			INSERT INTO cardLegalities (
				alchemy, 
				brawl, 
				commander, 
				duel, 
				explorer, 
				future, 
				gladiator, 
				historic, 
				historicbrawl, 
				legacy, 
				modern, 
				oathbreaker, 
				oldschool, 
				pauper, 
				paupercommander, 
				penny, 
				pioneer, 
				predh, 
				premodern, 
				standard, 
				uuid, 
				vintage
			) VALUES
			""";

	public static final String VALUES_BASE = "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	
	

}
