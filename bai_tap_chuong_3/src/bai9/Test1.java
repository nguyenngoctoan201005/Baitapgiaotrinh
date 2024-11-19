package bai9;

import java.util.Arrays;
import java.util.Comparator;

public class Test1 {
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle("Red", 10, 20); 
		Rectangle rect2 = new Rectangle("Blue", 15, 25); 
		Rectangle rect3 = new Rectangle("Green", 20, 30); 
		Rectangle rect4 = new Rectangle("Yellow", 25, 35); 
		Rectangle rect5 = new Rectangle("Purple", 30, 40);
		
		Rectangle[] rectangles = {rect1, rect2, rect3, rect4, rect5};
		
		Arrays.sort(rectangles , new Comparator<Rectangle>() {
			@Override
			public int compare(Rectangle rect1 , Rectangle rect2) {
				if(rect1.getLength() > rect2.getLength())
					return -1 ;
				if(rect1.getLength() < rect2.getLength())
					return 1 ;
				else 
					return 0;
			}
		});
		
		for(Rectangle x :rectangles ) {
			System.out.println(x.toString()); 
		}
	}
}
