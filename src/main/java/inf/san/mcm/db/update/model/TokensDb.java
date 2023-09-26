package inf.san.mcm.db.update.model;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TokensDb implements IInsertableUpdatable {

	private String artist;
	private String artistIds;
	private String asciiName;
	private String availability;
	private String boosterTypes;
	private String borderColor;
	private String colorIdentity;
	private String colors;
	private BigDecimal edhrecSaltiness;
	private String faceName;
	private String finishes;
	private String flavorText;
	private String frameEffects;
	private String frameVersion;
	private Boolean hasFoil;
	private Boolean hasNonFoil;
	private Boolean isFullArt;
	private Boolean isFunny;
	private Boolean isPromo;
	private Boolean isReprint;
	private Boolean isTextless;
	private String keywords;
	private String language;
	private String layout;
	private String name;
	private String number;
	private String orientation;
	private String originalText;
	private String originalType;
	private String otherFaceIds;
	private String power;
	private String promoTypes;
	private String relatedCards;
	private String reverseRelated;
	private String securityStamp;
	private String setCode;
	private String side;
	private String signature;
	private String subtypes;
	private String supertypes;
	private String text;
	private String toughness;
	private String type;
	private String types;
	private String uuid;
	private String watermark;

	@Override
	public Object[] forUpdate() {
		return new Object[] {
				this.artist,
				this.artistIds,
				this.asciiName,
				this.availability,
				this.boosterTypes,
				this.borderColor,
				this.colorIdentity,
				this.colors,
				this.edhrecSaltiness,
				this.faceName,
				this.finishes,
				this.flavorText,
				this.frameEffects,
				this.frameVersion,
				this.hasFoil,
				this.hasNonFoil,
				this.isFullArt,
				this.isFunny,
				this.isPromo,
				this.isReprint,
				this.isTextless,
				this.keywords,
				this.language,
				this.layout,
				this.name,
				this.number,
				this.orientation,
				this.originalText,
				this.originalType,
				this.otherFaceIds,
				this.power,
				this.promoTypes,
				this.relatedCards,
				this.reverseRelated,
				this.securityStamp,
				this.setCode,
				this.side,
				this.signature,
				this.subtypes,
				this.supertypes,
				this.text,
				this.toughness,
				this.type,
				this.types,
				this.watermark,
				this.uuid
		};
	}

	@Override
	public Object[] forInsert() {
		return new Object[] {
				this.artist,
				this.artistIds,
				this.asciiName,
				this.availability,
				this.boosterTypes,
				this.borderColor,
				this.colorIdentity,
				this.colors,
				this.edhrecSaltiness,
				this.faceName,
				this.finishes,
				this.flavorText,
				this.frameEffects,
				this.frameVersion,
				this.hasFoil,
				this.hasNonFoil,
				this.isFullArt,
				this.isFunny,
				this.isPromo,
				this.isReprint,
				this.isTextless,
				this.keywords,
				this.language,
				this.layout,
				this.name,
				this.number,
				this.orientation,
				this.originalText,
				this.originalType,
				this.otherFaceIds,
				this.power,
				this.promoTypes,
				this.relatedCards,
				this.reverseRelated,
				this.securityStamp,
				this.setCode,
				this.side,
				this.signature,
				this.subtypes,
				this.supertypes,
				this.text,
				this.toughness,
				this.type,
				this.types,
				this.uuid,
				this.watermark
		};
	}
	
}
