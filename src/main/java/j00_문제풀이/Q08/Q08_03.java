package j00_문제풀이.Q08;

import java.util.Scanner;

public class Q08_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if (N != 1) {
			soinsu(N);
		}
	}
	
	public static void soinsu(int n) {
		for (int i = 2 ; i < n+1 ; i++) {
			if (n % i == 0) {
				n /= i;
				System.out.println(i);
				i = 1;
			}
		}
	}
}
