package inf.san.mcm.db.update.model.queries;

public class DbSetBoosterContentWeightsQueries {
	
	public static final String DELETE_ALL = """
			delete from setBoosterContentWeights
			""";
	
	public static final String SELECT = """
			SELECT boosterIndex, 
				boosterName, 
				boosterWeight, 
				setCode
			FROM setBoosterContentWeights
			""";
	
	public static final String INSERT = """
			INSERT INTO setBoosterContentWeights (
				boosterIndex, 
				boosterName, 
				boosterWeight, 
				setCode
			) VALUES (?, ?, ?, ?)
			""";

}
