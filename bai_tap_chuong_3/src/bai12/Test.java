package bai12;

public class Test {
	public static void main(String[] args) {
		SVCĐCQ sv1  = new SVCĐCQ(" " , " " ," ", 0,0,0);
		SVCĐN sv2 = new SVCĐN(" " , " " ," ", 0,0);
		
		sv1.nhapThongTin();
		sv2.nhapThongTin();
		
		System.out.println(sv1.inThongTin()); 
		System.out.println(sv2.inThongTin()); 
	
	}
	
	
	
}
