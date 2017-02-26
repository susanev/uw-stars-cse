_CSE 143_
# Check-in Meeting
## Week 9

1. Write a method hasDuplicates for the LinkedIntList we discussed in class. This method returns true only if there is at least one element duplicated in the list. A list of 0 or 1 elements has no duplicates by definition.

	You are writing a method for the LinkedIntList class discussed in lecture:

	```java
	public class ListNode {
		public int data; // data stored in this node
		public ListNode next; // link to next node in the list

		<constructors>
	}

	public class LinkedIntList {
		private ListNode front;

		<methods>
	}
	```

	You may not call any other methods of the LinkedIntList class to solve this problem

	Examples:
	* For a list containing `[1, 2, 1]`, hasDuplicates returns `true`
	* For a list containing `[1, 2, 3]`, hasDuplicates returns `false`
	* For a list containing `[3, 2, 5, 4, 2]`, hasDuplicates returns `true`

1. Write a method addListAt for the LinkedIntList class. This method takes a ListNode, which is the head of another linked list, and a integer index.

	The method should modify the LinkedIntList so that the passed in list is inserted into the existing list at the index specified. If index is 0 it should be inserted at the head of the list. If index is 1 it should be inserted after the 1st element, etc. Your method should throw an IllegalArgumentException if the index is negative. Your method should throw an IllegalArgumentException if the index is greater than the length of the LinkedIntList.

	You should modify the existing ListNode objects and should not need to create any new ones or use any auxiliary structures. You should not call any other methods on the LinkedIntList object.

	Examples:
	* If a LinkedIntList containing `[7, 11, 13, 19]` has the list `[8, 20]` added to it at index 2, the original LinkedIntList will become `[7, 11, 8, 20, 13, 19]`
	* If a LinkedIntList containing `[8, 20]` has the list `[7, 44, -6]` added to it at index 0, the original LinkedIntList will become `[7, 44, -6, 8, 20]`
	* If a LinkedIntList containing `[1, 1]` has the list `[2, 2, 2]` added to it at index 2, the original LinkedIntList will become `[1, 1, 2, 2, 2]`

1. Write an IntTree method countPathsOfLength that takes one argument n, and returns the number of paths that have length exactly n. Recall that a path is a list of nodes starting at the root and ending at a leaf, and the length of a path is the number of nodes it has. You may assume that n is not zero.

	For example, if a variable t stores a reference to the following tree:

	```java
	     t.root
	        |
	        1
	     /     \
	   2         3
	 /   \      /  \
	8     4    9    6
	    /   \      /
	   5    10    7
	```

	A call to t.countPathsOfLength(6) should return 0; however, a call to t.countPathsOfLength(3) should return 2, because 1,2,8 and 1,3,9 are the only paths of length 3 in the tree.

	Implementation Restrictions
	* You may not call any other methods on the IntTree object (e.g., add, remove)
	* You may not construct new IntTreeNode objects
	* You may not use any other data structures such as arrays, lists, queues, etc
	* Your solution should run in O(n) time, where n is the number of elements in the tree

	```java
	public class IntTree {
		private class IntTreeNode {
			public final int data; // data stored in this node
			public IntTreeNode left; // reference to left subtree
			public IntTreeNode right; // reference to right subtree

			public IntTreeNode(int data) { ... }
			public IntTreeNode(int data, IntTreeNode left) { ... }
			public IntTreeNode(int data, IntTreeNode left, IntTreeNode right) { ... }
		}

		private IntTreeNode overallRoot;
	```
