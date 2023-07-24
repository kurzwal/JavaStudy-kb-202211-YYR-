package j14_스태틱.빌더;

public class ProductMain {
	public static void main(String[] args) {
		Product product = Product.builder()
				  .productName("지우개")
				  .stock(100)
				  .price(500)
				  .productCode(1)
				  .build();
		
		System.out.println(product);
	}
}
