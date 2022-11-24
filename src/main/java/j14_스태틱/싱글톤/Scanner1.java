package j14_스태틱.싱글톤;

import java.util.Scanner;

public class Scanner1 {
	
	public void inputName() {
		String name = null;
		Scanner scanner = ScannerSingleton.getInstance().getScanner();
		System.out.print("이름을 입력하세요 : ");
		name = scanner.nextLine();
		System.out.println("이름 : " + name);
	}
	
}
