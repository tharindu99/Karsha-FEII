package lsf.FEII.model;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * EjRelationshipsId generated by hbm2java
 */
@Embeddable
public class EjRelationshipsId implements java.io.Serializable {

	private String idRssdParent;
	private String idRssdOffspring;
	private String DDtStart;
	private String relnLvl;

	public EjRelationshipsId() {
	}

	public EjRelationshipsId(String idRssdParent, String idRssdOffspring,
			String DDtStart, String relnLvl) {
		this.idRssdParent = idRssdParent;
		this.idRssdOffspring = idRssdOffspring;
		this.DDtStart = DDtStart;
		this.relnLvl = relnLvl;
	}

	@Column(name = "ID_RSSD_PARENT", nullable = false)
	public String getIdRssdParent() {
		return this.idRssdParent;
	}

	public void setIdRssdParent(String idRssdParent) {
		this.idRssdParent = idRssdParent;
	}

	@Column(name = "ID_RSSD_OFFSPRING", nullable = false)
	public String getIdRssdOffspring() {
		return this.idRssdOffspring;
	}

	public void setIdRssdOffspring(String idRssdOffspring) {
		this.idRssdOffspring = idRssdOffspring;
	}

	@Column(name = "D_DT_START", nullable = false)
	public String getDDtStart() {
		return this.DDtStart;
	}

	public void setDDtStart(String DDtStart) {
		this.DDtStart = DDtStart;
	}

	@Column(name = "RELN_LVL", nullable = false)
	public String getRelnLvl() {
		return this.relnLvl;
	}

	public void setRelnLvl(String relnLvl) {
		this.relnLvl = relnLvl;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EjRelationshipsId))
			return false;
		EjRelationshipsId castOther = (EjRelationshipsId) other;

		return ((this.getIdRssdParent() == castOther.getIdRssdParent()) || (this
				.getIdRssdParent() != null
				&& castOther.getIdRssdParent() != null && this
				.getIdRssdParent().equals(castOther.getIdRssdParent())))
				&& ((this.getIdRssdOffspring() == castOther
						.getIdRssdOffspring()) || (this.getIdRssdOffspring() != null
						&& castOther.getIdRssdOffspring() != null && this
						.getIdRssdOffspring().equals(
								castOther.getIdRssdOffspring())))
				&& ((this.getDDtStart() == castOther.getDDtStart()) || (this
						.getDDtStart() != null
						&& castOther.getDDtStart() != null && this
						.getDDtStart().equals(castOther.getDDtStart())))
				&& ((this.getRelnLvl() == castOther.getRelnLvl()) || (this
						.getRelnLvl() != null && castOther.getRelnLvl() != null && this
						.getRelnLvl().equals(castOther.getRelnLvl())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getIdRssdParent() == null ? 0 : this.getIdRssdParent()
						.hashCode());
		result = 37
				* result
				+ (getIdRssdOffspring() == null ? 0 : this.getIdRssdOffspring()
						.hashCode());
		result = 37 * result
				+ (getDDtStart() == null ? 0 : this.getDDtStart().hashCode());
		result = 37 * result
				+ (getRelnLvl() == null ? 0 : this.getRelnLvl().hashCode());
		return result;
	}

}
