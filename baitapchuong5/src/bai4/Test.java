package bai4;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Dictionary c = new Dictionary();
		Scanner sc = new Scanner(System.in);
		c.themPT();
		int q=5;
		while(q<6){
			System.out.println("Nhap vao tu can tra cuu : "); 
			String a = sc.nextLine();
			if(a.equals(" ")) {
				System.out.println("Ket thuc tim kiem !"); 
				break;
		}
			System.out.println(c.lookUp(a)); 
		}
	}
}
