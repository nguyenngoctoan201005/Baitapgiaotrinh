package bai11;

import java.util.Scanner;

public abstract class  GiangVien {
	protected String hoVaTen ;
	protected String diaChi;
	
	public GiangVien(String hoVaTen, String diaChi) {
		this.hoVaTen = hoVaTen;
		this.diaChi = diaChi;
	}
	
	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao ho va ten");
		this.hoVaTen = sc.nextLine();
		System.out.println("Nhap vao dia chi");
		this.diaChi = sc.nextLine();
	}

	public String getHoVaTen() {
		return hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
	public abstract double tinhLuong();

	public String inThongTin() {
		return "GiangVien [hoVaTen=" + hoVaTen + ", diaChi=" + diaChi + ", tinhLuong()=" + tinhLuong() + "]";
	}

}
