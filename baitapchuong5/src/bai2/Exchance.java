package bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Exchance {
	
	ArrayList<Rate> MonArr = new ArrayList<>();
	
	
	public Exchance() {
		
		Rate n1 = new Rate("USD" , "VND", 17000);
		Rate n2 = new Rate("EUR" , "USD", 1.2);
		Rate n3 = new Rate("USD" , "IDN", 15789);
		Rate n4 = new Rate("USD" , "EUR", 0.83);
		Rate n5 = new Rate("CAD" , "IND", 16869);
		this.MonArr.add(n1);
		this.MonArr.add(n2);
		this.MonArr.add(n3);
		this.MonArr.add(n4);
		this.MonArr.add(n5);
	}
		 
	
	public void convert(String code1 , String code2 , double amount ) {
		if(code1.equals("USD") && code2.equals("VND")) {
			System.out.print("Lượng tiền sau khi chuyển đổi là : "+ amount *this.MonArr.get(0).getRate());
			
		}else if(code1.equals("EUR") && code2.equals("USD")) {
			System.out.print("Lượng tiền sau khi chuyển đổi là : "+amount *this.MonArr.get(1).getRate());
			
		}else if(code1.equals("USD") && code2.equals("IDN")) {
			System.out.print("Lượng tiền sau khi chuyển đổi là : "+amount *this.MonArr.get(2).getRate());
			
		}else if(code1.equals("USD") && code2.equals("EUR")) {
			System.out.print("Lượng tiền sau khi chuyển đổi là : "+amount *this.MonArr.get(3).getRate());
			
		}else if(code1.equals("CAD") && code2.equals("IDN")) {
			System.out.print("Lượng tiền sau khi chuyển đổi là : "+amount *this.MonArr.get(4).getRate());
			
		}else {
			System.out.println("Bạn đã nhập sai"); 
		}
			
	}
	
}
