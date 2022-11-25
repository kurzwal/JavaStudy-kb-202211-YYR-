package j14_스태틱.빌더;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Student {
	private int studentCode;
	private String name;
	private String address;
	
	public static StudentBuilder builder() {
		return new StudentBuilder();
	}
	
	// static 클래스 :
	public static class StudentBuilder {	// 내부 클래스
		private int studentCode;				// 외부 클래스와 동일한 변수가 들어간다.
      private String name;
      private String address;
      
		public StudentBuilder studentCode(int studentCode) {
			this.studentCode = studentCode;
         return this;
		}
		public StudentBuilder name(String name) {
			this.name = name;
         return this;
		}
		public StudentBuilder address(String address) {
			this.address = address;
         return this;
		}
		public Student build() {
			return new Student(studentCode, name, address);
		}
	}
}
