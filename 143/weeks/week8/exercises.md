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

1. Collections Programming, 10 points. Write a method called recordDate that records information about a date between two people. For each person, the map records an ordered list of people that person has dated. For example, the map might record these entries for two people

	```
	Michael => [Ashley, Samantha, Joshua, Brittany, Amanda, Amanda]
	Amanda  => [Michael, Daniel, Michael]
	```

	The dates are listed in reverse order. The list for Michael indicates that he most recently dated Ashley and before that Samantha and before that Joshua, and so on.  Notice that he has dated Amanda twice. The list for Amanda incidates that she most recently dated Michael and before that Daniel and before that Michael. All names are stored as string values.

	The method takes three parameters: the map, the name of the first person, and the name of the second person. It should record the date for each person and should return what date number this is (1 for a first date, 2 for a second date, and so on). Given the entries above, if we make this call:

	```java
	int n = recordDate(dates, "Michael", "Amanda");
	```

	The method would record the new date at the front of each list:

	```
	Michael => [Amanda, Ashley, Samantha, Joshua, Brittany, Amanda, Amanda]
	Amanda  => [Michael, Michael, Daniel, Michael]
	```

	The method would return the value 3 indicating that this is the third date for this pair of people.  When someone is first added to the map, you should construct a LinkedList object (we use LinkedList instead of ArrayList because it has fast insertion at the front of the list).