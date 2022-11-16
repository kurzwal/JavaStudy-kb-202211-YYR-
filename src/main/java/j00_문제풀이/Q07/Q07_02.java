package j00_문제풀이.Q07;

import java.util.Scanner;

public class Q07_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int bee = sc.nextInt();
		bee+=5; bee /= 6;
		System.out.println(bee);
		// 1/23/456/78910/...
		double result = (Math.sqrt(1+8.*bee)-1)/2;
		System.out.println((int) result);
	}
}
