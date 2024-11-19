package baitapchuong2;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

        System.out.print("Nhập một số nguyên: ");
        int soNguyen = sc.nextInt();

        System.out.print("Nhập một số thực: ");
        double soThuc = sc.nextDouble();

        System.out.print("Nhập một ký tự: ");
        char kyTu = sc.next().charAt(0);

        sc.nextLine(); 

        System.out.print("Nhập một chuỗi ký tự: ");
        String chuoiKyTu = sc.nextLine();

   
        System.out.println("\nThông tin vừa nhập:");
        System.out.println("Số nguyên: " + soNguyen);
        System.out.println("Số thực: " + soThuc);
        System.out.println("Ký tự: " + kyTu);
        System.out.println("Chuỗi ký tự: " + chuoiKyTu);

        sc.close();
    }
}
