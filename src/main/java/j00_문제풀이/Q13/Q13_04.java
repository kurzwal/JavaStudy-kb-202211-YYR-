package j00_문제풀이.Q13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q13_04 {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      int N = Integer.parseInt(br.readLine());
      int[] arr = new int[N];
      arr[0] = Integer.parseInt(br.readLine());
      for (int i = 1; i < N; i++) {
         arr[i] = Integer.parseInt(br.readLine());
      }

      mergeSort(arr, 0, N - 1);

      for (int i = 0; i < N; i++) {
         sb.append(arr[i]).append('\n');
         if (i % 10000 == 0) {
            System.out.print(sb.toString());
            sb.setLength(0);
         }
      }
      if(sb.length() != 0) {
         System.out.println(sb.toString());
      }
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
