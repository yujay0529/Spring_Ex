package com.di.spring_di_annotation_component;

import org.springframework.stereotype.Component;

//NameService 클래스를 빈으로 등록
//생선된 빈 이름은 nameService
@Component

public class NameService implements INameService {

	@Override
	public String showName(String name) {
		System.out.println("NameServie showName() 메소드");
		String myName = "내 이름은 " + name + " 입니다.";
		return myName;
	}

}