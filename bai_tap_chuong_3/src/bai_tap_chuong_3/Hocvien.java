package bai_tap_chuong_3;

import java.util.Scanner;

public abstract class Hocvien {
	private String hoVaTen ;
	private String diaChi;
	private char uuTien;
	
	public Hocvien() {
		
	}
	
	public void nhapThongTin() {
		Scanner  sc = new Scanner(System.in);
		System.out.println("Nhap vao ho va ten");
		hoVaTen = sc.nextLine();
		System.out.println("Nhap vao dia chi");
		diaChi = sc.nextLine();
		System.out.println("Nhap vao doi tuong uu tien");
		uuTien = sc.next().charAt(0);
	}
	
	public abstract double hocPhi();

	public String inThongTin() {
		return "Hocvien [hoVaTen=" + hoVaTen + ", diaChi=" + diaChi + ", uuTien=" + uuTien + "]" + this.hocPhi();
	}
	
	
}
