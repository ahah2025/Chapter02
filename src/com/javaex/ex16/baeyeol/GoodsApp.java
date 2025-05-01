package com.javaex.ex16.baeyeol;

public class GoodsApp {

	public static void main(String[] args) {
		
		// 배열3칸 만든다(메모리에 올린다)
		Goods[] goodsArr = new Goods[4];
			
		//상품 4개를 메모리에 올린다
		Goods cup = new Goods("머그컵",2000);
		Goods camera = new Goods("니콘",400000);
		Goods laptop = new Goods("LG그램",1000000);
		Goods haribo = new Goods("젤리",500);
		
		//배열의 상품의 !!!!!!!주소!!!!!!!를 대입한다.
		goodsArr[0]=cup;
		goodsArr[1]=camera;
		goodsArr[2]=laptop;
		goodsArr[3]=haribo;
	
		//cup.getName()
		
		//모든상품의 이름을 출력하라
		for(int i=0; i<goodsArr.length;i++) {
			System.out.println(goodsArr[i].getName());
		}
		
		//모든상품의 정보를 출력하세요
		for(int i=0; i<goodsArr.length;i++) {
			goodsArr[i].showInfo();
		}
	}

}
