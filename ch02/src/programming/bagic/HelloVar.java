package programming.bagic;

public class HelloVar {
	
	public static void main(String[] args) {
		
	
	//���� ����
	int var01;
	
	//�ʱ�ȭ
	var01 = 100;
			
	// ���� ���� + �ʱ�ȭ
	int var02 = 100;
	
	//���� ������ ����
	int a1, b1, c1;						
	a1 = 100;							
	b1 = 100;
	c1 = 300;
	
	//���������� �ʱ�ȭ�� �ؾ� ��밡���ϴ�.
	// int x, y = 3; // x�� �ֱ�ȭ�ؾ� x���� �̿��� �� �ִ�.int x, y = 3;
	int x1 = 1, y1 = 3;					//�κ������� �ʱⰪ 
	System.out.println(x1);
	
	byte b = 0xA;						//32768�� ���� ���� �߻�
	short s = 32767;
	long distance = 1500_00_000000L;
	double d = 1500E8;					//1500 * E^8 
	int x, y =10, z = 20;
	
	System.out.println(b);
	System.out.println(s);
	System.out.println(distance);
	System.out.println(d);
	System.out.println(y);
	System.out.println(z);
	
    }

}