package com.wecodee.schoolfee.schoolfeeservice.model.ids;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class CampusId implements Serializable{
	private String campusId;
	private String institutionId;
	
	
	
	public CampusId() {
		super();
	}

	public CampusId(String campusId, String institutionId) {
		super();
		this.campusId = campusId;
		this.institutionId = institutionId;
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
	public String toString() {
		return "CampusId [campusId=" + campusId + ", institutionId=" + institutionId + ", getCampusId()="
				+ getCampusId() + ", getInstitutionId()=" + getInstitutionId() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(campusId, institutionId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CampusId other = (CampusId) obj;
		return Objects.equals(campusId, other.campusId) && Objects.equals(institutionId, other.institutionId);
	}
	
	
	
	
	
	

}
