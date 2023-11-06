package inf.san.mcm.db.update.mapper.row;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import inf.san.mcm.db.update.model.CardsDb;

public class CardsDbRowMapper extends AbstractDbRowMapper implements RowMapper<CardsDb> {

	@Override
	public CardsDb mapRow(ResultSet rs, int rowNum) throws SQLException {
		CardsDb result = new CardsDb();
		
		result.setArtist(rs.getString("artist"));
		result.setArtistIds(rs.getString("artistIds"));
		result.setAsciiName(rs.getString("asciiName"));
		result.setAttractionLights(rs.getString("attractionLights"));
		result.setAvailability(rs.getString("availability"));
		result.setBoosterTypes(rs.getString("boosterTypes"));
		result.setBorderColor(rs.getString("borderColor"));
		result.setCardParts(rs.getString("cardParts"));
		result.setColorIdentity(rs.getString("colorIdentity"));
		result.setColorIndicator(rs.getString("colorIndicator"));
		result.setColors(rs.getString("colors"));
		result.setDefense(rs.getString("defense"));
		result.setDuelDeck(rs.getString("duelDeck"));
		result.setEdhrecRank(getIntOrNull(rs, "edhrecRank"));
		result.setEdhrecSaltiness(rs.getBigDecimal("edhrecSaltiness"));
		result.setFaceConvertedManaCost(rs.getBigDecimal("faceConvertedManaCost"));
		result.setFaceFlavorName(rs.getString("faceFlavorName"));
		result.setFaceManaValue(rs.getBigDecimal("faceManaValue"));
		result.setFaceName(rs.getString("faceName"));
		result.setFinishes(rs.getString("finishes"));
		result.setFlavorName(rs.getString("flavorName"));
		result.setFlavorText(rs.getString("flavorText"));
		result.setFrameEffects(rs.getString("frameEffects"));
		result.setFrameVersion(rs.getString("frameVersion"));
		result.setHand(rs.getString("hand"));
		result.setHasAlternativeDeckLimit(getBooleanOrNull(rs, "hasAlternativeDeckLimit"));
		result.setHasContentWarning(getBooleanOrNull(rs, "hasContentWarning"));
		result.setHasFoil(getBooleanOrNull(rs, "hasFoil"));
		result.setHasNonFoil(getBooleanOrNull(rs, "hasNonFoil"));
		result.setIsAlternative(getBooleanOrNull(rs, "isAlternative"));
		result.setIsFullArt(getBooleanOrNull(rs, "isFullArt"));
		result.setIsFunny(getBooleanOrNull(rs, "isFunny"));
		result.setIsOnlineOnly(getBooleanOrNull(rs, "isOnlineOnly"));
		result.setIsOversized(getBooleanOrNull(rs, "isOversized"));
		result.setIsPromo(getBooleanOrNull(rs, "isPromo"));
		result.setIsRebalanced(getBooleanOrNull(rs, "isRebalanced"));
		result.setIsReprint(getBooleanOrNull(rs, "isReprint"));
		result.setIsReserved(getBooleanOrNull(rs, "isReserved"));
		result.setIsStarter(getBooleanOrNull(rs, "isStarter"));
		result.setIsStorySpotlight(getBooleanOrNull(rs, "isStorySpotlight"));
		result.setIsTextless(getBooleanOrNull(rs, "isTextless"));
		result.setIsTimeshifted(getBooleanOrNull(rs, "isTimeshifted"));
		result.setKeywords(rs.getString("keywords"));
		result.setLanguage(rs.getString("language"));
		result.setLayout(rs.getString("layout"));
		result.setLeadershipSkills(rs.getString("leadershipSkills"));
		result.setLife(rs.getString("life"));
		result.setLoyalty(rs.getString("loyalty"));
		result.setManaCost(rs.getString("manaCost"));
		result.setManaValue(rs.getBigDecimal("manaValue"));
		result.setName(rs.getString("name"));
		result.setNumber(rs.getString("number"));
		result.setOriginalPrintings(rs.getString("originalPrintings"));
		result.setOriginalReleaseDate(rs.getString("originalReleaseDate"));
		result.setOriginalText(rs.getString("originalText"));
		result.setOriginalType(rs.getString("originalType"));
		result.setOtherFaceIds(rs.getString("otherFaceIds"));
		result.setPower(rs.getString("power"));
		result.setPrintings(rs.getString("printings"));
		result.setPromoTypes(rs.getString("promoTypes"));
		result.setRarity(rs.getString("rarity"));
		result.setRebalancedPrintings(rs.getString("rebalancedPrintings"));
		result.setRelatedCards(rs.getString("relatedCards"));
		result.setSecurityStamp(rs.getString("securityStamp"));
		result.setSetCode(rs.getString("setCode"));
		result.setSide(rs.getString("side"));
		result.setSignature(rs.getString("signature"));
		result.setSourceProducts(rs.getString("sourceProducts"));
		result.setSubsets(rs.getString("subsets"));
		result.setSubtypes(rs.getString("subtypes"));
		result.setSupertypes(rs.getString("supertypes"));
		result.setText(rs.getString("text"));
		result.setToughness(rs.getString("toughness"));
		result.setType(rs.getString("type"));
		result.setTypes(rs.getString("types"));
		result.setUuid(rs.getString("uuid"));
		result.setVariations(rs.getString("variations"));
		result.setWatermark(rs.getString("watermark"));
		
		return result;
	}

}
