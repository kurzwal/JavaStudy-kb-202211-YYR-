package j09_접근지정자.캡슐화;

public class Student2 {
	/*
		school / name / year / gender
	 */
	private String school;
	private String name;
	private int year;
	private boolean gender;

	public Student2() {}
	public Student2(String school, String name, int year, boolean gender) {
		this.school = school;
		this.name = name;
		this.year = year;
		this.gender = gender;
	}
	
	// Getters
	public String getSchool() {
		return school;
	}
	public String getName() {
		return name;
	}
	public int getYear() {
		return year;
	}
	public boolean isGender() {
		return gender;
	}
	
	// Setters
   public void setSchool(String school) {
		this.school = school;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
}
