package com.koitt.java.class04;



public class TestDrive {
	public static void main(String[] args) {
		
		Car str = new Car("스팅어", "현대");
		Owner jiho = new Owner("지호", "서울", "스팅어");
		jiho.introCar();
		
		
		Car a = new Car("지수", "재규어");
		Owner gildong = new Owner("홍길동", "대구", "소나타");
		gildong.introCar();
	}
}


