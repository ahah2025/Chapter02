package com.javaex.ex14;

public class Goods {

	// 필드
	private String name; // 이름
	private int price; // 가격(한국돈 자료형: int . $일 경우 자료형 : double)
	private static int count;

	// 생성자
	public Goods() {
		// 메모리
		count = count+1;
	}

	public Goods(String name, int price) {
	
		this.name = name;
		this.price = price;
		count = count+1;
	}

	// 메소드gs
	// name 값 대입
	public void setName(String name) {
		this.name = name;
	}

	//이름 읽기
	public String getName() {
		return name;
	}

	// price 값 대입
	public void setPrice(int p) {
		this.price = p;
	}
	
	//Price 읽기
	public int getPrice() {
		return price;
	}

	// 카운터 읽기
	public int getCount() {
		return count;
	}

	// 메소드 일반

	// 정보출력
	public void showInfo() {
		System.out.println("==========================");
		System.out.println("이름:" + name);
		System.out.println("가격:" + price);
		System.out.println("==========================");
	}
}
