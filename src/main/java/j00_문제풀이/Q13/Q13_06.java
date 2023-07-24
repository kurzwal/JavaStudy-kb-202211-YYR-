package j00_문제풀이.Q13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q13_06 {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      int[] arr = new int[0];
      while (n > 0) {
         arr = addArr(arr, n % 10);
         n /= 10;
      }
      bubbleSort(arr);
      for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i]);
      }
      
   }
   static int[] addArr(int[] arr, int i) {
      int len = arr.length;
      int[] ret = new int[len + 1];
      System.arraycopy(arr, 0, ret, 0, len);
      ret[len] = i;
      return ret;
   }
   static void bubbleSort(int[] arr) {
      for (int i = 0; i < arr.length; i++) {
         for (int j = 0; j < arr.length - i - 1; j++) {
            if (arr[j] < arr[j+1]) {
               swap(arr, j, j+1);
            }
         }
      }
   }
   static void swap(int[] arr, int i, int j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
   }
}
