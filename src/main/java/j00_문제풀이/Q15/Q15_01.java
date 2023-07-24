package j00_문제풀이.Q15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q15_01 {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      int N = Integer.parseInt(br.readLine());
      for (int i = 0; i < N; i++) {
         StringTokenizer st = new StringTokenizer(br.readLine());
         int a = Integer.parseInt(st.nextToken());
         int b = Integer.parseInt(st.nextToken());
         int ans = getLCM(a, b);
         sb.append(ans).append('\n');
      }
      System.out.println(sb.toString());
   }

   public static int getLCM(int a, int b) {
      int x = a;
      int y = b;
      while (true) {
         if (x == y) {
            return x;
         } else if (x < y) {
            x += a;
         } else {
            y += b;
         }
      }
   }
}
