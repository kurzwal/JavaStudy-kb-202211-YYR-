package j00_문제풀이.Q07;

import java.util.Scanner;

public class Q07_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextInt(); sc.nextLine();
		for (long i = 0; i < N; i++) {
			long n = sc.nextInt(); sc.nextLine();
			long m = sc.nextInt(); sc.nextLine();
			if (m == 1) System.out.println(1);
			else System.out.println(combi(n+m,m-1));
		}
	}
	
	public static long facto(long n, long m){
		if (m<1){
			return 1;
		}
		long ret = 1;
		for (long i=n+1; i<m+1; i++) {
			ret *= i;
		}
		return ret;
	}
	public static long combi(long a, long b) {
		long c = a-b;
		if (b > c) {
			return facto(b,a)/facto(1,c);
		} else {
			return facto(c,a)/facto(1,b);
		}
	}
}
