package j17_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Gson2 {
	public static void main(String[] args) {
		
		User user = User.builder()
				.username("yyr")
				.password("1234")
				.name("유열림")
//				.email("openingyou@gmail.com")
				.build();
		
		System.out.println(user);
		
		Gson gson = new GsonBuilder()
				.setPrettyPrinting()
				// serializeNulls() : Null값도 Json으로 변환시켜주는 옵션
				.serializeNulls()
				// exclude...() : @Expose에 따라 변환할지 안할지를 정해주는 옵션
				.excludeFieldsWithoutExposeAnnotation()
				.create();
		
		String userJson = gson.toJson(user);
		System.out.println(userJson);
		
		User userObj = null;
		userObj = gson.fromJson(userJson, User.class);
		System.out.println(userObj);
	}
}
