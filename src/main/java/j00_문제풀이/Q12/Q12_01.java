package j00_문제풀이.Q12;

import java.util.Scanner;

public class Q12_01 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int M = sc.nextInt();
      int max = 0;
      sc.nextLine();
      int[] arr = new int[N];
      for (int i = 0; i < N; i++) {
         arr[i] = sc.nextInt();
      }
      for (int i = 0; i < N; i++) {
         for (int j = i + 1; j < N; j++) {
            for (int k = j + 1; k < N; k++) {
               int sum = arr[i] + arr[j] + arr[k];
               if (sum <= M && sum > max) {
                  max = sum;
               }
            }
         }
      }
      System.out.println(max);
   }
}
