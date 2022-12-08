package j00_문제풀이.Q07;

import java.util.Scanner;

public class Q07_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); int B = sc.nextInt(); int C = sc.nextInt(); sc.nextLine();
		int S = C-B;
		if(S <=0) {
			System.out.println(-1);
		} else {
			int ret = A/S;
			System.out.println(ret+1);
		}
	}
}
