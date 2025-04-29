package com.javaex.ex02;

//class(틀)
public class Goods {

	//필드
	private String name; //니콘
	private int price; //400000
	
	//생성자
	
	//메소드
	//name 값 입력
	      //void 는 리턴이 없을 경우 입력해야 함 리턴이 있을 경우 void 입력안함
	public void setName(String n) {
		//n이 "니콘"
		//위에 있는 name 입력
		name = n;
		//return 필요없는 경우 
	}	
	
	//name 값 읽어오기
	public String getName() {
		return name;
	}

	//가격 값 입력
    public void setPrice(int p) {
		price = p;
		//return 필요없는 경우 
    }	

	//가격 값 읽어오기
    public int getPrice() {
    	return price;
    }
}
