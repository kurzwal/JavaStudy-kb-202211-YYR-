package j00_문제풀이.Q03;

import java.util.Scanner;

public class Q03_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int num = sc.nextInt(); sc.nextLine();
		int ret = num;
		
		while(true) {
			count++;
			if(num/10 == 0) {
				num *= 11;
			} else {
				num = ((num % 10) * 10) + (num / 10 + num % 10) % 10;
			}
			if(num == ret) break;
		}
		System.out.println(count);
	}
}
