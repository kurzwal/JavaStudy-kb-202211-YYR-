package j00_문제풀이.Q04;

import java.util.Scanner;

public class Q04_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[30];
		for (int i = 0; i < 28; i++) {
			int num = sc.nextInt()-1;
			arr[num] = 1;
		}
		for (int i = 0; i < 30; i++) {
			if (arr[i] != 1) {
				System.out.println(i+1);
			}
		}
      sc.close();
	}
}
