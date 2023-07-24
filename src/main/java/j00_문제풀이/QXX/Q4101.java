package j00_문제풀이.QXX;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q4101 {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      StringTokenizer st = new StringTokenizer(br.readLine());
      while (true) {
         int a = Integer.parseInt(st.nextToken());
         int b = Integer.parseInt(st.nextToken());
         if (a == 0 && b == 0) break;
         sb.append(a > b ? "Yes\n" : "No\n");
         st = new StringTokenizer(br.readLine());
      }
      System.out.println(sb.toString());
   }
}
