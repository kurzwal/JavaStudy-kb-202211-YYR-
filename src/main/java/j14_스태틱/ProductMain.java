package j14_스태틱;

public class ProductMain {
	
	public static void show() {
		System.out.println("메인메소드에서 호출");
	}
	public static void main(String[] args) {
	
		Product product1 = new Product("아이폰14");
		Product product2 = new Product("아이폰14_Mini");
		
		System.out.println(product1);
		System.out.println(product2);
		
		Product.print();
		product1.print();			// 클래스 객체에서도 스태틱 메소드는 호출 가능
		System.out.println(product1.autoIncrement);	// 스태틱 변수도 호출 가능
		System.out.println(Product.autoIncrement);
		
//		ProductMain pm = new ProductMain();		// 메소드가 static 이 아닐 경우
//		pm.show();										// 호출하는 법 (생성이 필요하다)
		show();
		
	}
}
