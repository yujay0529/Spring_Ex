package com.di.spring_di_annotation_component2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class NameMain {

	public static void main(String[] args) {
		// 스프링 컨테이너 생성
		AbstractApplicationContext context = new GenericXmlApplicationContext("application-context.xml");
		
		// 컨테이너에서 컴포넌트(빈) 가져옴
		NameController controller = context.getBean("nameController", NameController.class);
		controller.show("통모짜");
		context.close();
	}

}