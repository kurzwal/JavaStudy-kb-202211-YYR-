package j00_문제풀이.Q15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q15_05 {
   public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      int N = Integer.parseInt(br.readLine());
      for (int i = 0; i < N; i++) {
         long quest = Long.parseLong(br.readLine());
         long ans = findPrime(quest);
         sb.append(ans).append('\n');
      }
      System.out.println(sb.toString());
   }
   
   public static boolean isPrime(long n) {
      if (n < 2) return false;
      if (n == 2 || n == 3) return true;
      if (n % 2 == 0 || n % 3 == 0) return false;
      long sqrtN = (long)Math.sqrt(n) + 1;
      for (long i = 6L; i <= sqrtN; i += 6) {
         if (n % (i - 1) == 0 || n % (i + 1) == 0) return false;
      }
      return true;
   }
   
   public static long findPrime(long n) {
      if (n <= 2) return 2;
      long index = n % 2 == 0 ? n + 1 : n;
      while (!isPrime(index)) {
         index += 2;
      }
      return index;
   }
}
