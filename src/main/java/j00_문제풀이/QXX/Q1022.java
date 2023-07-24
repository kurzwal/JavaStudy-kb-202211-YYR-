package j00_문제풀이.QXX;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1022 {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      StringTokenizer st = new StringTokenizer(br.readLine());
      int x1 = Integer.parseInt(st.nextToken());
      int y1 = Integer.parseInt(st.nextToken());
      int x2 = Integer.parseInt(st.nextToken());
      int y2 = Integer.parseInt(st.nextToken());

      for (int y = y1; y <= y2; y++) {
         for (int x = x1; x <= x2; x++) {
            
         }
      }
   }
   public static int getLargestNum(int x1, int y1, int x2, int y2) {
      return 1;
   }
   public static int getDigitCount(int number) {
      if (number == 0) return 1;
      return (int) Math.floor(Math.log10(Math.abs(number))) + 1;
   }
}

