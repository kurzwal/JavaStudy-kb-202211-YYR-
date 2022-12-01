package j18_예외;

public class ArrayException {
	public static void main(String[] args) {
		
		Integer[] numberArray = new Integer[] {1, 2, 3, 4, 5};
		
		try {	// 예외가 예상되는 부분에 try
			for(int i = 0; i < 6; i++) {
				System.out.println(numberArray[i]);
			}
			// 예외가 발생했을 때 실행할 구문
		} catch (ArrayIndexOutOfBoundsException e) {
			// 에러 메세지를 출력하는 여러 방법들
			System.out.println(e);
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("예외가 생성됨");
		}
		
		System.out.println("프로그램 정상 종료");
		
		
	}
}
