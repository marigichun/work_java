package control.switchcondition;

import java.util.Scanner;

public class BreakSwich {
	public static void main(String[] args) {
		Scanner inpu = new Scanner(System.in);
		System.out.println("���� ��(month)�� �Է� :");
		int month =inpu.nextInt();
		
		switch (month) {
		case 1 :
		case 2 :
		case 3 :
			System.out.printf("%d���� 1�б��Դϴ�. \n", month);
			break;
			
		case 4: case 5: case 6:
			System.out.printf("%d���� 2�б��Դϴ�. \n", month);
			break;
			
		case 7: case 8: case 9:
			System.out.printf("%d���� 3�б��Դϴ�. \n", month);
			break;
			
		case 10: case 11: case 12:
			System.out.printf("%d���� 4�б��Դϴ�. \n", month);
			break;
			
		default :
			System.out.print("��(month)�� �߸� �Է��ϼ̽��ϴ�.\n");
			
		}
	}

}
