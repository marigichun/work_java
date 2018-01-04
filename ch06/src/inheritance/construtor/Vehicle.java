package inheritance.construtor;

public class Vehicle {
		//3개의 필드
		public String name = "차량";		//이름
		public double maxSpeed;			//최대 속도
		public int seater;				//정원
		//기본 생성자
		public Vehicle() {
		}
		public Vehicle(double maxSpeed, int seater) {
			this.maxSpeed = maxSpeed;
			this.seater = seater;
		}
	}


