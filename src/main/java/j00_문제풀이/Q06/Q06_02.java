package j00_문제풀이.Q06;

import java.util.Scanner;

public class Q06_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String a = sc.nextLine();
		int sum = 0;
//		System.out.println((int) (a.charAt(0)) - 48);
		for (int i = 0; i < n; i++) {
			sum += (int) (a.charAt(i)) - 48;
		}
		System.out.println(sum);
	
	}
}
