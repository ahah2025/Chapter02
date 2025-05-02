//자식 클래스
package com.javaex.ex19.three3;

//ex19.three3 ==> PersonApp.java 8번이 Student 4번 extends Person
public class Student extends Person {

	// 필드
	private String SchoolName;
	
	// 생성자
	public Student() {
		super("정우성",25);
		/*
		부모클래스의 특정 생성자를 호출해야 할 경우에는 super()를 이용하여 명시적으로 부모클래스의 생성자를 호출된다.
		부모의 필드나 메소드에 접근시에는 super 키워드를 사용한다.
		 */
		System.out.println("Student()");
	}
	
	public Student(String schoolName) {
		this.SchoolName = schoolName;
		System.out.println("Student(1)");
	}
	///////////////////////////////
	public Student(String name,int age, String SchoolName) {
		//name
		//age ??
		
		this.SchoolName=SchoolName;
		Person.this.setName(ageName);
		
	}
	
	///////////////////////////////
	// 메소드-gs
	public String getSchoolName() {
		return SchoolName;
	}
	public void setSchoolName(String schoolName) {
		this.SchoolName = schoolName;
	}
	
	// 메소드-일반
	@Override
	public String toString() {
		return "Student [SchoolName=" + SchoolName + "]";
	}

}
