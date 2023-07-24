package j00_문제풀이.QXX;

import java.util.Scanner;

public class Q1002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int r2 = sc.nextInt();
			sc.nextLine();
			int result = foundLocation(x1, y1, r1, x2, y2, r2);
			System.out.println(result);
		}
		
	}
	public static int foundLocation(int x1, int y1, int r1, int x2, int y2, int r2) {
		if (x1 == x2 && y1 == y2 && r1 == r2) {
			return -1;
		}
		int dx = x1 - x2;
		int dy = y1 - y2;
		double dt = dist(dx, dy);
		if (dt + r1 < r2 || dt + r2 < r1 || r1 + r2 < dt) {
			return 0;
		}
		if (dt == r1 + r2 || dt + r1 == r2 || dt + r2 == r1) {
			return 1;
		}
		return 2;
	}
	
	public static int powAdd(int num1, int num2) {
		return num1 * num1 + num2 * num2;
	}
	
	public static double sqrt(int num) {
		return Math.sqrt(num);
	}
	
	public static double dist(int num1, int num2) {
		return sqrt(powAdd(num1, num2));
	}
}
