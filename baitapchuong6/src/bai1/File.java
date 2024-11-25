package bai1;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class File {
	
	
	public File() {
	}

	public void ghiFile() {
		try {
			FileWriter f = new FileWriter("D:\\expp.txt");
			PrintWriter d = new PrintWriter(f);
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap vao mot chuoi"); 
			String a = sc.nextLine();
			System.out.println("Nhap vao mot so nguyen"); 
			int b = sc.nextInt();
			System.out.println("Nhap vao mot so thuc"); 
			double c = sc.nextDouble();
			
			d.println(a);
			d.println(b);
			d.println(c);
			d.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void docFile() {
		try {
			FileReader fm = new FileReader("D:\\expp.txt");
			BufferedReader dc = new BufferedReader (fm);
			Scanner sc = new Scanner(System.in);
			System.out.println("Chuoi nhap la : "); 
			String a = dc.readLine();
			System.out.println(a);
			System.out.println("Gia tri so nguyen :"); 
			String b = dc.readLine();
			System.out.println(b); 
			System.out.println("Gia tri so thuc :"); 
			String c = dc.readLine();
			System.out.println(c); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
}
