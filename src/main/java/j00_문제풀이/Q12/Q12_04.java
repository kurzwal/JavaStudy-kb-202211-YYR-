package j00_문제풀이.Q12;

import java.util.Scanner;

public class Q12_04 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int M = sc.nextInt();
      sc.nextLine();
      char[][] board = new char[N][M];
      for (int i = 0; i < N; i++) {
         String s = sc.nextLine();
         for (int j = 0; j < M; j++) {
            board[i][j] = s.charAt(j);
         }
      }
      
      int min = 64;
      for (int i = 0; i < N - 7; i++) {
         for (int j = 0; j < M - 7; j++) {
            int temp = sumPaint(board, i, j);
            if (min >= temp) {
               min = temp;
            }
         }
      }
      System.out.println(min);
   }

   public static int sumPaint(char[][] board, int i, int j) {
      int sum = 0;
      char nextChar = board[i][j];
      for (int I = i; I < i + 8; I++) {
         for (int J = j; J < j + 8; J++) {
            if (nextChar != board[I][J]) {
               sum++;
            }
            nextChar = findNext(nextChar);
         }
         nextChar = findNext(nextChar);
      }
      if (64 - sum < sum) {
         sum = 64 - sum;
      }
      return sum;
   }
   public static char findNext(char c) {
      if (c == 'B') return 'W';
      else return 'B';
   }
}
