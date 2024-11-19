package bai2;

public class Diachi {
	private String thon ;
	private String xa ;
	private String huyen ;
	private String tinh ;
	
	public Diachi(String thon, String xa, String huyen, String tinh) {
		
		this.thon = thon;
		this.xa = xa;
		this.huyen = huyen;
		this.tinh = tinh;
	}
	public Diachi() {
		
	}
	public String getThon() {
		return thon;
	}
	public void setThon(String thon) {
		this.thon = thon;
	}
	public String getXa() {
		return xa;
	}
	public void setXa(String xa) {
		this.xa = xa;
	}
	public String getHuyen() {
		return huyen;
	}
	public void setHuyen(String huyen) {
		this.huyen = huyen;
	}
	public String getTinh() {
		return tinh;
	}
	public void setTinh(String tinh) {
		this.tinh = tinh;
	}
	@Override
	public String toString() {
		return "Diachi [thon=" + thon + ", xa=" + xa + ", huyen=" + huyen + ", tinh=" + tinh + "]";
	}
	
	
	
	
}
