package j09_접근지정자.test;

import j09_접근지정자.Access1;

/*
	class의 접근지정자
	public : 접근 제한 없음
	protected : 동일패키지와 상속받은 클래스 내부
	default (생략가능) : 동일 패키지 내에서만
	private : 동일 클래스 내에서만
 */

public class Access4 extends Access1 {			// extends로 상속
	public void access1PrintName() {
//		Access1 access = new Access1();
	}
}
