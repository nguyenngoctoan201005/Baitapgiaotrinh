package bai2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class File1 {
	
	
	public File1() {
	}

	public void ghiFile() {
		
		try {
			FileOutputStream f = new FileOutputStream("D:\\exp.txt");
			DataOutputStream d = new DataOutputStream(f);
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap vao mot chuoi"); 
			String a = sc.nextLine();
			System.out.println("Nhap vao mot ki tu"); 
			char b = sc.next().charAt(0);
			System.out.println("Nhap vao mot so thuc"); 
			double c = sc.nextDouble();
			
			d.writeUTF(a);
			d.writeChar(b);
			d.writeDouble(c);
			d.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void docFile() {
		try {
			FileInputStream fm = new FileInputStream("D:\\exp.txt");
			DataInputStream dc = new DataInputStream(fm);
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Chuoi nhap la : "); 
			String a = dc.readUTF();
			System.out.println(a);
			System.out.println("Gia tri ki tu la :"); 
			char b = dc.readChar();
			System.out.println(b); 
			System.out.println("Gia tri so thuc :"); 
			double c = dc.readDouble();
			System.out.println(c); 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
}
