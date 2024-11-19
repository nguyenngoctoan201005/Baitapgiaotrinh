package bai13;
import java.util.*;
public abstract class NguoiLaoDong {
	protected String hoVaTen ;
	protected String diaChi;
	
	public NguoiLaoDong(String hoVaTen, String diaChi) {
		this.hoVaTen = hoVaTen;
		this.diaChi = diaChi;
	}
	
	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao ho va ten");
		hoVaTen = sc.nextLine();
		System.out.println("Nhap vao dia chi ");
		diaChi = sc.nextLine();
	}
	
	public abstract double tinhLuong();
	
	public abstract String inThongtin();
}


