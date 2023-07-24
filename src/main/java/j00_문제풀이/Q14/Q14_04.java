package j00_문제풀이.Q14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q14_04 {
   public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      int N = Integer.parseInt(st.nextToken());
      int M = Integer.parseInt(st.nextToken());
      HashMap<String, String> pokemonMap = new HashMap<>();
      for (int i = 1; i < N + 1; i++) {
         String pokemon = br.readLine();
         String pokeNum = i + "";
         pokemonMap.put(pokemon, pokeNum);
         pokemonMap.put(pokeNum, pokemon);
      }
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < M; i++) {
         String ans = pokemonMap.get(br.readLine());
         sb.append(ans).append('\n');
      }
      System.out.println(sb.toString());
   }
}
