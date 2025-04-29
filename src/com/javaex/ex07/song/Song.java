package com.javaex.ex07.song;

public class Song {

	//필드
	private String title; 	//노래의 제목
	private String artist; 	//가수
	private char album; 	//노래가 속한 앨범 제목
	private char composer; 	//노래의 작곡가 
	private char year;		//노래가 발표된 연도 나타냄
	private char track;  	//노래가 속한 앨범에서 트랙 번호를 나타냄
	
	//생성자
	
	//메소드(gs)
	// title 값 대입
	public void settitle(String title) {
		this.title = title;
	}
	//title 읽기
	public String gettitle() {
		return title;
	}
	 
	// artist 값 대입
	public void setartist(String artist) {
		this.artist = artist;
	}
	//artist 읽기
	public String getartist() {
		return artist;
	}
	
	//album 값 대입
	public void setalbum(char album) {
		this.album = album;
	}
	//album 읽기
	public char getalbum() {
		return album;
	}
	
	//composer 값 대입
	public void setcomposer(char composer) {
		this.composer = composer;
	}
	//composer 읽기
	public char getcomposer() {
		return composer;
	}
	
	//year 값 대입
	public void setyear(char year) {
		this.year = year;
	}
	//year 읽기
	public char getyear() {
		return year;
	}	
	
	//track 값 대입
	public void settrack(char track) {
		this.track = track;
	}
	//track 읽기
	public char gettrack() {
		return track;
	}
	
	//메소드(일반)
	
	//노래정보 출력
	public void showInfo(){
		//System.out.println("artist1,title" + (album, year, track, composer);  
		System.out.println("artist2,title" + year +title +", album" +   "]composer + 작곡");  
		System.out.println("artist3,title" + year +title +", album" +   "]composer + 작곡");  
	}
}
