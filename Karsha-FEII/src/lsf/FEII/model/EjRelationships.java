package lsf.FEII.model;
// Generated Oct 24, 2016 12:54:05 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * EjRelationships generated by hbm2java
 */
@Entity
@Table(name = "ej_relationships", catalog = "feiii_db")
public class EjRelationships implements java.io.Serializable {

	private EjRelationshipsId id;
	private String ctrlInd;
	private String DDtRelnEst;
	private String equityInd;
	private String otherBasisInd;
	private String pctEquity;
	private String pctOther;
	private String reasonRowCrtd;
	private String reasonTermReln;
	private String regInd;
	private String pctEquityBracket;
	private String pctEquityFormat;
	private String DDtEnd;
	private String mbCost;
	private String fcInd;
	private String regkInv;
	private String dtEnd;
	private String dtRelnEst;
	private String dtStart;

	public EjRelationships() {
	}

	public EjRelationships(EjRelationshipsId id) {
		this.id = id;
	}

	public EjRelationships(EjRelationshipsId id, String ctrlInd,
			String DDtRelnEst, String equityInd, String otherBasisInd,
			String pctEquity, String pctOther, String reasonRowCrtd,
			String reasonTermReln, String regInd, String pctEquityBracket,
			String pctEquityFormat, String DDtEnd, String mbCost, String fcInd,
			String regkInv, String dtEnd, String dtRelnEst, String dtStart) {
		this.id = id;
		this.ctrlInd = ctrlInd;
		this.DDtRelnEst = DDtRelnEst;
		this.equityInd = equityInd;
		this.otherBasisInd = otherBasisInd;
		this.pctEquity = pctEquity;
		this.pctOther = pctOther;
		this.reasonRowCrtd = reasonRowCrtd;
		this.reasonTermReln = reasonTermReln;
		this.regInd = regInd;
		this.pctEquityBracket = pctEquityBracket;
		this.pctEquityFormat = pctEquityFormat;
		this.DDtEnd = DDtEnd;
		this.mbCost = mbCost;
		this.fcInd = fcInd;
		this.regkInv = regkInv;
		this.dtEnd = dtEnd;
		this.dtRelnEst = dtRelnEst;
		this.dtStart = dtStart;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "idRssdParent", column = @Column(name = "ID_RSSD_PARENT", nullable = false)),
			@AttributeOverride(name = "idRssdOffspring", column = @Column(name = "ID_RSSD_OFFSPRING", nullable = false)),
			@AttributeOverride(name = "DDtStart", column = @Column(name = "D_DT_START", nullable = false)),
			@AttributeOverride(name = "relnLvl", column = @Column(name = "RELN_LVL", nullable = false)) })
	public EjRelationshipsId getId() {
		return this.id;
	}

	public void setId(EjRelationshipsId id) {
		this.id = id;
	}

	@Column(name = "CTRL_IND")
	public String getCtrlInd() {
		return this.ctrlInd;
	}

	public void setCtrlInd(String ctrlInd) {
		this.ctrlInd = ctrlInd;
	}

	@Column(name = "D_DT_RELN_EST")
	public String getDDtRelnEst() {
		return this.DDtRelnEst;
	}

	public void setDDtRelnEst(String DDtRelnEst) {
		this.DDtRelnEst = DDtRelnEst;
	}

	@Column(name = "EQUITY_IND")
	public String getEquityInd() {
		return this.equityInd;
	}

	public void setEquityInd(String equityInd) {
		this.equityInd = equityInd;
	}

	@Column(name = "OTHER_BASIS_IND")
	public String getOtherBasisInd() {
		return this.otherBasisInd;
	}

	public void setOtherBasisInd(String otherBasisInd) {
		this.otherBasisInd = otherBasisInd;
	}

	@Column(name = "PCT_EQUITY")
	public String getPctEquity() {
		return this.pctEquity;
	}

	public void setPctEquity(String pctEquity) {
		this.pctEquity = pctEquity;
	}

	@Column(name = "PCT_OTHER")
	public String getPctOther() {
		return this.pctOther;
	}

	public void setPctOther(String pctOther) {
		this.pctOther = pctOther;
	}

	@Column(name = "REASON_ROW_CRTD")
	public String getReasonRowCrtd() {
		return this.reasonRowCrtd;
	}

	public void setReasonRowCrtd(String reasonRowCrtd) {
		this.reasonRowCrtd = reasonRowCrtd;
	}

	@Column(name = "REASON_TERM_RELN")
	public String getReasonTermReln() {
		return this.reasonTermReln;
	}

	public void setReasonTermReln(String reasonTermReln) {
		this.reasonTermReln = reasonTermReln;
	}

	@Column(name = "REG_IND")
	public String getRegInd() {
		return this.regInd;
	}

	public void setRegInd(String regInd) {
		this.regInd = regInd;
	}

	@Column(name = "PCT_EQUITY_BRACKET")
	public String getPctEquityBracket() {
		return this.pctEquityBracket;
	}

	public void setPctEquityBracket(String pctEquityBracket) {
		this.pctEquityBracket = pctEquityBracket;
	}

	@Column(name = "PCT_EQUITY_FORMAT")
	public String getPctEquityFormat() {
		return this.pctEquityFormat;
	}

	public void setPctEquityFormat(String pctEquityFormat) {
		this.pctEquityFormat = pctEquityFormat;
	}

	@Column(name = "D_DT_END")
	public String getDDtEnd() {
		return this.DDtEnd;
	}

	public void setDDtEnd(String DDtEnd) {
		this.DDtEnd = DDtEnd;
	}

	@Column(name = "MB_COST")
	public String getMbCost() {
		return this.mbCost;
	}

	public void setMbCost(String mbCost) {
		this.mbCost = mbCost;
	}

	@Column(name = "FC_IND")
	public String getFcInd() {
		return this.fcInd;
	}

	public void setFcInd(String fcInd) {
		this.fcInd = fcInd;
	}

	@Column(name = "REGK_INV")
	public String getRegkInv() {
		return this.regkInv;
	}

	public void setRegkInv(String regkInv) {
		this.regkInv = regkInv;
	}

	@Column(name = "DT_END")
	public String getDtEnd() {
		return this.dtEnd;
	}

	public void setDtEnd(String dtEnd) {
		this.dtEnd = dtEnd;
	}

	@Column(name = "DT_RELN_EST")
	public String getDtRelnEst() {
		return this.dtRelnEst;
	}

	public void setDtRelnEst(String dtRelnEst) {
		this.dtRelnEst = dtRelnEst;
	}

	@Column(name = "DT_START")
	public String getDtStart() {
		return this.dtStart;
	}

	public void setDtStart(String dtStart) {
		this.dtStart = dtStart;
	}

}
