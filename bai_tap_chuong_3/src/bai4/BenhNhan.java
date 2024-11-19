package bai4;

public class BenhNhan extends Nguoi {
	private String tiensu;
	private String chuanDoan;
	private BenhVien benhVien ;
	
	public BenhNhan(String ten, int tuoi, char gioiTinh, String tiensu, String chuanDoan, BenhVien benhVien) {
		super(ten, tuoi, gioiTinh);
		this.tiensu = tiensu;
		this.chuanDoan = chuanDoan;
		this.benhVien = benhVien;
	}

	public String getTiensu() {
		return tiensu;
	}

	public void setTiensu(String tiensu) {
		this.tiensu = tiensu;
	}

	public String getChuanDoan() {
		return chuanDoan;
	}

	public void setChuanDoan(String chuanDoan) {
		this.chuanDoan = chuanDoan;
	}

	public BenhVien getBenhVien() {
		return benhVien;
	}

	public void setBenhVien(BenhVien benhVien) {
		this.benhVien = benhVien;
	}

	@Override
	public String toString() {
		return "BenhNhan [tiensu=" + tiensu + ", chuanDoan=" + chuanDoan + ", benhVien=" + benhVien + "]";
	}

	
	
	
	
}
