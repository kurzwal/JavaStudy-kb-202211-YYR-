package j16_컬렉션.List;

import java.awt.color.ICC_Profile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentList2 {
	
	public static void main(String[] args) {
		List<Hobby> hl = Arrays.asList(new Hobby[] {
				  new Hobby(1, "축구"),
				  new Hobby(2, "농구"),
				  new Hobby(3, "골프"),
				  new Hobby(4, "음악감상")
		});
		
//		List<String> nameList = Arrays.asList(new String[] {
//				  "유열림",
//				  "김열림",
//				  "이열림"
//		});
//		// toArray 메소드는 내용물이 Object 클래스로 업캐스팅됨
//		Object[] nameArray = nameList.toArray();
//		// 배열 자체를 다운캐스팅 하는 것이 아니라 내용물을 꺼내서 다운캐스팅 해야함
//		System.out.println((String) nameArray[0]);
		
		Student s1 = Student.builder()
				  .studentId(20220001)
				  .name("유열림")
				  .age(29)
				  // asList : 배열(Hobby[])을 리스트(List<Hobby>) 로 바꾸는 메소드
				  .hobbyList(Arrays.asList(new Hobby[] {hl.get(0), hl.get(2)}))
				  .build();
		Student s2 = Student.builder()
				  .studentId(20220002)
				  .name("김열림")
				  .age(28)
				  .hobbyList(Arrays.asList(new Hobby[] {hl.get(1), hl.get(3)}))
				  .build();
		Student s3 = Student.builder()
				  .studentId(20220003)
				  .name("이열림")
				  .age(27)
				  .hobbyList(Arrays.asList(new Hobby[] {hl.get(0), hl.get(3)}))
				  .build();
		
		List<Student> sl = new ArrayList<Student>();
		sl.add(s1);
		sl.add(s2);
		sl.add(s3);
		
		for (Student s : sl) {
			System.out.println("<학생정보>");
			System.out.println(s);
			System.out.println("<"+ s.getName() + " 학생 취미>");
			for (Hobby h : s.getHobbyList()) {
				System.out.println(h);
			}
			System.out.println();
		}
		
	}
}
