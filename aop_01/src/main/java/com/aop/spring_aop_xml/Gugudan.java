package com.aop.spring_aop_xml;

//핵심기능수행
public class Gugudan {
	private int dan;

	public int getDan() {
		return dan;
	}

	public void setDan(int dan) {
		this.dan = dan;
	}
	public void showResult() {
		for(int i=1; i<9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));

		}
	}
}
