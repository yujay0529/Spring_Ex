package com.di.spring_di_annotation_configuration_bean;

public class BMI {
	//BMI(체질량 지수) 구하여 출력
	public void showBMI(float height, float weight) {
		float bmi = weight / (height * height) * 10000;
		
		String result;
		
		if(bmi > 25) result = "비만";
		else if(bmi >23) result = "과체중";
		else if(bmi >18.5) result = "정상";
		else result = "저체중";
		
		System.out.println("BMI 지수 : " + bmi + " - " + result);
	} 
}

