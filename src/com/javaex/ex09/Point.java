package com.javaex.ex09;

public class Point {

	//필드
	private int x;
	private int y;
	
	//생성자 기본
	public Point() {
		
	}
	
	//생성자 오버로딩
	public Point(int x,int y) {
		//메모리에 올려주는 일
		this.x = x;
		this.y = y;
	}
	
	//메소드(gs)
	//x값 대입
	public void setX(int xx) {
		this.x = xx;
	}

 	//x읽기
 	public int getX() {
 		return x;
 	}
 	//y대입
 	public void setY(int y) {
 		this.y = y;
 	}
 	 	
 	//y읽기
 	public int getY() {
 		return y;
 	}
	//메소드(일반)

 	//출력
 	public void draw() {
 		System.out.println("점[x="+ x +","+"y="+ y +"]"+ "을 그렸습니다.");
 	}
}
