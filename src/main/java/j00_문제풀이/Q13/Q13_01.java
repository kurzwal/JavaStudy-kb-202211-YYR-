package j00_문제풀이.Q13;

import java.util.Scanner;

public class Q13_01 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int[] arr = new int[N];
      int[] result = new int[N];
      for (int i = 0; i < N; i++) {
         arr[i] = sc.nextInt();
      }
      int min = -1001;
      for (int i = 0; i < N; i++) {
         int currentMin = 1001;
         for (int j = 0; j < N; j++) {
            if (arr[j] > min && arr[j] < currentMin) {
               currentMin = arr[j];
            }
         }
         result[i] = currentMin;
         min = currentMin;
      }
      for (int i = 0; i < N; i++) {
         System.out.println(result[i]);
      }
   }
}
