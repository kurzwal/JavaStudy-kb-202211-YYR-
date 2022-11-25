package j15_제네릭;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CMRespDto<T> {
	private String msg;
	private T data;
}
