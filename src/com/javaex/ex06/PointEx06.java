package com.javaex.ex06;

public class PointEx06 {

	//필드
	private int x;
	private int y;
		
	//생성자

	//메소드(gs)
	// x 값 대입
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
 	
 	//메소드 일반
 	
 	//출력
 	public void draw() {
 		System.out.println("점[x=" + x +", y=" + y + "]을 그렸습니다.");          
 	}
 	
 }