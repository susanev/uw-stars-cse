_CSE 143_
# Practice Final
## Week 9

1. Binary Tree Traversals. 6 points.

	Consider the following tree.

	```
	                   +---+
	                   | 0 |
	                   +---+
	                 /       \
	               /           \
	         +---+               +---+
	         | 3 |               | 5 |
	         +---+               +---+
	        /     \                   \
	       /       \                   \
	    +---+     +---+               +---+
	    | 4 |     | 2 |               | 9 |
	    +---+     +---+               +---+
	   /     \         \             /
	  /       \         \           /
	+---+     +---+     +---+     +---+
	| 7 |     | 6 |     | 1 |     | 8 |
	+---+     +---+     +---+     +---+
	```

	Fill in each of the traversals below:

	| Traversal | Output |
	| :--- | :--- |
	| Preorder traversal | |
	| Inorder traversal | |
	| Postorder traversal | |

1. Binary Search Tree. 4 points.

	Draw a picture below of the binary search tree that would result from inserting the following words into an empty binary search tree in the following order: Facebook, Accenture, Nintendo, Expedia, Amazon, Microsoft, Zillow, Google. Assume the search tree uses alphabetical ordering to compare words.

1. Collections Mystery. 5 points.

	Consider the following method:

	```java
	public List<Integer> mystery(int[][] data) {
		List<Integer> result = new LinkedList<Integer>();
		for (int i = 0; i < data.length; i++) {
			int sum = 0;
			for (int j = 0; j < data[i].length; j++) {
				sum = sum + j * data[i][j];
			}
			result.add(sum);
		}
		return result;
	}
	```

	In the left-hand column below are specific two-dimensional arrays. Indicate in the right-hand column what values would be stored in the list returned by method mystery if the array in the left-hand column is passed as a parameter to mystery.

	| Two-Dimensional Array	Contents of List | Returned |
	| :--- | :--- |
	| `[[1, 2, 3], [4, 5, 6]]` | |
	| `[[3, 4], [1, 2, 3], [], [5, 6]]` | |
	| `[[1, 2, 3], [4, 5, 6], [7, 8, 9]]` | |

1. Collections Programming. 5 points.

	Write a method called retainEvenLength that takes a set of strings as a parameter and that retains only the strings of even length from the set, removing all other strings. For example, if a set called s stores the following values:

	```
	[I, Sam, am, and, do, eggs, green, ham, like, not, them]
	```

	and the following call is made:

	```java
	retainEvenLength(s);
	```

	then s should store the following values after the call:

	```
	[am, do, eggs, like, them]
	```

	You may construct iterator objects, but you are not allowed to construct any structured objects to solve the problem (no set, list, stack, queue, string, etc).

1. Binary Trees. 10 points.

	Write a method called hasPathSum that takes an integer n as a parameter and that returns true if there is some nonempty path from the overall root of a tree to a node of the tree in which the sum of the data stored in the nodes adds up to n (returning false if no such path exists). For example if the variable t refers to the following tree:

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

1. Collections Programming. 10 points.

	Write a method called recordScore that records information about a student's homework assignment score. For each person, the map records an ordered list of homework assignment scores. For example, the map might record these entries for two people

	```
	Derek => [23, 27, 28, 27]
	Chloe => [28, 29, 26, 30, 27, 30]
	```

	The homework scores are listed in reverse order. The list for Derek indicates that his most recent homework score was 23 and before that 27 and before that 28, and so on. Notice that he has earned a 27 twice. The list for Chloe indicates that her most recent homework score was a 28 and before that 29 and before that 26, and so on. Notice that Derek has two less scores than Chloe does. All scores are ints.

	When you are recording the first score for someone, and they are first being added to the map, you should construct a LinkedList object (we use LinkedList instead of ArrayList because it has fast insertion at the front of the list).

	The method takes three parameters: the map, the name the person to record a score for, and the new value to record. It should record the value of the given score for that person. If the given value is less than 0 or greater than 30, it should throw an IllegalArgumentException. It should also calculate and return the percentage of possible homework points the person has earned after recording the new score. A homework assignment is worth 30 points possible. The percentage should be the total points the person has earned out of all possible points for the number of assignments they have completed, rounded to 1 decimal place.

	Given the entries above, if we make this call:

	```java
	double percent = recordScore(scores, "Derek", 29);
	```

	The method would record the new score at the front of Derek's list:

	```
	Derek => [29, 23, 27, 28, 27]
	Chloe => [28, 29, 26, 30, 27, 30]
	```

	The method would return the value 89.3 indicating that Derek has earned 89.3% of the homework points available to him so far. He has earned 134 total points for homework, after recording the new 29 score, out of a possible 150 (5 * 30) points. If a student has earned all possible homework points, the method would return 100.0, if the student has earned no homework points, the method would return 0.0.

