package com.javaex.ex19.three3;

public class Student extends Person {

	// 필드
	private String SchoolName;
	
	// 생성자
	public Student() {
	}
	
	public Student(String schoolName) {
		this.SchoolName = schoolName;
	}
	
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
