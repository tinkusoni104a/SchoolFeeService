package com.wecodee.schoolfee.schoolfeeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wecodee.schoolfee.schoolfeeservice.model.Institute;

public interface InstituteRepository  extends JpaRepository<Institute, String>{

	public Institute findByInstId(String institutionId);
	

}
