package j00_문제풀이.Q08;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q08_0101 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
		String n = sc.next();
		int b = sc.nextInt();
      Map<String, Integer> index = new HashMap<>();
      for (int i = 0; i < 36; i++) {
         if (i < 10) {
            index.put(String.valueOf(i), i);
         } else {
            index.put(String.valueOf((char) ((int) 'A' + (i - 10))), i);
         }
      }
      int result = 0;
      for (int i = 0; i < n.length(); i++) {
         int I = index.get(String.valueOf(n.charAt(i)));
         int plus = ((int) Math.pow(b, i)) * I;
         result += plus;
      }
      System.out.println(result);
   }
}
