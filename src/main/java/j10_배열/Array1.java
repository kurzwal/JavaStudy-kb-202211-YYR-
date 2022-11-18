package j10_배열;

public class Array1 {
	public static void main(String[] args) {
		int[] numbers = new int[5];

		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[3] = 4;
		numbers[4] = 5;
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);
		
		for (int i = 0; i < 5; i++) {
			System.out.println(numbers[i]);
		}
	}
}
