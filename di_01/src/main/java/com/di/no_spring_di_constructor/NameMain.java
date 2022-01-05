package com.di.no_spring_di_constructor;

public class NameMain {

	public static void main(String[] args) {
		// NameController에게 전달할 NameService 클래스 객체 생성
		NameService nameService = new NameService();
		
		//외부에서 NameContrller에게 생성자를 통해 주입 (injection)
		NameController controller = new NameController(nameService);
		controller.show("깜찍이");
	}
}