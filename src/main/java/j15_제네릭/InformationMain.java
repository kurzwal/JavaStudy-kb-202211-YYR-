package j15_제네릭;

public class InformationMain {
	public static void main(String[] args) {
		Student student = Student.builder()
				  .studentCode(20220001)
				  .name("유열림")
				  .build();
		
		Teacher teacher = Teacher.builder()
				  .teacherCode(200)
				  .name("이열림")
				  .build();
		
		// 제네릭 (업캐스팅 없이 들어감)
		Information<Student> studentInformation
				  = new Information<Student>(student);		// Student 생략가능, 가독성 때문에 적기도 한다
		Information<Teacher> teacherInformation
				  = new Information<Teacher>(teacher);
		
		// Object 업캐스팅
		Information2 i1 = new Information2(student);
		Information2 i2 = new Information2(teacher);
		
		// 제네릭은 다운캐스팅이 불필요
		System.out.println("학생이름 : " + studentInformation.getTarget().getName());
		System.out.println("학생이름 : " + ((Student) i1.getTarget()).getName());
		
		
		studentInformation.printInfo();
		teacherInformation.printInfo();
		
	}
}
