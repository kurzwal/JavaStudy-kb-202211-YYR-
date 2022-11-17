package j00_문제풀이.Q07;

import java.util.Scanner;

public class Q07_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		double result = (Math.sqrt(1 + 8. * x) - 1) / 2;
		int num = (int) Math.ceil(result);
		int sum = (1 + num) * num / 2;
		int n = sum - x + 1;
		if (num % 2 == 0) {
			System.out.println((num - n + 1) + "/" + n);
		} else {
			System.out.println(n + "/" + (num - n + 1));
		}
	}
}
