package j00_문제풀이.QXX;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Q1025 {
   public static void main(String[] args) throws IOException {
      // input
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      int N = Integer.parseInt(st.nextToken());
      int M = Integer.parseInt(st.nextToken());
      int[][] arr = new int[N][M];
      String s;
      int maxLen = N > M ? N : M;
      List<List<Integer>> powArr = new ArrayList<List<Integer>>();
      int count = 0;
      for (int i = 0; i < maxLen; i++) {
         powArr.add(new ArrayList<>());
         int maxTemp = 10;
         for (int x = 0; x < i; x++) maxTemp *= 10;
         for (int j = count; j * j < maxTemp; j++) {
            powArr.get(i).add(j * j);
            count++;
         }
      }
      for (int i = 0; i < N; i++) {
         s = br.readLine();
         for (int j = 0; j < M; j++) {
            arr[i][j] = Character.getNumericValue(s.charAt(j));
         }
      }
      
      // calculate
      int ans = -1;
      for (int i = powArr.size() - 1; i >= 0; i--) {
         ans = findAnswer(i + 1, powArr.get(i), arr);
         if (ans != -1) break;
      }
      
      // output
      System.out.println(ans);
   }
   public static void addWithDirection(List<Integer> retArr, int len, int xDir, int yDir, int[][] arr) {
      if (xDir == 0 && yDir == 0) return;
      int xlen = arr[0].length;
      int ylen = arr.length;
      int xLenAbs = xDir > 0 ? xDir : -xDir;
      int yLenAbs = yDir > 0 ? yDir : -yDir;
      int xTrueLen = len + (len - 1) * (xLenAbs - 1);
      int yTrueLen = len + (len - 1) * (yLenAbs - 1);
      int numOfX = xlen - xTrueLen + 1;
      int numOfY = ylen - yTrueLen + 1;
      int xStart = xDir < 0 ? xTrueLen - 1 : 0;
      int yStart = yDir < 0 ? yTrueLen - 1 : 0;
      for (int x = xStart; x < xStart + numOfX; x++) {
         for (int y = yStart; y < yStart + numOfY; y++) {
            String s = "";
            int xNext = x;
            int yNext = y;
            for (int i = 0; i < len; i++) {
               s += arr[yNext][xNext];
               xNext += xDir;
               yNext += yDir;
            }
            if (!retArr.contains(Integer.parseInt(s))) retArr.add(Integer.parseInt(s));
         }
      }
   }

   public static List<Integer> findAllInt(int[][] arr, int len) {
      int xlen = arr[0].length; // 5
      int ylen = arr.length; // 9
      int xDirLen = (xlen - len + 1) * 2 + 1;
      int yDirLen = (ylen - len + 1) * 2 + 1;
      xDirLen = xDirLen > 0 ? xDirLen : 1;
      yDirLen = yDirLen > 0 ? yDirLen : 1;
      int[] xDirArr = new int[xDirLen];
      int[] yDirArr = new int[yDirLen];
      List<Integer> retArr = new ArrayList<>();
      for (int i = 0; i < xDirLen; i++) xDirArr[i] = i - xDirLen / 2;
      for (int i = 0; i < yDirLen; i++) yDirArr[i] = i - yDirLen / 2;
      for (int i = 0; i < xDirLen; i++) {
         for (int j = 0; j < yDirLen; j++) {
            addWithDirection(retArr, len, xDirArr[i], yDirArr[j], arr);
         }
      }
      return retArr;
   }

   public static int findAnswer(int len, List<Integer> dict, int[][] arr) {
      int ret = -1;
      List<Integer> intArr = findAllInt(arr, len);
      for (int arrint : intArr) {
         ret = dict.contains(arrint) && ret < arrint ? arrint : ret;
      }
      return ret;
   }
}
