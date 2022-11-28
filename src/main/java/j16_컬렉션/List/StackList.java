package j16_컬렉션.List;

import java.util.ArrayList;

public class StackList {
	public static void main(String[] args) {
		
		// 임지현, 신경수, 고희주, 문승주, 장건녕, 박수현, 황석민, 박준현
		ArrayList<String> stack = new ArrayList<String>();
		stack.add(0,"임지현");
		stack.add(0,"신경수");
		stack.add(0,"고희주");
		stack.add(0,"문승주");
		stack.add(0,"장건녕");
		stack.add(0,"박수현");
		stack.add(0,"황석민");
		stack.add(0,"박준현");
		for(String name : stack) {
			System.out.print(name);
			if(!name.equals(stack.get(stack.size() - 1))) {
				System.out.print (", ");
			}
		}
		System.out.println();
		stack.clear();
		stack.add("임지현");
		stack.add("신경수");
		stack.add("고희주");
		stack.add("문승주");
		stack.add("장건녕");
		stack.add("박수현");
		stack.add("황석민");
		stack.add("박준현");
		int n = stack.size();
		ArrayList<String> copyList = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			String imsi = stack.remove(stack.size()-1);
			copyList.add(0, imsi);
			System.out.print(imsi);
			if(i != n-1) {
				System.out.print(", ");
			}
		}
		System.out.println("\n"+stack);
		System.out.println(copyList);
		
	}
}
