package j00_문제풀이.Q13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q13_11 {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      int N = Integer.parseInt(br.readLine());
      int[] arr = new int[N];
      HashMap<Integer, Integer> map = new HashMap<>();
      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int i = 0; i < N; i++) {
         arr[i] = Integer.parseInt(st.nextToken());
      }
      int[] sortedArr = new int[N];
      System.arraycopy(arr, 0, sortedArr, 0, N);

      mergeSort(sortedArr, 0, N - 1);

      int index = 0;
      for (int i = 0; i < N; i++) {
         if (!map.containsKey(sortedArr[i])) {
            map.put(sortedArr[i], index++);
         }
      }

      for (int i = 0; i < N; i++) {
         sb.append(map.get(arr[i])).append(" ");
      }
      System.out.println(sb.toString());
   }

      public static void merge(int[] arr, int left, int mid, int right) {
      int leftLen = mid - left + 1;
      int rightLen = right - mid;
      int[] leftArr = new int[leftLen];
      int[] rightArr = new int[rightLen];
      System.arraycopy(arr, left, leftArr, 0, leftLen);
      System.arraycopy(arr, mid + 1, rightArr, 0, rightLen);

      int i = 0, j = 0, k = left;
      while (i < leftLen && j < rightLen) {
         if (leftArr[i] <= rightArr[j]) {
            arr[k++] = leftArr[i++];
         } else {
            arr[k++] = rightArr[j++];
         }
      }
      if (i < leftLen) {
         System.arraycopy(leftArr, i, arr, k, leftLen-i);
      } else {
         System.arraycopy(rightArr, j, arr, k, rightLen-j);
      }
   }   
   public static void mergeSort(int[] arr, int left, int right) {
      if (left < right) {
         int mid = left + (right - left) / 2;
         mergeSort(arr, left, mid);
         mergeSort(arr, mid + 1, right);
         merge(arr, left, mid, right);
      }
   }
}
