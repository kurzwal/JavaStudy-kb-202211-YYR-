package j10_배열;

import java.util.Random;

public class Array3 {
	public static int foundMinNumber(int[] numbers) {
		int min = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
	      if (numbers[i] < min) {
	        min = numbers[i];
         }
      }
		return min;
	}
	public static int foundMaxNumber(int[] numbers) {
		int max = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
	      if (numbers[i] > max) {
	        max = numbers[i];
         }
      }
		return max;
	}
	public static void main(String[] args) {
		Random random = new Random();
		int[] randomArray = new int[10];
		int total = 0;
		for (int i = 0; i < randomArray.length; i++) {
			randomArray[i] = (random.nextInt(10) + 1);
			total += randomArray[i];
			System.out.print(randomArray[i]);
			if (i < randomArray.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("\n총합 : " + total);
		
		System.out.println("Max number : " + foundMinNumber(randomArray));
	   System.out.println("Min number : " + foundMaxNumber(randomArray));
		
	}
}
