package j15_제네릭;

public class ResponseMain {
	
	// 어떤 자료형이 들어올 지 모를 때 ?작성
	public static CMRespDto<?> response(String msg, Object data) {
		return new CMRespDto<Object>(msg, data);	// Object 가 생략된다
	}
/*
	와일드 카드 <?> 안에는 <? extends Object>, <? super Object>
	를 적을 수 있다
	extends : 부모 클래스를 한정지음, 또는 부모 클래스
	super : 자식 클래스를 한정지음, 또는 자식 클래스
 */

	
	public static void main(String[] args) {
		Student student = Student.builder()
				  .studentCode(20220001)
				  .name("유열림")
				  .build();
		
		System.out.println(response("학생데이터 응답", student));
		System.out.println(response("student code error!!", "학번에 오류가 있습니다."));
	}
}
