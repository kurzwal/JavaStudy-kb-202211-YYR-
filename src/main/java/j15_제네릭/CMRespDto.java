package j15_제네릭;
/*
	실제로 제네릭을 사용하는 예제
 */
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CMRespDto<T> {
	private String msg;
	private T data;
}
