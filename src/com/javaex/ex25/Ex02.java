package com.javaex.ex25;

public class Ex02 {

	public static void main(String[] args) {

		int[] intArr = new int[] {3,6,9};
		
		try {
		System.out.println(intArr[3]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("범위에서 벗어났습니다");
		}
	}

}
