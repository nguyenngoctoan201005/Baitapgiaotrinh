package bai13;

public class LaoDongPhoThong extends NguoiLaoDong {
	private int soNgayCong;
	private double donGia ;
	
	public LaoDongPhoThong(String hoVaTen, String diaChi, int soNgayCong, double donGia) {
		super(hoVaTen, diaChi);
		this.soNgayCong = soNgayCong;
		this.donGia = donGia;
	}
	
	@Override
    public double tinhLuong() {
        if (this.soNgayCong >= 25) {
            return this.soNgayCong * this.donGia + 1000000;
        } else if (this.soNgayCong > 15 && this.soNgayCong < 25) {
            return this.soNgayCong * this.donGia + 700000;
        } else {
            return this.soNgayCong * this.donGia;
        }
    }

	@Override
	public String inThongtin() {
		return "Ho va ten :" +this.hoVaTen +"Dia chi : " + this.diaChi +"Luong " + this.tinhLuong() ;
	}
	
	
}
