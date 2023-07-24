package j00_문제풀이.Q04;

import java.util.Scanner;

public class Q04_066 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int M = sc.nextInt();
      int[] arr = new int[N];
      for (int i = 0; i < N; i++) {
         arr[i] = i + 1;
      }
      for (int I = 0; I < M; I++) {
         sc.nextLine();
         int i = sc.nextInt() - 1;
         int j = sc.nextInt() - 1;
         int temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
      }
      for (int i = 0; i < N; i++) {
         System.out.print(arr[i] + " ");
      }
   }
}
