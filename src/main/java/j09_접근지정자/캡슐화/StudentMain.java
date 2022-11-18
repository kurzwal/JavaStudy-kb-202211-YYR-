package j09_접근지정자.캡슐화;

public class StudentMain {
	public static void main(String[] args) {
		Student s1 = new Student("유열림", "남");
		s1.printInfo();
		
		s1.setName("류열림");
		s1.printInfo();
		
		s1.setGender("여");
		s1.printInfo();
		System.out.println(s1.getGender());
		System.out.println(s1.getName());
	}
}
