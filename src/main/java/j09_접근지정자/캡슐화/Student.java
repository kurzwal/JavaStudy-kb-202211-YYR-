package j09_접근지정자.캡슐화;

public class Student {
	protected String name;
	protected String gender;
	
	// Setters
	public void setName(String name) {
		this.name = name;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	// Getters
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	
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
