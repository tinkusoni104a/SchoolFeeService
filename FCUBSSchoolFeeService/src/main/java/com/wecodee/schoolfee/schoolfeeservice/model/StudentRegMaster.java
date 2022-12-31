package com.wecodee.schoolfee.schoolfeeservice.model;

import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.wecodee.schoolfee.schoolfeeservice.model.ids.StudentRegMasterId;

@Entity
@Table(name = "STTM_STUDENT_REG_MASTER")
public class StudentRegMaster {

	@EmbeddedId
	private StudentRegMasterId studentRegMasterId;
	private String studentId;
	private String stSection;
	private String studentName;
	private String stCategory;
	private Date regDate;
	private String addr1;
	private String addr2;
	private String addr3;
	private String city;
	private String phoneNo;
	private String discounted;
	private String recordStat;
	private String authStat;
	private int modNo;
	private String makerId;
	private Date makerDtStamp;
	private String checkerId;
	private Date checkerDtStamp;
	private String onceAuth;

	public StudentRegMaster() {
		super();
	}

	
	

	public StudentRegMaster(StudentRegMasterId studentRegMasterId, String stSection, String studentName,
			String stCategory, Date regDate, String addr1, String addr2, String addr3, String city, String phoneNo,
			String discounted, String recordStat, String authStat, int modNo, String makerId, Date makerDtStamp,
			String checkerId, Date checkerDtStamp, String onceAuth) {
		super();
		this.studentRegMasterId = studentRegMasterId;
		this.stSection = stSection;
		this.studentName = studentName;
		this.stCategory = stCategory;
		this.regDate = regDate;
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.addr3 = addr3;
		this.city = city;
		this.phoneNo = phoneNo;
		this.discounted = discounted;
		this.recordStat = recordStat;
		this.authStat = authStat;
		this.modNo = modNo;
		this.makerId = makerId;
		this.makerDtStamp = makerDtStamp;
		this.checkerId = checkerId;
		this.checkerDtStamp = checkerDtStamp;
		this.onceAuth = onceAuth;
	}




	public StudentRegMasterId getStudentRegMasterId() {
		return studentRegMasterId;
	}

	
	
	public String getStudentId() {
		return studentId;
	}




	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}




	public void setStudentRegMasterId(StudentRegMasterId studentRegMasterId) {
		this.studentRegMasterId = studentRegMasterId;
	}
	
	public String getStSection() {
		return stSection;
	}

	public void setStSection(String stSection) {
		this.stSection = stSection;
	}


	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStCategory() {
		return stCategory;
	}

	public void setStCategory(String stCategory) {
		this.stCategory = stCategory;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
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

	public String getDiscounted() {
		return discounted;
	}

	public void setDiscounted(String discounted) {
		this.discounted = discounted;
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

	public int getModNo() {
		return modNo;
	}

	public void setModNo(int modNo) {
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
		return "StudentRegMaster [studentRegMasterId=" + studentRegMasterId + ", studentId=" + studentId
				+ ", stSection=" + stSection + ", studentName=" + studentName + ", stCategory=" + stCategory
				+ ", regDate=" + regDate + ", addr1=" + addr1 + ", addr2=" + addr2 + ", addr3=" + addr3 + ", city="
				+ city + ", phoneNo=" + phoneNo + ", discounted=" + discounted + ", recordStat=" + recordStat
				+ ", authStat=" + authStat + ", modNo=" + modNo + ", makerId=" + makerId + ", makerDtStamp="
				+ makerDtStamp + ", checkerId=" + checkerId + ", checkerDtStamp=" + checkerDtStamp + ", onceAuth="
				+ onceAuth + "]";
	}




	

	
}
