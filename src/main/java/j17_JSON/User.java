package j17_JSON;

import com.google.gson.annotations.Expose;

import lombok.Builder;
import lombok.Data;
/*
 *	
 * 
 */
@Builder
@Data
public class User {
	@Expose(serialize = true, deserialize = true)	// = true : Json으로 변환한다. 
	private String username;
	@Expose(serialize = false, deserialize = false)	// = false : 변환하지 않는다.
	private String password;
	@Expose(serialize = true, deserialize = false)	// 생성할 때 .exclude...Annotation() 옵션을 사용해야함
	private String name;
	@Expose(serialize = true, deserialize = true)
	private String email;
	
}
// serialize : Object를 Json으로 변환할 때 포함/제외 할 값
// deserialize : Json을 Object로 변환할 때 포함/제외 할 값