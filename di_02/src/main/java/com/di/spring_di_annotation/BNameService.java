package com.di.spring_di_annotation;

public class BNameService implements INameService {

	@Override
	public String showName(String name) {
		System.out.println("BNameServie showName() 메소드");
		String myName = "내 이름은 " + name + " 입니다.";
		return myName;
	}

}