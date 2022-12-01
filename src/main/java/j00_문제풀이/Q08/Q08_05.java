package j00_문제풀이.Q08;

import java.util.Scanner;

public class Q08_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 1;
		while (true) {
			n = sc.nextInt(); sc.nextLine();
			if (n==0) break;
			int m = n*2;
			int count = 0;
			boolean[] arr = foundAllPrimeNumber(m);
			for (int i = n+1; i < m+1 ; i++) {
				if (!arr[i] && i > 1) {
					count++;
				}
			}
			System.out.println(count);
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
