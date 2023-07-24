package j00_문제풀이.Q07;

import java.util.Scanner;

public class Q07_011 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      int[][] matrix1 = new int[n][m];
      for (int i = 0; i < n; i++) {
         sc.nextLine();
         for (int j = 0; j < m; j++) {
            matrix1[i][j] = sc.nextInt();
         }
      }
      for (int i = 0; i < n; i++) {
         sc.nextLine();
         for (int j = 0; j < m; j++) {
            System.out.print(matrix1[i][j] + sc.nextInt() + " ");
         }
         System.out.println();
      }
   }
}
