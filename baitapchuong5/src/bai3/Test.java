package bai3;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Xulychuoi m = new Xulychuoi();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao day muon kiem tra"); 
		String a = sc.nextLine();
		m.layPhanTu(a);
		m.duyetMap();
	}
}
