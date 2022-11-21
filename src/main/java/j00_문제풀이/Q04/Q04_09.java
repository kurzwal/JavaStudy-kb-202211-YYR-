package j00_문제풀이.Q04;

import java.util.Scanner;

public class Q04_09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int n = sc.nextInt();
			int[] a = new int[n];
			int sum = 0;
			for (int j = 0; j < n; j++) {
				a[j] = sc.nextInt();
				sum += a[j];
			}
			double avr = ((double) sum) / n;
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (a[j] > avr) {
               count++;
            }
			}
			System.out.printf("%.3f",((double)count) / n * 100);
			System.out.println("%");
		}
	}
}
