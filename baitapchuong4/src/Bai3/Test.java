package Bai3;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Nhập một chuỗi (hoặc nhập 'DONE' để kết thúc): ");
            String input = scanner.nextLine();

            if (input.equals("DONE")) {
                System.out.println("Kết thúc chương trình.");
                break;
            }

            try {
                if (input.length() > 30) {
                    throw new StringTooLongException("Chuỗi nhập vào vượt quá 30 ký tự.");
                }
                System.out.println("Chuỗi hợp lệ: " + input);
            } catch (StringTooLongException e) {
                System.out.println("Lỗi: " + e.getMessage());
                break;
            }
        }

        scanner.close();
    }
}
