package Bai2;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập ngày: ");
            int ngay = scanner.nextInt();

            System.out.print("Nhập tháng: ");
            int thang = scanner.nextInt();

            System.out.print("Nhập năm: ");
            int nam = scanner.nextInt();

            ThoiGian thoiGian = new ThoiGian(ngay, thang, nam);
            System.out.println("Thời gian hợp lệ: " + thoiGian);
        } catch (InvalidDateException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
