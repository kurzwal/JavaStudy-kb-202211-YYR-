package j00_문제풀이.QXX;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q6840 {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int a = Integer.parseInt(br.readLine());
      int b = Integer.parseInt(br.readLine());
      int c = Integer.parseInt(br.readLine());
      int mid = a > b ? c > a ? a : c > b ? c : b : c > b ? b : c > a ? c : a;
      System.out.println(mid);
   }
}
