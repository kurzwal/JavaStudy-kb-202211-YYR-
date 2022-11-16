package j06_반복;

import java.util.Scanner;

public class Loop5 {
	/** 선택하는 메소드 */
	public static boolean selectionConditions(String select, int a, int b) {
		boolean loopFlag1 = true;
		
		System.out.println("==================");
		
		if(select.equals("1")) {
			System.out.println(a + " + " + b + " = " + (a + b));
		} else if(select.equals("2")) {
			System.out.println(a + " - " + b + " = " + (a - b));
		} else if(select.equals("3")) {
			System.out.println(a + " * " + b + " = " + (a * b));
		} else if(select.equals("4")) {
			System.out.println(a + " / " + b + " = " + (a / b));
		} else if(select.equals("5")) {
			System.out.println(a + " % " + b + " = " + (a % b));
		} else if(select.equals("q")) {
			System.out.println("bye bye");
			loopFlag1 = false;
		} else {
			System.out.println("잘못된 입력! 다시 입력하세요.");
		}
		System.out.println("==================");
		return loopFlag1;

	}
	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		
		Scanner sc = new Scanner(System.in);
		
		String select = null;
		
		boolean loopFlag1 = true;
		
		while(loopFlag1) {
			System.out.println("1. 덧셈");
         System.out.println("2. 뺄셈");
         System.out.println("3. 곱셈");
			System.out.println("4. 나눗셈");
			System.out.println("5. 나머지");
			System.out.println("q. 프로그램 종료");
			
			select = sc.nextLine();
			loopFlag1 = selectionConditions(select, a, b);
		}
	}
}
