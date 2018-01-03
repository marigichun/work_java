package com.koitt.java.class04;

import obj.constructor.Car;

public class Owner {
		private String name;
		private Car car;
		
	
		public Owner(String name, Car car) {
			this.name = name;
			this.car = car;
		}

	
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Car getCar() {
			return car;
		}

		public void setCar(Car car) {
			this.car = car;
		}

		public void introCar() {
			System.out.print(this.name + "의 자동차의 브랜드 이름은");
			System.out.print(car.getBrandName() + " 이고, 최고속도는 ");
			System.out.println(car.getMaxSpeed() + "km/h 입니다.");
			
		}
}
		
	
	
	
	
	
	
	
	
	