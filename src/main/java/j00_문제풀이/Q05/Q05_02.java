package j00_문제풀이.Q05;

public class Q05_02 {
	static int d(int n) {
		int ret = 0;
		ret += n;
		while (n != 0) {
			ret += n%10;
			n /= 10;
		}
		return ret;
	}

	public static void main(String[] args) {
		boolean[] arr = new boolean[10000];
		for (int i = 0; i < 10000 ; i++) {
			int X = i+1;
			if (!arr[i]) {
				X = d(X);
				while (X < 10000) {
					arr[X-1] = true;
					X = d(X);
				}
			}
		}
		for (int i = 0; i < 9999 ; i++) {
			if (!arr[i]) {
				System.out.println(i+1);
			}
		}
	}
}
