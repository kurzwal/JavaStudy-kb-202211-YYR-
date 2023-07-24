package j00_문제풀이.Q11;

import java.util.Scanner;

public class Q11_06 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      long n = sc.nextLong();
      long result = n * (n - 1) * (n - 2) / 6;
      System.out.println(result);
      System.out.println(3);
   }
}
