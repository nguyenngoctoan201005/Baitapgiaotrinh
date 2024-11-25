package bai3;

import java.io.Serializable;

public class Student implements Serializable {
	private String code ;
	private String name ;
	private String dob ;
	private char gender;
	
	public Student() {
	}
	
	public Student(String code, String name, String dob,char gender) {
		this.code = code;
		this.name = name;
		this.dob = dob;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [code=" + code + ", name=" + name + ", dob=" + dob + ", gender=" + gender + "]";
	}

	
	
	
	
}
