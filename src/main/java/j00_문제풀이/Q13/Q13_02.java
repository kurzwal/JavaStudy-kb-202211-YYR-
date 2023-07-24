package j00_문제풀이.Q13;

import java.util.Scanner;

public class Q13_02 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int[] arr = new int[5];
      for (int i = 0; i < 5; i++) {
         arr[i] = sc.nextInt();
      }
      int avrg = calcAvrg(arr);
      System.out.println(avrg);
      int center = calcCenter(arr);
      System.out.println(center);
   }

   public static int calcAvrg(int[] arr) {
      int sum = 0;
      for (int i = 0; i < 5; i++) {
         sum += arr[i];
      }
      return sum/5;
   }

   public static int calcCenter(int[] arr) {
      for (int i = 0; i < 2; i++) {
         int index = -1;
         int min = 100;
         for (int j = 0; j < 5; j++) {
            if (arr[j] <= min) {
               min = arr[j];
               index = j;
            }
         }
         arr[index] = 101;
      }
      int min = 100;
      for (int i = 0; i < 5; i++) {
         if (arr[i] <= min) {
            min = arr[i];
         }
      }

      return min;
   }
}
