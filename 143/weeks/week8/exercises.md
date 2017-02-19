_CSE 143_
# Exercises
## Week 8

1. Binary Search Tree, 4 points. Draw a picture below of the binary search tree that would result from inserting the following words into an empty binary search tree in the following order: Karl, Chris, Simon, John, Zoe, Anton, Zach. Assume the search tree uses alphabetical ordering to compare words.

1. Binary Trees, 10 points. Write a method called hasPathSum that takes an integer n as a parameter and that returns true if there is some nonempty path from the overall root of a tree to a node of the tree in which the sum of the data stored in the nodes adds up to n (returning false if no such path exists). For example if the variable t refers to the following tree:

	```
	                       +----+
	                       |  5 |
	                       +----+
	                    /          \
	            +----+                +----+
	            |  1 |                | 21 |
	            +----+                +----+
	           /      \                     \
	      +----+       +----+               +----+
	      | -9 |       |  2 |               | 20 |
	      +----+       +----+               +----+
	     /      \                          /      \
	+----+      +----+                +----+      +----+
	|  3 |      | 30 |                | 13 |      |  4 |
	+----+      +----+                +----+      +----+
	```

	Below are various calls and an explanation for the value returned:

	```
	t.hasPathSum(8) returns true because of the path (5, 1, 2)
	t.hasPathSum(26) returns true because of the path (5, 21)
	t.hasPathSum(0) returns true because of the path (5, 1, -9, 3)
	t.hasPathSum(5) returns true because of the path (5)
	t.hasPathSum(1) returns false because no path with that sum exists
	```

	You are writing a public method for a binary tree class defined as follows:

	```java
	public class IntTreeNode {
		public int data;          // data stored in this node
		public IntTreeNode left;  // reference to left subtree
		public IntTreeNode right; // reference to right subtree

		<constructors>
	}

	public class IntTree {
		private IntTreeNode overallRoot;

		<methods>
	}
	```
	You are writing a method that will become part of the IntTree class. You may define private helper methods to solve this problem, but otherwise you may not call any other methods of the class. You may not construct any extra data structures to solve this problem.

1. Programming, 10 points. Write a recursive method called printSubsets that takes an array of integer values and that prints all subsets of the list. For example, if we have:

	```java
	int[] list = {1, 2, 3};
	```

	and we make the call:

	```java
	printSubsets(list);
	```

	The method should print the 8 subsets:

	```
	[]
	[3]
	[2]
	[2, 3]
	[1]
	[1, 3]
	[1, 2]
	[1, 2, 3]
	```

	Your method can print the subsets in any order, but you should preserve the order of the values from the list.  For example, the subsets of [42, 23] should be listed as:

	```
	[]
	[23]
	[42]
	[42, 23]
	```

	You may assume the list has no duplicate values. You are allowed to have your method construct exactly one collection of your choice from the collections we have studied (one array, list, set, map, stack, or queue), but you are otherwise not allowed to construct any other structured objects to solve this problem (note that only one structure is to be constructed in total for each call a client makes on your method).  Your method should not alter the contents of the array that is passed as a parameter and you may not use a while loop, for loop or do/while loop to solve this problem; you must use recursion.