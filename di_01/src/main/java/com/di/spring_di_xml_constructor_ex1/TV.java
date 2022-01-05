package com.di.spring_di_xml_constructor_ex1;

public class TV {
	// 멤버 변수(필드)로 선언 해 놓고
	Speaker speaker;
	// 객체를 new 연산자를 통해서 직접 만들지 않고
	// 생성자를 통해서 객체를 전달 받음
	// 의미 : 생성자를 통해서 외부에서 주입 받음 (injection)
	// 의존성 주입
	public TV(Speaker speaker) {
		this.speaker = speaker;
	}
	
	public void volumUp() {
		speaker.volumUp();
	}
	
	public void volumDown() {
		speaker.volumDown();
	}

}