1. Comparable Class. 20 points.

	Define a class called ClockTime that stores information about time of day using a standard clock. Each ClockTime object keeps track of hours, minutes, and a String to indicate "am" or "pm". It has the following public methods:

	| Method | Description |
	| :--- | :--- |
	| `ClockTime(hours, minutes, amPm)` | constructs a ClockTime with given hours, minutes and amPm setting |
	| `getHours()` | returns the hours |
	| `getMinutes()` | returns the minutes |
	| `getAmPm()` | returns the am/pm setting |
	| `toString()` | returns a String representation of the time |

	Assume that the values passed to your constructor are legal. In particular, hours will be between 1 and 12 inclusive, minutes will be between 0 and 59 inclusive, and the am/pm parameter will be either the String "am" or the String "pm". These values should be returned by the various "get" methods.

	The toString method should return a String composed of the hours followed by a colon followed by the minutes (2 digits) followed by a space followed by the am/pm String. For example, given these declarations:

	```java
	ClockTime time1 = new ClockTime(8, 31, "am");
	ClockTime time2 = new ClockTime(12, 7, "pm");
	```

	`time1.toString();` should return _8:31 am_ and `time2.toString();` should return _12:07 pm_. You must exactly reproduce the format of these examples.

	Your class should implement the Comparable<E> interface with earlier times consider _less_. The earliest time is 12:00 am and the latest time is 11:59 pm. In between the time increases as it would in a standard clock. Keep in mind that 12:59 am is followed by 1:00 am, that 11:59 am is followed by 12:00 pm, and that 12:59 pm is followed by 1:00 pm.

1. Binary Trees. 20 points.

	Write a method removeLeftLeaves that could be added to the IntTree class from lecture and section (see cheat sheet). The method should remove left leaves from a tree until it has no left leaves remaining. A left leaf is a leaf that is the left child of some other node.

	The following table shows the results of a call of your method on a particular tree:

	`IntTree tree = new IntTree();` ... `tree.removeLeftLeaves();`

	```
	             tree before call
	                    +---+
	                    | 0 |
	                    +---+
	                   /       \
	                 /           \
	          +---+               +---+
	          | 3 |               | 0 |
	          +---+               +---+
	         /     \             /     \
	        /       \           /       \
	     +---+     +---+     +---+     +---+
	     | 4 |     | 2 |     | 5 |     | 9 |
	     +---+     +---+     +---+     +---+
	    /         /         /         /     \
	   /         /         /         /       \
	+---+     +---+     +---+     +---+     +---+
	| 7 |     | 6 |     | 1 |     | 8 |     | 3 |
	+---+     +---+     +---+     +---+     +---+	                


	            tree after call
	                +---+
	                | 0 |
	                +---+
	              /       \
	            /           \
	      +---+               +---+
	      | 3 |               | 0 |
	      +---+               +---+
	           \                   \
	            \                   \
	           +---+               +---+
	           | 2 |               | 9 |
	           +---+               +---+
	                                    \
	                                     \
	                                    +---+
	                                    | 3 |
	                                    +---+
	```

	The left leaves of the original tree are the nodes that store 7, 6, 1, and 8. Notice that these have been removed by the call on removeLeftLeaves. Additionally, removing those four left leaves revealed left leaves storing 4 and 5. Those were also removed.

	Note that the overall root can’t be a left leaf since it has no parent.

	You may define private helper methods, but you may not call other methods of the class nor create data structures. You may not change the data fields of the existing nodes in the tree or construct additional nodes. Your solution must run in O(n) time where n is the number of nodes in the tree. For full credit, your solution must be recursive and properly utilize the x = change(x) pattern.

1. Linked Lists. 20 points.

	Write a method called increasingTriples that returns whether or not a list of integers is composed of a series of increasing triples. An increasing triple is a sequence of three integers that increase in value. Below are examples of increasing triples:

	```
	1, 2, 3              0, 42, 309               -8, 47, 2094
	```

	Below are examples of triples that are not increasing:

	```
	1, 2, 2              3, 18, 12                45, 30, 10
	```

	Your method should examine the first three values to see if they are an increasing triple, then the next three values, then the next three, and so on. If there is an extra value at the end, you can ignore it. If there is an extra pair at the end, your method should check that the pair is increasing. For example, if a variable list stored any of the following:

	```
	[1, 2, 3, 0, 42, 309, -8, 47, 2094]
	[1, 2, 3, 0, 42, 309, -8, 47, 2094, 14]
	[1, 2, 3, 0, 42, 309, -8, 47, 2094, 14, 20]
	```

	then the call list.increasingTriples() would return true. Your method should return true for a list with fewer than two elements.

	You are writing a method for the LinkedIntList class discussed in lecture:

	```java
	public class ListNode {
		public int data;       // data stored in this node
		public ListNode next;  // link to next node in the list

		<constructors>
	}

	public class LinkedIntList {
		private ListNode front;

		<methods>
	}
	```

	Your method should not modify the list contents and is required to run in O(n) time where n is the length of the list. You may not call any other methods of the LinkedIntList class and you may not construct any structured objects to solve this problem.