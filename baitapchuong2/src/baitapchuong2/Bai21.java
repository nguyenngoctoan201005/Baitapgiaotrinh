package baitapchuong2;

import java.util.Scanner;

public class Bai21 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();

        int[] a = new int[n];

        
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = scanner.nextInt();
        }

  
        System.out.println("Các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        scanner.close();
    }
}
