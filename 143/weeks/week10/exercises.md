_CSE 143_
# Exercises
## Week 10

1. Define a class Donation that represents donations made to organizations. Each Donation object keeps track of an amount, the organization the donation was made to and a boolean to indicate whether or not the donation was tax-deductible. Your class must have the following public methods:

	| Member | Description |
	| :--- | :--- |
	| `public Donation(organization, amount, isDeductible)` | constructs a donation object with the given organization, amount and tax-deductible status |
	| `public String toString()` | returns a String representation of the donation |

	Your constructor should throw an IllegalArgumentException if the amount passed to it is negative or 0.

	The toString method returns a String composed of a dollar sign ($), followed by the amount donated, followed by a colon and the name of the organization. If the donation is tax-deductible, an asterisk (*) is added to the beginning of the String. You must exactly reproduce the format of the examples given below.

	Make Donation objects comparable to each other using the Comparable<E> interface. Donation objects that are tax-deductible are considered "less" than donations that are not tax-deductible. In other words, all tax-deductible donations go before donations that are not tax-deductible. Then, they are sorted by amount in ascending order, breaking ties by organization in ascending alphabetical order. For example, if the following objects are declared:

	```java
	Donation uw1 = new Donation("University of Washington", 600.75, true);
	Donation uw2 = new Donation("University of Washington", 40, true);
	Donation sj = new Donation("Snap Judgment", 30, false);
	Donation tal = new Donation("This American Life", 40, true);
	Donation mc = new Donation("Microphone Check", 99.99, false);
	```

	Printing them in sorted order would result in the following output:

	````
	* $40.0: This American Life
	* $40.0: University of Washington
	* $600.75: University of Washington
	$30.0: Snap Judgment
	$99.99: Microphone Check
	```

1. Write a method called double that creates two new nodes for each node in a binary tree of integers. Specifically, each node in the original tree will be given new left and right child nodes that each contain a value twice that of its parent. The left child of the original node will be made the left child of the new left child and the right child of the original node will be made the right child of the new right child. Only nodes from the original tree will be modified in this manner, do not continue modifying new nodes. For example, suppose a variable t stores a reference to the following tree:

	```
	           +----+
	           |  2 |
	           +----+
	         /        \
	       /            \
	+----+               +----+
	| -6 |               |  7 |
	+----+               +----+
	      \                  
	       \                 
	      +----+             
	      | 23 |             
	      +----+ 
	```            

	After a call to double:

	```java
	t.double();
	```

	The new tree should look like this:

	```
	                         +----+
	                         |  2 |
	                         +----+
	                       /        \
	                     /            \
	              +----+                +----+
	              |  4 |                |  4 |
	              +----+                +----+
	             /                            \
	            /                              \
	      +----+                              +----+
	      | -6 |                              |  7 |
	      +----+                              +----+
	     /      \                            /      \             
	    /        \                          /        \     
	+----+      +----+                  +----+      +----+ 
	|-12 |      |-12 |                  | 14 |      | 14 | 
	+----+      +----+                  +----+      +----+ 
	                  \      
	                   \
	                 +----+
	                 | 23 |
	                 +----+
	                /      \      
	               /        \     
	            +----+     +----+ 
	            | 46 |     | 46 | 
	            +----+     +----+ 
	```

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

1. Write a method takeSmallerFrom that compares two lists of integers, making sure that the first list has smaller values in corresponding positions. For example, suppose the the variables list1 and list2 refer to lists that contain the following values:

	```
	list1: (3, 16, 7, 23)
	list2: (2, 12, 6, 54)
	```

	If the following call is made:

	```java
	list1.takeSmallerFrom(list2);
	```

	the method will compare values in corresponding positions and move the smaller values to list1. It will find that among the first pair, 2 is smaller than 3, so it needs to move. In the second pair, 12 is smaller than 16, so it needs to move. In the third pair, 6 is smaller than 7, so it needs to move. In the fourth pair, 54 is not smaller than 23, so those values can stay where they are. Thus, after the call, the lists should store these values:

	```
	list1: (2, 12, 6, 23)
	list2: (3, 16, 7, 54)
	```

	One list might be longer than the other, in which case those values should stay at the end of their list. For example, for these lists:

	```
	list1: (2, 4, 6, 8, 10, 12)
	list2: (1, 3, 6, 9)
	```

	the call:

	```java
	list1.takeSmallerFrom(list2);
	```

	should leave the lists with these values:

	```
	list1: (1, 3, 6, 8, 10, 12)
	list2: (2, 4, 6, 9)
	```

	Assume that you are using a linked list that stores integers, as discussed in lecture.

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

	You are writing a method that will become part of the LinkedIntList class. You may not call any methods of the class to solve this problem, you may not construct any new nodes and you may not use any auxiliary data structure to solve this problem (no array, ArrayList, stack, queue, String, etc). You also may not change any data fields of the nodes. You MUST solve this problem by rearranging the links of the two lists.