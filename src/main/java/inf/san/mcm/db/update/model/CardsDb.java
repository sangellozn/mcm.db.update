package inf.san.mcm.db.update.model;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CardsDb implements IInsertableUpdatable {
	
	private String artist;
	private String artistIds;
	private String asciiName;
	private String attractionLights;
	private String availability;
	private String boosterTypes;
	private String borderColor;
	private String cardParts;
	private String colorIdentity;
	private String colorIndicator;
	private String colors;
	private String defense;
	private String duelDeck;
	private Integer edhrecRank;
	private BigDecimal edhrecSaltiness;
	private BigDecimal faceConvertedManaCost;
	private String faceFlavorName;
	private BigDecimal faceManaValue;
	private String faceName;
	private String finishes;
	private String flavorName;
	private String flavorText;
	private String frameEffects;
	private String frameVersion;
	private String hand;
	private Boolean hasAlternativeDeckLimit;
	private Boolean hasContentWarning;
	private Boolean hasFoil;
	private Boolean hasNonFoil;
	private Boolean isAlternative;
	private Boolean isFullArt;
	private Boolean isFunny;
	private Boolean isOnlineOnly;
	private Boolean isOversized;
	private Boolean isPromo;
	private Boolean isRebalanced;
	private Boolean isReprint;
	private Boolean isReserved;
	private Boolean isStarter;
	private Boolean isStorySpotlight;
	private Boolean isTextless;
	private Boolean isTimeshifted;
	private String keywords;
	private String language;
	private String layout;
	private String leadershipSkills;
	private String life;
	private String loyalty;
	private String manaCost;
	private BigDecimal manaValue;
	private String name;
	private String number;
	private String originalPrintings;
	private String originalReleaseDate;
	private String originalText;
	private String originalType;
	private String otherFaceIds;
	private String power;
	private String printings;
	private String promoTypes;
	private String rarity;
	private String rebalancedPrintings;
	private String relatedCards;
	private String securityStamp;
	private String setCode;
	private String side;
	private String signature;
	private String sourceProducts;
	private String subsets;
	private String subtypes;
	private String supertypes;
	private String text;
	private String toughness;
	private String type;
	private String types;
	private String uuid;
	private String variations;
	private String watermark;
	
	@Override
	public Object[] forUpdate() {
		return new Object[] {
				artist,
				artistIds,
				asciiName,
				attractionLights,
				availability,
				boosterTypes,
				borderColor,
				cardParts,
				colorIdentity,
				colorIndicator,
				colors,
				defense,
				duelDeck,
				edhrecRank,
				edhrecSaltiness,
				faceConvertedManaCost,
				faceFlavorName,
				faceManaValue,
				faceName,
				finishes,
				flavorName,
				flavorText,
				frameEffects,
				frameVersion,
				hand,
				hasAlternativeDeckLimit,
				hasContentWarning,
				hasFoil,
				hasNonFoil,
				isAlternative,
				isFullArt,
				isFunny,
				isOnlineOnly,
				isOversized,
				isPromo,
				isRebalanced,
				isReprint,
				isReserved,
				isStarter,
				isStorySpotlight,
				isTextless,
				isTimeshifted,
				keywords,
				language,
				layout,
				leadershipSkills,
				life,
				loyalty,
				manaCost,
				manaValue,
				name,
				number,
				originalPrintings,
				originalReleaseDate,
				originalText,
				originalType,
				otherFaceIds,
				power,
				printings,
				promoTypes,
				rarity,
				rebalancedPrintings,
				relatedCards,
				securityStamp,
				setCode,
				side,
				signature,
				sourceProducts,
				subsets,
				subtypes,
				supertypes,
				text,
				toughness,
				type,
				types,
				variations,
				watermark,
				uuid
		};
	}

	@Override
	public Object[] forInsert() {
		return new Object[] {
				artist,
				artistIds,
				asciiName,
				attractionLights,
				availability,
				boosterTypes,
				borderColor,
				cardParts,
				colorIdentity,
				colorIndicator,
				colors,
				defense,
				duelDeck,
				edhrecRank,
				edhrecSaltiness,
				faceConvertedManaCost,
				faceFlavorName,
				faceManaValue,
				faceName,
				finishes,
				flavorName,
				flavorText,
				frameEffects,
				frameVersion,
				hand,
				hasAlternativeDeckLimit,
				hasContentWarning,
				hasFoil,
				hasNonFoil,
				isAlternative,
				isFullArt,
				isFunny,
				isOnlineOnly,
				isOversized,
				isPromo,
				isRebalanced,
				isReprint,
				isReserved,
				isStarter,
				isStorySpotlight,
				isTextless,
				isTimeshifted,
				keywords,
				language,
				layout,
				leadershipSkills,
				life,
				loyalty,
				manaCost,
				manaValue,
				name,
				number,
				originalPrintings,
				originalReleaseDate,
				originalText,
				originalType,
				otherFaceIds,
				power,
				printings,
				promoTypes,
				rarity,
				rebalancedPrintings,
				relatedCards,
				securityStamp,
				setCode,
				side,
				signature,
				sourceProducts,
				subsets,
				subtypes,
				supertypes,
				text,
				toughness,
				type,
				types,
				uuid,
				variations,
				watermark
		};
	}

}
