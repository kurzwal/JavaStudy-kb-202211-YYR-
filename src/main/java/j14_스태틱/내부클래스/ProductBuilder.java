package j14_스태틱.내부클래스;
/*
	빌더를 외부에서 생성하는 경우
 */
public class ProductBuilder {
	
	private int productCode;
	private String productName;
	private int price;
	private int stock;
	
	public ProductBuilder() {}
	
	public ProductBuilder productCode(int productCode) {
		this.productCode = productCode;
      return this;
	}
	public ProductBuilder productName(String productName) {
		this.productName = productName;
      return this;
	}
	public ProductBuilder price(int price) {
		this.price = price;
      return this;
	}
	public ProductBuilder stock(int stock) {
		this.stock = stock;
      return this;
	}
	public Product build() {
		return new Product(productCode, productName, price, stock);
	}
	
}
