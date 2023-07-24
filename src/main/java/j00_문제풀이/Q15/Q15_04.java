package j00_문제풀이.Q15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q15_04 {
   public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int N = Integer.parseInt(br.readLine());
      int[] arr = new int[N];
      arr[0] = Integer.parseInt(br.readLine());
      int[] arrDiff = new int[N-1];
      for (int i = 1; i < N; i++) {
         arr[i] = Integer.parseInt(br.readLine());
         arrDiff[i - 1] = arr[i] - arr[i - 1];
      }
      int gcd = arrDiff[0];
      for (int i = 1; i < N - 1; i++) {
         gcd = getGCD(gcd, arrDiff[i]);
         if (gcd == 1) break;
      }
      int ans = 0;
      for (int diff : arrDiff) {
         ans += diff / gcd - 1;
      }
      System.out.println(ans);
   }
   
   public static int getGCD(int a, int b) {
      if (b == 0) return a;
      else return getGCD(b, a % b);
   }
}
