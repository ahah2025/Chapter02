package com.javaex.ex17;

public class PointApp {

	public static void main(String[]args) {

	Point[] pointArr = new Point[3];
	
	//숫자 2개를 메모리에 올린다
	Point p01 = new Point(5,5);
	Point p02 = new Point(10,10);
	Point p03 = new Point(20,20);
	
	//배열의 상품의 주소를 대입한다
	pointArr[0]=p01;
	pointArr[1]=p02;
	pointArr[2]=p03;
	
	//모든 숫자의 이름 출력
	for(int i=0; i<pointArr.length;i++) {
		System.out.println(pointArr[i].getX());
	}
	
	//출력
	for(int i=0; i<pointArr.length;i++) {
		pointArr[i].draw();
	}
	
	/*
	5, 5
	
	10.10
	
	20.20
	
	배열에 넣고 
	
	draw()로 그리시오

	 */
	
	}
	
}
