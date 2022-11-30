package j16_컬렉션.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListMethod {
	// List 를 출력해주는 메소드
	public static void printList(String listName, List<String> list) {
		System.out.println("[ " + listName + " ]");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(i + " ->\t");
			System.out.println(list.get(i));
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		List<String> nameList = new ArrayList<String>();
		List<String> nameList2 = new ArrayList<String>();
		// add() -> 리스트에 값을 추가함
		nameList.add("임지현");
		nameList.add("신경수");
		nameList.add("고희주");
		nameList.add("문승주");
		nameList.add("장건녕"); 
		nameList.add("박수현");
		printList("nameList", nameList);
		
		// addAll() -> 리스트에 다른 Collection의 값을 모두 추가함
		nameList2.addAll(nameList);
		printList("nameList2", nameList2);
		// addAll(n, List) -> n번 인덱스부터 추가한다 (삽입) 
		nameList2.addAll(3, nameList);
		printList("nameList2", nameList2);

		// contains() -> 리스트 안에 값을 포함하고 있는지 boolean 타입으로 리턴
		boolean isContains = nameList.contains("장건녕");
		System.out.println("이름 목록에 장건녕이 있나? " 
							+ (isContains? "있음" : "없음"));
		
		// indexOf() -> 리스트 안에 있는 값의 인덱스를 int 타입으로 리턴
		// 없을 경우 -1 반환
		int index = nameList.indexOf("고희주");
		System.out.println("리스트에서 고희주의 인덱스 위치 : " + index);
		int index2 = nameList.indexOf("유열림");
		System.out.println("리스트에서 유열림의 인덱스 위치 : " + index2);
		
		// lastIndexOf() -> 리스트에서 해당 값의 인덱스 위치를 반환 (제일 뒤에 있는 값)
		int lastIndex = nameList2.lastIndexOf("임지현");
		System.out.println("리스트에서 임지현의 인덱스 위치 : " + lastIndex);
		int lastIndex2 = nameList2.lastIndexOf("유열림");
		System.out.println("리스트에서 유열림의 인덱스 위치 : " + lastIndex2);
		
		// isEmpty() -> 리스트가 비어있는지를 boolean 타입으로 리턴
		boolean isEmpty = nameList.isEmpty();
		System.out.println("해당 리스트가 비어있는가? : "
							+ (isEmpty? "비어있음" : "비어있지않음"));
		
		// 리스트의 반복
		// 1. forEach
		for (String name : nameList) {
			System.out.println(name);
		}
		// 2. Iterator
		System.out.println("test");
		Iterator<String> ir = nameList.iterator();
		while (ir.hasNext()) {		// boolean 타입 반환 메소드 중 
									// 있다/없다를 가리킬떄는 has로 시작한다
			System.out.println(ir.next());	// 다음 값을 꺼내는 용도
		}
		// 3. 람다식 (나중에 공부)
		nameList.forEach(name -> {
			System.out.println(name);
		});
		
	}
}










