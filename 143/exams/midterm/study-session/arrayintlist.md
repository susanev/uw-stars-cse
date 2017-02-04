_CSE 143_

# ArrayIntList
# Midterm Study Session

1. Write a method removeFront that takes an integer n as a parameter and that removes the first n values from a list of integers. For example, if a variable called list stores this sequence of values:

	```
	[8, 17, 9, 24, 42, 3, 8]
	```

	and the following call is made:

	```java
	list.removeFront(4);
	```

	then it should store the following values after the call:

	```
	[42, 3, 8]
	```

	Notice that the first four values in the list have been removed and the other values appear in the same order as in the original list.

	You are writing a method for the ArrayIntList class discussed in lecture (handout 3):

	```java
	public class ArrayIntList {
		private int[] elementData; // list of integers
		private int size;          // current # of elements in the list

		<methods>
	}
	```
	You are not to call any other ArrayIntList methods to solve this problem. Your method should throw an IllegalArgumentException if the parameter n is less than 0 or greater than the number of elements in the list. Your solution must run in O(n) time.

1. Write a method collapse that collapses a list of integers by replacing each successive pair of integers with the sum of the pair. For example, if a variable called list stores this sequence:

	```
	[7, 2, 8, 9, 4, 13, 7, 1, 9, 10]
	```

	and the following call is made:

	```java
	list.collapse();
	```

	The first pair should be collapsed into 9 (7 + 2), the second pair should be collapsed into 17 (8 + 9), the third pair should be collapsed into 17 (4 + 13) and so on to yield:

	```
	[9, 17, 17, 8, 19]
	```

	If the list stores an odd number of elements, the final element is not collapsed. For example, the sequence:

	```
	[1, 2, 3, 4, 5]
	```

	would collapse into:

	```
	[3, 7, 5]
	```

	You are writing a method for the ArrayIntList class discussed in lecture:

	```java
	public class ArrayIntList {
		private int[] elementData; // list of integers
		private int size;          // current # of elements in the list

		<methods>
	}
	```

	You are not to call any other ArrayIntList methods to solve this problem, you are not allowed to define any auxiliary data structures (no array, ArrayList, etc), and your solution must run in O(n) time where n is the length of the list to be collapsed.

1. Write a method longestSortedSequence that returns the length of the longest sorted sequence within a list of integers. For this problem sorted means non-decreasing. For example, if a variable called list stores the following sequence of values:

	```
	(1, 3, 5, 2, 9, 7, -3, 0, 42, 308, 17)
	```

	then the call:

	```java
	list.longestSortedSequence()
	```

	would return the value 4 because it is the length of the longest sorted sequence within this list (the sequence -3, 0, 42, 308). If the list is empty, your method should return 0. Notice that for a non-empty list the method will always return a value of at least 1 because any individual element constitutes a sorted sequence.

	You are writing a method for the IntList class discussed in lecture (handouts 3 and 5):

	```java
	public class IntList {
		private int[] elementData; // list of integers
		private int size;          // current # of elements in the list

		<methods>
	}
	```

	You are not to call any other IntList methods to solve this problem. You also may not use another data structure like a temporary array and your method must run in O(n) time where n is the size of the list.

1. Write a method mirror that doubles the size of a list of integers by appending the mirror image of the original sequence to the end of the list. The mirror image is the same sequence of values in reverse order. For example, if a variable called list stores this sequence of values:

	```
	[1, 3, 2, 7]
	```

	and we make the following call:

	```java
	list.mirror();
	```

	then it should store the following values after the call:

	```
	[1, 3, 2, 7, 7, 2, 3, 1]
	```

	Notice that it has been doubled in size by having the original sequence appearing in reverse order at the end of the list. You may not make assumptions about how many elements are in the list.

	You are writing a method for the ArrayIntList class discussed in lecture (handout 3):

	```java
	public class ArrayIntList {
		private int[] elementData; // list of integers
		private int size;          // current # of elements in the list

		<methods>
	}
	```

	You are not to call any other ArrayIntList methods to solve this problem. You may assume that the array has sufficient capacity to store the new sequence of values.

