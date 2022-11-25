package j00_문제풀이.Q06;

import java.util.Scanner;


public class Q06_07 {
	public static int reverse(int a) {
		int c;
		c = a%10;
		a = (a/10*10) + (a/100);
		a = a%100 + c*100;
		return a;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c;
		
		a = reverse(a);
		b = reverse(b);
		
		if (a > b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
	}
}
