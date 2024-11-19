package baitapchuong2;

import java.util.Scanner;

public class Bai10 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Nhập chiều dài của hình chữ nhật: ");
        double chieuDai = sc.nextDouble();

        System.out.print("Nhập chiều rộng của hình chữ nhật: ");
        double chieuRong = sc.nextDouble();

        
        double dienTich = chieuDai * chieuRong;
        double chuVi = 2 * (chieuDai + chieuRong);

        
        System.out.println("\nDiện tích của hình chữ nhật: " + dienTich);
        System.out.println("Chu vi của hình chữ nhật: " + chuVi);

        sc.close();
    }
}
