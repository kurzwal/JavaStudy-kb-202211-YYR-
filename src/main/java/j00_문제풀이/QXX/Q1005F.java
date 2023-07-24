package j00_문제풀이.QXX;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Q1005F {
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
         int K = Integer.parseInt(st.nextToken());
         HashMap<Integer, ArrayList<Integer>> techMap = new HashMap<>(K);
         st = new StringTokenizer(br.readLine());
         for (int i = 0; i < N; i++) {
            buildTimeArr[i] = Integer.parseInt(st.nextToken());
         }
         for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()) - 1;
            int y = Integer.parseInt(st.nextToken()) - 1;
            if (!techMap.containsKey(y)) 
               techMap.put(y, new ArrayList<>());
            techMap.get(y).add(x);
         }
         int W = Integer.parseInt(br.readLine()) - 1;

         // calc
         ArrayList<Integer> needToBuildArr = new ArrayList<>();
         HashMap<Integer, Integer> buildRootTimeMap = new HashMap<>();
         HashSet<Integer> needToBuildSet = new HashSet<>();
         needToBuildArr.add(W);
         buildRootTimeMap.put(W, buildTimeArr[W]);
         needToBuildSet.add(W);
         int answer = buildTimeArr[W];
         for (int i = 0; i < needToBuildArr.size(); i++) {
            int curIdx = needToBuildArr.get(i);
            int curBuildTime = buildRootTimeMap.get(curIdx);
            ArrayList<Integer> nextBuildArr = techMap.get(curIdx);
            if (nextBuildArr != null) {
               for (int nextIdx : nextBuildArr) {
                  int nextTime = buildTimeArr[nextIdx];
                  int newTime = curBuildTime + nextTime;
                  System.out.println("curIdx : " + (curIdx+1) + " / nextIdx : " + (nextIdx+1) + " / newTime : " + newTime);
                  if (!buildRootTimeMap.containsKey(nextIdx) || buildRootTimeMap.get(nextIdx) < newTime) {
                     buildRootTimeMap.put(nextIdx, newTime);
                     needToBuildSet.remove(nextIdx);
                  }
                  if (!needToBuildSet.contains(nextIdx)) {
                     needToBuildArr.add(nextIdx);
                     needToBuildSet.add(nextIdx);
                  }
                  answer = answer < newTime ? newTime : answer;
               }
            }
         }
      // print
         sb.append(answer).append('\n');
      }
      System.out.println(sb);
   }
}
