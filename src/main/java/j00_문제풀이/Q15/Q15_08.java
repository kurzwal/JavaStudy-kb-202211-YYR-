package j00_문제풀이.Q15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q15_08 {
   public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      int N = Integer.parseInt(br.readLine());
      boolean[] primeArr = makePrimeArr();
      for (int i = 0; i < N; i++) {
         int n = Integer.parseInt(br.readLine());
         int ans = findGoldbach(primeArr, n);
         sb.append(ans).append('\n');
      }
      System.out.println(sb.toString());
   }
   public static boolean[] makePrimeArr() {
      boolean[] ret = new boolean[1000001];
      int len = ret.length;
      int sqrtLen = (int) Math.sqrt(len);
      ret[0] = ret[1] = true;
      for (int i = 2; i <= sqrtLen; i++) {
         if (!ret[i]) {
            for (int j = i * i; j < len; j += i) {
               ret[j] = true;
            }
         }
      }
      return ret;
   }
   public static int findGoldbach(boolean[] pArr, int n) {
      int ret = 0;
      for (int i = 2; i <= n / 2; i++) 
         if (!pArr[i] && !pArr[n - i]) ret++;
      return ret;
   }
}
