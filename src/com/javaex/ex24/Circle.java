//자식 3 클래스
package com.javaex.ex24;

public class Circle extends Shape implements Drawable{
	
	//필드
	private int radius;
	
	//생성자
	public Circle() {
	}
	
	public Circle(String fillColor,String lineColor, int radius) {
		super(fillColor,lineColor);
		this.radius = radius;
	}

	//메소드gs
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	//메소드일반
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getFillColor()=" + getFillColor() + ", getLineColor()=" + getLineColor()
				+ "]";
	}
	//Drawable 인터페이스 구현
	public void draw() {
		System.out.println("================원을 그렸습니다==================");
		System.out.println("면색:"+super.getFillColor());
		System.out.println("선색:"+super.getLineColor());
		System.out.println("반지름:"+this.radius);
		System.out.println("=========================================================");
	}
	
	//shape의 area()메소드 오버라이드:    넓이 구하는 함수
	public void area() {	
		System.out.println("원의 넓이-------------------------");
		System.out.println(3.14*radius*radius);
		System.out.println("-------------------------------------------");
	}
	
}
