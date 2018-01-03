package ingeritance.access;

import java.util.Date;

public class Account {
	public String name;
	public Date open;
	/*package*/ int number;
	private long balance;
	
	//생성자(동일 패키지, 하위 클래스에서 사용 가능)
	protected Account(String name, int number) {
		this.name = name;
		this.number = number;
		this.open = new Date();
	}
	
	//일반 메소드
	//입금 메소드
	public long deposit(long amount) {
		return balance += amount;
		
	}
	//출금메소드
	public long withdraw(long amount) {
		return balance -= amount;
	}
	//가상정보 및 잔액 출력 메소드
	public long checkBalance() {
		System.out.println(name + "; 계좌번호 " + number + ", 잔액 " + balance);
		return balance;
	}
}





