package j00_문제풀이.QXX;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Q1271 {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      StringBuilder sb = new StringBuilder();
      BigInteger N = new BigInteger(st.nextToken());
      BigInteger M = new BigInteger(st.nextToken());
      String ansDiv = N.divide(M).toString();
      String ansRem = N.remainder(M).toString();
      sb.append(ansDiv).append('\n').append(ansRem);
      System.out.println(sb.toString());
   }
}
