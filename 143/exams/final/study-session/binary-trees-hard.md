_CSE 143_

# Binary Trees Hard
## Final Study Session

1. Write a method called limitPathSum that removes nodes from a binary tree of integers to guarantee that the sum of the values on any path from the root to a node does not exceed some maximum value. For example, suppose that a variable t stores a reference to the following tree:

	```
				   +----+
				   | 29 |
				   +----+
				/           \
			+----+                +----+
			| 17 |                | 15 |
			+----+                +----+
		   /      \              /      \
		  +----+      +----+    +----+      +----+
		  | -7 |      | 37 |    |  4 |      | 14 |
		  +----+      +----+    +----+      +----+
		 /      \           \              /      \
	+----+      +----+      +----+    +----+      +----+
	| 11 |      | 12 |      | 16 |    | -9 |      | 19 |
	+----+      +----+      +----+    +----+      +----+
	```

	Then the call:

	```java
	t.limitPathSum(50);
	```

	will remove nodes so as to guarantee that no path from the root to a node has a sum that is greater than 50. This will require removing the node with 12 in it because the sum of the values from the root to that node is greater than 50 (29 + 17 + -7 + 12, which is 51). Similarly, we have to remove the node with 37 in it because its sum is too high (29 + 17 + 37, which is 83). Whenever you remove a node, you remove anything under it as well, so removing the node with 37 also removes the node with 16 in it. We also remove the node with 14 and everything under it because its sum is too high (29 + 15 + 14, which is 58). Thus, we end up with:

	```
	                       +----+
	                       | 29 |
	                       +----+
	                    /          \
	            +----+                +----+
	            | 17 |                | 15 |
	            +----+                +----+
	           /                     /
	      +----+                +----+
	      | -7 |                |  4 |
	      +----+                +----+
	     /
	+----+
	| 11 |
	+----+
	```

	The method would be forced to remove all nodes if the data stored at the overall root is greater than the given maximum.

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

	You are writing a method that will become part of the IntTree class. You may define private helper methods to solve this problem, but otherwise you may not call any other methods of the class. You may not construct any new nodes and you may not use any auxiliary data structure to solve this problem (no array, ArrayList, stack, queue, String, etc).

1. Write a method tighten that eliminates branch nodes that have only one child from a binary tree of integers. For example, if a variable called t stores a reference to the following tree:


	```
	                       +----+
	                       | 12 |
	                       +----+
	                     /        \
	                   /            \
	            +----+                +----+
	            | 28 |                | 19 |
	            +----+                +----+
	           /                     /
	          /                     /
	      +----+                +----+
	      | 94 |                | 32 |
	      +----+                +----+
	     /      \                     \
	    /        \                     \
	+----+      +----+                +----+
	| 65 |      | -8 |                | 72 |
	+----+      +----+                +----+
	                  \              /      \
	                   \            /        \
	                  +----+    +----+      +----+
	                  | 10 |    | 42 |      | 50 |
	                  +----+    +----+      +----+
	```
	
	then the call:

	```java
	t.tighten();
	```

	should leave t storing the following tree:

	```
	                 +----+
	                 | 12 |
	                 +----+
	               /        \
	             /            \
	      +----+                +----+
	      | 94 |                | 72 |
	      +----+                +----+
	     /      \              /      \
	    /        \            /        \
	+----+      +----+    +----+      +----+
	| 65 |      | 10 |    | 42 |      | 50 |
	+----+      +----+    +----+      +----+
	```

	Notice that the nodes that stored the values 28, 19, 32, and -8 have all been eliminated from the tree because each had one child. When a node is removed, it is replaced by its child. Notice that this can lead to multiple replacements because the child might itself be replaced (as in the case of 19 which is replaced by its child 32 which is replaced by its child 72).

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

	You are writing a method that will become part of the IntTree class. You may define private helper methods to solve this problem, but otherwise you may not call any other methods of the class. You may not construct any new nodes and you may not use any auxiliary data structure to solve this problem (no array, ArrayList, stack, queue, String, etc).

