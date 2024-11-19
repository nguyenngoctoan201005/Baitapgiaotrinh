package bai12;

public class SVCĐN extends Nguoi {
	private double TĐCMKT ;
	private int soMon;
	public SVCĐN(String hoVaTen, String ngaySinh, String diaChi, double tDDCMKT, int soMon) {
		super(hoVaTen, ngaySinh, diaChi);
		this.TĐCMKT = tDDCMKT;
		this.soMon = soMon;
	}
	
	@Override
	public double tinhDiem() {
		return this.TĐCMKT / this.soMon ;
	}
	
	
	
}
