//자식 클래스
package com.practice.ex01;

//      B라는 클래스는 A라는 클래스를 상속받음             
public class B extends A{

	int a=20;
	public B() {
		System.out.println("다");
	}
	public B(int x) {
		super(1);
		System.out.println("라");
	}
}
