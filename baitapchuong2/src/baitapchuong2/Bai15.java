package baitapchuong2;

import java.util.Scanner;

public class Bai15 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Nhập số ngày lưu trú: ");
	        int soNgay = scanner.nextInt();

	        System.out.print("Nhập đơn giá ngày: ");
	        double donGia = scanner.nextDouble();

	        double tienPhong;

	        
	        if (soNgay == 1) {
	            tienPhong = donGia;
	        } else if (soNgay <= 4) {
	            tienPhong = soNgay * donGia * 0.8; // Giảm 20%
	        } else if (soNgay <= 10) {
	            tienPhong = soNgay * donGia * 0.6; // Giảm 40%
	        } else {
	            tienPhong = soNgay * donGia * 0.4; // Giảm 60%
	        }

	        System.out.println("Số tiền phòng phải thanh toán: " + tienPhong);

	        scanner.close();
	    }
}
