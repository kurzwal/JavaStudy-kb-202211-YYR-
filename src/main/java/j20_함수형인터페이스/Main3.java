package j20_함수형인터페이스;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main3 {
	
	public static void forEachTest(Consumer<String> consumer, List<String> list) {
		for(String s : list) {
			consumer.accept(s);
		}
		
	}
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		
		names.add("임지현");
		names.add("신경수");
		names.add("고희주");
		names.add("문승주");
		names.add("장건녕");
		
		names.forEach(n -> {System.out.println(n);});
		
		System.out.println();
		forEachTest(n -> {System.out.println(n);}, names);
		
		Consumer<String> cons = s -> System.out.println(s); 
		cons.accept("a");
	}
}
