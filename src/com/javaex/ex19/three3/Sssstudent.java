//자식 클래스
package com.javaex.ex19.three3;

//ex19.three3 ==> PersonApp.java 8번이 Student 4번 extends Person
public class Sssstudent extends Peeerson {

	// 필드
	private String SchoolName;
	
	// 생성자
	public Sssstudent() {
		super("이효리",22);
		/*
		부모클래스의 특정 생성자를 호출해야 할 경우에는 super()를 이용하여 명시적으로 부모클래스의 생성자를 호출된다.
		부모의 필드나 메소드에 접근시에는 super 키워드를 사용한다.
		 */
		System.out.println("Student()");
	}
	
	public Sssstudent(String schoolName) {
		this.SchoolName = schoolName;
		System.out.println("Student(1)");
	}
	///////////////////////////////
	public Sssstudent(String name,int age, String SchoolName) {
		
		super(name,age); //Person의 파라미터2개짜리 생성자 실행
		this.SchoolName=SchoolName;
		System.out.println("Student(3)");
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

	public void showInfo() {
		System.out.println("=======================");
		System.out.println("이름:"+ super.getName()); 
		//부모클래스는 나와 다른 파일이니까 super. 이라고 표기  //부모 privated
		System.out.println("나이:"+ super.age);  //부모 protected
		System.out.println("학교:"+ this.SchoolName); //자식클래스에서는 this. 이라고 표기 //자신
		System.out.println("=======================");
		
	}
}
