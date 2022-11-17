package j08_클래스;

public class Phone {
	String company;
	String model;
	
	// Phone() {}	// 이러한 생성자(메소드)가 기본으로 내장되어있읍
	
	Phone() {} 	// 매개변수 없이 클래스를 생성할 수 있게 오버로딩
					// 기본적으로 내장되어있지만 생성자를 바꾼 경우에 써야함
	
	Phone(String c, String m) {	// 메소드, 리턴값은 할당된 메모리 주소
//		System.out.println("생성자 호출");
		company = c;
		model = m;
	}
	void printPhoneCompany() {
		System.out.println("제조사 : " + company);
		System.out.println();
	}
	void printPhoneModel() {
		System.out.println("모델명 : " + model);
		System.out.println();
	}
}
