package j14_스태틱.싱글톤;
import lombok.Getter;
import java.util.Scanner;
/*
		싱글톤의 구성 요소
		1. 생성자가 private 이어야 한다
		2. 자기 자신을 static 변수로 가지고 있어야 한다.
 */
public class ScannerSingleton {
	// 2. 자기 자신을 static 으로 포함 (null 로 초기화)
	private static ScannerSingleton instance = null;
	
	public static ScannerSingleton getInstance() {	// static 변수(2번)의 getter
		if (instance == null) {
			instance = new ScannerSingleton();	// 생성자는 이곳에서만 생성 가능 (null 일 때 1번만)
		}
		return instance;
	}
	
	
	
   @Getter	// Scanner 의 getter 만 생성하는 법
	private Scanner scanner;
	
   private ScannerSingleton() {				// 1. private 으로 생성자를 차단
		scanner = new Scanner(System.in);
	}
}
