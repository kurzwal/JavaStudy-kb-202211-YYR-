package j08_클래스;

public class PhoneMain {
	public static void main(String[] args) {
		
		Phone iPhone14 = new Phone();							// Phone 9번라인 호출
		Phone galaxyS22 = new Phone("SAMSUNG", "S22");	// Phone 12번라인 호출
		System.out.println(iPhone14);		// 할당된 주소 출력
		System.out.println(galaxyS22);
		
		iPhone14.company = "Apple";
//		iPhone14.model = "14";

		iPhone14.printPhoneCompany();
		iPhone14.printPhoneModel();
		
		galaxyS22.printPhoneCompany();
		galaxyS22.printPhoneModel();
		
		
	}
}

