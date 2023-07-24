package j00_문제풀이.QXX;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Q2238 {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      BigInteger a = new BigInteger(br.readLine());
      BigInteger b = new BigInteger(br.readLine());
      sb.append(a.add(b)).append('\n').append(a.subtract(b)).append('\n').append(a.multiply(b));
      System.out.println(sb.toString());
   }
}
