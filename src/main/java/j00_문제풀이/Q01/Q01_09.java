package j00_문제풀이.Q01;

import java.util.Scanner;

public class Q01_09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int[] chesses = {1,1,2,2,2,8};
		for(int i=0; i<6; i++) {
			num = sc.nextInt();
			chesses[i] -= num;
		}
		for(int i=0; i<6; i++) {
			System.out.print(chesses[i] + " ");
		}
	}
}
