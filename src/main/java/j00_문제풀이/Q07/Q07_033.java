package j00_문제풀이.Q07;

import java.util.Scanner;

public class Q07_033 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      char[][] matrix = new char[15][5];
      for (int i = 0; i < 5; i++) {
         String s = sc.nextLine();
         int len = s.length();
         for (int j = 0; j < 15; j++) {
            if (j < len) {
               matrix[j][i] = s.charAt(j);
            } else {
               matrix[j][i] = '#';
            }
         }
      }
      for (int i = 0; i < 15; i++) {
         for (int j = 0; j < 5; j++) {
            if (matrix[i][j] != '#') {
               System.out.print(matrix[i][j]);
            }
         }
      }
   }
}
