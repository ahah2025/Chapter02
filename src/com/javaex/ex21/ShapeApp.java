package com.javaex.ex21;

public class ShapeApp {

	public static void main(String[]args) {
		
		Triangle t01 = new Triangle("주황","검정",10,5);
		//System.out.println(t01.toString());
		t01.draw();
	
		Rectangle r01 = new Rectangle("보라","빨강",20,5);
		r01.draw();
		
		Circle c01 = new Circle("분홍","빨강",5);
		c01.draw();
	}
}
