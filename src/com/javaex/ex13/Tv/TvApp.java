package com.javaex.ex13.Tv;

public class TvApp {

	public static void main(String[]args) {
		Tv tv = new Tv();
		
		tv.setVolume(100); //100으로 유지
		
		tv.setVolume(15);
		
		tv.setChannel(11);
			
		tv.getPower();
		tv.status();
	}
}
/*
Volume(100)
파워0		채널11	볼륨15
*/