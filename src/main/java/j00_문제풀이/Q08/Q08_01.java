package j00_문제풀이.Q08;

import java.util.Scanner;

public class Q08_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); sc.nextLine();
		int count = 0;
      for (int i = 0; i < n; i++) {
			int m = sc.nextInt();
			if (foundPrimeNumber(m)) count++;
		}
		System.out.println(count);
	}
	public static boolean foundPrimeNumber(int n) {
		if (n == 1) return false;
		for (int i = 2; i < n/2+1; i++) {
			if (n%i == 0) return false;
		}
		return true;
	}
}
