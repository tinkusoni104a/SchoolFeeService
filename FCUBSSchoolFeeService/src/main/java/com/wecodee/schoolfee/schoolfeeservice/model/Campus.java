package com.wecodee.schoolfee.schoolfeeservice.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.wecodee.schoolfee.schoolfeeservice.model.ids.CampusId;

@Entity
@Table(name = "STTM_INST_CAMPUS_MASTER")
public class Campus {

	@EmbeddedId
	private CampusId campusId;

	@Column(name = "CAMPUS_NAME")
	private String campusName;

	@Column(name = "AC_BRANCH")
	private String acBranch;

	@Column(name = "AC_NO")
	private String acNo;

	@Column(name = "CAMPUS_ADDR1")
	private String campusAddr1;

	@Column(name = "CAMPUS_ADDR2")
	private String campusAddr2;

	@Column(name = "CAMPUS_ADDR3")
	private String campusAddr3;

	@Column(name = "CAMPUS_CITY")
	private String campusCity;

	@Column(name = "PHONE_NO")
	private String phoneNo;

	private String recordStat;
	private String authStat;
	private Integer modNo;
	private String makerId;
	private Date makerDtStamp;
	private String checkerId;
	private Date checkerDtStamp;
	private String onceAuth;

	public Campus() {
		super();
	}

	public CampusId getCampusId() {
		return campusId;
	}

	public void setCampusId(CampusId campusId) {
		this.campusId = campusId;
	}

	public String getCampusName() {
		return campusName;
	}

	public void setCampusName(String campusName) {
		this.campusName = campusName;
	}

	public String getAcBranch() {
		return acBranch;
	}

	public void setAcBranch(String acBranch) {
		this.acBranch = acBranch;
	}

	public String getAcNo() {
		return acNo;
	}

	public void setAcNo(String acNo) {
		this.acNo = acNo;
	}

	public String getCampusAddr1() {
		return campusAddr1;
	}

	public void setCampusAddr1(String campusAddr1) {
		this.campusAddr1 = campusAddr1;
	}

	public String getCampusAddr2() {
		return campusAddr2;
	}

	public void setCampusAddr2(String campusAddr2) {
		this.campusAddr2 = campusAddr2;
	}

	public String getCampusAddr3() {
		return campusAddr3;
	}

	public void setCampusAddr3(String campusAddr3) {
		this.campusAddr3 = campusAddr3;
	}

	public String getCampusCity() {
		return campusCity;
	}

	public void setCampusCity(String campusCity) {
		this.campusCity = campusCity;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getRecordStat() {
		return recordStat;
	}

	public void setRecordStat(String recordStat) {
		this.recordStat = recordStat;
	}

	public String getAuthStat() {
		return authStat;
	}

	public void setAuthStat(String authStat) {
		this.authStat = authStat;
	}

	public Integer getModNo() {
		return modNo;
	}

	public void setModNo(Integer modNo) {
		this.modNo = modNo;
	}

	public String getMakerId() {
		return makerId;
	}

	public void setMakerId(String makerId) {
		this.makerId = makerId;
	}

	public Date getMakerDtStamp() {
		return makerDtStamp;
	}

	public void setMakerDtStamp(Date makerDtStamp) {
		this.makerDtStamp = makerDtStamp;
	}

	public String getCheckerId() {
		return checkerId;
	}

	public void setCheckerId(String checkerId) {
		this.checkerId = checkerId;
	}

	public Date getCheckerDtStamp() {
		return checkerDtStamp;
	}

	public void setCheckerDtStamp(Date checkerDtStamp) {
		this.checkerDtStamp = checkerDtStamp;
	}

	public String getOnceAuth() {
		return onceAuth;
	}

	public void setOnceAuth(String onceAuth) {
		this.onceAuth = onceAuth;
	}

	@Override
	public String toString() {
		return "Campus [campusId=" + campusId + ", campusName=" + campusName + ", acBranch=" + acBranch + ", acNo="
				+ acNo + ", campusAddr1=" + campusAddr1 + ", campusAddr2=" + campusAddr2 + ", campusAddr3="
				+ campusAddr3 + ", campusCity=" + campusCity + ", phoneNo=" + phoneNo + ", recordStat=" + recordStat
				+ ", authStat=" + authStat + ", modNo=" + modNo + ", makerId=" + makerId + ", makerDtStamp="
				+ makerDtStamp + ", checkerId=" + checkerId + ", checkerDtStamp=" + checkerDtStamp + ", onceAuth="
				+ onceAuth + "]";
	}

}
