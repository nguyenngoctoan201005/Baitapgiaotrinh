package bai9;

public class Test {
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle("Red", 10, 20); 
		Rectangle rect2 = new Rectangle("Blue", 15, 25); 
		Rectangle rect3 = new Rectangle("Green", 20, 30); 
		Rectangle rect4 = new Rectangle("Yellow", 25, 35); 
		Rectangle rect5 = new Rectangle("Purple", 30, 40);
	
		Triangle tri1 = new Triangle("Red", 5, 10);
		Triangle tri2 = new Triangle("Blue", 6, 12);
		Triangle tri3 = new Triangle("Green", 7, 14);
		Triangle tri4 = new Triangle("Yellow", 8, 16);
		Triangle tri5 = new Triangle("Purple", 9, 18);
		
		Object[] ds = {rect1, rect2, rect3, tri1, tri2, rect4, tri3, rect5};
		
		for(Object x : ds) {
			if(x instanceof Rectangle)
				System.out.println(x.toString()); 
		}

		
	}
}
