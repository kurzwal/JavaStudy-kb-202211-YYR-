package j00_문제풀이.Q02;

import java.util.Scanner;

public class Q02_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		if(H<1 && M<45) {
			System.out.println(23 + " " + (M+15));
		} else if(M>44) {
			System.out.println(H + " " + (M-45));
		}
		else {
			System.out.println((H-1) + " " + (M+15));
		}
	}
}
