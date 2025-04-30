package com.javaex.ex04;

public class Goods {

	//필드
	private String name;
	private int price;
	
	//생성자 ->메모리에 올린다(자동)   생성자의 이름은 클래스명(Goods)과 같음
	//return 형은 필요없음
	public Goods() {
		//기본생성자
	}
	
	//메소드
	
	//name 값 입력
	public void setName(String n) {
		name = n;
	}
	
	//name 값 읽어오기
	public String getName() {
		return name;
	}
	//price 입력
	public void setPrice(int p) {
		price = p;
	}
	
	//price 읽어오기
	public int getPrice() {
		return price;
	}
}
