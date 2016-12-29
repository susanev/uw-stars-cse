_CSE 143_
# Check-in Meeting
## Week 2

1. Write a method isPalindrome that takes a Queue of integers as a parameter and that returns whether or not the numbers in the queue represent a palindrome (true if they do, false otherwise).  A sequence of numbers is considered a palindrome if it is the same in reverse order.
   
  For example, suppose a Queue called q stores this sequence of values:

	```
	front [3, 8, 17, 9, 17, 8, 3] back
	```

	Then the following call:

	```java
	isPalindrome(q);
	```

	should return true because this sequence is the same in reverse order. If the list had instead stored these values:

	```
	front [3, 8, 17, 9, 4, 17, 8, 3] back
	```

	the call on isPalindrome would instead return false because this sequence is not the same in reverse order (the 9 and 4 in the middle don't match).

	The empty queue should be considered a palindrome. You may not make any assumptions about how many elements are in the queue and your method must restore the queue so that it stores the same sequence of values after the call as it did before.

	You are to use one stack as auxiliary storage to solve this problem. You may not use any other auxiliary data structures to solve this problem, although you can have as many simple variables as you like. You also may not solve the problem recursively.

	In writing your method, assume that you are using the Stack and Queue interfaces and the ArrayStack and LinkedQueue implementations discussed in lecture.

1. 	Write the code necessary to convert the following sequences of ListNode objects:

	```
	p -> [1] -> [2] -> [6] /
	q -> [3] -> [4] -> [5] /
	```

	Into this sequence of ListNode objects:

	```
	p -> [4] -> [2] -> [1] /
	q -> [3] -> [5] -> [6] /
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