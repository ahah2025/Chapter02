package com.javaex.ex19.three3;

public class PersonApp {

	public static void main(String[] args) {
		
		//학생의 개념 --> 이름 나이 학교이름
		//Student.java 의 extends Person 지우고 테스트 ==> 같은 패키지 학생.java 클래스 3번 참고
		//Student 가 Person을 상속받기 전
		Student s01 = new Student();
		s01.setSchoolName("제주고등학교");
		//이름 X
		//나이 X
		
		//Student 가 Person을 상속받기 후
		Student s02 = new Student();
		s02.setSchoolName("서울고등학교");
		s02.setName("정우성");
		s02.setAge(22);
		
		
		
		
	}

}
