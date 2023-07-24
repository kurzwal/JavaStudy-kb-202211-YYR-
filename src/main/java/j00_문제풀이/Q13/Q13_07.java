package j00_문제풀이.Q13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q13_07 {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      int N = Integer.parseInt(br.readLine());
      long[] arr = new long[N];
      for (int i = 0; i < N; i++) {
         String[] s = br.readLine().split(" ");
         arr[i] = getFlat(Integer.parseInt(s[0]), Integer.parseInt(s[1]));
      }

      mergeSort(arr, 0, N - 1);

      for (int i = 0; i < N; i++) {
         sb.append(getXY(arr[i])).append('\n');
         if (i % 10000 == 0) {
            System.out.print(sb.toString());
            sb.setLength(0);
         }
      }
      if(sb.length() != 0) {
         System.out.println(sb.toString());
      }
   }
   public static long getFlat(int x, int y) {
      return 1l * (x + 100000) * 1000000 + 1l * (y + 100000);
   }
   public static String getXY(long x) {
      String ret = " ";
      int tempX = (int) (x / 1000000 - 100000);
      int tempY = (int) (x % 1000000 - 100000);
      return tempX + ret + tempY;
   }


   public static void merge(long[] arr, int left, int mid, int right) {
      int leftLen = mid - left + 1;
      int rightLen = right - mid;
      long[] leftArr = new long[leftLen];
      long[] rightArr = new long[rightLen];
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
   public static void mergeSort(long[] arr, int left, int right) {
      if (left < right) {
         int mid = left + (right - left) / 2;
         mergeSort(arr, left, mid);
         mergeSort(arr, mid + 1, right);
         merge(arr, left, mid, right);
      }
   }
}
