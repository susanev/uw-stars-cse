_CSE 143_
# Exercises
## Week 2

_These problems are intended to be completed in pairs, you may work with anyone you like. However, if you begin these exercises before others have finished the quiz, please work in silence until everyone has finished_

1. 	Write a method shift that takes a stack of integers and an integer n as parameters and that shifts n values from the bottom of the stack to the top of the stack.

	For example, if a variable called s stores the following sequence of values:

	```
	bottom [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] top
	```

	and we make the following call:

	```java
	shift(s, 6);
	```

	the method shifts the six values at the bottom of the stack to the top of the stack and leaves the other values in the same order producing:

	```
	bottom [7, 8, 9, 10, 6, 5, 4, 3, 2, 1] top
	```

	Notice that the value that was at the bottom of the stack is now at the top, the value that was second from the bottom is now second from the top, the value that was third from the bottom is now third from the top, and so on, and that the four values not involved in the shift are now at the bottom of the stack in their original order.


	If s had stored these values instead:

	```
	bottom [7, 23, -7, 0, 22, -8, 4, 5] top
	```

	and we make the following call:

	```java
	shift(s, 3);
	```

	then s should store these values after the call:

	```
	bottom [0, 22, -8, 4, 5, -7, 23, 7] top
	```

	You are to use one queue as auxiliary storage to solve this problem. You may not use any other auxiliary data structures to solve this problem, although you can have as many simple variables as you like. You also may not solve the problem recursively. Your solution must run in O(n) time.

	Your method should throw an IllegalArgumentException if the parameter n is less than 0 or greater than the number of elements in the stack. In writing your method, assume that you are using the Stack class, Queue Interface, and Linked List class as discussed in lecture.

1. 	Write the code necessary to convert the following sequences of ListNode objects:

	```
	p -> [1] -> [2] /
	```

	Into this sequence of ListNode objects:

	```
	p -> [2] /
	q -> [1] /
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

1. 	Write the code necessary to convert the following sequences of  objects:

	```
	list -> [1] -> [2] -> [3] -> [4] /
	```

	Into this sequence of  objects:

	```
	list -> [4] -> [2] /
	list2 -> [3] -> [1] /
	```

	There may be more than one way to write the code, but you are NOT allowed to change any existing node's data field value. You also should not create new ListNode objects unless necessary to add new values to the chain, but you may create a single ListNode variable to refer to any existing node if you like.  If a variable does not appear in the "after" picture, it doesn't matter what value it has after the changes are made.

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