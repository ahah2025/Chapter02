//객체지향 프로그래밍 06.예외처리
package com.javaex.ex25;

import java.util.Scanner;

public class Ex01 {
	
	//메소드일반	
	public static void main(String[] args) {
		
		
		null.draw();

		Scanner sc = new Scanner(System.in);
		int result=0;
		
		int num = sc.nextInt();
		
		try {
			//예외가 발생할 가능성이 있는 실행문
			result = 100/num;
		}catch(ArithmeticException e){
			//예외 처리문
			//System.out.println(e.toString());
			System.out.println("0으로 나눌 수 없습니다");
			
		}finally { //생략 가능
			//예외 발생 여부와 상관없이 무조건 실행
			
		}
	
		System.out.println(result);
		
		sc.close();
	}
}
