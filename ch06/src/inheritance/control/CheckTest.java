package inheritance.control;

import ingeritance.access.SavingAccount;

public class CheckTest {
	public static void main(String[] args) {
		SavingAccount myAccount = new SavingAccount("김태희", 234567654, 0.34);
		myAccount.deposit(250000);
		myAccount.withdraw(50000);
		myAccount.checkBalance();
		
		System.out.println(myAccount.name);			//접근가능
		//System.out.println(myAccount.open);		//접근 불가
		//System.out.println(myAccount.number);		//접근 불가
		//System.out.println(myAccount.balance);	//접근 불가
		
		CheckAccount cAccount = new CheckAccount("이민정", 87542356, 5000000);
		myAccount.deposit(250000);
		myAccount.withdraw(50000);
		myAccount.checkBalance();
		
		System.out.println(myAccount.name);			//접근 가능
		System.out.println(myAccount.minimum);		//접근 가능
		//System.out.println(myAccount.open);		//접근 불가
		//System.out.println(myAccount.number);		//접근 불가
		//System.out.println(myAccount.balance);	//접근 불가
		
	}
}
