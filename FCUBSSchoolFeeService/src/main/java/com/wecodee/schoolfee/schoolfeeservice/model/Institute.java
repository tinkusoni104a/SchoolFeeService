package com.wecodee.schoolfee.schoolfeeservice.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STTM_INSTITUTION_MASTER")
public class Institute {

	@Id
	@Column(name = "inst_id")
	private String instId;

	@Column(name = "inst_name")
	private String instName;

	@Column(name = "ac_branch")
	private String acBranch;

	@Column(name = "ac_no")
	private String acNo;

	@Column(name = "addr1")
	private String addr1;

	@Column(name = "addr2")
	private String addr2;

	@Column(name = "addr3")
	private String addr3;

	@Column(name = "city")
	private String city;

	@Column(name = "phone_no")
	private String phoneNo;

	@Column(name = "partial_payment")
	private String partialPayment;

	private String recordStat;
	private String authStat;
	private Integer modNo;
	private String makerId;
	private Date makerDtStamp;
	private String checkerId;
	private Date checkerDtStamp;
	private String onceAuth;

	public Institute() {
		super();
	}

	public String getInstId() {
		return instId;
	}

	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getInstName() {
		return instName;
	}

	public void setInstName(String instName) {
		this.instName = instName;
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

	public String getAddr1() {
		return addr1;
	}

	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}

	public String getAddr2() {
		return addr2;
	}

	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}

	public String getAddr3() {
		return addr3;
	}

	public void setAddr3(String addr3) {
		this.addr3 = addr3;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getPartialPayment() {
		return partialPayment;
	}

	public void setPartialPayment(String partialPayment) {
		this.partialPayment = partialPayment;
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
		return "Institute [instId=" + instId + ", instName=" + instName + ", acBranch=" + acBranch + ", acNo=" + acNo
				+ ", addr1=" + addr1 + ", addr2=" + addr2 + ", addr3=" + addr3 + ", city=" + city + ", phoneNo="
				+ phoneNo + ", partialPayment=" + partialPayment + ", recordStat=" + recordStat + ", authStat="
				+ authStat + ", modNo=" + modNo + ", makerId=" + makerId + ", makerDtStamp=" + makerDtStamp
				+ ", checkerId=" + checkerId + ", checkerDtStamp=" + checkerDtStamp + ", onceAuth=" + onceAuth + "]";
	}

}
