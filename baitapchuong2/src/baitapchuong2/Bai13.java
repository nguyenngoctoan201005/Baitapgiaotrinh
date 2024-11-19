package baitapchuong2;

import java.util.Scanner;

public class Bai13 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Nhập giá bán sản phẩm: ");
        double giaBan = scanner.nextDouble();

        System.out.print("Nhập phần trăm giảm giá (%): ");
        double phanTramGiamGia = scanner.nextDouble();

       
        double giaSauGiam = giaBan - (giaBan * phanTramGiamGia / 100);

       
        System.out.println("Giá bán sau khi giảm: " + giaSauGiam);

        scanner.close();
    }
}
