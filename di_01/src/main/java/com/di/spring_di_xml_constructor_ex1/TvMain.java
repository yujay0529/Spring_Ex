package com.di.spring_di_xml_constructor_ex1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TvMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new GenericXmlApplicationContext("application-context2.xml");
		
		TV tv = context.getBean("tv", TV.class);
		tv.volumUp();
		tv.volumDown();
		context.close();
	}
}