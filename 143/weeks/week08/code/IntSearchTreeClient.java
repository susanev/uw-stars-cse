// This program tests the IntTree class by constructing a binary search tree of
// integers and printing its contents as well as its structure.

import java.util.*;

public class IntSearchTreeClient {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        IntTree numbers = new IntTree();
        System.out.print("Next int (0 to quit)? ");
        int number = console.nextInt();
        while (number != 0) {
            numbers.add(number);
            System.out.print("Next int (0 to quit)? ");
            number = console.nextInt();
        }
        System.out.println();

        System.out.println("Tree Structure:");
        numbers.printSideways();
	System.out.println("Sorted list:");
        numbers.printInorder();
    }
}