package com.javaex.ex20.colorPoint;

public class PointApp {

	public static void main(String[] args) {
		
		Point p = new Point();
		//System.out.println(p.toString());
		
		ColorPoint cp1 = new ColorPoint(5,3,"red");
		//System.out.println(cp1.toString());
	
		cp1.draw();
		
		//Point(2)
		//ColorPoint(3)
		
	}

}
