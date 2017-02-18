_CSE 143_
# Quiz
## Week 8

1. Binary Search Tree, 4 points. Draw a picture below of the binary search tree that would result from inserting the following words into an empty binary search tree in the following order: Ephraim, Ben, Dan, Frank, Caleb, Gideon, Adam.  Assume the search tree uses alphabetical ordering to compare words.

1. Binary Trees, 10 points. Write a method called printLevel that takes an integer n as a parameter and that prints the values at level n from left to right. By definition, the overall root is at level 1, it's children are at level 2, and so on. For example, if a variable t stores this tree:

	```
	              +----+
	              | 12 |
	              +----+
	            /        \
	     +----+            +----+
	     | 19 |            | 93 |
	     +----+            +----+
	    /      \                 \
	+----+      +----+            +----+
	| 11 |      | 14 |            | 15 |
	+----+      +----+            +----+
	```

	then the calla:

	```java
	t.printLevel(3);
	t.printLevel(5);
	```

	would produce the output:

	```
	nodes at level 3 = 11 14 15
	nodes at level 5 = 
	```

	Notice that if there are no values at the level (e.g., level 5), your method should produce no output after the equals sign. You must exactly reproduce the format of this output. Your method should throw an IllegalArgumentException if passed a value for level that is less than 1.

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

1. Collections Programming, 10 points. Write a method called acronyms that takes a set of word lists as a parameter and that returns a map whose keys are acronyms and whose values are the word lists that produce that acronym. Acronyms are formed from each list as described in problem 4. Recall that the list [laughing, out, loud] produces the acronym "LOL". The list [League, of, Legends] also produces the acronym "LOL". Suppose that a variable called lists stores this set of word lists:

	```java
	[[attention, deficit], [Star, Trek, Next, Generation],
		[laughing, out, loud], [International, Business, Machines],
		[League, of, Legends], [anno, domini], [art, director],
		[Computer, Science and, Engineering]]
	```

	Each element of this set is a list of values of type String. You may assume that each list is nonempty and that each string in a list is nonempty.

	Your method should construct a map whose keys are acronyms and whose values are sets of the word lists that produce that acronym. For example, the call acronyms(lists) should produce the following map:

	```java
	{AD=[[attention, deficit], [anno, domini], [art, director]],
			CSE=[[Computer, Science and, Engineering]],
			IBM=[[International, Business, Machines]],
			LOL=[[laughing, out, loud], [League, of, Legends]],
			STNG=[[Star, Trek, Next, Generation]]}
	```

	Notice that there are 5 unique acronyms produced by the 8 lists in the set. Each acronym maps to a set of the word lists for that acronym. Your method should not make copies of the word lists; the sets it constructs should store references to those lists. As in the example above, the keys of the map that you construct should be in sorted order. You may assume that a working version of acronymFor as described in problem 4 is available for you to use no matter what you wrote for problem 4. Your method is not allowed to change either the set passed as a parameter or the lists within the set.

1. Binary Trees, 20 points. Write a method called limitLeaves that takes an integer n as a parameter and that removes nodes from a tree to guarantee that all leaf nodes store values that are greater than n. For example, suppose a variable t stores a reference to the following tree:

	```java
	                   +----+
	                   | 13 |
	                   +----+
	                 /        \
	          +----+            +----+
	          | 18 |            | 10 |
	          +----+            +----+
	         /                 /      \
	    +----+           +----+        +----+
	    | 82 |           | 17 |        | 23 |
	    +----+           +----+        +----+
	   /      \                \             \
	+----+    +----+           +----+        +----+
	| 92 |    |  8 |           | 12 |        | 20 |
	+----+    +----+           +----+        +----+
	```

	And we make the following call:

	```java
	t.limitLeaves(20);
	```

	Then your method must guarantee that all leaf node values are greater than 20. So it must remove the leaves that store 8, 12, and 20. But notice that this creates a new leaf that stores 17 when its child is removed. This new leaf must also be removed. Thus, we end up with this tree:

	```java
	                   +----+
	                   | 13 |
	                   +----+
	                 /        \
	          +----+            +----+
	          | 18 |            | 10 |
	          +----+            +----+
	         /                        \
	    +----+                         +----+
	    | 82 |                         | 23 |
	    +----+                         +----+
	   /
	+----+
	| 92 |
	+----+
	```

	Notice that the nodes storing 13, 18, and 10 remain even though those values are not greater than 20 because they are branch nodes. Also notice that you might be required to remove nodes at many levels. For example, if the node storing 23 instead had stored the value 14, then we would have removed it as well, which would have led us to remove the node storing 10.

	Your method should remove the minimum number of nodes that satisfies the constraint that all leaf nodes store values greater than the given n.

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

	You are writing a method that will become part of the IntTree class. You may define private helper methods to solve this problem, but otherwise you may not assume that any particular methods are available. You are not allowed to change the data fields of the existing nodes in the tree (what we called "morphing" in assignments 7 and 8), you are not allowed to construct new nodes or additional data structures, and your solution must run in O(n) time where n is the number of nodes in the tree.

1. Linked Lists, 20 points. Write a method called bubble that performs one pass of the bubble sort algorithm on a list of integers, returning true if any changes were made and returning false otherwise. As Wikipedia describes, bubble sort "works by repeatedly stepping through the list to be sorted, comparing each pair of adjacent items and swapping them if they are in the wrong order.  The pass through the list is repeated until no swaps are needed, which indicates that the list is sorted."

	For example, suppose that a variable called list stores the following:

	```java
	[5, 1, 4, 2, 8]
	```

	There are four pairs of adjacent values to compare, which leads to the following changes:

	| Starting list | New list | Explanation |
	| :--- | :--- | :--- |
	| `[5, 1, 4, 2, 8]` | `[1, 5, 4, 2, 8]` | 1st pair is swapped |
	| `[1, 5, 4, 2, 8]` | `[1, 4, 5, 2, 8]` | 2nd pair is swapped |
	| `[1, 4, 5, 2, 8]` | `[1, 4, 2, 5, 8]` | 3rd pair is swapped |
	| `[1, 4, 2, 5, 8]` | `[1, 4, 2, 5, 8]` | no change |

	All of these changes should be made in the first pass (i.e., on a single call to bubble). Notice that the list is not sorted because this represents just one pass of the algorithm.  A second pass would swap the pair (4, 2), which would leave the list in sorted order. A third pass would not swap any values.

	Remember that your method is performing just one pass, but it should return true if it swapped something and should return false if no swaps were performed. Thus, a client can use your method to sort a list by saying:

	```java
	boolean sorted = false;
	while (!sorted) {
		sorted = !list.bubble();
	}
	```

	You are writing a public method for a linked list class defined as follows:

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

	You are writing a method that will become part of the LinkedIntList class. You may define private helper methods to solve this problem, but otherwise you may not assume that any particular methods are available. You are allowed to define your own variables of type ListNode, but you may not construct any new nodes, and you may not use any auxiliary data structure to solve this problem (no array, ArrayList, stack, queue, String, etc). You also may not change any data fields of the nodes. You MUST solve this problem by rearranging the links of the list.