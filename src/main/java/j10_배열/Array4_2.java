package j10_배열;

import java.util.Random;

public class Array4_2 {
	public static void main(String[] args) {
		Random random = new Random();
		int[] randomArray = new int[10];
		int total = 0;
		
		for(int i = 0; i < randomArray.length; i++) {
			while(true) {			// 무한반복
				int randomNumber = random.nextInt(10) + 1;	 //랜덤 넘버 뽑기
				boolean found = true;	// 카운트 반복마다 0으로 초기화
				for(int j = 0; j < randomArray.length; j++) { // 0도 같이 검사
					if(randomArray[j] == randomNumber) { // 뽑은 숫자가 있으면 카운트 ++ (검사)
                  found = false;
						break;
               }
				}
				if(found) {   // 카운트가 1이라도 올라가면 검사 불합격
					randomArray[i] = randomNumber;
               break;
				}
			}
		}
		
		
		System.out.println("\n총합 : " + total);
	}
}
