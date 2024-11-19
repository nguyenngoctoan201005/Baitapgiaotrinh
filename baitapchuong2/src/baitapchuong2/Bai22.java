package baitapchuong2;

import java.util.Scanner;

public class Bai22 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();

        double[] a = new double[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = scanner.nextDouble();
        }
        
        double tong = 0;
        for (int i = 0; i < n; i++) {
            tong += a[i];
        }
        
        System.out.println("Tổng giá trị các phần tử của mảng: " + tong);

        scanner.close();
    }
}
