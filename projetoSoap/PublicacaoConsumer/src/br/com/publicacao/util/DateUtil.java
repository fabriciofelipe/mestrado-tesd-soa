package br.com.publicacao.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;


public class DateUtil {

	public static XMLGregorianCalendar stringToXMLGregorianCalendar(String s) 
		     throws  
		            DatatypeConfigurationException, ParseException
		 {
		 XMLGregorianCalendar result = null;
		 Date date;
		 SimpleDateFormat simpleDateFormat;
		 GregorianCalendar gregorianCalendar;
		 
		 simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		                date = simpleDateFormat.parse(s);        
		                gregorianCalendar = 
		                    (GregorianCalendar)GregorianCalendar.getInstance();
		                gregorianCalendar.setTime(date);
		                result = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
		                return result;
		 }

	
}
