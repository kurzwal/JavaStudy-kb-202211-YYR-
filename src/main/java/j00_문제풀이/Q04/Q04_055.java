package j00_문제풀이.Q04;

import java.util.Scanner;

public class Q04_055 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int M = sc.nextInt();
      int[] arr = new int[N];
      for (int I = 0; I < M; I++) {
         sc.nextLine();
         int i = sc.nextInt() - 1;
         int j = sc.nextInt();
         int k = sc.nextInt();
         for (int J = i; J < j; J++) {
            arr[J] = k;
         }
      }
      for (int i = 0; i < N; i++) {
         System.out.print(arr[i] + " ");
      }
   }
}
