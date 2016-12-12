import java.util.*;

public class FinalArrayList {
	public static void main(String[] args) {
		// ArrayLists for removeShorterStrings and collapse
		// ArrayList<String> a = new ArrayList<String>(Arrays.asList(new String[] {"four", "score", "and", "seven", "years", "ago"}));
		// ArrayList<String> b = new ArrayList<String>(Arrays.asList(new String[] {"to", "be", "or", "not", "to", "be", "hamlet"}));
		
		// Tests for removeShorterStrings
		// removeShorterStrings(a);
		// System.out.println(a);
		// removeShorterStrings(b);
		// System.out.println(b);

		// Tests for collapse
		// collapse(a);
		// System.out.println(a);
		// collapse(b);
		// System.out.println(b);

		// Tests for expand
		// ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(new Integer[] {2, 4, 3, 5, 1, 9, 12, 8}));
		// expand(a);
		// System.out.println(a);
	}

	public static void removeShorterStrings(ArrayList<String> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(i).length() <= list.get(i + 1).length()) {
				list.remove(i);
			} else {
				list.remove(i + 1);
			}
		}
	}

	public static void collapse(ArrayList<String> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			list.add(i, "(" + list.get(i) + ", " + list.get(i + 1) + ")");
			list.remove(i + 1);
			list.remove(i + 1);
		}
	}

	public static void expand(ArrayList<Integer> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			int mult = list.remove(i) - 1;
			for (int j = 0; j < mult; j++) {
				list.add(i, list.get(i));
			}
			i += mult;
		}
	}
}