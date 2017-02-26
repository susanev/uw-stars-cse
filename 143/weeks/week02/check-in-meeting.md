_CSE 143_
# Check-in Meeting
## Week 2

1. Write a method isConsecutive that takes a stack of integers as a parameter and that returns whether or not the stack contains a sequence of consecutive integers starting from the bottom of the stack (returning true if it does, returning false if it does not). Consecutive integers are integers that come one after the other, as in 5, 6, 7, 8, 9, etc. So if a stack s stores the following values:

	```
	bottom [3, 4, 5, 6, 7, 8, 9, 10] top
	```

	Then the call of isConsecutive(s) should return true. If the stack had instead contained this set of values:

	```
	bottom [3, 4, 5, 6, 7, 8, 9, 10, 12] top
	```

	Then the call should return false because the numbers 10 and 12 are not consecutive. Notice that we look at the numbers starting at the bottom of the stack. The following sequence of values would be consecutive except for the fact that it appears in reverse order, so the method would return false:

	```
	bottom [3, 2, 1] top
	```

	Your method must restore the stack so that it stores the same sequence of values after the call as it did before. Any stack with fewer than two values should be considered to be a list of consecutive integers. You may use one queue as auxiliary storage to solve this problem.

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