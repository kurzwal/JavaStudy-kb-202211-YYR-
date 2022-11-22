package j00_문제풀이.Q04;

import java.util.Scanner;

public class Q04_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt() % 42;
		}
		int result = 0;
		for (int i = 0; i < 10; i++) {
			boolean check = true;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j] && i != j) {
					check = false;
					break;
				}
			}
			if(check) {
				result++;
			}
			
		}
		System.out.println(result);
      sc.close();
	}
}
