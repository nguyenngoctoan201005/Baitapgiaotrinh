package bai14;

import java.util.Scanner;

public abstract class CongNhan {
	protected String hoVaTen ;
	protected String ngaySinh;
	protected String diaChi;

	public CongNhan(String hoVaTen, String ngaySinh, String diaChi) {
		this.hoVaTen = hoVaTen;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
	}
	
	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao ho va ten");
		hoVaTen = sc.nextLine();
		System.out.println("Nhap vao ngay sinh");
		this.ngaySinh = sc.nextLine();
		System.out.println("Nhap vao dia chi ");
		diaChi = sc.nextLine();
	}
	
	public abstract double tinhLuong();

	public String inThongTin() {
		return "CongNhan [hoVaTen=" + hoVaTen + ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi + ", tinhLuong()="
				+ tinhLuong() + "]";
	}
	
	
}
