package com.javaex.ex16;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods cup = new Goods("머그컵",2000);
		Goods camera = new Goods("니콘",400000);
		Goods laptop = new Goods("LG그램",900000);
		
		/*
		System.out.println(cup.toString());
		System.out.println(camera.toString());
		System.out.println(laptop.toString());
		*/
		
		cup.showInfo();
		//camera.showInpo();
		//laptop.showInpo();
		
		System.out.println("-------------------------");
		System.out.println(cup.getName());
		System.out.println(camera.getName());
		System.out.println(laptop.getName());
	}
}
