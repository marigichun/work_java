package com.koitt.java.class04;

import obj.constructor.Car;

public class TestDrive {
	public static void main(String[] args) {
		Car gene = new Car("현대 제네시스", 220);
		Owner jisoo = new Owner("김지수", Genesis);
		jisoo.introCar();
		
		Car benz = new Car("Benz", 220);
		Owner sooji = new Owner("김수지", Benz);
		sooji.introCar();
	}
}