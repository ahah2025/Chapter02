package com.javaex.ex17;

public class PointApp {

	public static void main(String[]args) {

	Point[] pointArr = new Point[3];
	
	//숫자 2개를 메모리에 올린다
	Point p01 = new Point(5,5);
	Point p02 = new Point(10,10);
	Point p03 = new Point();
	p03.setX(20);
	p03.setY(20);
	
	/*
	System.out.println(p01.toString());
	System.out.println(p02.toString());
	System.out.println(p03.toString());
	*/
	
	//배열의 상품의 주소를 대입한다
	pointArr[0]=p01;
	pointArr[1]=p02;
	pointArr[2]=p03;
	
	/*
	System.out.println(pointArr[0].toString());
	System.out.println(pointArr[1].toString());
	System.out.println(pointArr[2].toString());
	*/
	
	for(int i=0; i<pointArr.length;i++) {
		System.out.println(pointArr[i].toString());
		
		pointArr[i].draw();
	}
	
	}
}
