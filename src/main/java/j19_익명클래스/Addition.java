package j19_익명클래스;

public class Addition implements Calculator {
	
	@Override
	public int calc(int a, int b) {
		System.out.println("덧셈");
		return a + b;
	}
	
}
