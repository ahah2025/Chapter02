package com.javaex.ex18;

public class PersonApp {

	public static void main(String[] args) {
		
		Student s01 = new Student("정우성",22, "서울고등학교");
		Student s02 = new Student("이효리",40, "하남고등학교");
		
		System.out.println(s01.toString());
		System.out.println(s02.toString());
	}

}
