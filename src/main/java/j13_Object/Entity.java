package j13_Object;

import lombok.*;			// MVN 에서 가져온 라이브러리 (pom.xml 참조)

@NoArgsConstructor		// 기본생성자
@AllArgsConstructor		// 전체생성자
//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
@Data	 			 			// 위의 네 줄을 전부 포함하는 구문

public class Entity {
	
	private String name;
	private int age;
	private String address;
	
	public boolean cmp() {
		return this.getClass() == Entity.class;
	}
	
}
