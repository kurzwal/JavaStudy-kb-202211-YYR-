package j14_스태틱;
/*
	공유영역 (static)
 */
import lombok.*;
@Data
public class Product {
	public static int autoIncrement = 20220000;	// 스태틱영역도 클래스를 생성하면 메모리에 할당된다
																// 복사되는 것이 아닌 원본의 주소를 참조함
	
	private int serialNumber;
	
	private String name;
	public Product(String name) {
		this.serialNumber = ++autoIncrement;
		this.name = name;
	}
	
	
	public static void print() {
		System.out.println(autoIncrement);
	}
	/*	스태틱 메소드는 기존의 클래스 틀에만 메모리 할당이 되어있음
	 	그러므로 클래스가 만들어지면서 생기는 스태틱이 아닌
	 	영역에 있는 변수나 함수는 호출 불가능.
	 	(스태틱 메소드는 스태틱 메소드와 스태틱 변수만 참조 가능) 		*/
	

}
