_CSE 143_
# Check-in Meeting
## Week 3

1. Write the code necessary to convert the following sequences of ListNode objects:

	```
	p -> [1] -> [2] -> [3] /
	q -> [4] -> [5] -> [6] /
	```

	Into this sequence of ListNode objects:

	```
	p -> [1] -> [3] -> [5] /
	q -> [2] -> [4] -> [6] /
	```

	There may be more than one way to write the code, but you are NOT allowed to change any existing node's data field value. You also should not create new ListNode objects unless necessary to add new values to the chain, but you may create a single ListNode variable to refer to any existing node if you like. If a variable does not appear in the "after" picture, it doesn't matter what value it has after the changes are made.

	Assume that you are using ListNode class as defined in lecture and section:

	```java
	public class ListNode {
		public int data;	   // data stored in this node
		public ListNode next;  // a link to the next node in the list

		public ListNode() { ... }
		public ListNode(int data) { ... }
		public ListNode(int data, ListNode next) { ... }
	}
	```

1. 	Write the code necessary to convert the following sequences of ListNode objects:

	```
	p -> [1] -> [2] -> [3] /
	q -> [4] -> [5] /
	```

	Into this sequence of ListNode objects:

	```
	p -> [3] -> [1] -> [5] /
	q -> [4] -> [2] /
	```

	There may be more than one way to write the code, but you are NOT allowed to change any existing node's data field value. You also should not create new ListNode objects unless necessary to add new values to the chain, but you may create a single ListNode variable to refer to any existing node if you like. If a variable does not appear in the "after" picture, it doesn't matter what value it has after the changes are made.

	Assume that you are using ListNode class as defined in lecture and section:

	```java
	public class ListNode {
		public int data;	   // data stored in this node
		public ListNode next;  // a link to the next node in the list

		public ListNode() { ... }
	```

1. Write a recursive method largestDigit that accepts an integer parameter and returns the largest digit value that appears in that integer. Your method should work for both positive and negative numbers. If a number contains only a single digit, that digit's value is by definition the largest. The following table shows several example calls:

	| Call | Returns |
	| :--- | :--- |
	| `largestDigit(14263203)` | `6` |
	| `largestDigit(845)` | `8` |
	| `largestDigit(52649)` | `9` |
	| `largestDigit(3)` | `3` |
	| `largestDigit(0)` | `0` |
	| `largestDigit(-573026)` | `7` |
	| `largestDigit(-2)` | `2` |
	
	For full credit, obey the following restrictions in your solution. A solution that disobeys them may get partial credit.
	* You may not use a String, Scanner, array, or any data structure (list, stack, map, etc.).
	* Your method must be recursive and not use any loops (for, while, etc.).
	* Your solution should run in no worse than O(N) time, where N is the number of digits in the number.