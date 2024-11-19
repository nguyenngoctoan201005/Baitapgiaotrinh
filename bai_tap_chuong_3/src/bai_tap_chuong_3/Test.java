package bai_tap_chuong_3;

import bai8.Rectangle;
import bai8.Triangle;

public class Test {
	public static void main(String[] args) {
		Rectangle cn = new Rectangle("xanh" , 5,6);
		Rectangle cn1 = new Rectangle("Do" , 5,2);
		Rectangle cn2 = new Rectangle("Tim" , 8,6);
		Rectangle cn3 = new Rectangle("den" ,7 ,6);
		Triangle tg = new Triangle ("Trang" , 5,7);
		Triangle tg1 = new Triangle ("Trang" , 1,9);
		Triangle tg2 = new Triangle ("Trang" , 3,9);
		Triangle tg3 = new Triangle ("Trang" , 5,8);
		
		Object[]a = new Object[]{cn,cn1,cn2,cn3,tg1,tg2};
		for(int i = 0 ; i<a.length; i++) {
			if(a[i] instanceof Rectangle)
				System.out.println(a[i].toString());
		}
	}
}
