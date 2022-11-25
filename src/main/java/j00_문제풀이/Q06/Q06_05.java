package j00_문제풀이.Q06;

import java.util.Scanner;

public class Q06_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int n = s.length();
		int[] arr = new int[26];
		int a = 'a';
		int b = 'A';
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 26; j++) {
				if (((int) s.charAt(i)) == a + j || ((int) s.charAt(i)) == b + j ) {
					arr[j]++;
				}
			}
		}
		int max = 0;
		int check = 0;
		for (int i = 0 ; i < 26; i++) {
			if (arr[i] > max) {
				max = arr[i];
				check = i;
			}
		}
		int count = 0;
		for (int i = 0; i < 26; i++) {
			if (arr[i] == max) {
				count++;
			}
		}
		if (count > 1) {
			System.out.println("?");
		} else {
			System.out.println(((char) (b + check)));
		}
		
	}
}
