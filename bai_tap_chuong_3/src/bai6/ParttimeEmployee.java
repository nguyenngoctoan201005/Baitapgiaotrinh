package bai6;

public class ParttimeEmployee extends Employee {
	private int hoursPerWeek ;

	public ParttimeEmployee(String name, int age, char gender, String employeename, String dateHired,
			int hoursPerWeek) {
		super(name, age, gender, employeename, dateHired);
		this.hoursPerWeek = hoursPerWeek;
	}

	public int getHoursPerWeek() {
		return hoursPerWeek;
	}

	public void setHoursPerWeek(int hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}

	@Override
	public String toString() {
		return "ParttimeEmployee [hoursPerWeek=" + hoursPerWeek + "]";
	}
	
	
}
