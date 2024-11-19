package Bai1;

import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        try {
	            System.out.print("Nhập số nguyên thứ nhất: ");
	            int a = scanner.nextInt();

	            System.out.print("Nhập số nguyên thứ hai: ");
	            int b = scanner.nextInt();

	            int result = a / b;
	            System.out.println("Kết quả phép chia: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Lỗi: Không thể chia cho 0.");
	        } finally {
	            scanner.close();
	        }
	    }
}
