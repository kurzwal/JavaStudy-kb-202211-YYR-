package j00_문제풀이.Q07;

import java.util.Scanner;

public class Q07_022 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int column = 1;
      int row = 1;
      int max = 0;
      for (int i = 0; i < 9; i++) {
         for (int j = 0; j < 9; j++) {
            int temp = sc.nextInt();
            if (max < temp) {
               max = temp;
               column = j + 1;
               row = i + 1;
            }
         }
         if (sc.hasNext()) sc.nextLine();
      }
      System.out.println(max);
      System.out.println(row + " " + column);
   }
}
