package j00_문제풀이.Q09;

import java.util.Scanner;

public class Q09_03 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      while (true) {
         int n = sc.nextInt();
         if (n == -1) {
            break;
         }
         sc.nextLine();
         int[] arr = {};
         for (int i = 0; i < n / 2; i++) {
            int index = i + 1;
            if (n % index == 0) {
               arr = addArr(arr, index);
            }
         }
         if (n == sumArr(arr)) {
            printArr(n, arr);
         } else {
            System.out.println(n + " is NOT perfect.");
         }
      }
   }
   public static int[] addArr(int[] arr, int index) {
      int len = arr.length;
      int[] result = new int[len + 1];
      for (int i = 0; i < len; i++) {
         result[i] = arr[i];
      }
      result[len] = index;
      return result;
   }
   public static int sumArr(int[] arr) {
      int len = arr.length;
      int result = 0;
      for (int i = 0; i < len; i++) {
         result += arr[i];
      }
      return result;
   }
   public static void printArr(int n, int[] arr) {
      int len = arr.length;
      System.out.print(n + " = " + arr[0]);
      for (int i = 1; i < len; i++) {
         System.out.print(" + " + arr[i]);
      }
      System.out.println();
   }
}
