package j18_예외;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CustomExceptionMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String username = null;
		String password = null;
		
		System.out.print("아이디: ");
		username = scanner.nextLine();
		System.out.print("비밀번호: ");
		password = scanner.nextLine();
		
		
		try {
			if(username.isBlank() && password.isBlank()) {
				Map<String, String> errorMap = new HashMap<>();
				errorMap.put("username", "아이디를 입력하세요.");
				errorMap.put("password", "비밀번호를 입력하세요.");
				throw new CustomException("유효성 검사 실패", errorMap);
				
			}else if(username.isBlank()) {
				Map<String, String> errorMap = new HashMap<>();
				errorMap.put("username", "아이디를 입력하세요.");
				throw new CustomException("유효성 검사 실패", errorMap);
				
			}else if(password.isBlank()) {
				Map<String, String> errorMap = new HashMap<>();
				errorMap.put("password", "비밀번호를 입력하세요.");
				throw new CustomException("유효성 검사 실패", errorMap);
				
			} 
			
			System.out.println("회원 등록 진행");
		} catch (CustomException e) {
			try {
				e.printErrorMap();				
			} catch (NullPointerException e2) {
				e2.printStackTrace();
			}
		}
		
		System.out.println("프로그램 종료");
		
	}
}