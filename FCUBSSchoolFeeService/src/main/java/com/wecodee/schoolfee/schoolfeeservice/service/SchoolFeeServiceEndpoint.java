package com.wecodee.schoolfee.schoolfeeservice.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.wecodee.schoolfee.schoolfeeservice.constant.SchoolFeeServiceConstant;
import com.wecodee.schoolfee.schoolfeeservice.model.Campus;
import com.wecodee.schoolfee.schoolfeeservice.model.StudentPaySchedules;
import com.wecodee.schoolfee.schoolfeeservice.model.StudentPaymentMaster;
import com.wecodee.schoolfee.schoolfeeservice.model.StudentRegMaster;
import com.wecodee.schoolfee.schoolfeeservice.model.ids.CampusId;
import com.wecodee.schoolfee.schoolfeeservice.model.ids.StudentRegMasterId;
import com.wecodee.schoolfee.schoolfeeservice.repository.CampusRepository;
import com.wecodee.schoolfee.schoolfeeservice.repository.InstituteRepository;
import com.wecodee.schoolfee.schoolfeeservice.repository.StudentPaySchedulesRepository;
import com.wecodee.schoolfee.schoolfeeservice.repository.StudentPaymentMasterRepository;
import com.wecodee.schoolfee.schoolfeeservice.repository.StudentRegMasterRespository;
import com.wecodee.webservice.schoolfeeservice.FeePaymentDetails;
import com.wecodee.webservice.schoolfeeservice.PaymentScheduleDetails;
import com.wecodee.webservice.schoolfeeservice.QueryByStudentDetailsRequest;
import com.wecodee.webservice.schoolfeeservice.QueryByStudentIdRequest;
import com.wecodee.webservice.schoolfeeservice.SchoolFeeDetailsBody;
import com.wecodee.webservice.schoolfeeservice.SchoolFeeDetailsRequest;
import com.wecodee.webservice.schoolfeeservice.SchoolFeeDetailsResponse;
import com.wecodee.webservice.schoolfeeservice.StudentDetails;

@Endpoint
public class SchoolFeeServiceEndpoint {

	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private StudentRegMasterRespository studentRegMasterRespository;
	@Autowired
	private StudentPaymentMasterRepository studentPaymentMasterRepository;
	@Autowired
	private StudentPaySchedulesRepository studentPaySchedulesRepository;

	@Autowired
	private InstituteRepository instituteRepository;
	@Autowired
	private CampusRepository campusRepository;
	@Autowired
	private Utils utils;

	@PayloadRoot(namespace = SchoolFeeServiceConstant.NAMESPACE_URI, localPart = "SchoolFeeDetailsRequest")
	@ResponsePayload
	public SchoolFeeDetailsResponse querySchoolFeeDetails(@RequestPayload SchoolFeeDetailsRequest request) {
		SchoolFeeDetailsResponse response = new SchoolFeeDetailsResponse();
		SchoolFeeDetailsBody schoolFeeDetailsBody = new SchoolFeeDetailsBody();
		StudentDetails studentDetails = null;
		try {
			log.info("In querySchoolFeeDetails..");

			List<StudentRegMaster> studentRegMasterList = studentRegMasterRespository
					.findByPhoneNoAndRecordStat(request.getQueryByPhoneNoBody().getPHONENO(), "O");

			if (studentRegMasterList.size() < 1) {
				request.getHeader().setMSGSTAT("FAILURE");
				response.setHeader(request.getHeader());
			} else {

				for (StudentRegMaster studentRegMaster : studentRegMasterList) {
					studentDetails = buildStudentDetails(studentRegMaster);
					schoolFeeDetailsBody.getStudentDetails().add(studentDetails);
				}
				request.getHeader().setMSGSTAT("SUCCESS");
				response.setSchoolFeeDetailsBody(schoolFeeDetailsBody);
			}
			response.setHeader(request.getHeader());

			return response;
		} catch (

		Exception e) {
			log.error("In querySchoolFeeDetails exception ", e);
			request.getHeader().setMSGSTAT("FAILURE");
			response.setHeader(request.getHeader());

			return response;
		}
	}

