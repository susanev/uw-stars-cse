// The Shape class is an abstract class that serves as the superclass of a
// family of Shape classes.  It implements the Comparable interface, ordering
// shapes by their area.

public abstract class Shape implements Comparable<Shape> {
	private String name;

	public Shape(String name) {
		this.name = name;
	}

	public abstract double area();

	public final int compareTo(Shape other) {
		double difference = area() - other.area();
		if (difference < 0)
			return -1;
		else if (difference == 0)
			return 0;
		else // difference > 0
			return 1;
	}

	public final String toString() {
		return name + " of area " + area();
	}
}