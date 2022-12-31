package com.wecodee.schoolfee.schoolfeeservice.model.ids;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Embeddable;
import javax.persistence.Id;

@Embeddable
public class StudentPaySchedulesId implements Serializable {

    private String paymentRefNo;	
    private String paymentType;
    private Date paymentDueDt;
   
    
    
    public StudentPaySchedulesId(String paymentRefNo, String paymentType, Date paymentDueDt) {
		super();
		this.paymentRefNo = paymentRefNo;
		this.paymentType = paymentType;
		this.paymentDueDt = paymentDueDt;
	}

    
	public StudentPaySchedulesId() {
		super();
	}

	


	@Override
	public int hashCode() {
		return Objects.hash(paymentDueDt, paymentRefNo, paymentType);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentPaySchedulesId other = (StudentPaySchedulesId) obj;
		return Objects.equals(paymentDueDt, other.paymentDueDt) && Objects.equals(paymentRefNo, other.paymentRefNo)
				&& Objects.equals(paymentType, other.paymentType);
	}


	public String getPaymentRefNo() {
        return paymentRefNo;
    }

    public void setPaymentRefNo(String paymentRefNo) {
        this.paymentRefNo = paymentRefNo;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public Date getPaymentDueDt() {
        return paymentDueDt;
    }

    public void setPaymentDueDt(Date paymentDueDt) {
        this.paymentDueDt = paymentDueDt;
    }


    @Override
    public String toString() {
        return "StudentPaySchedules{" +
                "paymentRefNo='" + paymentRefNo + '\'' +
                ", paymentType='" + paymentType + '\'' +
                ", paymentDueDt=" + paymentDueDt +
                '}';
    }
    
    
}
