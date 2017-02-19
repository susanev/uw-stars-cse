_CSE 143_
# Check-in Meeting
## Week 8

1. Write a method trim that could be added to the IntTree class. The method accepts minimum and maximum integers as parameters and removes from the tree any elements that are not within that range, inclusive. For this method you should assume that your tree is a binary search tree (BST) and that its elements are in valid BST order. Your method should maintain the BST ordering property of the tree.

	For example, suppose a variable of type IntTree called tree stores the following elements:

	```
	                         +----+
	                         | 50 |
	                   _____ +----+ _____
	                  /                  \
	              +----+                   +----+
	              | 38 |                   | 90 |
	        _____ +----+               ___ +----+
	       /           \              /
	    +----+         +----+   +----+
	    | 14 |         | 42 |   | 54 |
	    +----+         +----+   +----+
	   /      \                      \
	+----+   +----+                  +----+
	|  8 |   | 20 |                  | 72 |
	+----+   +----+                  +----+
	              \                  /    \
	            +----+           +----+  +----+
	            | 26 |           | 61 |  | 83 |
	            +----+           +----+  +----+
	```

	The diagrams below show what the state of the tree would be if various trim calls were made. The calls shown are separate; it's not a chain of calls in a row. You may assume that the minimum is less than or equal to the maximum.

	```java
	tree.trim(25, 72);
	```

	```
	            +----+
	            | 50 |
	          _ +----+
	         /        \
	    +----+        +----+  
	    | 38 |        | 54 |  
	    +----+        +----+  
	    /    \            \  
	+----+  +----+       +----+
	| 26 |  | 42 |       | 72 |
	+----+  +----+       +----+
	                      /   
	                   +----+
	                   | 61 |
	                   +----+
	```

  ```java
  tree.trim(54, 80);
  ```
	```
	+----+  
	| 54 |  
	+----+  
	   \  
	   +----+
	   | 72 |
	   +----+
	   /   
	+----+   
	| 61 |   
	+----+
	```

	```java
	tree.trim(18, 42);
	```

	```
	      +----+     
	      | 38 |     
	    _ +----+
	   /         \     
	+----+      +----+
	| 20 |      | 42 |
	+----+      +----+
	    \              
	   +----+          
	   | 26 |          
	   +----+ 
	```    

	```java
	tree.trim(3, 7);
	```

	Hint: The BST ordering property is important for solving this problem. If a node's data value is too large or too small to fit within the range, this may also tell you something about whether that node's left or right subtree elements can be within the range. Taking advantage of such information makes it more feasible to remove the correct nodes.

	You may define private helper methods to solve this problem, but otherwise you may not call any other methods of the class nor create any data structures such as arrays, lists, etc.

	Assume that you are adding this method to the IntTree class as defined below:

	```java
	public class IntTree {
		private IntTreeNode overallRoot;
		...
	}
	```

1. Write a method completeToLevel that accepts an integer n as a parameter and that adds nodes to a tree so that the first n levels are complete. A level is complete if every possible node at that level is not null. We will use the convention that the overall root is at level 1, it's children are at level 2, and so on. You should preserve any existing nodes in the tree. Any new nodes added to the tree should have -1 as their data.

	For example, if a variable called tree refers to the tree below at left and you make the call of tree.completeToLevel(3);, the variable tree should store the tree below at right after the call.

	Before Call

	```
	            +----+
	            | 17 |
	            +----+
	           /      \
	          /        \
	      +----+      +----+
	      | 83 |      |  6 |
	      +----+      +----+
	     /                  \
	    /                    \
	+----+                  +----+
	| 19 |                  | 87 |
	+----+                  +----+
	      \                /
	       \              /
	      +----+      +----+
	      | 48 |      | 75 |
	      +----+      +----+
	```

	After Call

	```
	                  +----+
	                  | 17 |
	                _ +----+ _
	            _ /            \ _
	          /                    \
	      +----+                  +----+
	      | 83 |                  |  6 |
	      +----+                  +----+
	     /      \                /      \
	    /        \              /        \
	+----+      +----+      +----+      +----+
	| 19 |      | -1 |      | -1 |      | 87 |
	+----+      +----+      +----+      +----+
	      \                            /
	       \                          /
	      +----+                  +----+
	      | 48 |                  | 75 |
	      +----+                  +----+
	```

	In this case, the request was to fill in nodes as necessary to ensure that the first 3 levels are complete. There were two nodes missing at level 3, Notice that level 4 of this tree is not complete because the call requested that nodes be filled in to level 3 only.

	Keep in mind that your method might need to fill in several different levels. Your method should throw an IllegalArgumentException if passed a value for level that is less than 1.

	Assume that you are adding this method to the IntTree class as defined below:

	```java
	public class IntTree {
		private IntTreeNode overallRoot;
		...
	}
	```