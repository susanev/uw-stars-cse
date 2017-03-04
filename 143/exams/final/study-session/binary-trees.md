_CSE 143_

# Binary Trees
## Final Study Session

1. Write a method evenBranches that returns the number of branch nodes in a binary tree that contain even numbers. A branch node is one that has one or two children (i.e., not a leaf). For example, if a variable t stores a reference to the following tree:

	```
	                  +---+
	                  | 2 |
	                  +---+
	                 /     \
	               /         \
	         +---+             +---+
	         | 8 |             | 1 |
	         +---+             +---+
	        /                 /     \
	       /                 /       \
	    +---+             +---+     +---+
	    | 0 |             | 7 |     | 6 |
	    +---+             +---+     +---+
	                     /               \
	                    /                 \
	                 +---+               +---+
	                 | 4 |               | 9 |
	                 +---+               +---+
	```

	then the call t.evenBranches() should return 3 because there are three branch nodes with even values (2, 8 and 6). Notice that the leaf nodes with even values are not included (the nodes storing 0 and 4).

	Assume that you are writing a public method for a binary tree class defined as follows:

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

	You are writing a method that will become part of the IntTree class. You may define private helper methods to solve this problem, but otherwise you may not call any other methods of the class.

1. Write a method countMultiples that returns a count of the number of multiples of a particular value in a binary tree of integers. Given a number n, a value m is considered a multiple of n if it can be expressed as (k * n) for some integer k. For example, suppose that a variable t stores a reference to the following tree:

	```
	               +---+
	               | 6 |
	               +---+
	             /       \
	           /           \
	     +---+               +---+
	     | 2 |               | 9 |
	     +---+               +---+
	    /     \                   \
	   /       \                   \
	+---+     +---+               +---+
	| 5 |     | 3 |               | 4 |
	+---+     +---+               +---+
	         /     \              /    \
	        /       \            /      \
	    +---+     +---+      +---+     +---+
	    | 8 |     | 6 |      | 7 |     | 0 |
	    +---+     +---+      +---+     +---+
	```

	The table below shows various calls and the values returned.

	| Method call | Return value | Explanation |
	| :--- | :--- | :--- |
	| `t.countMultiples(2);` | `6` | six multiples of 2: 6, 2, 4, 8, 6, 0 |
	| `t.countMultiples(4);` | `3` | three multiples of 4: 4, 8, 0 |
	| `t.countMultiples(3);` | `5` | five multiples of 3: 6, 9, 3, 6, 0 |
	| `t.countMultiples(1);` | `10` | all ten numbers are multiples of 1 |

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

	You are writing a method that will become part of the IntTree class. You may define private helper methods to solve this problem, but otherwise you may not call any other methods of the class.

	Your method should throw an IllegalArgumentException if passed the value 0.

1. Write a method called pairsOfTwins that returns the number of pairs of twins in a binary tree of integers. A pair of twins occurs whenever two nodes have the same parent node and store the same value. For example, if the variable t refers to the following tree:

	```
	               +---+
	               | 5 |
	               +---+
	             /       \
	           /           \
	     +---+               +---+
	     | 1 |               | 1 |
	     +---+               +---+
	    /     \             /     \
	   /       \           /       \
	+---+     +---+     +---+     +---+
	| 2 |     | 2 |     | 6 |     | 1 |
	+---+     +---+     +---+     +---+
	         /     \              /    \
	        /       \            /      \
	    +---+     +---+      +---+     +---+
	    | 7 |     | 7 |      | 2 |     | 2 |
	    +---+     +---+      +---+     +---+
	```

	Then there are 4 pairs of twins (the pair of 1s near the top, the pair of 2s on the left, the pair of 7s on the bottom left, and the pair of 2s on the bottom right). So the call t.pairsOfTwins() would return 4. If there are no pairs of twins, then the method should return 0.

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

	You are writing a method that will become part of the IntTree class. Your method may not modify the structure of the tree or the values stored in the nodes. You may define private helper methods to solve this problem, but otherwise you may not call any other methods of the class.