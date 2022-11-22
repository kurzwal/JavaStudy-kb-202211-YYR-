package j00_문제풀이.Q05;

import java.util.Scanner;

public class Q05_03 {
	static boolean foundH(int n) {
		boolean ret = true;
		int count = 0;
		int X = n;
		while (X != 0) {
			count++;
         X = X / 10;
		}
		X = n;
		int[] set = new int[count];
		for (int i = 0; i < count; i++) {
			set[i] = X % 10;
			X = X / 10;
		}
		
		
		if(n < 100) {
			ret = true;
		} else {
			int Y = set[1] - set[0];
			for (int i = 1; i < count - 1; i++) {
				if (set[i + 1] - set[i] != Y) {
					ret = false;
					break;
				}
			}
		}
		return ret;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (foundH(i+1)) {
				count++;
			}
		}
		System.out.println(count);
	}
}
