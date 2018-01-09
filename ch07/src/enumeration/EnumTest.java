package enumeration;

public class EnumTest {
	public enum pl {c, cpp, java, csharp};
	
	public static void main(String[] args) {
		pl clang = pl.c;				//정의한 열거 유형은 한나의 자료 유형으로 이용
		System.out.println(clang);		//저장된 상수 문자열이 출력
		
		clang = pl.csharp;
		switch(clang) {
			case csharp:
			System.out.println(clang + ": C# 언어 ");
		}
		
		for (pl p : pl.values())
			System.out.print(p + " ");
		System.out.println();
	}
}
