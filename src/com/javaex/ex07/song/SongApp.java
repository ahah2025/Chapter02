package com.javaex.ex07.song;

public class SongApp {

	public static void main(String[] args) {
		
		Song s1 = new Song();
		s1.settitle("좋은날");
		s1.setartist("아이유");
		//s1.setalbum('REAL');
		s1.setyear('2010');
		s1.settrack("3번 track");
		s1.setcomposer("이민수 작곡");
		
		Song s2 = new Song();
		s2.settitle("거짓말");
		s2.setartist("BIGBANG");
		//s2.setalbum('Always');
		s2.setyear('2007');
		s2.settrack("2번 track");
		s2.setcomposer("G-DRAGON 작곡");
		
		/*
		Song s3 = new Song();
		s3.settitle("벚꽃엔딩");
		s3.setartist("버스커버스커");
		s3.setalbum("버스커버스커1집");
		s3.setyear('2012');
		s3.settrack('4번 track');
		s3.setcomposer('장범준 작곡');
		*/
	}
}

