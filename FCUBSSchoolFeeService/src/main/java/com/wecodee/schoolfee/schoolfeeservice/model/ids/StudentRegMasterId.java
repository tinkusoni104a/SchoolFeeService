package com.wecodee.schoolfee.schoolfeeservice.model.ids;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class StudentRegMasterId implements Serializable {

	private String studentNumber;
	private String stGrade;
	private String campusId;
	private String institutionId;

	public StudentRegMasterId() {
		super();
	}

	public StudentRegMasterId( String studentNumber, String stGrade, String campusId,
			String institutionId) {
		super();
		this.studentNumber = studentNumber;
		this.stGrade = stGrade;
		this.campusId = campusId;
		this.institutionId = institutionId;
	}

	

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getStGrade() {
		return stGrade;
	}

	public void setStGrade(String stGrade) {
		this.stGrade = stGrade;
	}

	public String getCampusId() {
		return campusId;
	}

	public void setCampusId(String campusId) {
		this.campusId = campusId;
	}

	public String getInstitutionId() {
		return institutionId;
	}

	public void setInstitutionId(String institutionId) {
		this.institutionId = institutionId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(campusId, institutionId, stGrade, studentNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentRegMasterId other = (StudentRegMasterId) obj;
		return Objects.equals(campusId, other.campusId) && Objects.equals(institutionId, other.institutionId)
				&& Objects.equals(stGrade, other.stGrade) 
				&& Objects.equals(studentNumber, other.studentNumber);
	}

	@Override
	public String toString() {
		return "StudentRegMasterId [ studentNumber=" + studentNumber + ", stGrade="
				+ stGrade + ", campusId=" + campusId + ", institutionId=" + institutionId + "]";
	}

}
