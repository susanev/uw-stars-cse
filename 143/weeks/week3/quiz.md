_CSE 143_
# Quiz
## Week 3

1. Recursive Tracing. For each of the calls to the following recursive method below, indicate what output is produced:

	```java
	public static void mystery(int x, int y) {
		if (y <= 0) {
			System.out.print("0 ");
		} else if (x > y) {
			System.out.print(x + " ");
			mystery(x - y, y);
		} else {
			mystery(x, y - x);
			System.out.print(y + " ");
		}
	}
	```
	
	| Call | Output |
	| :--- | :--- |
	| `mystery(6, 3);` | |
	| `mystery(2, 3);` | |
	| `mystery(5, 8);` | |
	| `mystery(21, 12);` | |
	| `mystery(3, 10);` | |

1. Write a method called parityMatches that takes two stacks of integers as parameters and that returns a count of the number of elements in corresponding positions that have the same parity. Two numbers are considered to have the same parity if they are either both even or both odd. Suppose, for example, that two stacks store these values:

	```
	s1: bottom [3, 4, 5] top        s2: bottom [37, 14, 24] top
	```

	The method compares values in corresponding positions in the two stacks (3 and 37, 4 and 14, 5 and 24).  Of these pairs, two have the same parity. The third pair (5 and 24) do not have the same parity. Therefore the method call parityMatches(s1, s2) would return 2.

	You may assume that the two stacks store the same number of values (your method should throw an IllegalArgumentException if they have different numbers of elements). You may also assume that all of the numbers stored in the list are greater than or equal to 0.  Your method is to examine the two stacks but must return them to their original state before terminating.

	You are to use one queue as auxiliary storage to solve this problem. You may not use any other auxiliary data structures to solve this problem, although you can have as many simple variables as you like. You also may not solve the problem recursively. Your solution must run in O(n) time where n is the size of the stacks. Use the Stack and Queue structures described in the cheat sheet and obey the restrictions described there (recall that you can't use the peek method or a foreach loop or iterator).