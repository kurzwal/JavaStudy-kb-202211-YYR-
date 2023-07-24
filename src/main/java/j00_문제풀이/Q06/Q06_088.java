package j00_문제풀이.Q06;

import java.util.Scanner;

public class Q06_088 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double[] result = new double[] {0, 0};
      for (int i = 0; i < 20; i++) {
         sc.next();
         double d = sc.nextDouble();
         String s = sc.nextLine();
         if (s.equals(" A+")) {
            sumDoubles(result, d, 4.5);
         } else if (s.equals(" A0")) {
            sumDoubles(result, d, 4.0);
         } else if (s.equals(" B+")) {
            sumDoubles(result, d, 3.5);
         } else if (s.equals(" B0")) {
            sumDoubles(result, d, 3.0);
         } else if (s.equals(" C+")) {
            sumDoubles(result, d, 2.5);
         } else if (s.equals(" C0")) {
            sumDoubles(result, d, 2.0);
         } else if (s.equals(" D+")) {
            sumDoubles(result, d, 1.5);
         } else if (s.equals(" D0")) {
            sumDoubles(result, d, 1.0);
         } else if (s.equals(" F")) {
            sumDoubles(result, d, 0.0);
         }
      }
      System.out.println(result[0] / result[1]);
   }
   public static void sumDoubles(double[] result, double d, double grade) {
      result[0] += d * grade;
      result[1] += d;
   }
}
