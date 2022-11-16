package j00_문제풀이.Q03;

import java.util.Scanner;

public class Q03_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		for(int i = 0 ; i < 9 ; i++) {
			System.out.println(d + " * " + (i + 1) + " = " + (d * (i + 1)));
		}
	}
}
