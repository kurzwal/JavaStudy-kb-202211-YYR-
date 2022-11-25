package j14_스태틱.내부클래스;

public class Main {
	public static void main(String[] args) {
		A.B b = new A().new B("A");	// static 이 아니므로 항상 new 로 생성해 주어야 한다
		System.out.println(b.getName());
		
		A.C c = new A.C("B");			// C는 static 이지만 A를 선언해야만 접근할 수 있다.
		System.out.println(c.getName());
		
	}
}
