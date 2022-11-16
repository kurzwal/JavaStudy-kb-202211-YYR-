package j06_반복;

public class Loop2 {
	public static void main(String[] args) {
		int dan = 2;
		for(int i = 0; i < 8; i++) {
			System.out.println("== " + dan + "단 ==");
			for(int j = 0; j < 9; j++) {
				System.out.println(dan + " × " + (j + 1) + " = " + (dan * (j + 1)));
			}
			dan++;
			System.out.println();
		}
	}
}
