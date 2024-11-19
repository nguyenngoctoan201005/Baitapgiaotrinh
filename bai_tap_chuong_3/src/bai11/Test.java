package bai11;

import bai10.HocvienDH;
import bai10.HocvienLT;

public class Test {
	public static void main(String[] args) {
		GVCoHuu gv1 = new GVCoHuu("","",500,3.2,7,0);
		GVThinhGiang gv2 = new GVThinhGiang("","",100,50,0);
		
		gv1.nhapThongTin();
		gv2.nhapThongTin();
		System.out.println(gv1.inThongTin());
		System.out.println(gv2.inThongTin()); 
	}
}
