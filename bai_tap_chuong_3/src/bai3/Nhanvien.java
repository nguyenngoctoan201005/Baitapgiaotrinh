package bai3;

import bai2.Diachi;

public class Nhanvien {
	private String name ; 
	private Diachi diaChi;
	private String dob ;
	private char gender ;
	public Nhanvien(String name, Diachi diaChi, String dob, char gender) {
		
		this.name = name;
		this.diaChi = diaChi;
		this.dob = dob;
		this.gender = gender;
	}
	public Nhanvien() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Diachi getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(Diachi diaChi) {
		this.diaChi = diaChi;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Nhanvien [name=" + name + ", diaChi=" + diaChi + ", dob=" + dob + ", gender=" + gender + "]";
	}
	
	
	
	public static void main(String[] args) {
		Diachi dc1 = new Diachi("thon 1" , "Tholoc" , "Phuc Tho" , "Hanoi");
		Nhanvien nv =new Nhanvien("Nguyen Toan" , dc1 , "20-10", '1');
		
		System.out.println(nv.toString());
	}
	
}
