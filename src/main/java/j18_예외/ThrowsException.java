package j18_예외;

public class ThrowsException {
	
	// throws Exception : 함수를 사용할 때 try ~ catch 구문을 강제하는 기능 
	public static void printArray(int[] numbers) throws Exception {
		for (int i = 0; i < 6; i++) {
			System.out.println(numbers[i]);
		}
	}
	
	// main 클래스에 throws Exception 구문을 사용하면 JVM까지 예외가 미뤄진다(고하네요)
	public static void main(String[] args) {
		
		int[] nums = new int[] {1, 2, 3, 4, 5};
		
		// 왼쪽에 뭐 눌러서 자동으로 try ~ catch 구문 완성
		try {
			printArray(nums);
			// 예외 여러개를 한번에 처리하는 방법
		} catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (Exception f) {
			f.printStackTrace();
		}
		
		System.out.println("프로그램 정상 종료");
		
	}
}
