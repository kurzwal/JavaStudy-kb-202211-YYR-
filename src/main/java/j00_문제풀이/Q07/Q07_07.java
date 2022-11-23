//package j00_문제풀이.Q07;
//
//import java.util.Scanner;
//
//public class Q07_07 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		int n3 = N % 15 ;
//		int count = 0 ;
//		int n5 = 0 ;
//		while(true) {
//			if (n3 % 5 == 0) {
//				n5 = n3 / 5;
//				break;
//			} else if (n3 - 3 < 0){
//
// 			} else {
//				n3 -= 3;
//				count++;
//			}
//		}
//		n3 = count;
//		n5 += N / 15 * 3;
//		int result = n5 + n3;
//		System.out.println(result);
//	}
//}
