package com.di.spring_di_annotation_configuration_bean;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.di.spring_di_annocation_configuration_bean")
@Configuration
public class ApplicationConfig {
	@Bean
	public BMI bmi() {
		BMI bmi = new BMI();
		return bmi;
	}
	
	@Bean
	public Member member() {
		ArrayList<String> courses = new ArrayList<String>();
		courses.add("수영");
		courses.add("헬스");
		courses.add("에어로빅");
		
		
		Member member = new Member(null, null, 0, 0, 0, courses);
		member.setBmi(bmi());
		member.setName("홍길동");
		member.setAge(20);
		member.setHeight(170);
		member.setWeight(60);
		member.setCourses(courses);
		
		return member;
		
	}

}
