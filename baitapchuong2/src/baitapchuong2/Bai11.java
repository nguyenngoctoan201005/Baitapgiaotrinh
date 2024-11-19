package baitapchuong2;

import java.util.Scanner;

public class Bai11 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Nhập bán kính của hình tròn: ");
        double banKinh = sc.nextDouble();

        double dienTich = Math.PI * Math.pow(banKinh, 2);
        double chuVi = 2 * Math.PI * banKinh;

        System.out.println("\nDiện tích của hình tròn: " + dienTich);
        System.out.println("Chu vi của hình tròn: " + chuVi);

        sc.close();
    }
}
