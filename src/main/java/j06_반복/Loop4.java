package j06_반복;

import java.util.Scanner;

public class Loop4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String select = null;
		boolean loopFlag1 = true;
		boolean loopFlag2 = true;
		while (loopFlag1) {
			System.out.println("[폴더 선택]");
			System.out.println("1. 문서");
			System.out.println("2. 음악");
			System.out.println("3. 사진");
			System.out.println("4. 동영상");
			System.out.println("q. 프로그램 종료");
			select = sc.nextLine();
			
			if (select.equals("1")) {
				while (loopFlag2) {
					System.out.println("1. 대학서류");
               System.out.println("2. 개인자료");
               System.out.println("3. 기업정보");
               System.out.println("b. 뒤로가기");
               System.out.println("q. 프로그램종료");
					select = sc.nextLine();
					if (select.equals("1")) {
						System.out.println("대학서류");
					}else if (select.equals("2")) {
						System.out.println("개인자료");
					}else if (select.equals("3")) {
						System.out.println("기업정보");
					}else if (select.equals("b")) {
						break;
					}else if (select.equals("q")) {
						System.out.print("정말 프로그램을 종료하시겠습니까? (y/n) : ");
						select = sc.nextLine();
						if (select.equals("y")) {
							loopFlag1 = false;
							loopFlag2 = false;
						}
					}else {
						System.out.println("다시 입력하세요");
					}
				}
			} else if (select.equals("2")) {
				System.out.println("음악");
			} else if (select.equals("3")) {
				System.out.println("사진");;
			} else if (select.equals("4")) {
				System.out.println("동영상");
			} else if (select.equals("q")) {
				System.out.print("정말 프로그램을 종료하시겠습니까? (y/n) : ");
				select = sc.nextLine();
				if (select.equals("y")) {
					break;
				}
			} else {
				System.out.println("다시 입력해주세요.");
			}
		}
		
	}
}
