package com.koitt.java.class03;

public class TestDrive {
	public static void main(String[] args) {
		//케이 고양이 한마리 생성
		Cat kei = new Cat("케이", 1);
		
		//주인 생성- 강예은 주인이 kei 라는 고양이를 소유한다
		Owner yeEun = new Owner("강예은", "서울", kei);
		//주인이 소유한 고양이를 소개하는 메소드를 호출
		yeEun.introCat();
		
		//해피 고양이 한마리 생성
		Cat happy = new Cat("해피", 5);
		
		//주인 생성- 홍길도 주인이 happy라는 고양이를 소유한다.
		Owner gildong = new Owner("홍길도", "율도국", happy);
		
		//주인이 소유한 고양이를 소개하는 메소드를 호출
		gildong.introCat();
	}
}
