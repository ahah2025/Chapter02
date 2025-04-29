package com.javaex.ex07.song;

public class Song {

	//필드
	private String title; 	//노래의 제목
	private String artist; 	//가수
	private String album; 	//노래가 속한 앨범 제목
	private String composer; 	//노래의 작곡가 
	private String year;		//노래가 발표된 연도 나타냄
	private String track;  	//노래가 속한 앨범에서 트랙 번호를 나타냄
	
	//생성자
	
	//메소드(gs)
	// title 값 대입
	public void setTitle(String title) {
		this.title = title;
	}
	//title 읽기
	public String getTitle() {
		return title;
	}
	 
	// artist 값 대입
	public void setArtist(String artist) {
		this.artist = artist;
	}
	//artist 읽기
	public String getArtist() {
		return artist;
	}
	
	//album 값 대입
	public void setAlbum(String album) {
		this.album = album;
	}
	//album 읽기
	public String getAlbum() {
		return album;
	}
	
	//composer 값 대입
	public void setComposer(String composer) {
		this.composer = composer;
	}
	//composer 읽기
	public String getComposer() {
		return composer;
	}
	
	//year 값 대입
	public void setYear(String year) {
		this.year = year;
	}
	//year 읽기
	public String getYear() {
		return year;
	}	
	
	//track 값 대입
	public void setTrack(String track) {
		this.track = track;
	}
	//track 읽기
	public String getTrack() {
		return track;
	}
	
	//메소드(일반)
	
	//노래정보 출력
	public void showInfo(){
		System.out.println(artist + ","+ title +","+"(" + album + "," + year + "," + track + "," + composer+")");  
		
	}
}
