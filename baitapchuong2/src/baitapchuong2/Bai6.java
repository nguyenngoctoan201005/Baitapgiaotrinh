package baitapchuong2;

import java.util.Scanner;

public class Bai6 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Nhập số nguyên thứ nhất: ");
        int so1 = sc.nextInt();

        System.out.print("Nhập số nguyên thứ hai: ");
        int so2 = sc.nextInt();

        int tong = so1 + so2;
        int hieu = so1 - so2;
        int tich = so1 * so2;
        double thuong = (double) so1 / so2;

        System.out.println("\nKết quả:");
        System.out.println("Tổng: " + tong);
        System.out.println("Hiệu: " + hieu);
        System.out.println("Tích: " + tich);
        System.out.println("Thương: " + thuong);

        sc.close();
    }
}
