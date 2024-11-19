package baitapchuong2;

import java.util.Scanner;

public class Bai7 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Nhập số thực thứ nhất: ");
        double so1 = sc.nextDouble();

        System.out.print("Nhập số thực thứ hai: ");
        double so2 = sc.nextDouble();

        
        System.out.print("Nhập ký tự (A, S, M, D): ");
        char kyTu = sc.next().charAt(0);

       
        switch (kyTu) {
            case 'A': 
                System.out.println("Tổng: " + (so1 + so2));
                break;
            case 'S': 
                System.out.println("Hiệu: " + (so1 - so2));
                break;
            case 'M': 
                System.out.println("Tích: " + (so1 * so2));
                break;
            case 'D': 
                if (so2 != 0) {
                    System.out.println("Thương: " + (so1 / so2));
                } else {
                    System.out.println("Lỗi: Không thể chia cho 0.");
                }
                break;
            default:
                System.out.println("Ký tự không hợp lệ.");
                break;
        }

        sc.close();
	}
}
