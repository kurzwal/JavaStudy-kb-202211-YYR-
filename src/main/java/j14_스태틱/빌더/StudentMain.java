package j14_스태틱.빌더;

public class StudentMain {
	public static void main(String[] args) {
		Student student = Student.builder()
				  .studentCode(1)
				  .name("유열림")
				  .address("부산 사상구 사상로")
				  .build();
		System.out.println(student);
		
	}
}
