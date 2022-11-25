package j00_문제풀이.Q06;

import java.util.Scanner;

public class Q06_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i = 0; i < a; i++) {
			String ret = "";
			int b = sc.nextInt();
			String s = sc.nextLine();
			for (int j = 1; j < s.length(); j++) {
				for (int k = 0; k < b; k++) {
					ret += s.charAt(j);
				}
			}
			System.out.println(ret);
		}
	}
}
