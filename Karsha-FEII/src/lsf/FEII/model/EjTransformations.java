package lsf.FEII.model;
// Generated Oct 24, 2016 12:54:05 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * EjTransformations generated by hbm2java
 */
@Entity
@Table(name = "ej_transformations", catalog = "feiii_db")
public class EjTransformations implements java.io.Serializable {

	private EjTransformationsId id;
	private String trnsfmCd;
	private String acctMethod;
	private String dtTrans;

	public EjTransformations() {
	}

	public EjTransformations(EjTransformationsId id) {
		this.id = id;
	}

	public EjTransformations(EjTransformationsId id, String trnsfmCd,
			String acctMethod, String dtTrans) {
		this.id = id;
		this.trnsfmCd = trnsfmCd;
		this.acctMethod = acctMethod;
		this.dtTrans = dtTrans;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "idRssdPredecessor", column = @Column(name = "ID_RSSD_PREDECESSOR", nullable = false)),
			@AttributeOverride(name = "idRssdSuccessor", column = @Column(name = "ID_RSSD_SUCCESSOR", nullable = false)),
			@AttributeOverride(name = "DDtTrans", column = @Column(name = "D_DT_TRANS", nullable = false)) })
	public EjTransformationsId getId() {
		return this.id;
	}

	public void setId(EjTransformationsId id) {
		this.id = id;
	}

	@Column(name = "TRNSFM_CD")
	public String getTrnsfmCd() {
		return this.trnsfmCd;
	}

	public void setTrnsfmCd(String trnsfmCd) {
		this.trnsfmCd = trnsfmCd;
	}

	@Column(name = "ACCT_METHOD")
	public String getAcctMethod() {
		return this.acctMethod;
	}

	public void setAcctMethod(String acctMethod) {
		this.acctMethod = acctMethod;
	}

	@Column(name = "DT_TRANS")
	public String getDtTrans() {
		return this.dtTrans;
	}

	public void setDtTrans(String dtTrans) {
		this.dtTrans = dtTrans;
	}

}