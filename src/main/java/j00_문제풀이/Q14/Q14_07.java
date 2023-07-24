package j00_문제풀이.Q14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Q14_07 {
   public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      int N = Integer.parseInt(st.nextToken());
      int M = Integer.parseInt(st.nextToken());
      HashSet<Integer> numSet = new HashSet<>(N);
      st = new StringTokenizer(br.readLine());
      for (int i = 0; i < N; i++) {
         int num = Integer.parseInt(st.nextToken());
         numSet.add(num);
      }
      st = new StringTokenizer(br.readLine());
      int answer = numSet.size();
      for (int i = 0; i < M; i++) {
         int num = Integer.parseInt(st.nextToken());
         if (numSet.contains(num)) answer--;
         else answer++;
      }
      System.out.println(answer);
   }
}
