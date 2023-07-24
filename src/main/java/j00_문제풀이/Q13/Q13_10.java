package j00_문제풀이.Q13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Member {
   private final int age;
   private final String name;
   
   Member (int age, String name) {
      this.age = age;
      this.name = name;
   }

   public int getAge() {
      return this.age;
   }

   public String toString() {
      return this.age + " " + this.name;
   }
}
public class Q13_10 {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      int N = Integer.parseInt(br.readLine());
      Member[] arr = new Member[N];
      for (int i = 0; i < N; i++) {
         String[] s = br.readLine().split(" ");
         arr[i] = new Member(Integer.parseInt(s[0]), s[1]);
      }

      mergeSort(arr, 0, N - 1);

      for (int i = 0; i < N; i++) {
         sb.append(arr[i].toString()).append('\n');
         if (i % 10000 == 0) {
            System.out.print(sb.toString());
            sb.setLength(0);
         }
      }
      if(sb.length() != 0) {
         System.out.println(sb.toString());
      }
   }

   public static void merge(Member[] arr, int left, int mid, int right) {
      int leftLen = mid - left + 1;
      int rightLen = right - mid;
      Member[] leftArr = new Member[leftLen];
      Member[] rightArr = new Member[rightLen];
      System.arraycopy(arr, left, leftArr, 0, leftLen);
      System.arraycopy(arr, mid + 1, rightArr, 0, rightLen);

      int i = 0, j = 0, k = left;
      while (i < leftLen && j < rightLen) {
         if (leftArr[i].getAge() <= rightArr[j].getAge()) {
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
   public static void mergeSort(Member[] arr, int left, int right) {
      if (left < right) {
         int mid = left + (right - left) / 2;
         mergeSort(arr, left, mid);
         mergeSort(arr, mid + 1, right);
         merge(arr, left, mid, right);
      }
   }
}
