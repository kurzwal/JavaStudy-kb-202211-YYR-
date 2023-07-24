package j00_문제풀이.QXX;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5341 {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      int n = Integer.parseInt(br.readLine());
      while (true) {
         if (n == 0) break;
         int ans = n * (n + 1) / 2;
         sb.append(ans + "\n");
         n = Integer.parseInt(br.readLine());
      }
      System.out.println(sb);
   }
}
