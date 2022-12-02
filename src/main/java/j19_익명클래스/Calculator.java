package j19_익명클래스;

// 람다식 전용 어노테이션 (메소드가 2개 이상이 되면 에러를 띄운다)
@FunctionalInterface
public interface Calculator {
	
	public int calc(int a, int b);
	
	// 디폴트 메소드는 람다 전용 인터페이스에서도 사용 가능
	public default int a() {
		return 10;
	}
}
