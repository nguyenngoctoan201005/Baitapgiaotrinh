package bai14;

public class CNTCN extends CongNhan {
	private double luongCoBan ;
	private double heSoLuong;
	private double thuong ;
	private double soNgayCong;
	
	public CNTCN(String hoVaTen, String ngaySinh, String diaChi, double luongCoBan, double heSoLuong, double thuong,
			double soNgayCong) {
		super(hoVaTen, ngaySinh, diaChi);
		this.luongCoBan = luongCoBan;
		this.heSoLuong = heSoLuong;
		this.thuong = thuong;
		this.soNgayCong = soNgayCong;
	}

	@Override
	public double tinhLuong() {
		if(this.soNgayCong < 20)
			this.thuong = 0;
		if(this.soNgayCong >=20)
			this.thuong = 1.2*this.luongCoBan ;
		return this.luongCoBan * this.heSoLuong + this.thuong ;
	}
	
	
	
	
	
}
