package j12_추상.인터페이스;
/*
	인터페이스는
	1. 모든 메소드가 기본적으로 추상 메소드이다.
	2. 변수는 선언할 수 없다. (기본적으로 모든 변수선언은 상수로 선언된다)
	3. 상수는 선언할 수 있다. (public만 가능)
	4. 일반 메소드를 선언하고 싶으면 abstract 대신에 default 키워드를 사용한다. (JDK 8버전부터 사용가능)
 */
public interface Calculator {

//	public Calcularot() {}			//	5. 생성자 선언 불가능
	
	public int ERROR_CODE = -9999999;			// 상수 선언 (final임)
	
	public int calc(int[] values);				// 추상 메소드 선언
	
}

/*
	인터페이스와 추상클래스의 차이
	1. 인터페이스는 다중 구현이 가능하다.
	
 */