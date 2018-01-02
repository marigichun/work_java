package obj.setter;

public class CreditCard {
	public String owner;
	private long number;
	private int point;
	private int balance;
	
	public void use(int amount) {
		balance += amount;
		System.out.println("현재 카드 사용액: " + balance);
	}
	public void payBill(int amount) {
		balance -= amount;
		System.out.println("지불액: " + amount + " , 지불금액; "+ balance);
		addPoint(amount);
	}
	public void addPoint(int amount) {
		point += amount/1000;
		System.out.println("");
	}
	//(캡슐화)
	/*
	 * setter & grtter (캡슐화)
	 *                 만들기 탄축키 :alt+ahift+s
	 */
	
}