	@SuppressWarnings({ "null", "unchecked" })
	@PayloadRoot(namespace = SchoolFeeServiceConstant.NAMESPACE_URI, localPart = "QueryByStudentDetailsRequest")
	@ResponsePayload
	public SchoolFeeDetailsResponse queryByStudentDetailsRequest(@RequestPayload QueryByStudentDetailsRequest request) {
		System.out.println("in querySchoolFeeForOthers");
		SchoolFeeDetailsResponse response = new SchoolFeeDetailsResponse();
		SchoolFeeDetailsBody schoolFeeDetailsBody = new SchoolFeeDetailsBody();
		StudentRegMaster studentRegMaster = new StudentRegMaster();
		StudentDetails studentDetails = new StudentDetails();
		try {
			System.out.println("request " + request);
			StudentRegMasterId studentRegMasterId = new StudentRegMasterId(
					request.getQueryByStudentDetailsBody().getSTUDENTNUMBER(),
					request.getQueryByStudentDetailsBody().getSTGRADE(),
					request.getQueryByStudentDetailsBody().getCAMPUSID(),
					request.getQueryByStudentDetailsBody().getINSTITUTIONID());
			System.out.println("studentRegMasterId " + studentRegMasterId.toString());
			System.out.println("studentRegMasterRespository.findById(studentRegMasterId)"
					+ studentRegMasterRespository.findById(studentRegMasterId).get());

			studentRegMaster = studentRegMasterRespository
					.findByStudentRegMasterIdAndRecordStat(studentRegMasterId, "O").get();

			System.out.println("studentRegMasterList : " + studentRegMaster);

			if (studentRegMasterRespository.existsById(studentRegMasterId)) {
				studentDetails = buildStudentDetails(studentRegMaster);
				// response.getSchoolFeeDetailsBody().add(schoolFeeDetailsBody);
				request.getHeader().setMSGSTAT("SUCCESS");

			} else {
				request.getHeader().setMSGSTAT("FAILURE");
			}

			schoolFeeDetailsBody.getStudentDetails().add(studentDetails);
			response.setSchoolFeeDetailsBody(schoolFeeDetailsBody);
			response.setHeader(request.getHeader());
			return response;
		} catch (Exception e) {
			System.out.println(e.toString());
			request.getHeader().setMSGSTAT("FAILURE");
			response.setHeader(request.getHeader());
			return response;
		}
	}

	@SuppressWarnings({ "null", "unchecked" })
	@PayloadRoot(namespace = SchoolFeeServiceConstant.NAMESPACE_URI, localPart = "QueryByStudentIdRequest")
	@ResponsePayload
	public SchoolFeeDetailsResponse QueryByStudentIdRequest(@RequestPayload QueryByStudentIdRequest request) {
		System.out.println("in QueryByStudentIdRequest");
		SchoolFeeDetailsResponse response = new SchoolFeeDetailsResponse();
		SchoolFeeDetailsBody schoolFeeDetailsBody = new SchoolFeeDetailsBody();
		StudentRegMaster studentRegMaster = new StudentRegMaster();
		StudentDetails studentDetails = new StudentDetails();
		try {
			System.out.println("request " + request);
			studentRegMaster.setStudentId(request.getQueryByStudentIdBody().getSTUDENTID());

			studentRegMaster = studentRegMasterRespository
					.findByStudentIdAndRecordStat(request.getQueryByStudentIdBody().getSTUDENTID(), "O").get();

			System.out.println("studentRegMasterList : " + studentRegMaster);

			if (studentRegMasterRespository.existsByStudentId(request.getQueryByStudentIdBody().getSTUDENTID())) {
				studentDetails = buildStudentDetails(studentRegMaster);
				// response.getSchoolFeeDetailsBody().add(schoolFeeDetailsBody);
				request.getHeader().setMSGSTAT("SUCCESS");

			} else {
				request.getHeader().setMSGSTAT("FAILURE");
			}

			schoolFeeDetailsBody.getStudentDetails().add(studentDetails);
			response.setSchoolFeeDetailsBody(schoolFeeDetailsBody);
			response.setHeader(request.getHeader());
			return response;
		} catch (Exception e) {
			System.out.println(e.toString());
			request.getHeader().setMSGSTAT("FAILURE");
			response.setHeader(request.getHeader());
			return response;
		}
	}

