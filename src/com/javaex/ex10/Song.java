package com.javaex.ex10;

public class Song {

	//필드 6개
	private String title;
	private String artist;
	private String album;
	private String composer;
	private String year;
	private String track;
	
	//생성자
	public Song() {
		
	}
	
	public Song(Title,Artist,Album,Composer,Year,Track) {
		this.title=title;
		this.artist=artist;
		this.album=album;
		this.composer=composer;
		this.year=year;
		this.track=track;
	}
	
	//메소드(gs)
	public void setTitle(String title) {
		this.title=title;
	}
	public String grtTitle() {
		return title;
	}
	
	public void setArtist(String artist) {
		this.artist=artist;
	}
	public String grtArtist() {
		return artist;
	}	
	
	public void setAlbum(String album) {
		this.album=album;
	}
	public String getAlbum() {
		return album;
	}
	
	public void setComposer(String composer) {
		this.composer=composer;
	}
	public String getComposer() {
		return composer;
	}
	
	public void setYear(String year) {
		this.year=year;
	}
	public String getYear() {
		return year;
	}
	//메소드(일반)
	
}
