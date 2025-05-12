package com.javaex.ex26;

import java.io.IOException;

//정우성(강남)
public class MyFileApp {

	public static void main(String[]args) {
	
		/*
		Scanner sc = new Scanner(System.in);
		sc.nextInt()
		*/
		
		/*
		Myfile m1 = new Myfile();
		String str = m1.read2("C:\\JavaStudy\\Java\\노라.txt");
		System.out.println(str);
		*/
		
		MyFile m1 = new MyFile();
		
		try {
			m1.read3("C:\\JavaStudy\\Java\\노라.txt");
		} catch (IOException e) {
			System.out.println("파일이 없습니다.");
		}
		
		
	}
	

}
