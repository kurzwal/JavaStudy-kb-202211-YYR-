package j15_제네릭;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Student {
	private int studentCode;
	private String name;
}
