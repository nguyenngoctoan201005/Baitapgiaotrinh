package bai2;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	Exchance e = new Exchance();
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhập vào mã tiền tệ thứ nhất :" );
	String a = sc.nextLine();
	System.out.println("Nhập vào mã tiền tệ thứ hai :");
	String b = sc.nextLine();
	System.out.println("Nhập vào lượng tiền cần chuyển đổi");
	double d = sc.nextDouble();
	e.convert(a, b, d);
}
}
