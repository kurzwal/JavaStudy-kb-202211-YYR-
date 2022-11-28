package j00_문제풀이.Q07;

import java.util.Scanner;

public class Q07_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		int len = Math.max(a.length(), b.length());
		int[] arr1 = new int[len];
		int[] arr2 = new int[len];
		int[] ret = new int[len+1];
		for (int i = 0 ; i < a.length() ; i++) {
			arr1[i] = a.charAt(a.length()-i-1)-'0';
		}
		for (int i = 0 ; i < b.length() ; i++) {
			arr2[i] = b.charAt(b.length()-i-1)-'0';
		}
		for (int i = 0 ; i < len+1 ; i++) {
			ret[i] = 0;
		}
		for (int i = 0 ; i < len ; i++) {
			int c = arr1[i] + arr2[i];
			if ((c+ret[i]) > 9) {
				ret[i+1]++;
				ret[i] = (c+ret[i])%10;
			} else {
				c = c % 10;
				ret[i] += c;
			}
		}
		if (ret[len] != 0) {
			System.out.print(ret[len]);
		}
		for(int i = 1 ; i < len+1; i++) {
			System.out.print(ret[len-i]);
		}
	}
}
