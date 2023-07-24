package j00_문제풀이.Q14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Q14_06 {
   public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      StringBuilder sb = new StringBuilder();
      int N = Integer.parseInt(st.nextToken());
      int M = Integer.parseInt(st.nextToken());
      HashSet<String> peopleSetD = new HashSet<>(N);
      for (int i = 0; i < N; i++) {
         String people = br.readLine();
         peopleSetD.add(people);
      }
      HashSet<String> answerSet = new HashSet<>(M);
      for (int i = 0; i < M; i++) {
         String people = br.readLine();
         if (peopleSetD.contains(people)){
            answerSet.add(people);
         }
      }
      sb.append(answerSet.size()).append('\n');
      answerSet.stream().sorted().forEach(people -> sb.append(people).append('\n'));
      System.out.println(sb.toString());
   }
}
