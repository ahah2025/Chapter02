package com.javaex.ex22;

public class ShapeApp {

	public static void main(String[] args) {
		
		Shape s01 = new Shape("빨강","검정");
		System.out.println(s01.toString());
		
		//선, 면의색이 없는 삼각형은 잘못된것임
		//Triangle t01 = new Triangle(5,10); //선, 면의색이 없는 삼각형은 잘못된것임
		
		Triangle t01 = new Triangle("빨강","검정",5,10);
		//System.out.println(t01.toString());
		t01.draw();
		t01.getWidth();
		t01.getHeight();
		
		Ractangle r01 = new Ractangle("주황","초록",10,20);
		//System.out.println(r01.toString());
		r01.draw();
		
		Circle c01 = new Circle("빨강","검정",5);
		//System.out.println(c01.toString());
		c01.draw();
		
		Shape st = new Triangle("초록","초록",100,100);
		st.getFillColor();
		//st.draw();
		//st.getWidth();
		//st.getHeight();
		
		Shape sc = new Circle("빨강","빨강",50);
		sc.getFillColor();
		//sc.getRadius();
		//sc.draw();
		
		
		
		
	}

}
