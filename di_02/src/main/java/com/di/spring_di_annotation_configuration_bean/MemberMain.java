package com.di.spring_di_annotation_configuration_bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		Member member = context.getBean("member", Member.class);
		
		System.out.println(member);  // toString() 자동 호출
		member.showBMI();
		context.close();
	}

}