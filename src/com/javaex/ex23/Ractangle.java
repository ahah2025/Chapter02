//자식 2 클래스
package com.javaex.ex23;

public class Ractangle extends Shape{

	//필드
	private int width;
	private int height;
	
	//생성자
	public Ractangle() {
	}

	public Ractangle(String fillColor, String lineColor,int width, int height) {
		super(fillColor,lineColor);
		this.width = width;
		this.height = height;
	}
	
	//메소드gs
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	//메소드일반
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", getFillColor()=" + getFillColor()
				+ ", getLineColor()=" + getLineColor() + "]";
	}
	public void draw() {
		System.out.println("====사각형을 그렸습니다==================");
		System.out.println("면색:"+super.getFillColor());
		System.out.println("선색:"+super.getLineColor());
		System.out.println("가로:"+this.width);
		System.out.println("세로:"+this.height);
		System.out.println("=========================================================");
	}
	
	//넓이 구하는 함수
	public void area() {
		System.out.println("사각형의 넓이-------------------------");
		System.out.println(width*height);
		System.out.println("-------------------------------------------");
	}
}
