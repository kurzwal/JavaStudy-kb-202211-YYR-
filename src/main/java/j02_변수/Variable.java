package j02_변수;

public class Variable {
	public static void main(String[] args) {
		boolean checkFlag = false;
		System.out.println("논리자료형 : " + checkFlag);
		checkFlag = true;
		System.out.println("논리자료형 : " + checkFlag);
		
		char name1 = '유';
		char name2 = '열';
		char name3 = '림';
		System.out.println("" + name1 + name2 + name3);		//문자열
		System.out.println(Integer.toHexString(name1));		//16진수
		System.out.println("\uc720");						//16진수로 반환한 값을 유니코드로 작성
		
		int width = 100;
		int width2 = 200;
		System.out.println(width + width2);
		
		String sWidth = "100";
		String sWidth2 = "200";
		System.out.println(sWidth + sWidth2);
		
		System.out.println("<<<< 형변환 >>>>");
		
		//업캐스팅 : 문자 -> 정수 -> 실수
		
		char c1 = 'a';
		System.out.println(c1);
		System.out.println((int) c1 + 10);
		int n1 = (int) c1;
		System.out.println(n1);
		double d1 = (double) c1;
		System.out.println("d1");
		
		//
		
		
		
	}
}
