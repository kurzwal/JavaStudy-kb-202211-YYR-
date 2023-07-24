package j00_문제풀이.Q15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q15_03 {
   public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      int am = Integer.parseInt(st.nextToken());
      int an = Integer.parseInt(st.nextToken());
      st = new StringTokenizer(br.readLine());
      int bm = Integer.parseInt(st.nextToken());
      int bn = Integer.parseInt(st.nextToken());

      int ansM = am * bn + bm * an;
      int ansN = an * bn;
      int gcd = getGCD(ansM, ansN);
      System.out.println(ansM / gcd + " " + ansN / gcd);
   }

   public static int getGCD(int m, int n) {
      int a = m < n ? m : n;
      int ret = 1;
      for (int i = 2; i < a + 1; i++) {
         if (m % i == 0 && n % i == 0) {
            ret = i;
         }
      }
      System.out.println(ret);
      return ret;
   }
}
