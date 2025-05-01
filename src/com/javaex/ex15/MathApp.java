package com.javaex.ex15;

public class MathApp {
		
	//메소드 일반
	public static void main(String[] args) {
		
		Math math = new Math();
		
		/*int val01 = math.plus(5, 3);
		System.out.println(val01);
		*/
		
		System.out.println(math.plus(5, 3));
		System.out.println(math.plus2(5, 3.3));
		System.out.println(math.plus3(3.3, 5));
		
		System.out.println(math.plus4(3.3, 5.5));
	}

}
