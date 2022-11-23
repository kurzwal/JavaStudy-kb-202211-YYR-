package j13_Object;

import j01_출력.SystemOut;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StudentMain {
	
	public static void print(Object obj) {
		System.out.println(obj);
	}
	public static void main(String[] args) {
		Student student = new Student(19999999, "홍길동");
		Student student2 = new Student(19999999, "홍길동");
		
		System.out.println(student);
		System.out.println(student2);
		print(student);					// Object를 상속중이므로 업캐스팅 가능
		System.out.println();
		
		System.out.println(student == student2);
		System.out.println(student.equals(student2));
		System.out.println();
		
		System.out.println(student.hashCode());
		System.out.println(student2.hashCode());
		System.out.println();
		
		Class c = student.getClass(); 					// getClass는 Class클래스를 반환함
		System.out.println(c);
		System.out.println(c.getName());
		System.out.println(c.getSimpleName());
		System.out.println();
		
		Field[] fields= c.getDeclaredFields();			// 변수들의 이름 반환
		for(int i=0; i<fields.length; i++) {
			System.out.println(fields[i].getName());
		}
		System.out.println();
		
		Method[] methods = c.getDeclaredMethods();	// 메소드들의 이름 반환
		for(int i=0; i<methods.length; i++) {
			System.out.println(methods[i].getName());
		}
		System.out.println();
		
	}
}
