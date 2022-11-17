package j08_클래스;

public class StudentMain {
	public static void main(String[] args) {
		Student student = new Student();
      student.school = "부산대학교";
      student.name = "홍길동";
      student.studentYear = 3;
      student.gender = true;
		
		student.showStudentInfo();
		System.out.println();
		
		Student student2 = new Student("부산여자대학교", "성춘향", 2, false);
		student2.showStudentInfo();
  
	}
}
/*
	class의 접근지정자
	public : 접근 제한 없음
	protected : 동일패키지와 상속받은 클래스 내부
	default : 동일 패키지 내에서만
	private : 동일 클래스 내에서만
 */