package j00_문제풀이.Q03;

import java.util.Scanner;

public class Q03_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); sc.nextLine();
		for(int i = 0 ; i < a ; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt(); sc.nextLine();
			System.out.println(A+B);
		}
	}
}
