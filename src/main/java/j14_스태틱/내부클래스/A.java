package j14_스태틱.내부클래스;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class A {
	
	@AllArgsConstructor
	public class B {
		@Getter
		private String name;
	}
	
	@AllArgsConstructor
   public static class C {
		@Getter
		private String name;
	}
}
