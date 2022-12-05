package j21_문자열메소드;

import java.util.Arrays;
import java.util.List;

public class StringMethod4 {
	public static void main(String[] args) {
		
		String roles = "ROLE_USER, ROLE_MANAGER, ROLE_ADMIN, GUEST";
		roles = roles.replaceAll(" ", "");
		
		String[] roleArray = roles.split(",");
		List<String> roleList = Arrays.asList(roleArray);
		
		roleList.forEach(role -> {
			// prefix(접두어) startsWith
			// suffix(접미어) endsWith
			// ROLE_이 붙어있지 않은 GUEST는 출력되지 않음
			// equalsIgnoreCase : 소대문자 상관 없이 비교해주는 메소드
			if(role.startsWith("ROLE_") && role.equalsIgnoreCase("role_user")) {
				System.out.println("권한 : " + role);
			}
		});
	}
}
