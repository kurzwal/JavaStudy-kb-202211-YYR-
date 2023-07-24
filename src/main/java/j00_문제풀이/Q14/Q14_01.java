package j00_문제풀이.Q14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Q14_01 {
   public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      int N = Integer.parseInt(br.readLine());
      HashSet<Integer> cardSet = new HashSet<>();
      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int i = 0; i < N; i++) {
         cardSet.add(Integer.parseInt(st.nextToken()));
      }
      int M = Integer.parseInt(br.readLine());
      st = new StringTokenizer(br.readLine());
      for (int i = 0; i < M; i++) {
         if (cardSet.contains(Integer.parseInt(st.nextToken()))) 
            sb.append("1 ");
         else
            sb.append("0 ");
      }
      System.out.println(sb.toString());
   }
}
