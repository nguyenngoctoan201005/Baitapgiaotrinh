package bai7;

public class Circle implements GeomtricObject {
	protected double radius = 1.0;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double getPerimeter() {
		return 2*Math.PI * this.radius;
	}

	@Override
	public double getArea() {
		return Math.PI * Math.pow(this.radius,2);	
	}
	
	
	
	
}
