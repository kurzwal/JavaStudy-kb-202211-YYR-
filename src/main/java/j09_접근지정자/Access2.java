package j09_접근지정자;

/*
	class의 접근지정자
	public : 접근 제한 없음
	protected : 동일패키지와 상속받은 클래스 내부
	default (생략가능) : 동일 패키지 내에서만
	private : 동일 클래스 내에서만
 */

public class Access2 {
	int age;
	
	void printAge() {
		System.out.println("age: " + age);
	}
	
}
