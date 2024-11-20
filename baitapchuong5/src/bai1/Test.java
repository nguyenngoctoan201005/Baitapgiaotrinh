package bai1;

public class Test {
	public static void main(String[] args) {
		CircleCollection nnt = new CircleCollection ();
			nnt.nhapGiaTri();
			System.out.println("Thông tin các hình tròn đã nhập"); 
			nnt.hienThiThongTin();
			System.out.println(); 
			System.out.println("Diện tích lớn nhất :"); 
			System.out.println(nnt.findMaxArea()); 
			System.out.println("Tổng diện tích đã nhập"); 
			System.out.println(nnt.caclSumArea()); 
			System.out.println("Diện tích nhỏ nhất"); 
			System.out.println(nnt.findMinArea()); 
			nnt.InfomationMinArea();
		
		
	}
}	
