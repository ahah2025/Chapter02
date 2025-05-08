package com.javaex.ex24;

public class ShapeApp {

	public static void main(String[] args) {
		//Shape[] sArr = new Shape[4];
		
		Drawable[] dArr = new Drawable[4];
		
		//포인트를 메모리에 올리고 Drawable 이야 라고 속인다
		Drawable dp = new Point(5,5);
		
		/*
		dp.draw();
		((Point)dp).getX();
		*/
		Drawable dt = new Triangle("빨강","빨강",10,20);
		
		/*
		dt.draw();
		((Triangle)dt).getHeight();
		((Shape)dt).getfillColor();
		*/
		
		Drawable dr = new Ractangle("초록","초록",20,200);
		Drawable dc = new Circle("파랑","파랑",5);
	
		dArr[0]=dt;
		dArr[1]=dr;
		dArr[2]=dc;
		dArr[3]=dp;
		
		//한번에 면적그리기
		for(int i=0; i<dArr.length; i++) {
			dArr[i].draw();
		}
		
		//dp가 Drawable 출신이냐?
		System.out.println(dp instanceof Drawable);
		
		//dp가 Point 출신이냐?
		System.out.println(dp instanceof Point);
		
		//dp가 Shape 출신이냐?
		System.out.println(dp instanceof Shape);
		
		//dt가 Shape 출신이냐?
		System.out.println(dt instanceof Shape);
				
		
		
		//한번에 면적구하기 --> Point는 Shape으로 캐스팅 할 수 없다.
		for(int i=0; i<dArr.length; i++) {
			if(dArr[i] instanceof Shape) { //방의 주소가 Shape출신이냐?
				((Shape)dArr[i]).area();
			}else {
				System.out.println("면적못구함");
			}
			
			
			
			
		}
		
		
	}

}
