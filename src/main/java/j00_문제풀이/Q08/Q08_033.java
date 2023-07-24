package j00_문제풀이.Q08;

import java.util.Scanner;

public class Q08_033 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int[] changeArr = {25, 10, 5, 1};
      for (int i = 0; i < N; i++) {
         sc.nextLine();
         int change = sc.nextInt();
         for (int j = 0; j < changeArr.length; j++) {
            int currentChange = change/changeArr[j];
            System.out.print(currentChange + " ");
            change = change % changeArr[j];
         }
         System.out.println();
      }
   }
}
