package bai1;

public class Circle {
	private double radius ;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	
	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}


	public double getArea() {
		return Math.PI * Math.pow(this.radius ,2);
	}

	@Override
	public String toString() {
		return "[Ban kinh " + this.radius + ", Dien tich " + this.getArea() + "]";
	}
	
	
}
