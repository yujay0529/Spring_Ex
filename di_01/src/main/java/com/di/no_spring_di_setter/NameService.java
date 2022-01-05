package com.di.no_spring_di_setter;

public class NameService {
	public String showName(String name) {
		System.out.println("NameService showName()메소드");
		String myName ="잘생긴사람 목록 -" + name +"-";
		return myName;
	}

}
