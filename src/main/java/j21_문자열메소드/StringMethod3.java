package j21_문자열메소드;

import java.util.function.Function;

public class StringMethod3 {
	public static void main(String[] args) {
		Function<String, String> replacePhoneToken =
				phoneNumber -> phoneNumber
				.replaceAll("/", "")
				.replaceAll("-", "")
				.replaceAll(" ", "")
				// . 은 replace같은거 할때 [.]으로 잡아야함
				.replaceAll("[.]", "");
		
				String phone = "010-9988-1916";
		
		System.out.println(replacePhoneToken.apply(phone));
		
		System.out.println(phone.replaceAll("-", ""));
		
		
	}
}
