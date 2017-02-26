// This program uses the SearchTree class to construct a binary search tree of
// strings and a binary search tree of integers, printing out each.

import java.util.*;

public class SearchTreeClient {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		SearchTree<String> names = new SearchTree<String>();
		System.out.print("Name (blank to quit)? ");
		String name = console.nextLine();
		while (name.length() > 0) {
			names.add(name);
			System.out.print("Name (blank to quit)? ");
			name = console.nextLine();
		}
		System.out.println();
		System.out.println("Alphabetized list:");
		names.print();
		System.out.println();

		SearchTree<Integer> numbers = new SearchTree<Integer>();
		System.out.print("Next int (0 to quit)? ");
		int number = console.nextInt();
		while (number != 0) {
			numbers.add(number);
			System.out.print("Next int (0 to quit)? ");
			number = console.nextInt();
		}
		System.out.println();
		System.out.println("Sorted list:");
		numbers.print();	
	}
}