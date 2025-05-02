//테스트
package com.javaex.ex13.Tv;

public class TvApp {

	public static void main(String[]args) {
		Tv tv = new Tv(7,20,false);
		
		//전원 off테스트
		tv.setChannel(true); 
		tv.setVolume(45);
		tv.status();
		System.out.println("------------------------");
			
		tv.setPower(true);
		tv.status();
		System.out.println("------------------------");
				
		//채널 최고값 테스트
		tv.setChannel(300); 
		tv.status();
				
		tv.setChannel(254); 
		tv.status();
				
		tv.setChannel(true);
		tv.status();
				
		tv.setChannel(true);
		tv.status();
		System.out.println("------------------------");
				
		//채널 최저값 테스트
		tv.setChannel(0); 
		tv.status();
				
		tv.setChannel(2); 
		tv.status();
				
		tv.setChannel(false);
		tv.status();
				
		tv.setChannel(false);
		tv.setChannel(false);
		tv.status();
				
		System.out.println("------------------------");
			
		//볼륨 최고값 테스트
		tv.setVolume(150); 
		tv.status();
				
		tv.setVolume(98); 
		tv.status();
				
		tv.setVolume(true);
		tv.status();
				
		tv.setVolume(true);
		tv.setVolume(true);
		tv.setVolume(true);
		tv.status();
		System.out.println("------------------------");
				
		//볼륨 최저값 테스트
		tv.setVolume(-20); 
		tv.status();
				
		tv.setVolume(2); 
		tv.status();
				
		tv.setVolume(false);
		tv.status();
				
		tv.setVolume(false);
		tv.setVolume(false);
		tv.setVolume(false);
		tv.status();
				
		System.out.println("------------------------");
				
		//전원끄기
		tv.setPower(false);
		tv.status();
	}
}
