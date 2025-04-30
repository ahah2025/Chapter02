package com.javaex.ex07.song;

public class SongApp {

	public static void main(String[] args) {
		
		//아이유
		Song S1 = new Song();
		S1.setArtist("아이유");
		S1.setTitle(" 좋은날");
		S1.setAlbum("Real");
		S1.setYear("2010");
		S1.setTrack("3번 track");
		S1.setComposer(" 이민수 작곡");
		
		//BIGBANG
		Song S2 = new Song();
		S2.setArtist("BIGBANG");
		S2.setTitle(" 거짓말");
		S2.setAlbum("Always");
		S2.setYear("2007");
		S2.setTrack("2번 track");
		S2.setComposer(" G-DRAGON 작곡");
		
		//버스커버스커
		Song S3 = new Song();
		S3.setTitle(" 벚꽃엔딩");
		S3.setArtist("버스커버스커");
		S3.setAlbum("버스커버스커1집");
		S3.setYear(" 2012");
		S3.setTrack("4번 track");
		S3.setComposer(" 장범준 작곡");
		
		S2.showInfo();
		S1.showInfo();
		S3.showInfo();
	}
}

