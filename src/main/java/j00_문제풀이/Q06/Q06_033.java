package j00_문제풀이.Q06;

import java.util.Scanner;

public class Q06_033 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      for (int i = 0; i < n; i++) {
         int spaces = n - (i + 1);
         int stars = (i + 1) * 2 - 1;
         String output = "";
         for (int j = 0; j < spaces; j++) {
            output = output + " ";
         }
         for (int j = 0; j < stars; j++) {
            output = output + "*";
         }
         System.out.println(output);
      }
      for (int i = 0; i < n - 1; i++) {
         int spaces = i + 1;
         int stars = (n - spaces) * 2 - 1;
         String output = "";
         for (int j = 0; j < spaces; j++) {
            output = output + " ";
         }
         for (int j = 0; j < stars; j++) {
            output = output + "*";
         }
         System.out.println(output);
      }
   }
}
