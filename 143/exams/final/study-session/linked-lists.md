_CSE 143_

# Linked Lists
## Final Study Session

1. Write a method isSortedByN that takes an integer n as a parameter and that returns true if a list of integers is sorted in nondecreasing order when examined "by n" and that returns false otherwise. When examining a list by n, you pick any element of the list and consider the sublist formed by that element followed by the element that comes n later, followed by the element that comes 2n later, followed by the element that comes 3n later, and so on. For example, suppose that a variable list stores the following sequence of numbers:

	```
	[1, 3, 2, 5, 8, 7, 12, 7, 20]
	```

	This list would normally not be considered to be sorted, which means that list.isSortedByN(1) should return false. But when examining elements by 2, we get two sorted sublists:

	`[1, 2, 8, 12, 20]` and `[3, 5, 7, 7]`

	Thus, list.isSortedByN(2) should return true. Notice that duplicates are allowed in the sublists. The call list.isSortedByN(3) returns false because one of the resulting sublists is not sorted:

	`[1, 5, 12]`(sorted), `[3, 8, 7]`(NOT sorted), and `[2, 7, 20]`(sorted)

	By definition, an empty list and a list of one element are considered to be sorted. The method should return true whenever n is greater than or equal to the length of the list because in that case all of the resulting sublists would be of length 1. Your method should throw an IllegalArgumentException if passed an n that is less than or equal to 0.

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

	You may not call any other methods of the LinkedIntList class to solve this problem.

1. Write a method evenSum that returns the sum of the values in even indexes in a list of integers. Assume we are using 0-based indexing where the first value in the list has index 0, the second value has index 1 and so on. The values we are interested in are the ones with even indexes (the value at index 0, the value at index 2, the value at index 4, and so on). For example, if a variable called list stores the following sequence of values:

	```
	(1, 18, 2, 7, 39, 8, 40, 7)
	```

	then the call:

	```java
	list.evenSum();
	```

	should return the value 82 (1 + 2 + 39 + 40). Notice that what is important is the position of the numbers (index 0, index 2, index 4, etc), not whether the numbers themselves are even. If the list is empty, your method should return a sum of 0.

	Assume that we are using a linked list that stores integers, as discussed in lecture.

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

	You are writing a method that will become part of the LinkedIntList class. You may not call any other methods of the class to solve this problem.

1. Write a method rotate that moves the value at the front of a list of integers to the end of the list. For example, if a variable called list stores the following sequence of values:

	```
	[8, 23, 19, 7, 45, 98, 102, 4]
	```

	then the call:

	```java
	list.rotate();
	```

	should move the value 8 from the front of the list to the back of the list, yielding this sequence of values:

	```
	[23, 19, 7, 45, 98, 102, 4, 8]
	```

	The other values in the list should retain the same order as in the original list. If the method is called for a list of 0 or 1 elements, it should have no effect on the list.

	Assume that we are using a linked list that stores integers, as discussed in lecture (handout 9).

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

	You are writing a method that will become part of the LinkedIntList class. You may not call any other methods of the class to solve this problem. You are not allowed to construct any new nodes to solve this problem and you are not allowed to change any of the integer values stored in nodes. You must solve the problem by rearranging the links of the list.

1. Write a method lastIndexOf that takes an integer n as a parameter and that returns the index of the last occurrence of n in a list of integers and that returns -1 if n does not appear in the list. We are using the normal 0-based indexing scheme. For example, if a variable called list stores the following sequence of values:

	```
	(1, 18, 2, 7, 18, 39, 18, 40)
	```

	then the call:

	```java
	list.lastIndexOf(18);
	```

	should return 6 because that is the index of the last occurrence of 18 in the list. If the call had instead been:

	```java
	list.lastIndexOf(3);
	```

	The method would return -1 because 3 does not appear in the list.

	You may not make any assumptions about how many elements are in the list.

	Assume that we are using a linked list that stores integers, as discussed in lecture.

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

	You are writing a method that will become part of the LinkedIntList class. You may not call any other methods of the class to solve this problem.

