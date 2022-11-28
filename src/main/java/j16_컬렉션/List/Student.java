package j16_컬렉션.List;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Student {
	private int studentId;
	private String name;
	private int age;
}
