package j00_문제풀이.Q04;

import java.util.Scanner;

public class Q04_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		int max = -1000000;
		int min = 1000000;
		for (int i = 0; i < N; i++) {
	      if (arr[i] > max) {
				max = arr[i];
         }
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(min + " " + max);
      sc.close();
	}
}