1. Write a method compress that could be added to the LinkedIntList class, that accepts an integer n representing a "compression factor" and replaces every n elements with a single element whose data value is the sum of those n nodes. Suppose a LinkedIntList variable named list stores the following values:

	```
	[2, 4, 18, 1, 30, -4, 5, 58, 21, 13, 19, 27]
	```

	If you made the call of list.compress(2);, the list would replace every two elements with a single element (2 + 4 = 6, 18 + 1 = 19, 30 + (-4) = 26, ...), storing the following elements:

	```
	[6, 19, 26, 63, 34, 46]
	```
	
	If you then followed this with a second call of list.compress(3);, the list would replace every three elements with a single element (6 + 19 + 26 = 51, 63 + 34 + 46 = 143), storing the following elements:

	```
	[51, 143]
	```

	If the list's size is not an even multiple of n, whatever elements are left over at the end are compressed into one node. For example, the original list on this page contains 12 elements, so if you made a call on it of list.compress(5);, the list would compress every five elements, (2 + 4 + 18 + 1 + 30 = 55, -4 + 5 + 58 + 21 + 13 = 93), with the last two leftover elements compressing into a final third element (19 + 27 = 46), resulting in the following list:

	```
	[55, 93, 46]
	```

	If n is greater than or equal to the list size, the entire list compresses into a single element. If the list is empty, the result after the call is empty regardless of what factor n is passed. You may assume that the value passed for n is ≥ 1.

	For full credit, you may not create any new ListNode objects, though you may have as many ListNode variables as you like. For full credit, your solution must also run in O(n) time. Assume that you are adding this method to the LinkedIntList class below. You may not call any other methods of the class.

	```java
	public class LinkedIntList {
		private ListNode front;
		...
	```

1. Write a method interleave that combines elements from two lists in an alternating fashion to form a single list. For example, suppose the the variables list1 and list2 refer to lists that contain the following values:

	```
	list1: (1, 8, 3, 9)
	list2: (2, 12, 6, 14)
	```

	If the following call is made:

	```java
	list1.interleave(list2);
	```

	The method should move values from list2 into list1 so that list1 contains the combined list in alternating order (1st value of list1, followed by 1st value of list2, followed by 2nd value of list1, followed by 2nd value of list2, etc):

	```
	list1: (1, 2, 8, 12, 3, 6, 9, 14)
	list2: ()
	```

	Notice that list2 is empty after the call. If the call instead had been:

	```java
	list2.interleave(list1);
	```

	The method would have moved the elements of list1 into list2:

	```
	list1: ()
	list2: (2, 1, 12, 8, 6, 3, 14, 9)
	```

	One list might be longer than the other, in which case any extra values from the longer list should simply be appended at the end of the result. For example, given the following lists:

	```
	list1: (1, 8, 3, 9)
	list2: (82, 7, 4, 2, 1, 6, 5, 0, 18)
	```

	The call:

	```java
	list1.interleave(list2);
	```

	should produce the following result:

	```
	list1: (1, 82, 8, 7, 3, 4, 9, 2, 1, 6, 5, 0, 18)
	list2: ()
	```

	Notice that the first four values of the two lists have been interleaved and the excess values from the second list (1, 6, 5, 0, 18) have been included at the end of the result. If the call had instead been:

	```java
	list2.interleave(list1);
	```

	The result would be:

	```
	list1: ()
	list2: (82, 1, 7, 8, 4, 3, 2, 9, 1, 6, 5, 0, 18)
	```

	Again, the two lists have been interleaved with the excess values appearing at the end of the result.

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

	You are writing a method that will become part of the LinkedIntList class. You may not call any methods of the class to solve this problem, you may not construct any new nodes and you may not use any auxiliary data structure to solve this problem (no array, ArrayList, stack, queue, String, etc).