1. Write a method combineWith that constructs a binary tree of integers by combining two other trees. The combined tree should have each of the nodes that appears in either of the two trees. The nodes of the new tree should store an integer indicating which of the original trees had a node at that position (1 if just the first tree had the node, 2 if just the second tree had the node, 3 if both trees had the node). Consider, for example, the following trees.

	```

	            +---+               |                  +---+
	       t1-> | 9 |               |             t2-> | 0 |
	            +---+               |                  +---+
	           /     \              |                 /     \
	          /       \             |                /       \
	      +---+       +---+         |            +---+       +---+
	      | 6 |       | 14|         |            | -3|       | 8 |
	      +---+       +---+         |            +---+       +---+
	     /     \           \        |           /           /     \
	    /       \           \       |          /           /       \
	+---+       +---+      +---+    |      +---+        +---+     +---+
	| 9 |       | 2 |      | 11|    |      | 8 |        | 5 |     | 6 |
	+---+       +---+      +---+    |      +---+        +---+     +---+
	           /                    |                        \
	          /                     |                         \
	      +---+                     |                         +---+
	      | 4 |                     |                         | 1 |
	      +---+                     |                         +---+
	```

	Suppose the following call is made:

	```java
	IntTree t3 = t1.combineWith(t2);
	```

	The variable t3 will refer to the following tree:

	```
	                +---+
	           t3-> | 3 |
	                +---+
	              /        \
	            /            \
	      +---+               +---+
	      | 3 |               | 3 |
	      +---+               +---+
	     /     \             /     \
	    /       \           /       \ 
	+---+       +---+   +---+       +---+
	| 3 |       | 1 |   | 2 |       | 3 |
	+---+       +---+   +---+       +---+
	           /             \
	          /               \
	      +---+               +---+
	      | 1 |               | 2 |
	      +---+               +---+
	```

	Notice that the two nodes in t1 that have no corresponding nodes in t2 (the nodes storing 2 and 4) store the value 1 in the newly constructed tree while the two nodes in t2 that have no corresponding nodes in t1 (the nodes storing 5 and 1) store the value 2 in the newly constructed tree. All other nodes store the value 3 to indicate that they appeared in both of the original trees.

	You are writing a public method for a binary tree class defined as follows:

	```java
	public class IntTreeNode {
		public int data;          // data stored in this node
		public IntTreeNode left;  // reference to left subtree
		public IntTreeNode right; // reference to right subtree

		// post: constructs a leaf node with given data
		public IntTreeNode(int data) {
			this(data, null, null);
		}

		// post: constructs a branch node with the given data and links
		public IntTreeNode(int data, IntTreeNode left, IntTreeNode right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}

	public class IntTree {
		private IntTreeNode overallRoot;

		// post: constructs an empty tree
		public IntTree() {
			overallRoot = null;
		}

		<other methods>
	}
	```

	You are writing a method that will become part of the IntTree class. You may define private helper methods to solve this problem, but otherwise you may not call any other methods of the class other than the constructor. You will need to construct IntTreeNode objects to construct the new tree, but you should not change either of the two original trees.

1. Write a method called stretch that stretches each node that has only one child in a binary tree of integers. More specifically, each node that has a single child should be replaced by a new node storing the data 1 and with the old node as a child in the same direction as the original node's child. For example, suppose a variable t stores a reference to the following tree:

	```
	                       +----+
	                       | 13 |
	                       +----+
	                     /        \
	                   /            \
	            +----+                +----+
	            | 48 |                | 17 |
	            +----+                +----+
	           /                            \
	          /                              \
	      +----+                            +----+
	      | 82 |                            | 23 |
	      +----+                            +----+
	     /      \
	    /        \
	+----+      +----+
	| 65 |      | 10 |
	+----+      +----+
	```

	There are two nodes in this tree that have a single child: the nodes storing 48 and 17. Each of those nodes is replaced in the tree with a new node storing the value 1 and with the original node as a child in the same direction as its only child. The node storing 48 has a left child, so it appears to the left of a new node storing 1. The node 17 has a right child, so it appears to the right of a new node storing 1. So after the call:

	```java
	t.stretch();
	```

	The tree should look like this:

	```
	                               +----+
	                               | 13 |
	                               +----+
	                             /        \
	                           /            \
	                    +----+                +----+
	                    |  1 |                |  1 |
	                    +----+                +----+
	                   /                            \
	                  /                              \
	            +----+                              +----+
	            | 48 |                              | 17 |
	            +----+                              +----+
	           /                                          \
	          /                                            \
	      +----+                                          +----+
	      | 82 |                                          | 23 |
	      +----+                                          +----+
	     /      \
	    /        \
	+----+      +----+
	| 65 |      | 10 |
	+----+      +----+
	```

	This stretching process should be performed on every node in the original tree that has a single child.

	You are writing a public method for a binary tree class defined as follows:

	```java
	public class IntTreeNode {
		public int data;          // data stored in this node
		public IntTreeNode left;  // reference to left subtree
		public IntTreeNode right; // reference to right subtree

		// post: constructs an IntTreeNode with the given data and links
		public IntTreeNode(int data, IntTreeNode left, IntTreeNode right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}

	public class IntTree {
		private IntTreeNode overallRoot;

		<methods>
	}
	```

	You are writing a method that will become part of the IntTree class. You may define private helper methods to solve this problem, but otherwise you may not assume that any particular methods are available. You are NOT to change the data field of the existing nodes in the tree. You will, however, construct new nodes to be inserted into the tree and you will change the links of the tree to include these new nodes.

