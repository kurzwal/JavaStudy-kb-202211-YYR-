package j16_컬렉션.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapMethod {
	public static void main(String[] args) {
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("username", "YYR");
		map.put("password", "1234");
		map.put("name", "유열림");
		map.put("email", "openingyou@gmail.com");
		map.put("age", 29);
		map.put("gender", true);
		
		Map<String, String> address = new HashMap<>();
		address.put("address1", "부산광역시");
		address.put("address2", "사상구");
		address.put("address3", "사상로 147번길 36");
		map.put("address", address);
		
		System.out.println(map);
		
		// TreeMap은 저장할 때 key 값이 작은 값이 앞에 오게끔 정렬해준다.
		Map<Integer, String> subject = new TreeMap<>();
		subject.put(100, "java");
		subject.put(200, "C#");
		subject.put(300, "python");
		subject.put(401, "python2");
		subject.put(403, "python3");
		subject.put(502, "python4");
		subject.put(604, "python5");
		
		map.put("subject", subject);
		System.out.println(map);
		
		System.out.println(((Map<Integer, String>) map.get("subject")).get(403));
		
		List<String> hobby = new ArrayList<>();
		hobby.add("축구"); hobby.add("농구"); hobby.add("야구"); hobby.add("족구");
		map.put("hobby", hobby);
		
		System.out.println(((List) map.get("hobby")).get(2));
		System.out.println("======================");
		
		// entrySet() : Map 을 Set<Entry> 로 변환
		// Entry 클래스 : 순서쌍 하나를 만드는 클래스
		Set<Entry<String, Object>> userEntry = map.entrySet();
		
		for (Entry<String, Object> entry : userEntry) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		System.out.println();
		
		/**********************************************************/
		
		// keySet() : key들을 Set으로 반환
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key);
		}
		// values() : value들을 Collection<> 으로 반환
		for (Object obj : map.values()) {
			System.out.println(obj);
		}
	}
}
