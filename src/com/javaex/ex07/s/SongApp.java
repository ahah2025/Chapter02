package com.javaex.ex07.s;

import com.javaex.ex07.song.Song;

public class SongApp {

	public static void main(String[] args) {
		
		//BIGBANG	
		Song S1 = new Song();
		S1.setArtist("BIGBANG");
		S1.setTitle("거짓말");
		S1.setAlbum("Always");
		S1.setComposer("G-DRAGON 작곡");
		S1.setYear("2007");
		S1.setTrack("2번 track");
		
		//아이유
		Song S2 = new Song();
		S2.setArtist("아이유");
		S2.setTitle("좋은날");
		S2.setAlbum("Real");
		S2.setComposer("이민수 작곡");
		S2.setYear("2010");
		S2.setTrack("3번 track");
		
		//버스커버스커
		Song S3 = new Song();
		S3.setArtist("아이유");
		S3.setTitle("좋은날");
		S3.setAlbum("Real");
		S3.setComposer("이민수 작곡");
		S3.setYear("2010");
		S3.setTrack("3번 track");
		
		S1.showInfo();
		S2.showInfo();
		S3.showInfo();
		
	}

}