1. Write a method flip that could be added to the IntTree class from lecture and section. The method reverses the tree about its left/right axis so that any node that used to be its parent's left child will become its parent's right child and vice versa. The table below shows the result of calling this method on an IntTree variable tree.

	```java
	IntTree tree = new IntTree();
	...
	tree.flip();
	```

	```
	                Before Call                                     After Call
	                  +----+                                          +----+
	                  | 67 |                                          | 67 |
	                  +----+                                          +----+
	               /          \                                    /          \
	            /                \                              /                \
	       +----+                +----+                    +----+                +----+
	       | 80 |                | 52 |                    | 52 |                | 80 |
	       +----+                +----+                    +----+                +----+
	      /      \              /                                \              /      \
	     /        \            /                                  \            /        \
	 +----+     +----+      +----+                              +----+     +----+      +----+
	 | 16 |     | 21 |      | 99 |                              | 99 |     | 21 |      | 16 |
	 +----+     +----+      +----+                              +----+     +----+      +----+
	             /                                                              \
	            /                                                                \
	         +----+                                                            +----+
	         | 45 |                                                            | 45 |
	         +----+                                                            +----+
	```

	If a tree has no nodes or is a leaf, it should not be affected by a call to your method.

	You may define private helper methods to solve this problem, but otherwise you may not call any other methods of the tree class nor create any data structures such as arrays, lists, etc. You should not change the data of any nodes.

1. Write a method swapChildrenAtLevel to be added to the IntTree class from class (see cheat sheet). Your method should accept an integer n as a parameter and swap the left and right children of all nodes at level n. In other words, after your method is run, any node at level n + 1 that used to be its parent's left child should now be its parent's right child and vice versa. For this problem, the overall root of a tree is defined to be at level 1, its children are at level 2, etc. The table below shows the result of calling this method on an IntTree variable tree.

	```java
	IntTree tree = new IntTree();
	...
	tree.swapChildrenAtLevel(2);
	```

	```
	Level                       Before Call                             After Call
	                             +----+                                   +----+
	1                            | 42 |                                   | 42 |
	                             +----+                                   +----+
	                           /        \                               /        \
	                         /            \                           /             \
	                   +----+             +----+                  +----+            +----+
	2                  | 19 |             | 65 |                  | 19 |            | 65 |
	                   +----+             +----+                  +----+            +----+
	                  /      \           /                       /      \                 \
	                 /        \         /                       /        \                 \
	            +----+      +----+   +----+                +----+      +----+            +----+
	3           | 54 |      | 32 |   | 23 |                | 32 |      | 54 |            | 23 |
	            +----+      +----+   +----+                +----+      +----+            +----+
	                         /                                          /
	                        /                                          /
	                     +----+                                     +----+
	4                    | 12 |                                     | 12 |
	                     +----+                                     +----+
	```

	If n is 0 or less than 0, your method should throw an IllegalArgumentException. If the tree is empty or does not have any nodes at the given level or deeper, it should not be affected by a call to your method.

	For efficiency, your method should not traverse any parts of the tree that it does not need to traverse. Specifically, you should not access any nodes lower than level n + 1, because there is nothing there that would be changed.

	You may define private helper methods to solve this problem, but otherwise you may not call any other methods of the tree class nor create any data structures such as arrays, lists, etc. You should not construct any new node objects or change the data of any nodes. For full credit, your solution must be recursive.
