package j00_문제풀이.Q05;

public class Q05_01 {
	long sum(int[] a) {
		long ans = 0;
		for (int i = 0 ; i < a.length ; i++) {
			ans += a[i];
		}
		return ans;
	}
}
