//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.02.12 at 07:33:54 PM IST 
//


package com.wecodee.webservice.schoolfeeservice;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.wecodee.webservice.schoolfeeservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.wecodee.webservice.schoolfeeservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SchoolFeeDetailsRequest }
     * 
     */
    public SchoolFeeDetailsRequest createSchoolFeeDetailsRequest() {
        return new SchoolFeeDetailsRequest();
    }

    /**
     * Create an instance of {@link Header }
     * 
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link QueryByPhoneNoBody }
     * 
     */
    public QueryByPhoneNoBody createQueryByPhoneNoBody() {
        return new QueryByPhoneNoBody();
    }

    /**
     * Create an instance of {@link SchoolFeeDetailsResponse }
     * 
     */
    public SchoolFeeDetailsResponse createSchoolFeeDetailsResponse() {
        return new SchoolFeeDetailsResponse();
    }

    /**
     * Create an instance of {@link SchoolFeeDetailsBody }
     * 
     */
    public SchoolFeeDetailsBody createSchoolFeeDetailsBody() {
        return new SchoolFeeDetailsBody();
    }

    /**
     * Create an instance of {@link QueryByStudentDetailsRequest }
     * 
     */
    public QueryByStudentDetailsRequest createQueryByStudentDetailsRequest() {
        return new QueryByStudentDetailsRequest();
    }

    /**
     * Create an instance of {@link QueryByStudentDetailsBody }
     * 
     */
    public QueryByStudentDetailsBody createQueryByStudentDetailsBody() {
        return new QueryByStudentDetailsBody();
    }

    /**
     * Create an instance of {@link QueryByStudentIdRequest }
     * 
     */
    public QueryByStudentIdRequest createQueryByStudentIdRequest() {
        return new QueryByStudentIdRequest();
    }

    /**
     * Create an instance of {@link QueryByStudentIdBody }
     * 
     */
    public QueryByStudentIdBody createQueryByStudentIdBody() {
        return new QueryByStudentIdBody();
    }

    /**
     * Create an instance of {@link StudentDetails }
     * 
     */
    public StudentDetails createStudentDetails() {
        return new StudentDetails();
    }

    /**
     * Create an instance of {@link FeePaymentDetails }
     * 
     */
    public FeePaymentDetails createFeePaymentDetails() {
        return new FeePaymentDetails();
    }

    /**
     * Create an instance of {@link PaymentScheduleDetails }
     * 
     */
    public PaymentScheduleDetails createPaymentScheduleDetails() {
        return new PaymentScheduleDetails();
    }

}
