package j00_문제풀이.Q14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q14_05 {
   public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      int N = Integer.parseInt(br.readLine());
      HashMap<Integer, Integer> cardMap = new HashMap<>();
      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int i = 1; i < N + 1; i++) {
         int card = Integer.parseInt(st.nextToken());
         cardMap.put(card, cardMap.getOrDefault(card, 0) + 1);
      }
      int M = Integer.parseInt(br.readLine());
      st = new StringTokenizer(br.readLine());
      for (int i = 0; i < M; i++) {
         int card = Integer.parseInt(st.nextToken());
         String ans = cardMap.getOrDefault(card, 0) + " ";
         sb.append(ans);
      }
      System.out.println(sb.toString());
   }
}
