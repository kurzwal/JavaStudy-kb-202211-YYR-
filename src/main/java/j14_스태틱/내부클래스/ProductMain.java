package j14_스태틱.내부클래스;

public class ProductMain {
	public static void main(String[] args) {
		
		
		ProductBuilder productbuilder = Product.builder()
				  .productName("a")
				  .productCode(3)
				  .stock(1)
				  .price(1);
		
		
		Product product = productbuilder.build();
		
		System.out.println(product);
		
		
	}
}
