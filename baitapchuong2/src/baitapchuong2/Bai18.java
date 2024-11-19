package baitapchuong2;

import java.util.Scanner;

public class Bai18 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

   
        System.out.print("Nhập một số nguyên: ");
        int n = scanner.nextInt();

        boolean laSoNguyenTo = true;

        
        if (n < 2) {
            laSoNguyenTo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    laSoNguyenTo = false;
                    break;
                }
            }
        }

        
        if (laSoNguyenTo) {
            System.out.println(n + " là số nguyên tố.");
        } else {
            System.out.println(n + " không phải là số nguyên tố.");
        }

        scanner.close();
    }
}