1. Write a method removeOddPositions that removes the values in odd-numbered positions (if any) from a list of integers. For example if a variable called list stores these values:

	```
	[8, 13, 17, 4, 9, 12, 98]
	```

	and the following call is made:

	```java
	list.removeOddPositions();
	```

	The list should store this sequence after the call:

	```
	[8, 17, 9, 98]
	```

	The method removed the values at odd positions (positions 1, 3, and 5), otherwise preserving the order of the remaining elements. Notice that it doesn't matter whether the value itself is odd or even but instead whether it appears in an odd position or even position.

	You are writing a method for the ArrayIntList class discussed in lecture:

	```java
	public class ArrayIntList {
		private int[] elementData; // list of integers
		private int size;          // current # of elements in the list

		<methods>
	}
	```

	You may not call any other methods of the ArrayIntList methods to solve this problem, you are not allowed to define any auxiliary data structures (no array, ArrayList, etc), and your solution must run in O(n) time.

1. Write a method isPairwiseSorted that returns whether or not a list of integers is pairwise sorted (true if it is, false otherwise). A list is considered pairwise sorted if each successive pair of numbers is in sorted (non-decreasing) order. For example, if a variable called list stores the following sequence of values:

	```
	[3, 8, 2, 5, 19, 24, -3, 0, 4, 4, 8, 205, 42]
	```

	then the following call:

	```java
	list.isPairwiseSorted();
	```

	should return the value true because the successive pairs of this list are all sorted: (3, 8), (2, 5), (19, 24), (-3, 0), (4, 4), (8, 205). Notice that the extra value 42 at the end had no effect on the result because it is not part of a pair.

	If the list had instead stored the following values:

	```
	[1, 9, 3, 17, 4, 28, -5, -3, 0, 42, 308, 409, 19, 17, 2, 4]
	```

	then the method should return the value false because the pair [19, 17] is not in sorted order. If a list is so short that it has no pairs, then it is considered to be pairwise sorted.

	You are writing a method for the IntList class discussed in lecture (handouts 3 and 5):

	```java
	public class IntList {
		private int[] elementData; // list of integers
		private int size;          // current # of elements in the list

		<methods>
	}
	```

	You are not to call any other IntList methods to solve this problem.

1. Write a method takeMax to add to the ArrayIntList class that takes another ArrayIntList as a parameter. The method updates this list such that, at each index, it stores the maximum of the values at that index in this list and the other list. For example, if two lists list1 and list2 store the following values:

	```
	ArrayIntList list1 --> [41, 2, 4, 17, -3, -1, 20]
	ArrayIntList list2 --> [6, 13, 4, 29, -4]
	```

	and the following call is made:

	```java
	list1.takeMax(list2);
	```

	then list2 should be unchanged and list1 should store the following sequence of values after the call:

	```
	list1 --> [41, 13, 4, 29, -3, -1, 20]
	```

	Note that for each index for which the value in list2 exceeded the value in list1, list1 now stores the value from list2. Also note that the size of list1 is larger, and any indices that appear in list1 but not in list2 are unchanged. If instead we made the call list2.takeMax(list1), then after the call, list2 would store the following sequence of values, adding to itself the extra elements from list1:

	```
	list2 --> [41, 13, 4, 29, -3, -1, 20]
	```

	You are writing a method for the ArrayIntList class discussed in lecture:

	```java
	public class ArrayIntList {
		private int[] elementData; // list of integers
		private int size;          // current # of elements in the list

		// post: ensures that the list has the given capacity; if not, 
		//       the capacity is increased to at least the value
		public void ensureCapacity(int capacity) {...}

		<other methods>
	}
	```

	You cannot assume that the list has sufficient capacity. If you need to add elements, you should first call the ensureCapacity method; you may not call any other ArrayIntList methods to solve this problem. You may not define any data structures (no array, ArrayList, etc). Your solution must run in O(n) time.