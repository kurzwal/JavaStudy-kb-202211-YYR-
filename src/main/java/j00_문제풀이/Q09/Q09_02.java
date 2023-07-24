package j00_문제풀이.Q09;

import java.util.Scanner;

public class Q09_02 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int a = sc.nextInt();
      int[] arr = new int[a];
      int arrIndex = 0;
      for (int i = 0; i < n; i++) {
         if (n % (i + 1) == 0) {
            arr[arrIndex++] = i + 1;
            if (arrIndex == a) {
               break;
            }
         }
      }
      System.out.println(arr[a - 1]);
   }
}
