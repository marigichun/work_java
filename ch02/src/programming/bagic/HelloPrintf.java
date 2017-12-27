package programming.bagic;

public class HelloPrintf {
	
	public static void main(String[] args) {
		System.out.println("12345601234560123456");
		System.out.println("--------------------");
		/*
		 * d(Decimal):10����
		 * o(Octal): 8����
		 * h(Hexa): 16����	 
		 */
		System.out.format("%6d %6o %6h %n", 10, 10, 10);
		System.out.format("%-6d %-6o %-6x %n", 20, 20, 20);
		System.out.format("%+6d %6o %6H %n", 30, 30, 30);
		System.out.format("%1$6d %1$6o %1$6h %n", 128, 200);
		/*
		 * .2:�Ҽ� ��°�ڸ����� �ݿø��Ͽ� ǥ��
		 * .3:�Ҽ� ��°�ڸ����� �ݿø��Ͽ� ǥ��
		 * .4:�Ҽ� ��°�ڸ����� �ݿø��Ͽ� ǥ��
		 */
		System.out.format("%1$6.2f %1$6.3f %1$6.4f %n", 3.141592);
		
		System.out.format("%2$6d %1$6d", 100, 200);
	}
	

}
