package j14_스태틱.내부클래스;

public class Main {
	public static void main(String[] args) {
		A.B b = new A().new B("A");
		System.out.println(b.getName());
		
		A.C c = new A.C("B");
		System.out.println(c.getName());
		
	}
}
