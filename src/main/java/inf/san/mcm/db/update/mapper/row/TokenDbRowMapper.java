package inf.san.mcm.db.update.mapper.row;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import inf.san.mcm.db.update.model.TokensDb;

public class TokenDbRowMapper extends AbstractDbRowMapper implements RowMapper<TokensDb>  {

	@Override
	public TokensDb mapRow(ResultSet rs, int rowNum) throws SQLException {
		TokensDb result = new TokensDb();
		
		result.setArtist(rs.getString("artist"));
		result.setArtistIds(rs.getString("artistIds"));
		result.setAsciiName(rs.getString("asciiName"));
		result.setAvailability(rs.getString("availability"));
		result.setBoosterTypes(rs.getString("boosterTypes"));
		result.setBorderColor(rs.getString("borderColor"));
		result.setColorIdentity(rs.getString("colorIdentity"));
		result.setColors(rs.getString("colors"));
		result.setEdhrecSaltiness(rs.getBigDecimal("edhrecSaltiness"));
		result.setFaceName(rs.getString("faceName"));
		result.setFinishes(rs.getString("finishes"));
		result.setFlavorText(rs.getString("flavorText"));
		result.setFrameEffects(rs.getString("frameEffects"));
		result.setFrameVersion(rs.getString("frameVersion"));
		result.setHasFoil(getBooleanOrNull(rs, "hasFoil"));
		result.setHasNonFoil(getBooleanOrNull(rs, "hasNonFoil"));
		result.setIsFullArt(getBooleanOrNull(rs, "isFullArt"));
		result.setIsFunny(getBooleanOrNull(rs, "isFunny"));
		result.setIsPromo(getBooleanOrNull(rs, "isPromo"));
		result.setIsReprint(getBooleanOrNull(rs, "isReprint"));
		result.setIsTextless(getBooleanOrNull(rs, "isTextless"));
		result.setKeywords(rs.getString("keywords"));
		result.setLanguage(rs.getString("language"));
		result.setLayout(rs.getString("layout"));
		result.setName(rs.getString("name"));
		result.setNumber(rs.getString("number"));
		result.setOrientation(rs.getString("orientation"));
		result.setOriginalText(rs.getString("originalText"));
		result.setOriginalType(rs.getString("originalType"));
		result.setOtherFaceIds(rs.getString("otherFaceIds"));
		result.setPower(rs.getString("power"));
		result.setPromoTypes(rs.getString("promoTypes"));
		result.setRelatedCards(rs.getString("relatedCards"));
		result.setReverseRelated(rs.getString("reverseRelated"));
		result.setSecurityStamp(rs.getString("securityStamp"));
		result.setSetCode(rs.getString("setCode"));
		result.setSide(rs.getString("side"));
		result.setSignature(rs.getString("signature"));
		result.setSubtypes(rs.getString("subtypes"));
		result.setSupertypes(rs.getString("supertypes"));
		result.setText(rs.getString("text"));
		result.setToughness(rs.getString("toughness"));
		result.setType(rs.getString("type"));
		result.setTypes(rs.getString("types"));
		result.setUuid(rs.getString("uuid"));
		result.setWatermark(rs.getString("watermark"));
		
		return result;
	}

}
