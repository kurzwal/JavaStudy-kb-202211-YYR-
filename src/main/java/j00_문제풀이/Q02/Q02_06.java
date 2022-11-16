package j00_문제풀이.Q02;

import java.util.Scanner;

public class Q02_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		sc.nextLine();
		int plus = sc.nextInt();
		
		int rm = M+plus;
		if(rm>59) {
			H += rm/60;
			rm %= 60;
		}
		if(H>23) {
			H -= 24;
		}
		System.out.println(H + " " + rm);
	}
}
