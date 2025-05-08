package com.javaex.ex23;

public class ShapeApp {

	public static void main(String[] args) {
		
		//나는 1개로 관리하고 싶다
		Shape[] sArr = new Shape[4];
	
		//섞어쓰기
		Shape t = new Triangle("빨강","빨강",5,3);
		Shape r = new Ractangle("노랑","노랑",10,10);
		Shape c = new Circle("파랑","파랑",5);
		
		sArr[0]=t;
		sArr[1]=r;
		sArr[2]=c;
		
		//Point 추가
		Shape p = new Point(5,5);
		sArr[3]=p;
		
		//그리기
		for(int i=0; i<sArr.length; i++) {
			sArr[i].draw();
		}
		
		//넓이 출력
		for(int i=0; i<sArr.length; i++) {
			sArr[i].area();
		}
	}

}
