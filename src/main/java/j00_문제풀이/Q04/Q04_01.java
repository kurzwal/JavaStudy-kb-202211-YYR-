package j00_문제풀이.Q04;

import java.util.Scanner;

public class Q04_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		int count = 0;
		for (int i = 0; i < N; i++) {
	      arr[i] = sc.nextInt();
      }
		int v = sc.nextInt();
		for (int i = 0; i < N; i++) {
	      if (arr[i] == v) {
				count++;
         }
		}
		System.out.println(count);
      sc.close();
	}
}
