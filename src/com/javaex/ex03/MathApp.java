package com.javaex.ex03;

public class MathApp {

	public static void main(String[]args) {
		
		Math math = new Math();
		
		int sum = math.plus(5,2);
		System.out.println(sum); //7
		
		int sum02 = math.plus(99, 127);
		System.out.println(sum02);
		
		System.out.println(math.plus(100,100));
	}
}
