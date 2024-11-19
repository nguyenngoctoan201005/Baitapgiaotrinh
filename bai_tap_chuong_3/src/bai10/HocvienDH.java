package bai10;

import java.util.Scanner;

public class HocvienDH extends Hocvien {
	private int soBuoi ;
	private double donGia;
	
	public HocvienDH(String hoVaTen, String diaChi, String loaiUuTien, int soBuoi, double donGia) {
		super(hoVaTen, diaChi, loaiUuTien);
		this.soBuoi = soBuoi;
		this.donGia = donGia;
	}
	
	
	
	public int getSoBuoi() {
		return soBuoi;
	}

	public void setSoBuoi(int soBuoi) {
		this.soBuoi = soBuoi;
	}
	
	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	@Override 
	public double hocPhi(String loaiUuTien , double donGia , int soBuoi) {
		if(loaiUuTien.equals("1"))
			return  donGia*soBuoi -1000000;
		else
			return  donGia*soBuoi -500000;

	}
	
	
	public void nhapTT() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so buoi hoc"); 
		this.soBuoi = sc.nextInt();
		System.out.println("Nhap vao don gia"); 
		this.donGia = sc.nextDouble();
	}
}
