package j00_문제풀이.T01;

public class Main {

	public static void main(String[] args) {
		
		Order order = Order.builder()
				.orderId(100)
				.productName("ㅁㅁ")
				.consumerName("ㄴㄴㄴ")
				.price(3)
				.stock(1)
				.build();
				
		order.showOrderInfo();
				
	}

}