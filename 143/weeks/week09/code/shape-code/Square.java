public class Square extends Shape {
	private double length;

	public Square(double length) {
		super("square");
		this.length = length;
	}

	public double area() {
		return length * length;
	}
}