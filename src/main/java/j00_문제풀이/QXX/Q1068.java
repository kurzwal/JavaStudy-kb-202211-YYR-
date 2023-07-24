package j00_문제풀이.QXX;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Q1068 {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int N = Integer.parseInt(br.readLine());
      StringTokenizer st = new StringTokenizer(br.readLine());
      int[] arr = new int[N];
      for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
      int x = Integer.parseInt(br.readLine());

      // remove
      ArrayList<Integer> delList = new ArrayList<>();
      delList.add(x);
      HashSet<Integer> delSet = new HashSet<>();
      delSet.add(x);
      for (int i = 0; i < delList.size(); i++) {
         for (int j = 0; j < N; j++) {
            if (!delSet.contains(j) && arr[j] == delList.get(i)) {
               delList.add(j);
               delSet.add(j);
            }
         }
      }
      for (int i = 0; i < N; i++) {
         if (delSet.contains(i)) arr[i] = -2;
      }

      // count
      HashSet<Integer> countSet = new HashSet<>();
      int count = 0;
      for (int i = 0; i < N; i++) {
         if (arr[i] != -2) {
            count++;
            countSet.add(arr[i]);
         }
      }
      countSet.remove(-1);

      // print
      int ans = count - countSet.size();
      System.out.println(ans);
   }
   public static void printArr(int[] arr) {
      String s = "[ ";
      for (int i = 0; i < arr.length; i++) {
         s = s + arr[i] + ", ";
      }
      s = s + "]";
      System.out.println(s);
   }
}
