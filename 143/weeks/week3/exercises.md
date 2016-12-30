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

1. Write a method countDuplicates that returns the number of duplicates in a sorted list. The list will be in sorted order, so all of the duplicates will be grouped together. For example, if a variable list stores the sequence of values below, the call of list.countDuplicates() should return 7 because there are 2 duplicates of 1, 1 duplicate of 3, 1 duplicate of 15, 2 duplicates of 23 and 1 duplicate of 40:

	```
	[1, 1, 1, 3, 3, 6, 9, 15, 15, 23, 23, 23, 40, 40]
	```

	Remember that you may assume that the list is in sorted order, so any duplicates would occur consecutively.

	Assume that you are adding this method to the LinkedIntList class as defined below:

	```java
	public class LinkedIntList {
	    private ListNode front;   // null for an empty list
	    ...
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