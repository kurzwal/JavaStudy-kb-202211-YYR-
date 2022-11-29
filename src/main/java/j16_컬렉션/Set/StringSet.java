package j16_컬렉션.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringSet {
	public static void main(String[] args) {
		Set<String> nameSet = new HashSet<String>();
		nameSet.add("유열림");
		nameSet.add("김수현");
		nameSet.add("문경원");
		nameSet.add("권용범");
		nameSet.add("이영인");
		
		System.out.println(nameSet);
		// Set은 인덱스가 없기 때문에 forEach로 찾아야한다.
		for(String s : nameSet) {
			if(s.equals("유열림")) {
				System.out.println(s);
				break;
			}
		}
		
		List<String> nameList = Arrays.asList(new String[] {"유열림", "권용범"});
		
		System.out.println(nameList);
		
		Set<String> listToSet = new HashSet<String>();
		// addAll : List 를 Set 으로 전부 옮긴다 (Map 은 불가능) 
		listToSet.addAll(nameList);
		
		System.out.println(listToSet);
		// remove : Set 안의 값을 지운다
		nameSet.remove("유열림"); // remove 는 boolean 형을 반환한다.
		System.out.println(nameSet);
		
		// 삭제와 추가가 동시에 일어난다. (update가 없다)
		
	}
}
