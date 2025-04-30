package com.javaex.ex13.Tv;

public class Tv {

	//필드
	private int volume;
	private boolean volume01;
	private int power;
	private int channel;
	
	//생성자
	public Tv() {
		//메모리
		System.out.println("Volume(20)");
	}
	
	public Tv(int volume,int power,int channel) {
		//메모리에 올려주는 일
		this.volume = volume;
		this.power = power;
		this.channel = channel;
		System.out.println("Channel(7)");
	}
	
	//메소드 gs
	
	//전원(power) 대입
	public void setPower(int power) {
		this.power = power;
	} 	 	
	//전원(power) 읽기
	public int getPower() {
		return power;
	}	
	
	
	//볼륨 대입
	public void setVolume(int volume) {
		this.volume = volume;
	}
	//볼륨읽기
	public int getVolume() {
		return volume;
	}	
	//볼륨1 대입
	public void setVolume01(boolean volume) {
		this.volume01 = volume01;
	}
	//볼륨1 읽기
	public boolean getVolume01() {
		return volume01;
	}
	//channel 대입
	public void setChannel(int channel) {
		this.channel = channel;
	}
	//channel 읽기
	public int getChannel() {
		return channel;
	}
	
	
	//메소드(일반
	
	//Tv정보 출력
	public void status() {
		System.out.println(power);
		System.out.println(volume);
		System.out.println(channel);
	}	
}
