package com.javaex.ex09;

public class PointApp {

	public static void main(String[] args) {
		
		//메모리에 올리고
		Point p01 = new Point();
		p01.setX(5);
		p01.setY(10);
		
		p01.draw();	
		
		Point p02 = new Point(99,45);
 		p02.draw();		

	}

}
