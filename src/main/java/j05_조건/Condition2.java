package j05_조건;

import java.util.Scanner;

public class Condition2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = 0;
		System.out.print("점수를 입력하세요 : ");
		score = sc.nextInt();
		sc.nextLine();
		
		if (score > 100 || score <0) {
			System.out.println("잘못된 점수입니다.");
		} else if (score > 89) {
			System.out.println("A입니다.");
		} else if (score > 79) {
			System.out.println("B입니다.");
		} else if (score > 69) {
			System.out.println("C입니다.");
		} else if (score > 59) {
			System.out.println("D입니다.");
		} else {
			System.out.println("E입니다.");
		}
		
	}
}
