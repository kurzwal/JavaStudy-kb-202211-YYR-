package j00_문제풀이.Q00;

public class Q00_03 {
	public static void main(String[] args) {
		int[] a = new int[] {1, 2, 3, 4, 5};
		System.out.println("[배열 a]");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + (i != a.length - 1 ? ", " : "\n"));
		}
		
		System.out.println("[배열 b]");
		int[] b = a;
		
		b[3] = 10;
		for(int i = 0; i < a.length; i++) {
			System.out.print(b[i] + (i != b.length - 1 ? ", " : "\n"));
		}
		System.out.println("[배열 a]");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + (i != a.length - 1 ? ", " : "\n"));
		}
		
	}
}
