package j00_문제풀이.QXX;

public class QTest {
   public static void main(String[] args) {
      int[] a = {1, 2};
      int[] b = {1, 2};
      int[] c = new int[2];
      c[0] = 1;
      c[1] = 2;
      System.out.println(a == b);
      System.out.println(b == c);
      System.out.println(c == a);
   }
}
