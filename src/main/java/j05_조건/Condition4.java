package j05_조건;

import java.util.Scanner;

public class Condition4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = 0;
		System.out.print("시험 성적 입력 : ");
		score = sc.nextInt(); sc.nextLine();
		if (score > 100 || score <0) {
			System.out.println("잘못된 점수입니다.");
		} else {
			switch (score / 10) {
				case 10:
				case 9:
					System.out.println("A학점.");
				case 8:
					System.out.println("B학점.");
				case 7:
					System.out.println("C학점.");
				case 6:
					System.out.println("D학점.");
				default :
					System.out.println("F학점.");
			}
		}
	}
}
