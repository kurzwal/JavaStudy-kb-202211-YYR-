//package j00_문제풀이.Q08;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class Q08_06 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt(); sc.nextLine();
//		for (int I = 0; I < N ; I++) {
//			int n = sc.nextInt(); sc.nextLine();
//			boolean[] arr = foundAllPrimeNumber(n);
//			Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//			for (int i = 2; i < n; i++) {
//				for (int j = 2; j < n; j++) {
//					if (!arr[i] && !arr[j] && i+j == n) {
//						map.put(i, j);
//						break;
//					}
//				}
//			}
//			
//			
//		}
//	}
//	public static boolean[] foundAllPrimeNumber(int n) { // 소수가 false
//		boolean[] arr = new boolean[n+1];
//      for (int i = 2 ; i < n / 2 + 1 ; i++) {
//			if (!arr[i]) {
//				for (int j = 2 ; i * j < n+1 ; j++) {
//					arr[i * j] = true;
//				}
//			}
//		}
//		return arr;
//	}
//	public static int[] foundLessEntry(Map<Integer, Integer> map) {
//		
//	}
//}
