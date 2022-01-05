package com.di.spring_di_xml_constructor;

public class NameController {
	// 멤버 변수(필드) 선언
	NameService nameService;
	// NamerService 클래스의 객체를 new 연산를 통해서 생성하지 않고
	// 생성자를 통해서 객체 전달 받음
	// 의미 : 생성자를 통해 외부에서 주입 받음 (injection)
	// 의존성 주입

	public NameController(NameService nameService) {
		// 외부에서 전달받아서 멤버 변수 초기화
		this.nameService = nameService;
	}
	
	public void show(String name) {
		System.out.println("NameController : " + nameService.showName(name));
	}
}