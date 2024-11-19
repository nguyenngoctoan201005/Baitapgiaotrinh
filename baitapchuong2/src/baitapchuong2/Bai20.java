package baitapchuong2;

import java.util.Scanner;

public class Bai20 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập nhiệt độ (°C): ");
        double nhietDoC = scanner.nextDouble();
        double nhietDoF = nhietDoC * 9 / 5 + 32;

        System.out.println("Nhiệt độ tương ứng (°F): " + nhietDoF);

        scanner.close();
    }
}
