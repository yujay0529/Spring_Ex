package com.aop.spring_aop_xml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		AbstractApplicationContext context = new GenericXmlApplicationContext("application-config.xml");
		
		Rect rect = context.getBean("rect", Rect.class);
		rect.showResult();
		
		Gugudan gg = context.getBean("gugudan", Gugudan.class);
		gg.showResult();
		
		context.close();
	}

}