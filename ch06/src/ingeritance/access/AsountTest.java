package ingeritance.access;

public class AsountTest {


	public static void main(String[] args) {
		SavingAccount mayAccount = new SavingAccount("강민경", 1234567834, 0.32);
		mayAccount.deposit(50000);
		mayAccount.withdraw(4000);
		mayAccount.checkBalance();
		
		
		System.out.println(myAccount.name);			//접근가능
		System.out.println(myAccount.open);			//접근 가능
		System.out.println(myAccount.number);		//접근 가능
		//System.out.println(mayAccount.balance);	//접근 불가
	}
}
