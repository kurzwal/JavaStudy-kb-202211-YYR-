package j00_문제풀이.Q03;

import java.util.Scanner;

public class Q03_07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); sc.nextLine();
		for(int i = 0 ; i < num ; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt(); sc.nextLine();
			System.out.println("Case #" + (i + 1) + ": " + a + " + " + b + " = " + (a+b)); //Case #1: 2
		}
	}
}
