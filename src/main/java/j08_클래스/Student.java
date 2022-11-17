package j08_클래스;

public class Student {
	// 연습용
	
	String school; // 학교명
	String name; // 이름
	int studentYear; // 학년
	boolean gender; // 성별 (true = 남, false = 여)
	
	void showStudentInfo() {
		showStudentSchool();
		showStudentName();
		showStudentYear();
		showStudentGender();
	}
	Student() {}
	Student(String school, String name, int studentYear, boolean gender) {
		this.school = school;
      this.name = name;
      this.studentYear = studentYear;
      this.gender = gender;
	}
	void showStudentSchool() {
		System.out.println("학교명 : " + school);
	}
	void showStudentName() {
		System.out.println("이름 : " + name);
	}
	void showStudentYear() {
		System.out.println("학년 : " + studentYear);
	}
	void showStudentGender() {
		System.out.println("성별 : " + (gender ? "남" : "여"));
	}
	
}
