package j00_문제풀이.Q15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q15_09 {
   public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      int ans = 0;
      int sqrtN = (int) Math.sqrt(n);
      for (int i = 1; i <= sqrtN; i++) {
         if (i * i <= n) ans++;
      }
      System.out.println(ans);
   }
}
