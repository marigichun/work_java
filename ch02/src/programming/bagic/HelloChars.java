package programming.bagic;

public class HelloChars {
	
	public static void main(String[] args) {
	
		System.out.println('a');			//char��
		System.out.println('\\');			// \Ű�� ����ϴ� ��ɾ�
		System.out.println('\142');			//8���� 142�� ASCII �ڵ尪(10���� 98�� ASCII�ڵ尪)
		System.out.println('\uAC00');		//Unicode �� AC00 : ��
		System.out.println('\uAC01');		//Unicode �� AC00 : ��
		System.out.println('��');	
		
		System.out.print("Hello\nWorld\thi\b\rABC\r\n");
		System.out.println("\'");
		

	}
}
