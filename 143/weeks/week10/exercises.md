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

	```
	* $40.0: This American Life
	* $40.0: University of Washington
	* $600.75: University of Washington
	$30.0: Snap Judgment
	$99.99: Microphone Check
	```

1. Write a method construct that could be added to the IntTree class from lecture and section. The method accepts a sorted array of integers as a parameter and constructs a balanced binary search tree containing those integers. The tree should be constructed so that for every node, either the left/right subtrees have the same number of nodes, or the left subtree has one more node than the right.

	For example, if you have an IntTree variable called t and an array called a storing values [1, 2, 3, 4, 5, 6, 7], and call of t.construct(a); is made, t should store the tree below.

	```
	            +---+
	            | 4 |
	            +---+
	           /     \
	          /       \
	      +---+        +---+
	      | 2 |        | 6 |
	      +---+        +---+
	      /   \        /   \
	     /     \      /     \
	  +---+  +---+  +---+  +---+
	  | 1 |  | 3 |  | 5 |  | 7 |
	  +---+  +---+  +---+  +---+
	```


	If the array stores [3, 8, 19, 27, 34, 42, 49, 53, 67, 74], the tree below is constructed.

	```
		             +----+
		             | 42 |
		             +----+
		            /      \
		           /        \
		      +----+        +----+
		      | 19 |        | 67 |
		      +----+        +----+
		      /    \         /   \
		     /      \       /     \
		  +----+  +----+ +----+  +----+
		  |  8 |  | 34 | | 53 |  | 74 |
		  +----+  +----+ +----+  +----+
		  /      /       /
		 /      /       /
	+----+  +----+  +----+
	| 3  |  | 27 |  | 49 |
	+----+  +----+  +----+
	```

	Notice that when it is not possible to have left and right subtrees of equal size, the extra value always ends up in the left subtree, as in the overall tree which has 5 nodes in the left subtree and 4 in the right.

	The new tree should replace any old tree. For full credit, your solution must run in O(N) time, where N is the number of elements in the array. You may assume that the values in the array appear in sorted order.

	You may define private helper methods to solve this problem, but otherwise you may not call any other methods of the class nor create any data structures such as arrays, lists, etc. You also may not alter the array that you are passed. 

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
