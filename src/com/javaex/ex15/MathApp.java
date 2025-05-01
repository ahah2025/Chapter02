package com.javaex.ex15;

public class MathApp {
	// static 조사
	// main()

	// 메소드 일반
	public static void main(String[] args) {

		/*
		//스태틱 올리기 전에 
		//Math math = new Math();
		
		int val01 = math.plus(5, 3); System.out.println(val01);
		
		//메소드 오버로딩 System.out.println(math.plus(5, 3));
		System.out.println(math.plus2(5, 3.3)); System.out.println(math.plus3(3.3,
		5)); System.out.println(math.plus4(3, 5.5));
		
		//원의 넓이 
		System.out.println(Math.clrcleArea(5));
		
		 */
		/////////////////////////////////////////////////
		// 메소드 오버로딩
		System.out.println(Math.plus(5, 3));
		System.out.println(Math.plus2(5, 3.3));
		System.out.println(Math.plus3(3.3, 5));
		System.out.println(Math.plus4(3.3, 5.5));
		System.out.println(Math.plus4(3, 5.5));

		// 원의 넓이
		System.out.println(Math.clrcleArea(5));
	}

}
