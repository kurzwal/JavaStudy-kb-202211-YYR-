package j00_문제풀이.Q11;

import java.util.Scanner;

public class Q11_07 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      sc.nextLine();
      int c = sc.nextInt();
      sc.nextLine();
      int n0 = sc.nextInt();
      int left = a * n0 + b;
      int right = c * n0;
      if (left <= right) {
         n0 = 100;
         left = a * n0 + b;
         right = c * n0;
         if (left <= right) {
            System.out.println(1);
         } else {
            System.out.println(0);
         }
      } else {
         System.out.println(0);
      }
   }
}
