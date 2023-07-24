package j00_문제풀이.QXX;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q3733 {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      StringTokenizer st = new StringTokenizer(br.readLine());
      while (true) {
         int a = Integer.parseInt(st.nextToken());
         int b = Integer.parseInt(st.nextToken());
         sb.append(b / (a + 1)).append('\n');
         String s = br.readLine();
         if (s == null) break;
         else st = new StringTokenizer(s);
      }
      System.out.println(sb.toString());
   }
}
