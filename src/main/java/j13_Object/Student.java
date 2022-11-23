package j13_Object;

import java.util.Objects;

public class Student {
	private int code;
	private String name;
	
	public Student(int code, String name) {
		this.code = code;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;			// 주소가 같으면 무조건 true
		if (o == null || getClass() != o.getClass()) return false;		// 비교대상이 null 이거나 클래스가 다를경우
																							// (getClass ~ 구문은 instanceof 와 같은 의미)
		Student student = (Student) o;											// 2번줄에서 다운캐스팅 여부 확인후 다운캐스팅
		return code == student.code && Objects.equals(name, student.name);		//각 요소가 같은지 비교
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(code, name);
	}
	
	@Override
	public String toString() {
		return "Student{" +
				  "code=" + code +
				  ", name='" + name + '\'' +
				  '}';
	}
}
