import java.util.*;

public class ShapeTest {
	public static void main(String[] args) {
		Shape[] data = {new Square(12), new Rectangle(15, 3.2), new Circle(8.4),
				new Circle(1.5), new Square(8.7), new Rectangle(7.2, 3.2), new Square(2.4),
				new Circle(3.7), new Circle(7.9)};
		for (Shape s : data)
			System.out.println(s);
		System.out.println();
		Arrays.sort(data);
		for (Shape s : data)
			System.out.println(s);
	}
}