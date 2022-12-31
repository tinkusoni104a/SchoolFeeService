package com.wecodee.schoolfee.schoolfeeservice.service;

import org.springframework.stereotype.Service;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class Utils {

    public XMLGregorianCalendar getXMLGregorianDate(Date date) {
        if (date == null) {
            return null;
        } else {
            String FORMATER = "yyyy-MM-dd";
            DateFormat format = new SimpleDateFormat(FORMATER);
            XMLGregorianCalendar gDateFormatted = null;
            try {
                gDateFormatted = DatatypeFactory.newInstance().newXMLGregorianCalendar(format.format(date));
            } catch (DatatypeConfigurationException e) {
                e.printStackTrace();
                return null;
            }
            return gDateFormatted;
        }
    }

    public BigInteger getBigInteger(Integer value) {
        if (value == null) {
            return null;
        } else {
            return BigInteger.valueOf(Long.valueOf(String.valueOf(value)));
        }
    }
}
