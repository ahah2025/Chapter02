//부모클래스
package com.javaex.ex23;

public abstract class Shape {
	//abstract
	//필드
	private String fillColor;
	private String lineColor;

	//생성자
	public Shape() {
	}

	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
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
	
	//메소드일반
	@Override
	public String toString() {
		return "Shape [fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}

	//오버라이딩용 메소드 !!!!!!!!주의!!!!!!!
	public abstract void draw(); //내용을 안써도 됨!! 
		
	public void area() {
		System.out.println("어쩔수 없이 만들었음 오버라이딩하라고");
	}
}
