_CSE 143_
# Exercises
## Week 3

1. 	Write the code necessary to convert the following sequences of ListNode objects:

	```
	p -> [1] -> [3] /
	q -> [2] /
	```

	Into this sequence of ListNode objects:

	```
	p -> [1] -> [2] -> [3] /
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

1. Write a method deleteBack that deletes the last value (the value at the back of the list) and returns the deleted value. If the list is empty, your method should throw a NoSuchElementException.

	Assume that you are adding this method to the LinkedIntList class as defined below:

	```java
	public class LinkedIntList {
	    private ListNode front;   // null for an empty list
	    ...
	}
	```

1. Write a method starString that accepts an integer parameter n and returns a string of stars 2^n long (i.e., to the nth power). For example:
	
	| Call | Output | Reason |
	| :--- | :--- | :--- |
	| `starString(0);` | `"*"	20 = 1` |
	| `starString(1);` | `"**"	21 = 2` |
	| `starString(2);` | `"****"	22 = 4` |
	| `starString(3);` | `"********"	23 = 8` |
	| `starString(4);` | `"****************"	24 = 16` |

	You should throw an Illegal ArgumentException if passed a value less than 0.

1. Write a recursive method digitMatch that accepts two non-negative integers as parameters and that returns the number of digits that match between them. Two digits match if they are equal and have the same position relative to the end of the number (i.e. starting with the ones digit). In other words, the method should compare the last digits of each number, the second-to-last digits of each number, the third-to-last digits of each number, and so forth, counting how many pairs match. For example, for the call of digitMatch(1072503891, 62530841), the method would compare as follows:

	```
	1 0 7 2 5 0 3 8 9 1
	    | | | | | | | |
	    6 2 5 3 0 8 4 1
  ```

	The method should return 4 in this case because 4 of these pairs match (2-2, 5-5, 8-8, and 1-1). Below are more examples:

	| Call | Value Returned |
	| :--- | :--- |
	| `digitMatch(38, 34)` | `1` |
	| `digitMatch(5, 5552)` | `0` |
	| `digitMatch(892, 892)` | `3` |
	| `digitMatch(298892, 7892)` | `3` |
	| `digitMatch(380, 0)` | `1` |
	| `digitMatch(123456, 654321)` | `0` |
	| `digitMatch(1234567, 67)` | `2` |

	Your method should throw an IllegalArgumentException if either of the two parameters is negative. You are not allowed to construct any structured objects other than Strings (no array, List, Scanner, etc.) and you may not use any loops to solve this problem; you must use recursion.