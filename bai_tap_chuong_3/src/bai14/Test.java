package bai14;

public class Test {
	
	public static void main(String[] args) {
		CNKSP cn1 = new CNKSP("","","",0,0,0);
		CNTCN cn2 = new CNTCN("","","",0,0,0,0);
		
		cn1.nhapThongTin();
		cn2.nhapThongTin();
		
		System.out.println(cn1.inThongTin()); 
		System.out.println(cn2.inThongTin()); 
	}
}	
