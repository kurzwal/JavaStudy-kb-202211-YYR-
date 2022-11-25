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
	// static 클래스 : 내부 클래스를 선언할 때만 사용 가능.
	// 상위 클래스를 생성하지 않고 바로 접근 가능하다.
	// 상위 클래스와 독립되어져있으나 내부에 있어 private 에 접근 가능하다.
	// 관련있는 클래스끼리 모을 때에도 사용 (분리되어서 따로 기능하는 상속 느낌)
	
	public static class StudentBuilder {	// 내부 클래스
		private int studentCode;				// 외부 클래스와 동일한 변수가 들어간다. (builder)
      private String name;
      private String address;
      
		public StudentBuilder studentCode(int studentCode) {	// 메소드, 인수 모두 같은 값 사용
			this.studentCode = studentCode;
         return this;
		}
		public StudentBuilder name(String name) {
			this.name = name;
         return this;
		}		// 모든 변수들도 같은 방법으로
		public StudentBuilder address(String address) {
			this.address = address;
         return this;
		}// 메소드 제작 (생략)
		public Student build() {
			return new Student(studentCode, name, address);
		}
	}
}
