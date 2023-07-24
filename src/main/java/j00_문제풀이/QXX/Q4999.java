package j00_문제풀이.QXX;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4999 {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String a = br.readLine();
      String b = br.readLine();
      int aLen = a.length();
      int bLen = b.length();
      if (aLen >= bLen) System.out.println("go");
      else System.out.println("no");
   }
}
