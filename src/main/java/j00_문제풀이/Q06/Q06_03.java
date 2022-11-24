package j00_문제풀이.Q06;

import java.util.Scanner;

public class Q06_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int n = s.length();
		int[] arr = new int[26];
		for (int i = 0; i < 26; i++) {
			arr[i] = -1;
			for (int j = 0 ; j < n ; j++) {
				if ((int) ('a') + i == s.charAt(j)) {
					arr[i] = j;
					break;
				}
			}
		}
		for (int i = 0 ; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
