package programming.bagic;

public class HelloProgramming {

		//�ν��Ͻ� ���� (Insrance Variable)����(�ʵ�,��� ����)
		
			static String fd = " -- �ʵ�";
			static String md = " -- �޼ҵ�";
			
		//�ڹ� ���α׷��� �����ϴ� main() �޼ҵ� ����
		public static void main(String[] args) {
				
			System.out.println ("�ڹ� Ŭ������ ����");
			write(fd);
			write(md);
			}
		
		//���α׷��Ӱ� �����ϴ� �޼ҵ� write()�� ���� 35�������� �ٸ� ���
		public static void write(String word) {
		System.out.println (word);
		}

}
