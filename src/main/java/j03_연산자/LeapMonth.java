package j03_연산자;

public class LeapMonth {
	public static void main(String[] args) {
		//2000년일때 윤달입니다., 1999년일때 윤달이 아닙니다.
		
		//2000년일 때
		int year = 2000;
		String result = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)? "윤달입니다" : "윤달이 아닙니다.";
		System.out.println(year + " : " + result);

		//1999년일 깨
		year = 1999;
		result = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)? "윤달입니다" : "윤달이 아닙니다.";
		System.out.println(year + " : " + result);
		
	}
}
