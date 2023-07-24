package j00_문제풀이.QXX;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q1083 {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int N = Integer.parseInt(br.readLine());
      StringTokenizer st = new StringTokenizer(br.readLine());
      ArrayList<Integer> arr = new ArrayList<>();
      for (int i = 0; i < N; i++) {
         arr.add(Integer.parseInt(st.nextToken()));
      }
      int S = Integer.parseInt(br.readLine());
      int index = 0;
      while (true) {
         if (S == 0) break;
         if (index == arr.size()) break;

         int maxInt = arr.get(index);
         int maxIdx = index;
         int size = index + S >= N ? N : index + S + 1;
         for (int i = index + 1; i < size; i++) {
            if (maxInt < arr.get(i)) {
               maxInt = arr.get(i);
               maxIdx = i;
            }
         }
         arr.remove(maxIdx);
         arr.add(index, maxInt);
         S -= (maxIdx - index);
         index++;
      }
      printArr(arr);
   }

   public static void printArr(ArrayList<Integer> arr) {
      StringBuilder sb = new StringBuilder();
      int size = arr.size();
      for (int i = 0; i < size; i++) 
         sb.append(arr.get(i)).append(' ');
      System.out.println(sb);
   }
}
