package j00_문제풀이.QXX;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1041 {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      long N = Long.parseLong(br.readLine());
      StringTokenizer st = new StringTokenizer(br.readLine());
      int[] dice = new int[6];
      int minInt = 51;
      for (int i = 0; i < 6; i++) {
         int diceInt = Integer.parseInt(st.nextToken());
         dice[i] = diceInt;
         minInt = minInt > diceInt ? diceInt : minInt;
      }
      if (N == 1) {
         int maxInt = 0;
         int ans = 0;
         for (int i = 0; i < 6; i++) {
            maxInt = dice[i] > maxInt ? dice[i] : maxInt;
            ans += dice[i];
         }
         ans -= maxInt;
         System.out.println(ans);
      } else {
         long dice3 = sum3Dice(dice) * 4;
         long dice2 = sum2Dice(dice) * (8 * N - 12);
         long dice1 = minInt * (4 * (N - 1) * (N - 2) + (N - 2) * (N - 2));
   
         long ans = dice3 + dice2 + dice1;
         System.out.println(ans);
      }
   }

   public static long sum3Dice(int[] dice) {
      int[][] arr = new int[8][3];
      arr[0] = new int[] {0, 1, 2};
      arr[1] = new int[] {0, 1, 3};
      arr[2] = new int[] {1, 5, 2};
      arr[3] = new int[] {1, 5, 3};
      arr[4] = new int[] {5, 4, 2};
      arr[5] = new int[] {5, 4, 3};
      arr[6] = new int[] {4, 0, 2};
      arr[7] = new int[] {4, 0, 3};
      long ret = 151;
      for (int i = 0; i < 8; i++) {
         long temp = 0;
         for (int j = 0; j < 3; j++) {
            temp += dice[arr[i][j]];
         }
         ret = ret > temp ? temp : ret;
      }
      return ret;
   }

   public static long sum2Dice(int[] dice) {
      int minInt = 51;
      int minIdx = 0;
      for (int i = 0; i < 6; i++) {
         if (minInt > dice[i]) {
            minIdx = i;
            minInt = dice[i];
         }
      }
      int[] arr;
      if (minIdx == 0 || minIdx == 5) {
         arr = new int[] {1, 2, 3, 4};
      } else if (minIdx == 1 || minIdx == 4) {
         arr = new int[] {0, 2, 3, 5};
      } else {
         arr = new int[] {0, 1, 4, 5};
      }
      long minInt2 = 51;
      for (int i = 0; i < 4; i++) {
         minInt2 = minInt2 > dice[arr[i]] ? dice[arr[i]] : minInt2;
      }
      return minInt + minInt2;
   }
}
