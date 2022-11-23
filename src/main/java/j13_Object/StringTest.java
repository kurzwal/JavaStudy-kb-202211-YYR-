package j13_Object;
/*
	모든 클래스는 Object 클래스를 상속받음 (최상위 클래스)
 */
public class StringTest {
	public static void main(String[] args) {
		
		/*
			toString()
		 */
		String str = "A";
		String str2 = "A";
		String str3 = new String("A");
		// str = str2, str != str3
		
		System.out.println(str.toString()); // toString() : Object 클래스 안에 들어있음
		
		
		
		/*
			Object 클래스에서 중요한 메소드
			hashCode()
			equals()
         toString()
         equals()
		 */
	}
}
