//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.02.12 at 07:33:54 PM IST 
//


package com.wecodee.webservice.schoolfeeservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PaymentScheduleDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentScheduleDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PAYMENT_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PAYMENT_DUE_DT" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="FEE_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="PENALTY_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TOTAL_DUE_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="DISCOUNTED_AMT" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="PAYMENT_STATUS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentScheduleDetails", propOrder = {
    "paymenttype",
    "paymentduedt",
    "feeamount",
    "penaltyamount",
    "totaldueamount",
    "discountedamt",
    "paymentstatus"
})
public class PaymentScheduleDetails {

    @XmlElement(name = "PAYMENT_TYPE", required = true)
    protected String paymenttype;
    @XmlElement(name = "PAYMENT_DUE_DT", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar paymentduedt;
    @XmlElement(name = "FEE_AMOUNT")
    protected double feeamount;
    @XmlElement(name = "PENALTY_AMOUNT")
    protected double penaltyamount;
    @XmlElement(name = "TOTAL_DUE_AMOUNT")
    protected double totaldueamount;
    @XmlElement(name = "DISCOUNTED_AMT")
    protected double discountedamt;
    @XmlElement(name = "PAYMENT_STATUS", required = true)
    protected String paymentstatus;

    /**
     * Gets the value of the paymenttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYMENTTYPE() {
        return paymenttype;
    }

    /**
     * Sets the value of the paymenttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYMENTTYPE(String value) {
        this.paymenttype = value;
    }

    /**
     * Gets the value of the paymentduedt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPAYMENTDUEDT() {
        return paymentduedt;
    }

    /**
     * Sets the value of the paymentduedt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPAYMENTDUEDT(XMLGregorianCalendar value) {
        this.paymentduedt = value;
    }

    /**
     * Gets the value of the feeamount property.
     * 
     */
    public double getFEEAMOUNT() {
        return feeamount;
    }

    /**
     * Sets the value of the feeamount property.
     * 
     */
    public void setFEEAMOUNT(double value) {
        this.feeamount = value;
    }

    /**
     * Gets the value of the penaltyamount property.
     * 
     */
    public double getPENALTYAMOUNT() {
        return penaltyamount;
    }

    /**
     * Sets the value of the penaltyamount property.
     * 
     */
    public void setPENALTYAMOUNT(double value) {
        this.penaltyamount = value;
    }

    /**
     * Gets the value of the totaldueamount property.
     * 
     */
    public double getTOTALDUEAMOUNT() {
        return totaldueamount;
    }

    /**
     * Sets the value of the totaldueamount property.
     * 
     */
    public void setTOTALDUEAMOUNT(double value) {
        this.totaldueamount = value;
    }

    /**
     * Gets the value of the discountedamt property.
     * 
     */
    public double getDISCOUNTEDAMT() {
        return discountedamt;
    }

    /**
     * Sets the value of the discountedamt property.
     * 
     */
    public void setDISCOUNTEDAMT(double value) {
        this.discountedamt = value;
    }

    /**
     * Gets the value of the paymentstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYMENTSTATUS() {
        return paymentstatus;
    }

    /**
     * Sets the value of the paymentstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYMENTSTATUS(String value) {
        this.paymentstatus = value;
    }

}
