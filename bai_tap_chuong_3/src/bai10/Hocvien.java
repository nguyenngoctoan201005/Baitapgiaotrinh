package bai10;
import java.util.*;
public abstract class Hocvien {
	protected String hoVaTen ;
	protected String diaChi;
	protected String loaiUuTien ;
	
	public Hocvien(String hoVaTen, String diaChi, String loaiUuTien) {
		this.hoVaTen = hoVaTen;
		this.diaChi = diaChi;
		this.loaiUuTien = loaiUuTien;
	}
	
	
	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao ho va ten");
		this.hoVaTen = sc.nextLine();
		System.out.println("Nhap vao dia chi");
		this.diaChi = sc.nextLine();
		System.out.println("Nhap vao loai uu tien");
		this.loaiUuTien = sc.nextLine();
	}
	
	public abstract double hocPhi(String loaiUuTien , double donGia , int soBuoi);

	public String inThongTin() {
		return "Hocvien : hoVaTen=" + hoVaTen + ", diaChi=" + diaChi + ", loaiUuTien=" + loaiUuTien + ", hocPhi()= ";
	}
	
	
}
