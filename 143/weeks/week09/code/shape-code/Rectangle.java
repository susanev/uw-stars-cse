public class Rectangle extends Shape {
	private double length;
	private double width;

	public Rectangle(double length, double  width) {
		super("rectangle");
		this.length = length;
		this.width = width;
	}

	public double area() {
		return length * width;
	}
}