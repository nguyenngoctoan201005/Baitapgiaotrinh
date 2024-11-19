package baitapchuong2;

import java.util.Scanner;

public class Bai12 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Nhập điểm thi (0-100): ");
	        int diem = scanner.nextInt();

	        String xepLoai;
	        if (diem >= 90 && diem <= 100) {
	            xepLoai = "A";
	        } else if (diem >= 80 && diem < 90) {
	            xepLoai = "B";
	        } else if (diem >= 70 && diem < 80) {
	            xepLoai = "C";
	        } else if (diem >= 50 && diem < 70) {
	            xepLoai = "D";
	        } else if (diem >= 0 && diem < 50) {
	            xepLoai = "F";
	        } else {
	            xepLoai = "Điểm không hợp lệ!";
	        }

	        
	        System.out.println("Xếp loại: " + xepLoai);

	        scanner.close();
	    }
}
