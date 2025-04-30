package com.javaex.ex10;

import com.javaex.ex09.Point;

public class SongApp {

	public static void main(String[] args) {
	/*	
	Song S01 = new Song();
	S01.setTitle("좋은날");
	S01.setArtist("아이유");
	S01.setAlbum("Real");
	S01.setTrack(3);
	S01.setYear("2010");
	S01.setComposer("이민수");
	
	S01.showInfo();
	System.out.println("===============================================");
	*/
	
	/*	
	Song S02 = new Song("벚꽃엔딩","버스커버스커","버스커버스커1집","장범준","2012",4);
	S02.showInfo();
	*/
		
	System.out.println("===============================================");
	
	Song S03 = new Song("거짓말","BIGBANG","Always","G-DRAGON","2007",100);
	S03.showInfo();
	

	/*
	Song("거짓말", "빅뱅")
	Song("거짓말", "always")
	Song(노래제목, 트랙)
	*/
	}
}
