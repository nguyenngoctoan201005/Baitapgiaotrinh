package Bai5;

public class Test {
	public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        try {
            System.out.print("Nhập lương của người lao động (VND): ");
            double salary = scanner.nextDouble();

            if (salary < 5000000 || salary > 20000000) {
                throw new OutOfRangeException("Lương phải nằm trong khoảng từ 5.000.000 đến 20.000.000 VND.");
            }

            System.out.println("Lương của bạn là: " + salary + " VND.");

        } catch (OutOfRangeException e) {
            
            System.err.println("Lỗi: " + e.getMessage());
        } catch (java.util.InputMismatchException e) {
            
            System.err.println("Lỗi: Vui lòng nhập vào một số hợp lệ.");
        } finally {
        	
            scanner.close();
        }
    }
}
