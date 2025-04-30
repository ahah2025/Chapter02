package com.javaex.ex07.s;

public class song {

	//필드
	private String title; // 노래의 제목
	private String artist; // 가수
	private String album; // 노래가 속한 앨범 제목
	private String composer; // 작곡가
	private String year; // 노래 발표 연도
	private String track; //노래가 속한 앨범에서 트랙 번호를 나타앰

	//생성자
	
	//메소드(getter setter)
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getArtist() {
		return artist;
	}
	
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getAlbum() {
		return album;
	}
	
	public void setComposer(String composer) {
		this.composer=composer;
	}
	public String getcomposer() {
		return composer;
	}
	
	public void setYear(String year) {
		this.year = year;
	}
	public String getYear() {
		return year;
	}
	
	public void setTrack(String track) {
		this.track=track;
	} 
	public String getTrack() {
		return track;
	}
	
	//메소드(일반)
	
	public void showInpo(){
		System.out.println(artist+" title "+"("+album+","+year+","+track+","+composer+")");
	}
}
