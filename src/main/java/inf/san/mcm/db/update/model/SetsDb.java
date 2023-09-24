package inf.san.mcm.db.update.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SetsDb {

	private Integer baseSetSize;
	private String block;
	private Integer cardsphereSetId;
	private String code;
	private Boolean isFoilOnly;
	private Boolean isForeignOnly;
	private Boolean isNonFoilOnly;
	private Boolean isOnlineOnly;
	private Boolean isPartialPreview;
	private String keyruneCode;
	private String languages;
	private Integer mcmId;
	private Integer mcmIdExtras;
	private String mcmName;
	private String mtgoCode;
	private String name;
	private String parentCode;
	private String releaseDate;
	private Integer tcgplayerGroupId;
	private String tokenSetCode;
	private Integer totalSetSize;
	private String type;
	
	public Object[] forInsert() {
		return new Object[] {
				this.baseSetSize,
				this.block,
				this.cardsphereSetId,
				this.code,
				this.isFoilOnly,
				this.isForeignOnly,
				this.isNonFoilOnly,
				this.isOnlineOnly,
				this.isPartialPreview,
				this.keyruneCode,
				this.languages,
				this.mcmId,
				this.mcmIdExtras,
				this.mcmName,
				this.mtgoCode,
				this.name,
				this.parentCode,
				this.releaseDate,
				this.tcgplayerGroupId,
				this.tokenSetCode,
				this.totalSetSize,
				this.type
		};
	}
	
	public Object[] forUpdate() {
		return new Object[] {
				this.baseSetSize,
				this.block,
				this.cardsphereSetId,
				this.isFoilOnly,
				this.isForeignOnly,
				this.isNonFoilOnly,
				this.isOnlineOnly,
				this.isPartialPreview,
				this.keyruneCode,
				this.languages,
				this.mcmId,
				this.mcmIdExtras,
				this.mcmName,
				this.mtgoCode,
				this.name,
				this.parentCode,
				this.releaseDate,
				this.tcgplayerGroupId,
				this.tokenSetCode,
				this.totalSetSize,
				this.type,
				this.code
		};
	}
	
}
