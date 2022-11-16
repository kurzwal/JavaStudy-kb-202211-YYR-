package j00_문제풀이.Q01;

import java.util.Scanner;

public class Q01_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int a = B/100;
		
		int c = B%10;
		int b = B-a*100-c;
		System.out.println(A*c);
		System.out.println(A*b/10);
		System.out.println(A*a);
		System.out.println(A*B);
	}
}
