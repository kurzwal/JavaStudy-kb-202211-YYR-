package j12_추상.추상클래스;

/*
		추상 메소드를 하나라도 포함하는 클래스는
		추상 클래스로 정의하여야 한다.
		단, 추상 메소드가 없어도 추상 클래스가 될 수 있다.
		추상 클래스는 단독으로 생성할 수 없다.
 */

public abstract class Animal {
	
	private String kind;
	
	
	public Animal(String kind) {
		this.kind = kind;
		System.out.println(kind + "이(가) 생성되었습니다.");
	}
	
	// 추상메소드
	public abstract void move(); // 구현부가 필요 없으므로 중괄호 없이 세미콜론으로 끝냄
	
	public void eat() {
		System.out.println("동물이 밥을 먹습니다.");
	}
}
