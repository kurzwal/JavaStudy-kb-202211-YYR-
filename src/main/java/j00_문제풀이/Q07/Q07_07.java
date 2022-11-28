package j00_문제풀이.Q07;

import java.util.Scanner;

public class Q07_07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		while (true) {
			if (n%5 == 0) {count += n/5; break;}
			if (n<0) {count = -1; break;}
			n -= 3; count++;
		}
		System.out.println(count);
	}
}
