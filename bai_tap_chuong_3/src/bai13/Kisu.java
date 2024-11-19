package bai13;

public class Kisu extends NguoiLaoDong {
	private double luongCoBan ;
	private double heSoLuong ;
	private double soNgayCong;
	
	public Kisu(String hoVaTen, String diaChi, double luongCoBan, double heSoLuong, double soNgayCong) {
		super(hoVaTen, diaChi);
		this.luongCoBan = luongCoBan;
		this.heSoLuong = heSoLuong;
		this.soNgayCong = soNgayCong;
	}

	@Override
	public double tinhLuong() {
		if(this.soNgayCong >= 25 )
			return this.luongCoBan * this.heSoLuong + 2000000 ;
		
		if(this.soNgayCong >15 && this.soNgayCong < 25 )
			return this.luongCoBan * this.heSoLuong + 1000000 ;
		
			return this.luongCoBan * this.heSoLuong + 500000 ;
	}
	
	@Override 
	public String inThongtin() {
		return "Ho va ten : " + this.hoVaTen +" Dia chi : " + this.diaChi +" Luong: " + this.tinhLuong() ;
	}
	
}
