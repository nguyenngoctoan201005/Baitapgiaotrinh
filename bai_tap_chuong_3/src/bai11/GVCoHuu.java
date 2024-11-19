package bai11;

import java.util.Scanner;

public class GVCoHuu extends GiangVien {
	private double luongCoBan ;
	private double heSoLuong ;
	private double thamNien;
	private double phuCap ;
	
	public GVCoHuu(String hoVaTen, String diaChi, double luongCoBan, double heSoLuong, double thamNien, double phuCap) {
		super(hoVaTen, diaChi);
		this.luongCoBan = luongCoBan;
		this.heSoLuong = heSoLuong;
		this.thamNien = thamNien;
		if(thamNien >= 5) {
			this.phuCap = this.thamNien;
		}else
			this.phuCap = 0;
	}
	
	
	public double getLuongCoBan() {
		return luongCoBan;
	}


	public void setLuongCoBan(double luongCoBan) {
		this.luongCoBan = luongCoBan;
	}


	public double getHeSoLuong() {
		return heSoLuong;
	}


	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}


	public double getThamNien() {
		return thamNien;
	}


	public void setThamNien(double thamNien) {
		this.thamNien = thamNien;
	}


	public double getPhuCap() {
		return phuCap;
	}


	public void setPhuCap(double phuCap) {
		this.phuCap = phuCap;
	}
	

	@Override
	public double tinhLuong() {
		return this.luongCoBan * this.heSoLuong + this.phuCap ;
	}
	
	
}
