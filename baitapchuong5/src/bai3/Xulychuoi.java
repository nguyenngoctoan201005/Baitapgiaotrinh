package bai3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Xulychuoi {
	
	
	public Xulychuoi() {
	}

	Map<String , Integer> hm = new HashMap<>();
	
	public void layPhanTu(String a) {
		a = a.trim();
		String[]b= a.split(" ");
		
		for(int i = 0 ; i< b.length ; i++) {
			int dem = 0;
			for(int j = 0 ; j < b.length ; j++) {
				if(b[i].equals(b[j]))
					dem++;
			}
			
			hm.put(b[i], dem);
		}
	}
	
	public void duyetMap() {
		int sum = 0;
		for(String x : hm.keySet()) {
			System.out.println("Key :" + x +"    " + hm.get(x)); 
			sum = sum + hm.get(x);
		}
		System.out.println("Total words : " + sum); 
	}
}
