package j00_문제풀이.Q06;

import java.util.Scanner;

public class Q06_09 {
	public static int found(String lon, String sho) {
		int ret = 0;
		int n = lon.length();
		int m = sho.length();
		for (int i = 0; i < n - m + 1; i++) {
			boolean f = false;
			if (lon.charAt(i) == sho.charAt(0)) {
				for (int j = 1 ; j < m ; j++) {
					if (lon.charAt(i + j) != sho.charAt(j)) {break;}
					if (j == m-1) {
						f = true;
						break;
					}
				}
			}
			if (f) {ret++; i += m-1;}
		}
		return ret;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count = s.length();
		String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		for (int i = 0 ; i < arr.length; i++) {
			int n = found(s, arr[i]);
			count -= n;
		}
		System.out.println(count);
	}
}
