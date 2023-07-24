package j00_문제풀이.QXX;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Q1005 {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      StringTokenizer st;
      int T = Integer.parseInt(br.readLine());
      for (int I = 0; I < T; I++) {
         // input
         st = new StringTokenizer(br.readLine());
         int N = Integer.parseInt(st.nextToken());
         int[] buildTimeArr = new int[N];
         int[] childCountArr = new int[N];
         int K = Integer.parseInt(st.nextToken());
         HashMap<Integer, HashSet<Integer>> techMap = new HashMap<>(K);
         st = new StringTokenizer(br.readLine());
         for (int i = 0; i < N; i++) {
            buildTimeArr[i] = Integer.parseInt(st.nextToken());
         }
         for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()) - 1;
            int y = Integer.parseInt(st.nextToken()) - 1;
            if (!techMap.containsKey(x))
               techMap.put(x, new HashSet<>());
            techMap.get(x).add(y);
            childCountArr[y]++;
         }
         int W = Integer.parseInt(br.readLine()) - 1;

         // calc
         int[] sumArr = new int[N];
         LinkedList<Integer> parentQueue = new LinkedList<>(); 
         for (int i = 0; i < N; i++) {
            if (childCountArr[i] == 0) {
               sumArr[i] = buildTimeArr[i];
               parentQueue.add(i);
            }
         }
         while(!parentQueue.isEmpty()) {
            int parentIdx = parentQueue.poll();
            if (parentIdx != W && techMap.containsKey(parentIdx)) {
               HashSet<Integer> childSet = techMap.get(parentIdx);
               for (int childIdx : childSet) {
                  int newTime = sumArr[parentIdx] + buildTimeArr[childIdx];
                  sumArr[childIdx] = newTime > sumArr[childIdx] ?
                     newTime : sumArr[childIdx];
                  if (--childCountArr[childIdx] == 0)
                     parentQueue.add(childIdx);
               }
            }
         }
         sb.append(sumArr[W]).append('\n');
      }
      System.out.println(sb);
   }
}
