package baitapchuong2;

import java.util.Scanner;

public class Bai24 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();

        int[] diem = new int[n];

        
        System.out.println("Nhập điểm thi tiếng Anh của các sinh viên:");
        for (int i = 0; i < n; i++) {
            System.out.print("Sinh viên " + (i + 1) + ": ");
            diem[i] = scanner.nextInt();
        }

        
        System.out.print("\nNhập điểm cần tìm: ");
        int diemCanTim = scanner.nextInt();

        
        boolean timThay = false;
        System.out.println("\nSinh viên có điểm bằng " + diemCanTim + ":");
        for (int i = 0; i < n; i++) {
            if (diem[i] == diemCanTim) {
                System.out.println("Sinh viên " + (i + 1) + " có điểm: " + diem[i]);
                timThay = true;
            }
        }

        
        if (!timThay) {
            System.out.println("Không có sinh viên nào có điểm bằng " + diemCanTim);
        }

        scanner.close();
    }
}
