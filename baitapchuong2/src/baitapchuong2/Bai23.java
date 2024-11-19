package baitapchuong2;

import java.util.Scanner;

public class Bai23 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Nhập số sinh viên: ");
	        int n = scanner.nextInt();

	        int[] diem = new int[n];

	       
	        System.out.println("Nhập điểm của các sinh viên:");
	        for (int i = 0; i < n; i++) {
	            System.out.print("Sinh viên " + (i + 1) + ": ");
	            diem[i] = scanner.nextInt();
	        }

	        
	        int maxDiem = diem[0];
	        int viTriMax = 0;
	        for (int i = 1; i < n; i++) {
	            if (diem[i] > maxDiem) {
	                maxDiem = diem[i];
	                viTriMax = i;
	            }
	        }

	        
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = i + 1; j < n; j++) {
	                if (diem[i] > diem[j]) {
	                    
	                    int temp = diem[i];
	                    diem[i] = diem[j];
	                    diem[j] = temp;
	                }
	            }
	        }

	        
	        System.out.println("\nĐiểm cao nhất: " + maxDiem + " (Sinh viên " + (viTriMax + 1) + ")");
	        System.out.println("Điểm của các sinh viên theo thứ tự tăng dần:");
	        for (int d : diem) {
	            System.out.print(d + " ");
	        }

	        scanner.close();
	    }
}
