package bai12;

public class SVCĐCQ extends Nguoi {
	private double TĐCMKT ;
	private int soMon;
	private double DTKTHP;
	
	public SVCĐCQ(String hoVaTen, String ngaySinh, String diaChi, double tDDCMKT, int soMon, double dTKTHP) {
		super(hoVaTen, ngaySinh, diaChi);
		this.TĐCMKT = tDDCMKT;
		this.soMon = soMon;
		this.DTKTHP = dTKTHP;
	}
	
	public double tinhDiem() {
		return ((this.TĐCMKT /this.soMon) + this.DTKTHP)/3 ; 
	}
	
	
}
