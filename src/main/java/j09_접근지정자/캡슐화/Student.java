package j09_접근지정자.캡슐화;

public class Student {
	private String name;
	private String gender;
	
	public Student() {}
	public Student(String name, String gender) {
		this.name = name;
      this.gender = gender;
	}
	public void printInfo() {
		System.out.println("Name: " + name);
      System.out.println("Gender: " + gender);
	}
}
