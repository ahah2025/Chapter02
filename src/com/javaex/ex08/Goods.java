package com.javaex.ex08;

public class Goods {

	//필드
	private String name;
	private int price;
	
	//생성자  
	
	//리턴이 없음
	//영어 대문자로 기재
	public Goods() { //기본생성자
					//다른생성자가 있으면 자동으로 생기지 않는다.
		//메모리에 올리는일(엄청난걸 해준다)
	}
	
	public Goods(String name,int price){ //오버로딩
		//메모리에 올리는일(엄청난걸 해준다)
		this.name = name;
		this.price = price;
	}
	
	//메소드(gs) 영어소문자로 기재
	//Name 등록
	public void setName(String n) {
		this.name = n;
	}
	//Name 읽어오기
	public String getName() {
		return name;
	}
	//Price 등록
	public void setPrice(int p) {
		this.price = p;
	}
	//Price 읽어오기
	public int getPrice() {
		return price;
	}

	//정보출력
	public void showInfo() {
 		System.out.println("==========================");
 		System.out.println("이름:" + name);
 		System.out.println("가격:" + price);
 		System.out.println("==========================");
 	}

}
