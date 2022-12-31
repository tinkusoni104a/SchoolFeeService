package com.wecodee.schoolfee.schoolfeeservice.repository;

import com.wecodee.schoolfee.schoolfeeservice.model.StudentPaymentMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface StudentPaymentMasterRepository extends JpaRepository<StudentPaymentMaster, String> {

    List<StudentPaymentMaster> findByStudentId(String studentId);
}
