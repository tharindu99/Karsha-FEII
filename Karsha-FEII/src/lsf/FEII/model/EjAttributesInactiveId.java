package lsf.FEII.model;
// Generated Oct 24, 2016 12:54:05 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * EjAttributesInactiveId generated by hbm2java
 */
@Embeddable
public class EjAttributesInactiveId implements java.io.Serializable {

	private String idRssd;
	private String DDtStart;

	public EjAttributesInactiveId() {
	}

	public EjAttributesInactiveId(String idRssd, String DDtStart) {
		this.idRssd = idRssd;
		this.DDtStart = DDtStart;
	}

	@Column(name = "ID_RSSD", nullable = false)
	public String getIdRssd() {
		return this.idRssd;
	}

	public void setIdRssd(String idRssd) {
		this.idRssd = idRssd;
	}

	@Column(name = "D_DT_START", nullable = false)
	public String getDDtStart() {
		return this.DDtStart;
	}

	public void setDDtStart(String DDtStart) {
		this.DDtStart = DDtStart;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EjAttributesInactiveId))
			return false;
		EjAttributesInactiveId castOther = (EjAttributesInactiveId) other;

		return ((this.getIdRssd() == castOther.getIdRssd()) || (this
				.getIdRssd() != null && castOther.getIdRssd() != null && this
				.getIdRssd().equals(castOther.getIdRssd())))
				&& ((this.getDDtStart() == castOther.getDDtStart()) || (this
						.getDDtStart() != null
						&& castOther.getDDtStart() != null && this
						.getDDtStart().equals(castOther.getDDtStart())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getIdRssd() == null ? 0 : this.getIdRssd().hashCode());
		result = 37 * result
				+ (getDDtStart() == null ? 0 : this.getDDtStart().hashCode());
		return result;
	}

}
