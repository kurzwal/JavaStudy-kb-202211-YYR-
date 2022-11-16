package j00_문제풀이.Q03;

import java.util.Scanner;

public class Q03_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt(); sc.nextLine();
		int N = sc.nextInt(); sc.nextLine();
		int result = 0;
		for(int i = 0 ; i < N ; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt(); sc.nextLine();
			result += a*b;
		}
		if(total == result) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
