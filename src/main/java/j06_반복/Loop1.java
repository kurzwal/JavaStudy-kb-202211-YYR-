package j06_반복;

public class Loop1 {
	public static void main(String[] args) {
		for(int i = 0 ; i < 10 ; i++) {
			System.out.print(i);
			if (i < 9) {
				System.out.print(", ");
			}
			if ((i + 1) % 5 == 0) {
				System.out.println();
			}
		}
		for(int i = 0 ; i < 10 ; i++) {
			System.out.print(i+10);
			if (i < 9) {
				System.out.print(", ");
			}
			if ((i + 1) % 5 == 0) {
				System.out.println();
			}
		}
		for(int i = 0 ; i < 10 ; i++) {
			System.out.print(10-i);
			if (i < 9) {
				System.out.print(", ");
			}
			if ((i + 1) % 5 == 0) {
				System.out.println();
			}
		}
		for(int i = 0 ; i < 10 ; i++) {
			System.out.print(20-i);
			if (i < 9) {
				System.out.print(", ");
			}
			if ((i+1)%5==0) {
				System.out.println();
			}
		}
	}
}
