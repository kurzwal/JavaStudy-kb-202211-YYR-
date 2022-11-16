package j00_문제풀이.Q03;

import java.util.Scanner;

public class Q03_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int a = sc.nextInt() ;
			int b = sc.nextInt() ; sc.nextLine();
			if(a == 0 && b == 0) break;
			System.out.println(a+b);
			
		}
	}
}
