package j00_문제풀이.Q06;

import java.util.Scanner;

public class Q06_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int[] arr = {3,3,3, 4,4,4, 5,5,5, 6,6,6, 7,7,7, 8,8,8,8, 9,9,9, 10,10,10,10};
		int sum = 0;
		final int a = 'A';
		for (int i = 0; i < s.length(); i++) {
			int n = s.charAt(i);
			sum += arr[n - a];
		}
		System.out.println(sum);
	}
}
