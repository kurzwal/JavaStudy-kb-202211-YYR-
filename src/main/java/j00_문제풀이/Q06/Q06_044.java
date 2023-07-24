package j00_문제풀이.Q06;

import java.util.Scanner;

public class Q06_044 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      int len = s.length();
      int ans = 1;
      for (int i = 0; i < len / 2; i++) {
         char char1 = s.charAt(i);
         char char2 = s.charAt(len - 1 - i);
         if (char1 != char2) {
            ans = 0;
            break;
         }
      }
      System.out.println(ans);
   }
}
