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
		
		//Point 추가      클래스설계부터 억지로 만들었다
		Shape p = new Point(5,5);
		sArr[3]=p;
		
		//그리기
		for(int i=0; i<sArr.length; i++) {
			//sArr[i].draw();
		}
		
		//넓이 출력
		for(int i=0; i<sArr.length; i++) {
			sArr[i].area();
			//포인트는 면적을 구할수 없는데 임의로 넣은 값이 출력된다.
		}
		
		//sArray[3] 은 포인트 아래처럼쓰면 색을 넣을 수있다
		sArr[3].setFillColor("빨강");
		
	}

}
