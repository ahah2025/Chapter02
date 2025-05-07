//원을 그렸습니다
package com.javaex.ex21;

public class Circle {

	//필드
	private String fillColor;
	private String lineColor;
	private int Circle;

	
	//생성자
	public Circle() {
		super();
	}


	public Circle(String fillColor, String lineColor, int circle) {
		super();
		this.fillColor = fillColor;
		this.lineColor = lineColor;
		Circle = circle;
	}

	//메소드gs
	public String getFillColor() {
		return fillColor;
	}


	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}


	public String getLineColor() {
		return lineColor;
	}


	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}


	public int getCircle() {
		return Circle;
	}


	public void setCircle(int circle) {
		Circle = circle;
	}

	//메소드 일반
	
	@Override
	public String toString() {
		return "Circle [fillColor=" + fillColor + ", lineColor=" + lineColor + ", Circle=" + Circle + "]";
	}	
	
	public void draw() {
		System.out.println("=========원을 그렸습니다=======");
		System.out.println("면색:"+fillColor);
		System.out.println("선색:"+lineColor);
		System.out.println("원의 반지름:"+Circle);	
		System.out.println("==========================");
	}
	
	
}
