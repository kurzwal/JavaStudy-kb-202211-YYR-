package j14_스태틱.빌더;

public class ProductMain {
	public static void main(String[] args) {
		Product product = Product.builder()
				  .productCode(1)
				  .productName("지우개")
				  .price(500)
				  .stock(100)
				  .build();
		
		System.out.println(product);
	}
}
