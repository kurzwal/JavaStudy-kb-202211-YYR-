package j00_문제풀이.Q12;

import java.util.Scanner;

public class Q12_02 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int result = 0;
      for (int i = 1; i < n - 1; i++) {
         int sum = calc(i);
         if (sum == n) {
            result = i;
            break;
         }
      }
      System.out.println(result);
   }

   public static int calc(int i) {
      int ret = i + i % 10;
      while (i/10 != 0) {
         i = i/10;
         ret += i % 10;
      }
      return ret;
   }
}
