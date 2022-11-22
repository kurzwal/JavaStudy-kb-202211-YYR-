package j00_문제풀이.Q04;

import java.util.Scanner;

public class Q04_07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		for (int i = 1; i < N; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		double sum = 0;
		for (int i = 0 ; i < N ; i++) {
			sum += ((double) arr[i])/max*100;
		}
		System.out.println(sum/N);
      sc.close();
	}
}
