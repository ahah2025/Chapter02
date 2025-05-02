//부모 클래스
package com.javaex.ex19.three3;

public class Person {

	// 필드
	private String name;
	private int age;
	
	// 생성자
	public Person() {
		System.out.println("Person()");
	}
	
	public Person(String name, int age) {
		//super();
		/*
		부모클래스의 특정 생성자를 호출해야 할 경우에는 super()를 이용하여 명시적으로 부모클래스의 생성자를 호출된다.
		부모의 필드나 메소드에 접근시에는 super 키워드를 사용한다.
		 */
		this.name = name;
		this.age = age;
		System.out.println("Person(2)");
	}
	
	// 메소드-gs
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// 메소드-일반
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
