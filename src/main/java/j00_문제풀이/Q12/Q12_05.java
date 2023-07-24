package j00_문제풀이.Q12;

import java.util.Scanner;

public class Q12_05 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int number = 666;
      int index = 1;
      while (true) {
         String numberStr = "" + number;
         int len = numberStr.length();
         int stack = 0;
         for (int i = 0; i < len; i++) {
            if (numberStr.charAt(i) == '6') {
               stack++;
               if (stack == 3) {
                  index++;
                  break;
               }
            } else {
               stack = 0;
            }
         }
         if (index == n + 1) {
            break;
         }
         number++;
      }
      System.out.println(number);
   }
}
