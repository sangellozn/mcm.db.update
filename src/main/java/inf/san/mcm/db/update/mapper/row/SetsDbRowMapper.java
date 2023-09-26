package inf.san.mcm.db.update.mapper.row;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import inf.san.mcm.db.update.model.SetsDb;

public class SetsDbRowMapper extends AbstractDbRowMapper implements RowMapper<SetsDb> {

	@Override
	public SetsDb mapRow(ResultSet rs, int rowNum) throws SQLException {
		SetsDb setsDb = new SetsDb();
		
		setsDb.setBaseSetSize(getIntOrNull(rs, "baseSetSize"));
		setsDb.setBlock(rs.getString("block"));
		setsDb.setCardsphereSetId(getIntOrNull(rs, "cardsphereSetId"));
		setsDb.setCode(rs.getString("code"));
		setsDb.setIsFoilOnly(getBooleanOrNull(rs, "isFoilOnly"));
		setsDb.setIsForeignOnly(getBooleanOrNull(rs, "isForeignOnly"));
		setsDb.setIsNonFoilOnly(getBooleanOrNull(rs, "isNonFoilOnly"));
		setsDb.setIsOnlineOnly(getBooleanOrNull(rs, "isOnlineOnly"));
		setsDb.setIsPartialPreview(getBooleanOrNull(rs, "isPartialPreview"));
		setsDb.setKeyruneCode(rs.getString("keyruneCode"));
		setsDb.setLanguages(rs.getString("languages"));
		setsDb.setMcmId(getIntOrNull(rs, "mcmId"));
		setsDb.setMcmIdExtras(getIntOrNull(rs, "mcmIdExtras"));
		setsDb.setMcmName(rs.getString("mcmName"));
		setsDb.setMtgoCode(rs.getString("mtgoCode"));
		setsDb.setName(rs.getString("name"));
		setsDb.setParentCode(rs.getString("parentCode"));
		setsDb.setReleaseDate(rs.getString("releaseDate"));
		setsDb.setTcgplayerGroupId(getIntOrNull(rs, "tcgplayerGroupId"));
		setsDb.setTokenSetCode(rs.getString("tokenSetCode"));
		setsDb.setTotalSetSize(getIntOrNull(rs, "totalSetSize"));
		setsDb.setType(rs.getString("type"));
		
		return setsDb;
	}

}
