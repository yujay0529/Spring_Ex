package com.di.no_spring_no_di;

public class NameController {
	//원하는 곳에서 new연산자를 사용해 객체 직접 생성
	//의존성으 존재하나 DI는 아님
	NameService nameService = new NameService();
	
	//이름을 전달받아 nameService에 전달하고
	public void show(String name) {
		System.out.println("namecontroller:" + nameService.showName(name));
	}
}
