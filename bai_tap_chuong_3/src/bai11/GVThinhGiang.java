package bai11;

public class GVThinhGiang extends GiangVien {
	private int soTiet ;
	private double donGia;
	private double phanTramThuNhap;
	
	public GVThinhGiang(String hoVaTen, String diaChi, int soTiet, double donGia, double phanTramThuNhap) {
		super(hoVaTen, diaChi);
		this.soTiet = soTiet;
		this.donGia = donGia;
		this.phanTramThuNhap = 0.15*(this.soTiet*this.donGia);
	}
	
	@Override
	public double tinhLuong() {
		return this.soTiet * this.donGia + this.phanTramThuNhap ;
	}
	
	
}
