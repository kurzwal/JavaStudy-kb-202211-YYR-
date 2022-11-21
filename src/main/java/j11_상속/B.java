package j11_상속;
/*
	상속이란 하나의 클래스에 다른 클래스를 확장하는 개념,
	상위 클래스의 접근지정자가 private인 것들은 하위 클래스에서 접근 할 수 없음.
 */

public class B extends A {
	private String b;
	
	public B() {
		b = getA();
   }
}
