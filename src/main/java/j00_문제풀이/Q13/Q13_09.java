package j00_문제풀이.Q13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q13_09 {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      int N = Integer.parseInt(br.readLine());
      String[] arr = new String[N];

      for (int i = 0; i < N; i++) {
         arr[i] = br.readLine();
      }

      mergeSort(arr, 0, N - 1);

      sb.append(arr[0]).append('\n');
      for (int i = 1; i < N; i++) {
         if (arr[i-1].compareTo(arr[i]) != 0) {
            sb.append(arr[i]).append('\n');
         }
         if (i % 10000 == 0) {
            System.out.print(sb.toString());
            sb.setLength(0);
         }
      }
      if(sb.length() != 0) {
         System.out.println(sb.toString());
      }
   }
   public static int compare(String a, String b) {
      int c = a.length() - b.length();
      if (c == 0) {
         return a.compareTo(b);
      } else {
         return c;
      }
   }

   public static void merge(String[] arr, int left, int mid, int right) {
      int leftLen = mid - left + 1;
      int rightLen = right - mid;
      String[] leftArr = new String[leftLen];
      String[] rightArr = new String[rightLen];
      System.arraycopy(arr, left, leftArr, 0, leftLen);
      System.arraycopy(arr, mid + 1, rightArr, 0, rightLen);

      int i = 0, j = 0, k = left;
      while (i < leftLen && j < rightLen) {
         if (compare(leftArr[i], rightArr[j]) < 0) {
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
   public static void mergeSort(String[] arr, int left, int right) {
      if (left < right) {
         int mid = left + (right - left) / 2;
         mergeSort(arr, left, mid);
         mergeSort(arr, mid + 1, right);
         merge(arr, left, mid, right);
      }
   }
}
