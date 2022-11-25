package j00_문제풀이.Q06;

import java.util.Scanner;

public class Q06_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count = 0;
		boolean check = true;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ' && check) {
				count++; check = false;
			} else if (s.charAt(i) == ' ') {
				check = true;
			}
		}
		System.out.println(count);
	}
}
