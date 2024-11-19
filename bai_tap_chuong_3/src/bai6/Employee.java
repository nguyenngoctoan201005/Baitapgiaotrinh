package bai6;

public class Employee extends Person {
	private String employeename;
	private String dateHired;
	
	public Employee(String name, int age, char gender, String employeename, String dateHired) {
		super(name, age, gender);
		this.employeename = employeename;
		this.dateHired = dateHired;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public String getDateHired() {
		return dateHired;
	}

	public void setDateHired(String dateHired) {
		this.dateHired = dateHired;
	}

	@Override
	public String toString() {
		return "Employee [employeename=" + employeename + ", dateHired=" + dateHired + "]";
	}
	
	
}
