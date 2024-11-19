package bai10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		HocvienDH sv1 = new HocvienDH ("","","",30,50000);
		HocvienLT sv2 = new HocvienLT ("","","",20,80000);
		
		sv1.nhapThongTin();
		sv2.nhapThongTin();
		System.out.println(sv1.inThongTin());
		System.out.println(sv2.inThongTin()); 
	}
}
