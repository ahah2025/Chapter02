package com.javaex.ex05;

public class Goods {

	//필드
	private String name;
	private int price;
	
	//생성자

	//메소드
	
	//name 값 입력
	public void setName(String n) {
		this.name = n;
	}
	
	//name 값 읽어오기
	public String getName() {
		return name;
	}
	//price 입력
	public void setPrice(int p) {
		this.price = p;
	}
	
	//price 읽어오기
	public int getPrice() {
		return price;
	}
	
	//정보출력
	public void showInfo(){
		System.out.println("========================");
		System.out.println("이름:" + name);
		System.out.println("가격:" + price);
		System.out.println("------------------------");
	}
}
