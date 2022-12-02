package j19_익명클래스;

import java.util.Scanner;

public class CalcMain {
	public static void main(String[] args) {
		
		// interface는 생성할 수 없지만
		// 그자리에서 오버라이드 해서 임시로 쓸수있다 (익명클래스)
		Calculator c1 = new Calculator() {
			@Override
			public int calc(int a, int b) {
				System.out.println("덧셈");
				return a + b;
			}
		};
		
		int r1 = c1.calc(10, 20);
		System.out.println(r1);
		
		// 클래스를 실제 만드는 방법
		Calculator c2 = new Addition();
		
		int r2 = c2.calc(20, 30);
		System.out.println(r2);
		
		// 람다식의 특징
		// 1. 인수의 자료형을 축약 가능하다.
		// 2. 리턴과 중괄호를 생략 가능하다. 
		//    : (중괄호와 리턴 사이에 아무것도 없어야함)
		// 3. *인터페이스 안에 메소드가 단 하나여야만 람다식 가능 (인터페이스만 가능)
		
		// 람다식 방법
		Calculator c3 = (x, y) -> x + y;
		int r3 = c3.calc(10, 20);
		System.out.println(r3);
		// 람다식 축약 전
		Calculator c4 = (int x, int y) -> {
			return x + y;
		};
		int r4 = c4.calc(10, 20);
		System.out.println(r4);
		
		// 인수가 하나면 소괄호도 생략 가능
		CalculatorSub cs = x -> x * x;
		System.out.println(cs.calc(10));
		System.out.println(cs.a());
	}
}
