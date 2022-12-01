package j17_JSON;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

// Json은 데이터의 표준, 다른 언어로 데이터를 전달할 때 사용
// Gson은 자바에서의 Map을 Json으로 바꿔주는 라이브러리 (구글에서 만듬)

public class Gson1 {
	public static void main(String[] args) {
		//생성 방식
		Gson gson = new Gson();
		
		GsonBuilder gsonBuilder = new GsonBuilder();
		// setPrettyPrinting() : gson을 가독성 좋게 toString() 해준다
		Gson gson2 = gsonBuilder.setPrettyPrinting().create();
		
		Map<String, Object> map = new HashMap<>();
		map.put("name", "유열림");
		map.put("email", "openingyou@gmail.com");
		map.put("address", "부산 사상구");
		map.put("phone", "01031122976");
		{
			List<String> hobby = new ArrayList<>();
			hobby.add("축구");
			hobby.add("농구");
			hobby.add("야구");
			
			map.put("hobby", hobby);
		}
		System.out.println(map);
		
		// toJson : Map을 Json으로 바꿔주는 메소드
		String json1 = gson.toJson(map);
		String json2 = gson2.toJson(map);
		System.out.println(json1);
		System.out.println(json2);
		
		// fromJson : Json을 Map으로 바꿔주는 메소드 
		Map<String, Object> jsonMap = gson.fromJson(json1, Map.class);
		System.out.println(jsonMap);
		
	}
}
































