package bai9;

public class Triangle extends Shape  {
	private int base ;
	private int height ;
	
	public Triangle(String color, int base, int height) {
		super(color);
		this.base = base;
		this.height = height;
	}
	
	@Override 
	public double getArea() {
		return 1/2*height *base ;
	}

	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height + "]";
	}

	
}
