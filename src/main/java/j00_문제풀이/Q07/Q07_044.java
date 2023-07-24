package j00_문제풀이.Q07;

import java.util.Scanner;

public class Q07_044 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int[][] matrix = new int[100][100];
      for (int i = 0; i < N; i++) {
         sc.nextLine();
         int x = sc.nextInt();
         int y = sc.nextInt();
         addConfetti(matrix, x, y);
      }
      printArea(matrix);
   }
   public static void addConfetti(int[][] matrix, int x, int y) {
      for (int i = 0; i < 10; i++) {
         for (int j = 0; j < 10; j++) {
            matrix[x+i][y+j] = 1;
         }
      }
   }
   public static void printArea(int[][] matrix) {
      int sum = 0;
      for (int i = 0; i < 100; i++) {
         for (int j = 0; j < 100; j++) {
            sum += matrix[i][j];
         }
      }
      System.out.println(sum);
   }
}
