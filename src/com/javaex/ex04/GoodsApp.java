package com.javaex.ex04;

public class GoodsApp {

	public static void main(String[] args) {
		
		//메모리에 올리고
		Goods camera = new Goods();
		Goods cup = new Goods();
		Goods laptop = new Goods();
		
		//니콘세팅(값 입력)
		camera.setName("니콘");
		camera.setPrice(400000);
		
		//머그컵 세팅
		cup.setName("머그컵");
		cup.setPrice(2000);
		
		//LG그램세팅
		laptop.setName("LG그램");
		laptop.setPrice(900000);
		
		//니콘출력
		String cameraName = camera.getName();
		int cameraprice = camera.getPrice();
		System.out.println("========================");
		System.out.println("이름:" + cameraName);
		System.out.println("가격:" + cameraprice);
		System.out.println("------------------------");
		
		//머그컵 출력
		String cupName = cup.getName();
		int cupprice = cup.getPrice();
		System.out.println("========================");
		System.out.println("이름:" + cupName);
		System.out.println("가격:" + cupprice);
		System.out.println("------------------------");
		
		//LG그램 출력
		String laptopName = laptop.getName();
		int laptopprice = laptop.getPrice();
		System.out.println("========================");
		System.out.println("이름:" + laptopName);
		System.out.println("가격:" + laptopprice);
		System.out.println("------------------------");
	}

}
