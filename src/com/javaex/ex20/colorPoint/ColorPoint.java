//자식 클래스
package com.javaex.ex20.colorPoint;

public class ColorPoint extends Point {

	//필드
	private String color;
	
	//생성자
	public ColorPoint() {
		System.out.println("ColorPoint()");
	}	
	
	public ColorPoint(String color) {
		this.color = color;
		System.out.println("ColorPoint(1)");
	}
	
	public ColorPoint(int x,int y,String color) {
		//메모리 올리고
		
		
		/*
		//초기화 1 부모의 생성자이용
		super(x,y);
		this.color = color;
		*/
		
		
		//초기화2 - 부모의 필드에 직접 입력x  setter이용
		//super();
		super.setX(x);
		super.setY(y);
		this.color = color;
		
		//초기화3 - 부모의 필드가 protected일때
		//super();
		super.x = x;
		super.y = y;
		this.color = color;
		
		System.out.println("ColorPoint(3)");
		
	}
	
	//메소드-gs
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	//메소드-일반
	@Override
	public String toString() {
		return "ColorPoint [color=" + color + ", getX()=" + getX() + ", getY()=" + getY() + "]";
	}
	
	public void draw() {
		/*
		System.out.println("========================");
		System.out.println("x=" + super.getX());
		System.out.println("y=" + super.getY());
		System.out.println("color=" + this.color);
		System.out.println("========================");
		*/
		
		//부모의 필드가 protected 일때
		System.out.println("========================");
		System.out.println("x=" + super.x);
		System.out.println("y=" + super.y);
		System.out.println("color=" + this.color);
		System.out.println("========================");
	}



	
}
