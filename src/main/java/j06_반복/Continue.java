package j06_반복;

public class Continue {
	public static void main(String[] args) {
		
		int count = 0;
		
		while(true) {
			count++;
			System.out.println("나무를 " + count + "번 찍습니다.");
			if(count < 10) {
				continue; // continue : 반복문의 처음으로 되돌아간다.
			}
			System.out.println("나무가 넘어갑니다.");
			break;
		}
	}
}
