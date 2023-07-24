package j00_문제풀이.QXX;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class Q1038 {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int N = Integer.parseInt(br.readLine());
      if (N < 10) System.out.println(N);
      else if (N == 1022) System.out.println("9876543210");
      else if (N > 1022) System.out.println(-1);
      else {
         int ans = findAns(N);
         System.out.println(ans);
      }
   }
   public static void inputCombi(int len, ArrayList<Integer> retArr, int[] pickArr) {
      int[] combi = new int[len];
      inputCombi(pickArr, retArr, combi, 0, 0);
   }
   public static void inputCombi(int[] arr, ArrayList<Integer> retArr, int[] combi, int startIdx, int curIdx) {
      if (curIdx == combi.length) {
         retArr.add(toInteger(combi));
         return;
      }
      for (int i = startIdx; i < arr.length; i++) {
         combi[curIdx] = arr[i];
         inputCombi(arr, retArr, combi, i + 1, curIdx + 1);
      }
   }
   public static int findAns(int N) {
      int count = 9;
      int[] pickArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
      for (int i = 2; i < 11; i++) {
         ArrayList<Integer> arr = new ArrayList<>();
         inputCombi(i, arr, pickArr);
         if (count + arr.size() >= N) {
            arr.sort(Comparator.naturalOrder());
            return arr.get(N - count - 1);
         } else {
            count += arr.size();
         }
      }
      return -1;
   }
   public static int toInteger(int[] arr) {
      int ret = 0;
      for (int i = arr.length - 1; i >= 0; i--) {
         ret *= 10;
         ret += arr[i];
      }
      return ret;
   }
}
