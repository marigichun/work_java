package com.koitt.java.class04;

import obj.constructor.Car;

public class Owner {
	private String name;		//차주의 이름
	private String address;		//차주 주소
	private Car car1 ;			//소유한 자동차
	
	public Owner (String name, String address, Car car1) {
		this.name = name;
		this.address = address;
		this.car1 = car1;
	}
	public void introCar() {
		System.out.print(name + "의 자동차 브랜드 이름은");
		System.out.println(car1.getBrandName()+ "이고, 최고 속도는" + car1.getMaxSpeed() +"km/h 입니다.");		
		}
}
