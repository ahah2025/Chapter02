package com.javaex.ex22;

public class ShapeApp {

	public static void main(String[] args) {
		
		Shape s01 = new Shape("빨강","검정");
		System.out.println(s01.toString());
		
		//Triangle t01 = new Triangle(5,10); //선, 면의색이 없는 삼각형은 잘못된것임
		
		Triangle t01 = new Triangle("빨강","검정",5,10);
		//System.out.println(t01.toString());
		t01.draw();
		
		Ractangle r01 = new Ractangle("주황","초록",10,20);
		//System.out.println(r01.toString());
		r01.draw();
		
		Circle c01 = new Circle("빨강","검정",5);
		//System.out.println(c01.toString());
		c01.draw();
		
		//모든 도형을 하나의 배열로 관리하고 싶다.
		
		Shape[] sArr = new Shape[3];
		sArr[0] = t01;  //삼각형
		sArr[1] = r01;	//사각형
		sArr[2] = c01;  //원
		
		for(int i=0;i<sArr.length; i++) {
			System.out.println(sArr[i].getFillColor());
			System.out.println(sArr[i].getLineColor());
			System.out.println("--------------------------------");
		}
		
		
	}

}
