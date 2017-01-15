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

1. Write a method hasTwoConsecutive that returns whether or not a list of integers has two adjacent numbers that are consecutive integers (true if such a pair exists and false otherwise). For example, if a variable list stores the following sequence of values, then the call list.hasTwoConsecutive() should return true because the list contains the adjacent numbers (7, 8) which are a pair of consecutive numbers:

	```
	[1, 18, 2, 7, 8, 39, 18, 40]
	```

	If the list had stored the following sequence of values, then the method should return false:

	```
	[1, 18, 17, 2, 7, 39, 18, 40, 8]
	```

	This sequence contains some pairs of numbers that could represent consecutive integers (e.g., 1 and 2, 7 and 8, 39 and 40), but those pairs of numbers are not adjacent in the sequence. The list also has a pair of adjacent numbers (18, 17) that are not in the right order to be considered consecutive. You may not make any assumptions about how many elements are in the list.

	Assume that you are adding this method to the LinkedIntList class as defined below:

	```java
	public class LinkedIntList {
	    private ListNode front;   // null for an empty list
	    ...
	}
	```