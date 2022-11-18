package j09_접근지정자.캡슐화;

public class StudentMain2 {
	public static void main(String[] args) {
		
		Student2 s1 = new Student2();
		s1.setName("유열림");
		
		String nameS1 = s1.getName();
		System.out.println(nameS1);
		
	}
}
