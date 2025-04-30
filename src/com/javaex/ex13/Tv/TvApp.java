package com.javaex.ex13.Tv;

public class TvApp {

	public static void main(String[]args) {
		Tv tv = new Tv();
		
		tv.setVolume(120); //100으로 유지
		tv.status();
		
		tv.setVolume(20);
		
		tv.setChannel(7);
			
		tv.getPower();
		tv.status();
	}
}
/*
Volume(20)
0
120
0
0
20
7
*/