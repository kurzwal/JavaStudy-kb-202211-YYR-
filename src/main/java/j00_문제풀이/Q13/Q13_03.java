package j00_문제풀이.Q13;

import java.util.Scanner;

public class Q13_03 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int k = sc.nextInt();
      sc.nextLine();
      int[] arr = new int[N];
      for (int i = 0; i < N; i++) {
         arr[i] = sc.nextInt();
      }
      int cutline = calcCut(arr, k);
      System.out.println(cutline);
   }

   public static int calcCut(int[] arr, int k) {
      int ret = 0;
      for (int i = 0; i < k; i++) {
         int max = 0;
         int index = 0;
         for (int j = 0; j < arr.length; j++) {
            if (arr[j] >= max) {
               max = arr[j];
               index = j;
            }
         }
         ret = max;
         arr[index] = 0;
      }
      return ret;
   }
}
