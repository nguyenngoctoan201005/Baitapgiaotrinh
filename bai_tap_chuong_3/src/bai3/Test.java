package bai3;

import bai2.Diachi;

public class Test {
	
	public static void main(String[] args) {
			Diachi dc1 = new Diachi("thon 1" , "Tholoc" , "Phuc Tho" , "Hanoi");
			Diachi dc2 = new Diachi("thon 2" , "TichGiang" , "Phuc Tho" , "Hanoi");
			Nhanvien nv =new Nhanvien("Nguyen Van A" , dc1 , "20-1-1999", '1');
			
			System.out.println(nv.getName() + nv.getDiaChi() + nv.getDob() + nv.getGender()); 
			nv.setDiaChi(dc2);
			nv.setDob("20-5-1992");
			nv.setGender('1');
			nv.setName("Nguyen Thi B");
			
			System.out.println(nv.toString()); 
	}	
}
