package bai7;

public class ResizableCricle extends Circle implements Resizable {
	
	
	public ResizableCricle(double radius) {
		super(radius);
	}

	@Override
	public void resize(int percent) {
		radius = (1- percent/100)*radius ;
	}
}
