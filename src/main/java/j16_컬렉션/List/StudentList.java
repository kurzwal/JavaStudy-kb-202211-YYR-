package j16_컬렉션.List;

import java.util.ArrayList;
import java.util.List;

public class StudentList {

	public static void main(String[] args) {
		// List 인터페이스로 업캐스팅
		List<Student> students = new ArrayList<Student>();

		students.add(new Student(20220001, "이승아", 21, null));
		students.add(new Student(20220002, "김수현", 22, null));
		students.add(new Student(20220003, "문경원", 23, null));
		students.add(new Student(20220004, "홍지혜", 24, null));
		students.add(new Student(20220005, "고동현", 25, null));

		Student student2 = students.get(3);

		System.out.println(student2+"\n");

		// 이름이 문경원인 학생의 나이를 26세로 바꾸세요
		for (Student student : students) {
			if (student.getName().equals("문경원")) {
				student.setAge(26);
			}
			System.out.println(student);
		}
		System.out.println();

		// 0번 인덱스 학생의 이름을 다음 인덱스의 학생 이름으로 변경
		// 제일 마지막 인덱스의 학생 이름으로 0번 인덱스로 이동

		// 1. 실제로 바꾸는 법
		int size = students.size();
		String save = students.get(size - 1).getName();
		for (int i = 0 ; i < size - 1 ; i++) {
			students.get(size-1-i).setName(students.get(size-2-i).getName());
		}
		students.get(0).setName(save);
		for (Student student : students) {
			System.out.println(student);
		}
		System.out.println();


		// 2. 리스트로 추출 후에 add & remove 하고 다시 넣는법

		ArrayList<String> names = new ArrayList<>();
		for (Student student : students) {
			names.add(student.getName());
		}
		names.add(0, names.get(names.size()-1));
		names.remove(names.size()-1);
		for (int i = 0 ; i < students.size() ; i++) {
			students.get(i).setName(names.get(i));
		}
		for (Student student : students) {
			System.out.println(student);
		}
	}
}
