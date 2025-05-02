package com.javaex.ex15.sta; 
//메소드 일반(19번 Line)에서 static 이 들어간 Math.java

public class Math {

	// 필드
	// private String name;
	// private int price;
	private static final double PI = 3.141592;
	

	// 생성자
	/*
	 * public Math() { //메모리 }
	 */

	// 메소드gs

	// 메소드 일반
	public static int plus(int a, int b) {
		return a + b;
	}

	// 메소드 일반    2
	public static double plus2(int a, double b) {
		return a + b;
	}
 
	// 메소드 일반    	3
	public static double plus3(double a, int b) {
		return a + b;
	}

	// 메소드 일반      4
	public static double plus4(double a, double b) {
		return a + b;
	}
	
	public static double clrcleArea(int radius) {
		double result = PI*radius * radius; 
		return result;
	}
}
