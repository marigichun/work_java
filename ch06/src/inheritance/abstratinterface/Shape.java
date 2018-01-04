package inheritance.abstratinterface;

public class Shape {
	protected double x, y;
	
	public Shape(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public void drawCenter() {	
	}
	public void deawCenter() {					//일반 클래스
		System.out.println("(x, y) = " + x + ", " +y);
	}
	public void draw() {
	}				//추상 클래스
	
	public static void main(String [] args) {
		//Shape s = new Shape(3.1, 4.5);  //객체화 오류
	}

	
}

