package j16_컬렉션.Map;

import java.util.HashMap;
import java.util.Map;

public class StringMap {
	public static void main(String[] args) {
		Map<String, String> language = new HashMap<String, String>();
		
		// Map 은 add 대신 put 을 사용한다.
		// value (뒷 값)은 중복 가능, key (앞 값)은 중복 불가능
		language.put("java", "자바");
		language.put("html", "에이치티엠엘");
		language.put("css", "씨에스에스");
		language.put("js", "자바스크립트");
		language.put("python", "파이썬");
		language.put("python2", "파이썬");	// key 값은 중복 가능
		language.put("python", "파이썬?");	// 여기서 덮어쓰기됨
		
		System.out.println(language);
		
		// Map 에서는 key 값으로 get 사용가능.
		String s = language.get("java");
		System.out.println(s);
		
		// Map 에서는 set 메소드 대신 replace 를 사용한다.
		// replace는 두 종류가 있다 :
		// 인수 (key, value) 인 경우 : 조건 없이 value 값이 바뀜
		// : return (old value)
		// 인수 (key, old value, new value) : old value 가 일치해야만 바뀜
		// : return boolean (성공 여부)
		System.out.println(language.replace("java", "자바2"));
		System.out.println(language.replace("java", "자바2", "자바3"));
		
		// remove는 키 값을 받아서 삭제한다. (value 값 반환)
		System.out.println(language.remove("python2"));
		
	}
}
