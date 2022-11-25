package j00_문제풀이.Q06;

import java.util.Scanner;

public class Q06_10 {
	public static int found(String S) {
		int ret = 0;
		for (int i = 0; i < S.length(); i++) {
			ret++;
			if(S.length() == 1 || S.length() == ret) break;
			if(S.charAt(0) != S.charAt(ret)) break;
		}
		return ret;
	}
	public static String cutString(String S, int N) {
		String ret = "";
		for(int i = N; i < S.length(); i++) {
			ret += S.charAt(i);
		}
		return ret;
	}
	public static boolean group(String s) {
		boolean[] checks = new boolean[26];
		while(true) {
			int snum = s.charAt(0)-'a';
			if (checks[snum]) return false;
			checks[snum] = true;
			int n = found(s);
			if (s.length() < 2) break;
			s = cutString(s, n);
			if (s.length() < 1) break;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); sc.nextLine();
		int result = 0;
		for (int i = 0; i < n; i++) {
			String s = sc.nextLine();
			if (group(s)) result++;
		}
		System.out.println(result);
	}
}
