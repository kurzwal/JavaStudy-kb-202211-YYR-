package j00_문제풀이.Q13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

class Pair {
   private final int x;
   private final int y;

   Pair(int x, int y) {
      this.x = x;
      this.y = y;
   }

   public int getX() {
      return this.x;
   }
   public int getY() {
      return this.y;
   }
}

public class Q13_044 {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      int N = Integer.parseInt(br.readLine());
      int[] arr = new int[N];
      arr[0] = Integer.parseInt(br.readLine());
      for (int i = 1; i < N; i++) {
         arr[i] = Integer.parseInt(br.readLine());
      }
      iterativeQuicksort(arr);
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

   public static int partition(int[] arr, int lo, int hi) {
      int md = (lo + hi) / 2;
      int midValueIndex = findMidValue(arr, lo, md, hi);
      swap(arr, midValueIndex, hi);
      int pivot = arr[hi];
      int pIndex = lo;
      for (int i = lo; i < hi; i++) {
         if (arr[i] <= pivot) {
            swap(arr, i, pIndex);
            pIndex++;
         }
      }
      swap(arr, pIndex, hi);
      return pIndex;
   }
   public static int findMidValue(int[] arr, int lo, int md, int hi) {
      if (arr[lo] < arr[md]) {
         if (arr[md] < arr[hi]) return md;
         else if (arr[lo] < arr[hi]) return hi;
         else return lo;
      } else {
         if (arr[hi] < arr[md]) return md;
         else if (arr[hi] < arr[lo]) return hi;
         else return lo;
      }
   }

   public static void iterativeQuicksort(int[] arr) {
      Stack<Pair> stack = new Stack<>();

      int lo = 0;
      int hi = arr.length - 1;
      stack.push(new Pair(lo, hi));

      while(!stack.isEmpty()) {
         lo = stack.peek().getX();
         hi = stack.peek().getY();
         stack.pop();

         int pivot = partition(arr, lo, hi);

         if (pivot - 1 > lo) {
            stack.push(new Pair(lo, pivot - 1));
         }
         if (pivot + 1 < hi) {
            stack.push(new Pair(pivot + 1, hi));
         }
      }
   }

   public static void swap(int[] arr, int i, int j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
   }
}
