// ArrayIntList Client
public class ArrayIntListClient {
	public static void main(String[] args) {
		ArrayIntList list = new ArrayIntList(25);
		list.add(3);
		list.add(7);
		list.add(11);
		System.out.println("initial list = " + list);
		list.add(0, 2);
		list.add(2, 5);
		System.out.println("after some adds = " + list);
		System.out.print("index of:");
		for (int i = 1; i < 10; i += 2) {
			System.out.print("   " + i + " -> " + list.indexOf(i));
		}
		System.out.println();
		System.out.print("get:");
		for (int i = 0; i < list.size(); i++) {
			System.out.print("   " + i + " -> " + list.get(i));
		}
		System.out.println();
		System.out.println("list = " + list);
		while (list.size() > 0) {
			int i = (int) (Math.random() * list.size());
			list.remove(i);
			System.out.println("after removing at " + i + " list = " + list);
		}
	}
}