package j17_JSON;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class Gson3 {
	public static void main(String[] args) {
		
		// 기본적으로 Map이랑 같음.
		// Map 형태이면서 Json이기 때문에 변환이 필요없다.
		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("username", "yyr");
		jsonObject.addProperty("password", "1234");
		
		System.out.println(jsonObject);
		
		// JsonObject는 value값에 기본 자료형과 JsonElement만 들어간다.
		// JsonElement는 추상클래스로써, JsonElement를 상속받은 클래스를 넣는다.
		
		// JsonArray : JsonElement를 상속받은 List형 클래스
		JsonArray jsonArray = new JsonArray();
		jsonArray.add("java");
		jsonArray.add("python");
		jsonArray.add("javascript");
		jsonArray.add("c#");
		System.out.println(jsonArray);
		
		jsonObject.add("subject", jsonArray);
		System.out.println(jsonObject);
		
		
	}
}
