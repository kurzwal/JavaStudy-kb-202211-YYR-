package j00_문제풀이.Q07;

import java.util.Scanner;

public class Q07_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int bee = sc.nextInt();
		bee += 4;
		bee /= 6;
		double result = (Math.sqrt(1 + 8. * bee) - 1) / 2;
		System.out.println((int) Math.ceil(result)+1);
	}
}
