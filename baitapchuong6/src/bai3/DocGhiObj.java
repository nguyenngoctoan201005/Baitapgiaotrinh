package bai3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DocGhiObj {
	Student sv1 = new Student("20236012" , "Nguyen Van A" , "20-1",'1');
	Student sv2 = new Student("20236033" , "Nguyen Van B" , "20-8",'1');
	
	
	public DocGhiObj() {
	}
	
	public void ghiObj() {
		try {
		FileOutputStream f = new FileOutputStream ("D:\\student.dat");
		ObjectOutputStream o = new ObjectOutputStream(f);
		
			o.writeObject(sv1);
			o.writeObject(sv2);
			o.close();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void docObj() {
		try {
		FileInputStream f = new FileInputStream ("D:\\student.dat");
		ObjectInputStream o = new ObjectInputStream(f);
		
		
			while(true) {
				try {
					Student sv = (Student)o.readObject();
					System.out.println(sv.toString());  
				} catch (Exception e) {
					break;
				}
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