	private StudentDetails buildStudentDetails(StudentRegMaster studentRegMaster) {
		StudentDetails studentDetails = new StudentDetails();
		Campus campus = new Campus();

//		Institute institute = new Institute();
		try {
			log.info("In buildResponse..");

			studentDetails.setCAMPUSID(studentRegMaster.getStudentRegMasterId().getCampusId());
			studentDetails.setINSTITUTIONID(studentRegMaster.getStudentRegMasterId().getInstitutionId());
			studentDetails.setPHONENO(studentRegMaster.getPhoneNo());
			studentDetails.setSTCATEGORY(studentRegMaster.getStCategory());
			studentDetails.setSTGRADE(studentRegMaster.getStudentRegMasterId().getStGrade());
			studentDetails.setSTSECTION(studentRegMaster.getStSection());
			studentDetails.setSTUDENTID(studentRegMaster.getStudentId());
			studentDetails.setSTUDENTNAME(studentRegMaster.getStudentName());
			studentDetails.setSTUDENTNUMBER(studentRegMaster.getStudentRegMasterId().getStudentNumber());

			studentDetails.setPARTIALPAYMENT(instituteRepository
					.findByInstId(studentRegMaster.getStudentRegMasterId().getInstitutionId()).getPartialPayment());

			CampusId campusId = new CampusId(studentRegMaster.getStudentRegMasterId().getCampusId(),
					studentRegMaster.getStudentRegMasterId().getInstitutionId());

			campus = campusRepository.findById(campusId).get();

			studentDetails.setCAMPUSACBRANCH(campus.getAcBranch());
			studentDetails.setCAMPUSACNO(campus.getAcNo());

			List<StudentPaymentMaster> studentPaymentMasterList = studentPaymentMasterRepository
					.findByStudentId(studentRegMaster.getStudentId());

			for (StudentPaymentMaster studentPaymentMaster : studentPaymentMasterList) {
				FeePaymentDetails feePaymentDetails = new FeePaymentDetails();
				feePaymentDetails.setPAYMENTREFNO(studentPaymentMaster.getPaymentRefNo());
				feePaymentDetails.setPAYMENTCYCLE(studentPaymentMaster.getPaymentCycle());
				feePaymentDetails.setTOTALFEEAMOUNT(studentPaymentMaster.getTotalFeeAmount());
				feePaymentDetails.setFIRSTDUEDT(utils.getXMLGregorianDate(studentPaymentMaster.getFirstDueDt()));
				feePaymentDetails.setNOOFPAYMENTS(utils.getBigInteger(studentPaymentMaster.getNoOfPayments()));
				feePaymentDetails.setDISCOUNTEDAMOUNT(studentPaymentMaster.getDiscountedAmount());
				feePaymentDetails.setTOTALEFFFEEAMT(studentPaymentMaster.getTotalEffFeeAmt());

				List<StudentPaySchedules> studentPaySchedulesList = studentPaySchedulesRepository
						.findByStudentPaySchedulesIdPaymentRefNoOrderByStudentPaySchedulesIdPaymentDueDtAsc(
								feePaymentDetails.getPAYMENTREFNO());

				for (StudentPaySchedules studentPaySchedules : studentPaySchedulesList) {
					PaymentScheduleDetails paymentScheduleDetails = new PaymentScheduleDetails();
					paymentScheduleDetails
							.setPAYMENTTYPE(studentPaySchedules.getStudentPaySchedulesId().getPaymentType());
					paymentScheduleDetails.setPAYMENTDUEDT(utils
							.getXMLGregorianDate(studentPaySchedules.getStudentPaySchedulesId().getPaymentDueDt()));
					paymentScheduleDetails.setPAYMENTSTATUS(studentPaySchedules.getPaymentStatus());
					paymentScheduleDetails.setFEEAMOUNT(studentPaySchedules.getFeeAmount());
					paymentScheduleDetails.setPENALTYAMOUNT(studentPaySchedules.getPenaltyAmount());
					paymentScheduleDetails.setDISCOUNTEDAMT(studentPaySchedules.getDiscountedAmt());
					paymentScheduleDetails.setTOTALDUEAMOUNT(studentPaySchedules.getTotalDueAmount());
					feePaymentDetails.getPaymentScheduleDetails().add(paymentScheduleDetails);
				}
				studentDetails.getFeePaymentDetails().add(feePaymentDetails);
			}

		} catch (Exception e) {
			log.error("In querySchoolFeeDetails exception ", e);
			return studentDetails;
		}
		return studentDetails;

	}

}