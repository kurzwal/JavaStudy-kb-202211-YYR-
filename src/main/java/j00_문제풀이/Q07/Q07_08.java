//package j00_문제풀이.Q07;
//
//import java.util.Scanner;
//
//public class Q07_08 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String a = sc.next();
//		String b = sc.next();
//		int len = Math.max(a.length(), b.length());
//		int[] arr1 = new int[len];
//		int[] arr2 = new int[len];
//		int[] ret = new int[len+1];
//		for (int i = 0 ; i < a.length() ; i++) {
//			arr1[i] = a.charAt(i)-'0';
//		}
//		for (int i = 0 ; i < b.length() ; i++) {
//			arr1[i] = b.charAt(i)-'0';
//		}
//		for (int i = 0 ; i < len ; i++) {
//			int c = arr1[i] + arr2[i];
//			if (c/10 !=0) {
//				c = c%10;
//				ret[i+1]++;
//			}
//			ret[i] += c;
//		}
//		for(int i = 0 ; i < len+1; i++) {
//			if (i == ret[len-1] && ret[len-1] != 0) {
//				System.out.print(1);
//			} else if (i == ret[len-1]) {
//			} else {
//				System.out.print(ret[len-1-i]);
//			}
//		}
//	}
//}
