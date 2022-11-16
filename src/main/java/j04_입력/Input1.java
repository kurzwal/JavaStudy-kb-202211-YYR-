package j04_입력;

import java.util.Scanner;

public class Input1 {
	public static void main(String[] args) {
	
		String name = null;
		int age = 0;
		String phone = null;
		String address = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine();
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();
		sc.nextLine();
		System.out.print("연락처를 입력하세요 : ");
		phone = sc.nextLine();
		System.out.print("주소를 입력하세요 : ");
		address = sc.nextLine();
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("연락처 : " + phone);
		System.out.println("주소 : " + address);
	}
}
