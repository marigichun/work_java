package com.koitt.java.class01;

public class Motor extends Vehicle{
	public String name = "자동차";
	public int displacement;
	
	public void printInfo( ) {
		System.out.print("nsmae: " + name);
		System.out.println(", 최대속도: " + maxSpeed + " km");
		System.out.print("정원: "+ seater + " 명");
		System.out.println(", 배기량: " + displacement + " cc");
	}
	
	public static void main(String[] agrs) {
		Motor myCar = new Motor();
		myCar.maxSpeed = 160;
		myCar.seater = 5;
		myCar.displacement = 1500;
		myCar.printInfo();
	}
}