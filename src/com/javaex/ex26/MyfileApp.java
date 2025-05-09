package com.javaex.ex26;

import java.util.Scanner;

public class MyfileApp {

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
		
		Myfile m1 = new Myfile();
		
		try {
			m1.read3("C:\\JavaStudy\\Java\\노라.txt");
		} catch (IOException e) {
			System.out.println("파일이 없습니다.");
		}
		
		
	}
	

}
