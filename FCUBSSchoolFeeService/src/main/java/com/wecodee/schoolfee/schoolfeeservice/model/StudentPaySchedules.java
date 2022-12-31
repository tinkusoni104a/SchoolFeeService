package com.wecodee.schoolfee.schoolfeeservice.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.wecodee.schoolfee.schoolfeeservice.model.ids.StudentPaySchedulesId;

@Entity
@Table(name = "STTM_STUDENT_PAY_SCHEDULES")
public class StudentPaySchedules {

    @EmbeddedId
    StudentPaySchedulesId studentPaySchedulesId;
    private Double feeAmount;
    private Double penaltyAmount;
    private Double totalDueAmount;
    private Double discountedAmt;
    private String paymentStatus;
    private Double waivedAmount;
    
	public StudentPaySchedules(StudentPaySchedulesId studentPaySchedulesId, Double feeAmount, Double penaltyAmount,
			Double totalDueAmount, Double discountedAmt, String paymentStatus, Double waivedAmount) {
		super();
		this.studentPaySchedulesId = studentPaySchedulesId;
		this.feeAmount = feeAmount;
		this.penaltyAmount = penaltyAmount;
		this.totalDueAmount = totalDueAmount;
		this.discountedAmt = discountedAmt;
		this.paymentStatus = paymentStatus;
		this.waivedAmount = waivedAmount;
	}
	
	
	public StudentPaySchedules() {
		super();
	}


	@Override
	public String toString() {
		return "StudentPaySchedules [studentPaySchedulesId=" + studentPaySchedulesId + ", feeAmount=" + feeAmount
				+ ", penaltyAmount=" + penaltyAmount + ", totalDueAmount=" + totalDueAmount + ", discountedAmt="
				+ discountedAmt + ", paymentStatus=" + paymentStatus + ", waivedAmount=" + waivedAmount + "]";
	}
	public StudentPaySchedulesId getStudentPaySchedulesId() {
		return studentPaySchedulesId;
	}
	public void setStudentPaySchedulesId(StudentPaySchedulesId studentPaySchedulesId) {
		this.studentPaySchedulesId = studentPaySchedulesId;
	}
	public Double getFeeAmount() {
		return feeAmount;
	}
	public void setFeeAmount(Double feeAmount) {
		this.feeAmount = feeAmount;
	}
	public Double getPenaltyAmount() {
		return penaltyAmount;
	}
	public void setPenaltyAmount(Double penaltyAmount) {
		this.penaltyAmount = penaltyAmount;
	}
	public Double getTotalDueAmount() {
		return totalDueAmount;
	}
	public void setTotalDueAmount(Double totalDueAmount) {
		this.totalDueAmount = totalDueAmount;
	}
	public Double getDiscountedAmt() {
		return discountedAmt;
	}
	public void setDiscountedAmt(Double discountedAmt) {
		this.discountedAmt = discountedAmt;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public Double getWaivedAmount() {
		return waivedAmount;
	}
	public void setWaivedAmount(Double waivedAmount) {
		this.waivedAmount = waivedAmount;
	}

    
   
}
