package bai1;

public class Person {
	//Thuộc tính 
	protected String name ;
	protected String dod ;
	protected String pod ;
	protected char gender ;
	protected String email ;
	protected String phone ;
	
	public Person(String name, String dod, String pod, char gender, String email, String phone) {
		super();
		this.name = name;
		this.dod = dod;
		this.pod = pod;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
	}

	public Person() {
		
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", dod=" + dod + ", pod=" + pod + ", gender=" + gender + ", email=" + email
				+ ", phone=" + phone + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDod() {
		return dod;
	}

	public void setDod(String dod) {
		this.dod = dod;
	}

	public String getPod() {
		return pod;
	}

	public void setPod(String pod) {
		this.pod = pod;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
