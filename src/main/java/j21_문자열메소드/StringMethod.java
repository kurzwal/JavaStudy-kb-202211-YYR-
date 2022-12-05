package j21_문자열메소드;


public class StringMethod {
	
	public static void main(String[] args) {
		
		String name = "유열림김준일";
		System.out.println("name : " + name);
		// 문자열의 길이
		System.out.println("문자열의 길이 : " + name.length());
		// 문자의 위치 앞에서부터 찾기
		System.out.println("가장 앞에있는 '열'의 위치 : " + name.indexOf("열"));
		// 문자의 위치 뒤에서부터 찾기
		System.out.println("가장 뒤에있는 '열'의 위치 : " + name.lastIndexOf("열"));
		// 문자열의 인덱스로 글자찾기
		char name1 = name.charAt(0);
		System.out.println("0번 인덱스의 글자 : " + name1);
		// 문자열 슬라이싱
		String subName1 = name.substring(0, 3);
		System.out.println("0,3 인덱스 슬라이싱 : " + subName1);
		String subName2 = name.substring(2);
		System.out.println("2 인덱스 슬라이싱 : " + subName2);
		// 응용
		String nameY = "유열림";
		System.out.println(name.substring(name.indexOf(nameY), name.length()));
		System.out.println(name.substring(3));
		
		String file = "C:/String.java";
		String fileName = file.substring(file.lastIndexOf('/') + 1, file.lastIndexOf('.'));
		String Extension = file.substring(file.lastIndexOf('.'));
		
		System.out.println(fileName);
		System.out.println(Extension);
		
		
		
				
		
	}
}
