package PartTimeEmployee;

public class Person extends Employee{
	String name ;
	int age;
	char gender;
	
	
	

	public Person(int hoursPerWeek, String employerName, String dateHired, String name, int age, char gender) {
		super(hoursPerWeek, employerName, dateHired);
		this.name = name;
		this.age = age;
		this.gender = gender;
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





	public char getGender() {
		return gender;
	}





	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void gender() {
		System.out.println("gender");
	}





	public Person() {
		// TODO Auto-generated constructor stub
	}

}
