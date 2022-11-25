package j15_제네릭;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Teacher {
	private int teacherCode;
	private String name;
}
