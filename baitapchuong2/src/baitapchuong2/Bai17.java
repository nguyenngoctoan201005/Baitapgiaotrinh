package baitapchuong2;

public class Bai17 {
	public static void main(String[] args) {
        System.out.println("Các số có 3 chữ số thỏa mãn điều kiện abc = a³ + b³ + c³:");
        for (int i = 100; i < 1000; i++) {
            int a = i / 100;          
            int b = (i / 10) % 10;   
            int c = i % 10;          
            if (i == Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3)) {
                System.out.println(i);
            }
        }
    }
}
