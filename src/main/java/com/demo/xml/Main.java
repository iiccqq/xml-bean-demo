package com.demo.xml;

import java.io.StringReader;
import java.io.StringWriter;
import java.math.BigInteger;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.demo.xml.model.ObjectFactory;
import com.demo.xml.model.Res;
import com.demo.xml.model.Res.Items;
import com.demo.xml.model.Res.Items.Item;
import com.demo.xml.util.DateUtils;

public class Main {

	public static void main(String[] args) throws JAXBException {
		
		Marshaller mashaller =  JAXBContext.newInstance(Res.class).createMarshaller();  
		mashaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		ObjectFactory factory = new ObjectFactory();  
		Res res = factory.createRes();
		res.setCar("Audi");
		Items items = new Items();
		Item item = new Item();
		item.setId(BigInteger.valueOf(1));
		item.setAge(1);
		item.setLastname("fc");		
		XMLGregorianCalendar born = DateUtils.dateToXmlDate(new Date());
		item.setDateborn(born);
		Item item2 = new Item();
		item2.setId(BigInteger.valueOf(1));
		item2.setAge(2);
		item2.setLastname("fc2");		
		XMLGregorianCalendar born2 = DateUtils.dateToXmlDate(new Date());
		item2.setDateborn(born2);
		items.getItem().add(item);
		items.getItem().add(item2);
		res.setItems(items);
		res.setLetter("2");
		res.setPassword("password");
		StringWriter sw = new StringWriter();
		mashaller.marshal(res, sw);  
		String xml = sw.toString();
		System.out.println(xml);		
		
		Unmarshaller um =  JAXBContext.newInstance(Res.class).createUnmarshaller();	     
		Res r =   (Res) um.unmarshal(new StringReader(xml));
		System.out.println(ToStringBuilder.reflectionToString(r));
		for(Item i : r.getItems().getItem()){
			System.out.println(ToStringBuilder.reflectionToString(i));
		}
		
		
	}
}
