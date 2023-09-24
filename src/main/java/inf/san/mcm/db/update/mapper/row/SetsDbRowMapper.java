package inf.san.mcm.db.update.mapper.row;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import inf.san.mcm.db.update.model.SetsDb;

public class SetsDbRowMapper implements RowMapper<SetsDb> {

	@Override
	public SetsDb mapRow(ResultSet rs, int rowNum) throws SQLException {
		SetsDb setsDb = new SetsDb();
		
		// FIXME gérer le wasNull aussi pour le Int.
		setsDb.setBaseSetSize(rs.getInt("baseSetSize"));
		setsDb.setBlock(rs.getString("block"));
		setsDb.setCardsphereSetId(rs.getInt("cardsphereSetId"));
		setsDb.setCode(rs.getString("code"));
		setsDb.setIsFoilOnly(rs.getBoolean("isFoilOnly"));
		
		if (rs.wasNull()) {
			setsDb.setIsFoilOnly(null);
		}
		
		setsDb.setIsForeignOnly(rs.getBoolean("isForeignOnly"));
		
		if (rs.wasNull()) {
			setsDb.setIsForeignOnly(null);
		}
		
		setsDb.setIsNonFoilOnly(rs.getBoolean("isNonFoilOnly"));

		if (rs.wasNull()) {
			setsDb.setIsNonFoilOnly(null);
		}
		
		setsDb.setIsOnlineOnly(rs.getBoolean("isOnlineOnly"));

		if (rs.wasNull()) {
			setsDb.setIsOnlineOnly(null);
		}
		
		setsDb.setIsPartialPreview(rs.getBoolean("isPartialPreview"));

		if (rs.wasNull()) {
			setsDb.setIsPartialPreview(null);
		}
		
		setsDb.setKeyruneCode(rs.getString("keyruneCode"));
		setsDb.setLanguages(rs.getString("languages"));
		setsDb.setMcmId(rs.getInt("mcmId"));
		setsDb.setMcmIdExtras(rs.getInt("mcmIdExtras"));
		setsDb.setMcmName(rs.getString("mcmName"));
		setsDb.setMtgoCode(rs.getString("mtgoCode"));
		setsDb.setName(rs.getString("name"));
		setsDb.setParentCode(rs.getString("parentCode"));
		setsDb.setReleaseDate(rs.getString("releaseDate"));
		setsDb.setTcgplayerGroupId(rs.getInt("tcgplayerGroupId"));
		setsDb.setTokenSetCode(rs.getString("tokenSetCode"));
		setsDb.setTotalSetSize(rs.getInt("totalSetSize"));
		setsDb.setType(rs.getString("type"));
		
		return setsDb;
	}

}
