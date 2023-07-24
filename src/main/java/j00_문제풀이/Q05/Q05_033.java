package j00_문제풀이.Q05;

import java.util.Scanner;

public class Q05_033 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      sc.nextLine();
      for (int i = 0; i < N; i++) {
         String s = sc.nextLine();
         int len = s.length();
         char ans1 = s.charAt(0);
         char ans2 = s.charAt(len - 1);
         System.out.println("" + ans1 + ans2);
      }
   }
}
