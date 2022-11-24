package j14_스태틱.싱글톤;

import java.util.Scanner;

public class Scanner2 {
	
	public void inputAge() {
		int age = 0;
		Scanner scanner = ScannerSingleton.getInstance().getScanner();
		System.out.print("나이를 입력하세요 : ");
		age = scanner.nextInt();
		System.out.println("나이 : " + age);
	}
	
}
