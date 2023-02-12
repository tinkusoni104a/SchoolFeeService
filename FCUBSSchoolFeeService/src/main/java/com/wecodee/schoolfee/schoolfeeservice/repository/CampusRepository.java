package com.wecodee.schoolfee.schoolfeeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wecodee.schoolfee.schoolfeeservice.model.Campus;
import com.wecodee.schoolfee.schoolfeeservice.model.ids.CampusId;

public interface CampusRepository extends JpaRepository<Campus, CampusId>{

}
