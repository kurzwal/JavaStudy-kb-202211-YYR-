package j00_문제풀이.Q08;

import java.util.Scanner;

public class Q08_022 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int B = sc.nextInt();
      String ret = "";
      while (true) {
         String mod = convertNmodString(N%B, B);
         ret = mod + ret;
         N = N/B;
         if (N == 0) {
            break;
         }
      }
      System.out.println(ret);
   }
   public static String convertNmodString(int n, int b) {
      String Nmod = "";
      if (n < 10) {
         Nmod = "" + n;
      } else {
         int aIndex = 'A';
         int nIndex = n - 10;
         Nmod = "" + (char) (aIndex + nIndex);
      }
      return Nmod;
   }
}
