package j00_문제풀이.QXX;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1003 {
	public static void main(String[] args) throws IOException {
		// 버퍼리더 테스트중이라 거지같음 일단 버퍼리더를 해결하자
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		// 몇번 반복할지
		int N = Integer.parseInt(str);
		int[] arr = new int[N];
		// 값을 배열에 저장
		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			arr[i] = Integer.parseInt(str);
		}
		// 가장 큰값을 찾아서 피보나치 한번만 계산
		int m = max(arr);
		if (m == 0) {
			for (int i = 0; i < N; i++) {
				System.out.println("1 0");
			}
			return;
		}
		int[] resultArr = fibo(m);
		// 디버깅 용으로 받은값 뭔지 프린트함
		for (int i = 0; i < N; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		// 디버깅 용으로 계산값 뭔지 프린트함
		for (int i = 0; i < N; i++) {
			System.out.println(resultArr[i]);
		}
		// 이게 실제로 나올 값
		for (int i = 0; i < N; i++) {
			int x = arr[i];
			if (x == 0) {
				System.out.println("1 0");
			} else {
				int ret1 = resultArr[x-1];
				int ret2 = resultArr[x];
				System.out.println(ret1 + " " + ret2);
			}
		}
	}
	
	public static int max(int[] arr) {
		int ret = 0;
		for (int i = 0; i < arr.length; i++) {
			ret = Math.max(ret, arr[i]);
		}
		return ret;
	}
	public static int[] fibo(int n) {
		int[] arr = new int[n+1];
		arr[0] = 0;
		arr[1] = 1;
		for (int i = 2; i < n+1; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		return arr;
	}
}
