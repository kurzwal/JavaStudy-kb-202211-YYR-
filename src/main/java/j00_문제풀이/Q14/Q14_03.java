package j00_문제풀이.Q14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Q14_03 {
   public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int N = Integer.parseInt(br.readLine());
      StringTokenizer st;
      HashSet<String> workerSet = new HashSet<>();
      for (int i = 0; i < N; i++) {
         st = new StringTokenizer(br.readLine());
         String name = st.nextToken();
         boolean isEntered = st.nextToken().equals("enter");
         if (isEntered) workerSet.add(name);
         else workerSet.remove(name);
      }
      StringBuilder sb = new StringBuilder();
      workerSet.stream().sorted(Comparator.reverseOrder())
         .forEach(worker -> sb.append(worker).append('\n'));
      System.out.println(sb.toString());
   }
}
