package studio7;

public class Rectangle {

	private double width;
	private double length;
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	public double getWidth() {
	    return width;
	}

	public void setwidth(double width) {
	    this.width = width;
	}
	
	public double getLength() {
	    return length;
	}

	public void setLength(double length) {
	    this.length = length;
	}
	
	public double rectangleArea() {
		return this.width * this.length;
	}
	
	public double rectanglePerimeter() {
		return 2 * this.width + 2 * this.length;
	}
	public boolean isSmaller(Rectangle other) {
		
	return this.rectangleArea() < other.rectangleArea();
	}
	public boolean isSquare() {
		return this.width == this.length;
	}
	
	public static void main(String[] args) {
	
		
	}

}
