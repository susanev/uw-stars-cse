// Short client program to test the Angle class.  It constructs two specific
// angles and their sum and then adds several more angles and sorts and prints
// the list.

import java.util.*;

public class AngleTest {
	public static void main(String[] args) {
		Angle a1 = new Angle(23, 26);
		Angle a2 = new Angle(15, 48);
		Angle a3 = a1.add(a2);
		ArrayList<Angle> list = new ArrayList<Angle>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		System.out.println(list);

		int[][]data = {{30, 19}, {30, 12}, {30, 45}, {30, 8}, {30, 55}};
		for (int[] coords : data) {
			list.add(new Angle(coords[0], coords[1]));
		}
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}