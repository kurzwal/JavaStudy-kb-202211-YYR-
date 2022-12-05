package j20_함수형인터페이스;

import java.util.function.Function;
import java.util.function.Predicate;

public class Main5 {
	
	public static void main(String[] args) {
		
		Predicate<Integer> isEven = n -> n % 2 == 0;
		Function<Integer, String> isEvenString = num -> {
			Predicate<Integer> isEven2 = n -> n % 2 == 0;
			return isEven2.test(num) ? "짝수" : "홀수";
		};
		Function<Integer, String> isEvenStr = num -> num%2==0? "짝수" : "홀수";
		
		System.out.println(isEvenString.apply(3));
		System.out.println(isEven.test(98));
		System.out.println(isEvenStr.apply(98));
		
		
		
	}
}
