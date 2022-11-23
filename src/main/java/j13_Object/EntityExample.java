package j13_Object;

import java.util.Objects;

/*
	클래스를 용도에 따라 크게 두 종류로 나눈다
	1. 정보를 담는 위주의 Entity 클래스
	2. 기능을 담는 위주의 Service 클래스
 */

// Entity 클래스의 기본적인 형태 (private 변수, 생성자, 게터&세터, Equals&HashCode, ToString)
public class EntityExample {
	
	private String name;
	private int age;
	
	public EntityExample() {}
	
	public EntityExample(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		EntityExample entity = (EntityExample) o;
		return age == entity.age && Objects.equals(name, entity.name);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}
	
	@Override
	public String toString() {
		return "Entity{" +
				  "name='" + name + '\'' +
				  ", age=" + age +
				  '}';
	}
}
