package PartTimeEmployee;

public class Employee extends PartTimeEmphoyee{
	String employerName, dateHired;
	
	


	public Employee(int hoursPerWeek, String employerName, String dateHired) {
		super(hoursPerWeek);
		this.employerName = employerName;
		this.dateHired = dateHired;
	}
	




	public String getEmployerName() {
		return employerName;
	}





	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}





	public String getDateHired() {
		return dateHired;
	}





	public void setDateHired(String dateHired) {
		this.dateHired = dateHired;
	}
	public void employerName() {
		System.out.println("employerName");
		
	}





	public Employee() {
		// TODO Auto-generated constructor stub
	}

}
