package bai10;

public class HocvienLT extends Hocvien {
	private int soBuoi;
	private double donGia;
	
	public HocvienLT(String hoVaTen, String diaChi, String loaiUuTien, int soBuoi, double donGia) {
		super(hoVaTen, diaChi, loaiUuTien);
		this.soBuoi = soBuoi;
		this.donGia = donGia;
	}

	@Override
	public double hocPhi(String loaiUuTien , double donGia , int soBuoi) {
		if(loaiUuTien.equals("1"))
			return  donGia*soBuoi -1000000;
		else
			return  donGia*soBuoi -800000;

	}
	
}
