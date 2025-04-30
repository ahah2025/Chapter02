package com.javaex.ex06;

public class PointAppEx06 {
	
	public static void main(String[] args) {
		
		//메모리에 올리고
		PointEx06 p01 = new PointEx06();
		p01.setX(5);
		p01.setY(20);
		
		PointEx06 p02 = new PointEx06();
 		p02.setX(100);
 		p02.setY(100);
 		
 		p01.draw();
 		p02.draw();
		
	}
}
