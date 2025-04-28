// 02.Java_객체지향프로그래밍
package com.javaex.ex01;

public class GoodsApp {

	//시나리오
	public static void main(String[]args) {
		
		Goods camera = new Goods();
		camera.name="니콘";
		camera.price=400000;
		
		System.out.println(camera.name);
		System.out.println(camera.price);
		System.out.println("====================");
		
		Goods cup = new Goods();
		cup.name = "머그컵";
		cup.price= 2000;
		
		System.out.println(cup.name);
		System.out.println(cup.price);
		System.out.println("====================");
		
		Goods laptop = new Goods();
		laptop.name = "LG그램";
		laptop.price = 1000000;
		
		System.out.println(laptop.name);
		System.out.println(laptop.price);
		System.out.println("====================");
		
		cup.name="머그컵";
		cup.price = 400000;
		System.out.println(cup.name);
		System.out.println(cup.price);
		
	}

}
