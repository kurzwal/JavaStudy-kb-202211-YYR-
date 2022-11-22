package j12_추상.인터페이스;
/*
	연말정산
 */
public class Tax implements Calculator{		// 인터페이스는 implements로 상속가능
	
	
	@Override
	public int calc(int[] values) {							// 인터페이스에서 상속받은 메소드는 추상 메소드이기 때문에
		System.out.println("연말 정산을 진행합니다.");	// 오버라이드를 하거나 추상 클래스로 만들어야 한다.
		int result = 0;
		for(int i = 0; i < values.length; i++) {
			result += values[i];
		}
		return result;
	}
}
