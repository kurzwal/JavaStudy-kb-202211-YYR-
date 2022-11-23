package j00_문제풀이.Q07;

import java.util.Scanner;

public class Q07_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0 ; i < N ; i++) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int n = sc.nextInt();
			
			int h = n%H == 0 ? H : n%H;
			int w = (n-1) / H + 1;
			int result = h * 100 + w;
			System.out.println(result);
		}
	}
}
