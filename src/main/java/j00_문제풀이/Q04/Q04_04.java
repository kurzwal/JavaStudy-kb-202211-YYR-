package j00_문제풀이.Q04;

import java.util.Scanner;

public class Q04_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		int max = sc.nextInt();
		arr[0] = max;
		int check = 1;
		for (int i = 1; i < 9; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] > max) {
				max = arr[i];
				check = i+1;
			}
		}
		System.out.println(max);
		System.out.println(check);
      sc.close();
	}
}
