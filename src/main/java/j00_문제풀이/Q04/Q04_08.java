package j00_문제풀이.Q04;

import java.util.Scanner;

public class Q04_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); sc.nextLine();
		String[] arr = new String[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextLine();
		}
		int[] result = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			int check = 0;
			for (int j = 0; j < arr[i].length(); j++) {
				if (arr[i].charAt(j) == 'O') {
					check++;
					sum += check;
				} else {
					check = 0;
				}
			}
			result[i] = sum;
		}
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
      sc.close();
	}
}
