package com.di.spring_di_annotation_component2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//NameController클래스를 빈으로 등록
//생성된 빈이름은 namecontroller 
//NameMain에서 사용
//@Component
@Controller
public class NameController {

	@Autowired
	
	INameService nameService;	
	
	// 생성자 없음
	// Setter 메소드를 통해 외부에서 주입 받음	
	  public void setNameService(INameService nameService) { 
		  this.nameService = nameService; 
	}	 
	
	public void show(String name) {
		System.out.println("NameController : " + nameService.showName(name));
	}	
}