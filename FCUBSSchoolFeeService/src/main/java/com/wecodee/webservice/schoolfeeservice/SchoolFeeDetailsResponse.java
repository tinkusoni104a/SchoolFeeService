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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="header" type="{http://webservice.wecodee.com/schoolfeeservice}header"/&gt;
 *         &lt;element name="SchoolFeeDetailsBody" type="{http://webservice.wecodee.com/schoolfeeservice}SchoolFeeDetailsBody"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "header",
    "schoolFeeDetailsBody"
})
@XmlRootElement(name = "SchoolFeeDetailsResponse")
public class SchoolFeeDetailsResponse {

    @XmlElement(required = true)
    protected Header header;
    @XmlElement(name = "SchoolFeeDetailsBody", required = true)
    protected SchoolFeeDetailsBody schoolFeeDetailsBody;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link Header }
     *     
     */
    public Header getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header }
     *     
     */
    public void setHeader(Header value) {
        this.header = value;
    }

    /**
     * Gets the value of the schoolFeeDetailsBody property.
     * 
     * @return
     *     possible object is
     *     {@link SchoolFeeDetailsBody }
     *     
     */
    public SchoolFeeDetailsBody getSchoolFeeDetailsBody() {
        return schoolFeeDetailsBody;
    }

    /**
     * Sets the value of the schoolFeeDetailsBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchoolFeeDetailsBody }
     *     
     */
    public void setSchoolFeeDetailsBody(SchoolFeeDetailsBody value) {
        this.schoolFeeDetailsBody = value;
    }

}
