package com.di.spring_di_annotation_component;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class NameMain {

	public static void main(String[] args) {
		// 스프링 컨테이너 생성
		AbstractApplicationContext context = new GenericXmlApplicationContext("application-context2.xml");
		
		// 컨테이너에서 컴포넌트(빈) 가져옴
		NameController controller = context.getBean("nameController", NameController.class);
		controller.show("아이엠아이엠");
		context.close();
	}

}