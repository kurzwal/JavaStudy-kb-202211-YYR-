package j07_메소드;

public class Method2 {
	/*
		메소드 오버로딩
		이름 같고 인수 다르게
	 */
	public static void print(String name) {
		System.out.println("이름 : " + name);
	}
	public static void print(int age) {
		System.out.println("나이 : " + age);
	}
	public static void print(String name, int age) {
		System.out.println("이름 : " + name + "\n나이 : " + age);
	}
	public static void print(int age, String name) {
		System.out.println("이름 : " + name + "\n나이 : " + age);
	}
	public static void main(String[] args) {
		print("유열림");
		print(29);
		print("유열림", 29);
		print(29, "유열림");
	}
}