package baitapchuong2;

public class Bai8 {
	    public static void main(String[] args) {
	        int tong = 0;

	        for (int i = 1; i <= 100; i++) {
	            if (i % 2 == 0) {
	                tong += i;
	            }
	        }

	        System.out.println("Tổng các số chẵn từ 1 đến 100 là: " + tong);
	 }
}
