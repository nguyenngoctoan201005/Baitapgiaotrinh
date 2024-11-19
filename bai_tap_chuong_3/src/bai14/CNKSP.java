package bai14;

public class CNKSP extends CongNhan {
	private int soSanPham ;
	private double donGia;
	private int thuong ;
	
	public CNKSP(String hoVaTen, String ngaySinh, String diaChi, int soSanPham, double donGia, int thuong) {
		super(hoVaTen, ngaySinh, diaChi);
		this.soSanPham = soSanPham;
		this.donGia = donGia;
		this.thuong = thuong;
	}

	@Override
	public double tinhLuong() {
		if(this.soSanPham <1000 )
			this.thuong = 0;
		if(this.soSanPham <1150 && this.soSanPham >1000)
			this.thuong = 1000000;
		if (this.soSanPham >1150)
			this.thuong = 1500000;
		
		return this.donGia * this.soSanPham + this.thuong;
	}
	
	
	
	
	
}
