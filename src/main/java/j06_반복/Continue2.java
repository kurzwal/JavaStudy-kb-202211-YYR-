package j06_반복;

public class Continue2 {
	public static void main(String[] args) {
		
		for(int i = 0; i < 100; i++) {
			if(i%2 == 0) { // 홀수만 출력 = 짝수만 컨티뉴
				continue;
			}
			System.out.println(i);
		}
	}
}
