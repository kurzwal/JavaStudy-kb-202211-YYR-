package j16_컬렉션.List;

import java.util.ArrayList;
import java.util.Vector;

public class StringList {
	public static void main(String[] args) {
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Jsp";
		strArray[2] = "Servlet";

		// 일반 반복
		System.out.println("<<< 일반 반복 >>>");
		for (int i = 0 ; i < strArray.length ; i++) {
			System.out.println(strArray[i]);
		}
		// foreach
		System.out.println("\n<<< foreach >>>");
		for (String str : strArray) {
			System.out.println(str);
		}
		
		ArrayList<String> strList = new ArrayList<String>(3);	// ()는 배열의 크기
		// 값 추가(Create) : add(값), add(index, 값)
		strList.add("Java");						// 배열은 현재 배열의 1.5배까지 생성됨
		strList.add("Jsp");			// 배열의 공간을 낭비하고 싶지 않을때 크기 명시
		strList.add("Servlet");
		strList.add(1, "C++");							 // 인덱싱을 하면 값이 삽입된다.
		strList.add(0, "HTML");
		
		// 값 조회(Read) : get(index)
		System.out.println("\n<<< List 일반반복 >>>");
		for (int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));
		}
		
		// 값 수정(Update) : set(index, 값)
		strList.set(0, "HTML5");
		System.out.println(strList);		// toString 이 실행됨
		
		// 값 삭제(Delete) : remove(index)
		String removeData = strList.remove(2);
		System.out.println(removeData);
		System.out.println(strList);
	}
}
