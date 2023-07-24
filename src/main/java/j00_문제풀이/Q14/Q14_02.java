package j00_문제풀이.Q14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Q14_02 {
   public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      int N = Integer.parseInt(st.nextToken());
      int M = Integer.parseInt(st.nextToken());
      HashSet<String> textSet = new HashSet<>();
      for (int i = 0; i < N; i++) {
         textSet.add(br.readLine());
      }
      int count = 0;
      for (int i = 0; i < M; i++) {
         if (textSet.contains(br.readLine())) count++;
      }
      System.out.println(count);
   }
}
