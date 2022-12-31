package com.wecodee.schoolfee.schoolfeeservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wecodee.schoolfee.schoolfeeservice.model.StudentPaySchedules;


public interface StudentPaySchedulesRepository extends JpaRepository<StudentPaySchedules, String> {

    List<StudentPaySchedules> findByStudentPaySchedulesIdPaymentRefNoOrderByStudentPaySchedulesIdPaymentDueDtAsc(String paymentRefNo);

}
