//자식 클래스
package com.javaex.ex20.colorPoint;

public class ColorPoint extends Point {

	//필드
	private String color;
	
	//생성자
	public ColorPoint() {
		super(4,4);
		System.out.println("ColorPoint()");
	}
	public ColorPoint(String color) {
		this.color = color;
		System.out.println("ColorPoint(1)");
	}
	public ColorPoint(int x,int y,String color) {
		super(x,y);
		this.color=color;
		System.out.println("ColorPoint(2)");
	}
		
	//메소드-gs
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
		System.out.println("colorpoint(2)");
	}

	//메소드-일반
	@Override
	public String toString() {
		return "colorpoint [color=" + color + "]";
	}
	
	public void showInfo() {
		System.out.println("=============================");
		System.out.println(x +":"+ super.getX());
		System.out.println(y +":"+ super.getY());
		System.out.println("new color: "+this.color);
		System.out.println(color+":"+"red");
	}

	
}
