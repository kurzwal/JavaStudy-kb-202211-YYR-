package j00_문제풀이.Q04;

import java.util.Scanner;

public class Q04_099 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int M = sc.nextInt();
      int[] arr = new int[N];
      for (int i = 0; i < N; i++) {
         arr[i] = i + 1;
      }
      for (int I = 0; I < M; I++) {
         sc.nextLine();
         int i = sc.nextInt() - 1;
         int j = sc.nextInt() - 1;
         reverseArr(i, j, arr);
      }
      for (int i = 0; i < N; i++) {
         System.out.print(arr[i] + " ");
      }
   }
   public static void reverseArr(int i, int j, int[] fullArr) {
      int n = j - i + 1;
      int[] tempArr = new int[n];
      for (int index = 0; index < n; index++) {
         tempArr[index] = fullArr[j - index];
      }
      for (int index = 0; index < n; index++) {
         fullArr[i + index] = tempArr[index];
      }
   }
}
