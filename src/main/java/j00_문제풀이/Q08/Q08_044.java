package j00_문제풀이.Q08;

import java.util.Scanner;

public class Q08_044 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int root = 2;
      for (int i = 0; i < N; i++) {
         root = root * 2 - 1;
      }
      System.out.println(root*root);
   }
}
