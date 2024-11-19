package bai4;

public class BenhVien {
	private String ten ;
	private String diaChi ;
	private String giamDoc;
	
	public BenhVien(String ten, String diaChi, String giamDoc) {
		this.ten = ten;
		this.diaChi = diaChi;
		this.giamDoc = giamDoc;
	}

	public String getTen() {
		return ten;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public String getGiamDoc() {
		return giamDoc;
	}

	@Override
	public String toString() {
		return "BenhVien [ten=" + ten + ", diaChi=" + diaChi + ", giamDoc=" + giamDoc + "]";
	}
	
	
	
	
}
