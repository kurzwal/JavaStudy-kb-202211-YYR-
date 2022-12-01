package j18_예외;

import java.util.ArrayList;
import java.util.List;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
class User {	// 서브클래스 : public을 붙이면 안됨(파일이름과 같아야함)
				// 앞자리에 default가 들어가서 같은 패키지 내에서 사용가능
	private String username;
	private String password;
}

public class UserListException {
	public static void main(String[] args) {
		List<User> userList = new ArrayList<>();

		userList.add(new User("aaa", "1111"));
		userList.add(new User("bbb", "2222"));
		userList.add(new User("ccc", "3333"));
		userList.add(new User("ddd", "4444"));
		userList.add(null);

		int length = userList.size();
		////////////////////////////////////////////////////////////
		try {
			for (int i = 0; i < length; i++) {
				System.out.println(userList.get(i));
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			length -= 1;
		}

		////////////////////////////////////////////////////////////
		try {
			for (int i = 0; i < length; i++) {
				System.out.println("username : " + userList.get(i).getUsername());
				System.out.println("password : " + userList.get(i).getPassword());
			}
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		////////////////////////////////////////////////////////////
		System.out.println("프로그램 정상 종료");
	}
}
