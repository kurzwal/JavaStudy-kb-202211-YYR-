package j00_문제풀이.Q08;

import java.util.Scanner;

public class Q08_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		boolean[] arr = foundAllPrimeNumber(m);
		for (int i = n; i < m+1 ; i++) {
			if (!arr[i] && i > 1) {
				System.out.println(i);
			}
		}
	}
	public static boolean[] foundAllPrimeNumber(int n) { // 소수가 false
		boolean[] arr = new boolean[n+1];
      for (int i = 2 ; i < n / 2 + 1 ; i++) {
			if (!arr[i]) {
				for (int j = 2 ; i * j < n+1 ; j++) {
					arr[i * j] = true;
				}
			}
		}
		return arr;
	}
}
