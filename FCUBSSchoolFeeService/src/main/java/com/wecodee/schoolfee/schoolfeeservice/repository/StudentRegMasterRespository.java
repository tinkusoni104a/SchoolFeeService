package com.wecodee.schoolfee.schoolfeeservice.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wecodee.schoolfee.schoolfeeservice.model.StudentRegMaster;
import com.wecodee.schoolfee.schoolfeeservice.model.ids.StudentRegMasterId;

public interface StudentRegMasterRespository extends JpaRepository<StudentRegMaster, StudentRegMasterId> {

	List<StudentRegMaster> findByPhoneNoAndRecordStat(String phoneNo, String recordStat);

	Optional<StudentRegMaster> findById(StudentRegMasterId studentRegMasterId);

	// @Transactional
	Optional<StudentRegMaster> findByStudentRegMasterIdAndRecordStat(StudentRegMasterId studentRegMasterId,
			String recordStat);

	Optional<StudentRegMaster> findByStudentIdAndRecordStat(String studentid, String recordStat);

	boolean existsByStudentId(String studentid);

}
