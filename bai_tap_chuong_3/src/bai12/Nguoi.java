package bai12;

import java.util.Scanner;

public abstract class Nguoi {
	protected String hoVaTen ;
	protected String ngaySinh;
	protected String diaChi;

	public Nguoi(String hoVaTen, String ngaySinh, String diaChi) {
		this.hoVaTen = hoVaTen;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
	}


	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao ho va ten");
		this.hoVaTen = sc.nextLine();
		System.out.println("Nhap vao ngay sinh");
		this.ngaySinh = sc.nextLine();
		System.out.println("Nhap vao dia chi");
		this.diaChi = sc.nextLine();
	}
	
	
	public String getHoVaTen() {
		return hoVaTen;
	}


	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}


	public String getNgaySinh() {
		return ngaySinh;
	}


	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}


	public String getDiaChi() {
		return diaChi;
	}


	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public abstract double tinhDiem();
	
	public String inThongTin() {
		return "Nguoi [hoVaTen=" + hoVaTen + ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi + ", tinhDiem()="
				+ tinhDiem() + "]";
	}

	
}
