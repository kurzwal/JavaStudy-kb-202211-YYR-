package j14_스태틱.빌더;

public class UserMain {
	public static void main(String[] args) {
		User user = User.builder()
				  .username("YYR")
				  .password("1234")
				  .email("user@example.com")
				  .name("유열림")
				  .build();
		
		System.out.println(user);
	}
}
