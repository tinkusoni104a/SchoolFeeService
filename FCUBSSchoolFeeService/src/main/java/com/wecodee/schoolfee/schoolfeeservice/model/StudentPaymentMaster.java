package com.wecodee.schoolfee.schoolfeeservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "STTM_STUDENT_PAYMENT_MASTER")
public class StudentPaymentMaster {

    @Id
    private String paymentRefNo;
    private String studentId;
    private String studentNumber;
    private String grade;
    private String section;
    private String discounted;
    private String campusId;
    private String institutionId;
    private String paymentCycle;
    private Date firstDueDt;
    private Integer noOfPayments;
    private Integer intervalInDays;
    private Double totalFeeAmount;
    private Integer discountInPerc;
    private Double discountedAmount;
    private Double totalEffFeeAmt;
    private String penaltyId;
    private String recordStat;
    private String authStat;
    private Integer modNo;
    private String makerId;
    private Date makerDtStamp;
    private String checkerId;
    private Date checkerDtStamp;
    private String onceAuth;

    public String getPaymentRefNo() {
        return paymentRefNo;
    }

    public void setPaymentRefNo(String paymentRefNo) {
        this.paymentRefNo = paymentRefNo;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getDiscounted() {
        return discounted;
    }

    public void setDiscounted(String discounted) {
        this.discounted = discounted;
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

    public String getPaymentCycle() {
        return paymentCycle;
    }

    public void setPaymentCycle(String paymentCycle) {
        this.paymentCycle = paymentCycle;
    }

    public Date getFirstDueDt() {
        return firstDueDt;
    }

    public void setFirstDueDt(Date firstDueDt) {
        this.firstDueDt = firstDueDt;
    }

    public Integer getNoOfPayments() {
        return noOfPayments;
    }

    public void setNoOfPayments(Integer noOfPayments) {
        this.noOfPayments = noOfPayments;
    }

    public Integer getIntervalInDays() {
        return intervalInDays;
    }

    public void setIntervalInDays(Integer intervalInDays) {
        this.intervalInDays = intervalInDays;
    }

    public Double getTotalFeeAmount() {
        return totalFeeAmount;
    }

    public void setTotalFeeAmount(Double totalFeeAmount) {
        this.totalFeeAmount = totalFeeAmount;
    }

    public Integer getDiscountInPerc() {
        return discountInPerc;
    }

    public void setDiscountInPerc(Integer discountInPerc) {
        this.discountInPerc = discountInPerc;
    }

    public Double getDiscountedAmount() {
        return discountedAmount;
    }

    public void setDiscountedAmount(Double discountedAmount) {
        this.discountedAmount = discountedAmount;
    }

    public Double getTotalEffFeeAmt() {
        return totalEffFeeAmt;
    }

    public void setTotalEffFeeAmt(Double totalEffFeeAmt) {
        this.totalEffFeeAmt = totalEffFeeAmt;
    }

    public String getPenaltyId() {
        return penaltyId;
    }

    public void setPenaltyId(String penaltyId) {
        this.penaltyId = penaltyId;
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

    public Integer getModNo() {
        return modNo;
    }

    public void setModNo(Integer modNo) {
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
        return "StudentPaymentMaster{" +
                "paymentRefNo='" + paymentRefNo + '\'' +
                ", studentId='" + studentId + '\'' +
                ", studentNumber='" + studentNumber + '\'' +
                ", grade='" + grade + '\'' +
                ", section='" + section + '\'' +
                ", discounted='" + discounted + '\'' +
                ", campusId='" + campusId + '\'' +
                ", institutionId='" + institutionId + '\'' +
                ", paymentCycle='" + paymentCycle + '\'' +
                ", firstDueDt=" + firstDueDt +
                ", noOfPayments=" + noOfPayments +
                ", intervalInDays=" + intervalInDays +
                ", totalFeeAmount=" + totalFeeAmount +
                ", discountInPerc=" + discountInPerc +
                ", discountedAmount=" + discountedAmount +
                ", totalEffFeeAmt=" + totalEffFeeAmt +
                ", penaltyId='" + penaltyId + '\'' +
                ", recordStat='" + recordStat + '\'' +
                ", authStat='" + authStat + '\'' +
                ", modNo=" + modNo +
                ", makerId='" + makerId + '\'' +
                ", makerDtStamp=" + makerDtStamp +
                ", checkerId='" + checkerId + '\'' +
                ", checkerDtStamp=" + checkerDtStamp +
                ", onceAuth='" + onceAuth + '\'' +
                '}';
    }
}
