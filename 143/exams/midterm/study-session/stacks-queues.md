_CSE 143_

# Stacks and Queues
## Midterm Study Session

1. Write a method rotateBy that accepts a stack of integers and an integer n as parameters and that rotates the elements in the stack by n positions. Rotating the stack by a single position entails moving the element at the bottom of the stack to the top of the stack. To rotate by n positions, this process repeats n times.

	For example, given the following stack s:

	```
	bottom [1, 2, 3, 4, 5, 6, 7, 8] top
	```

	The call rotateBy(s, 3) moves the bottom 3 values to the top of the stack and leaves the other values in their original order:

	```
	bottom [4, 5, 6, 7, 8, 1, 2, 3] top
	```

	Notice that the value that was at the bottom of the stack is now third from the top, the value that was second from the bottom is now second from the top and the value that was third from the bottom is now at the top of the stack.

	You may assume that n is non-negative and no bigger than the stack size. You may assume that the stack is not null.

	You may use one queue or one stack (but not both) as auxiliary storage. You may not use other structures (arrays, lists, etc.), but you can have as many simple variables as you like.

	Use the Queue interface and Stack/LinkedList classes discussed in class.

	Use stacks/queues in stack/queue-like ways only. Do not use index-based methods such as get, search, or set, or for-each loops or iterators. You may call add, remove, push, pop, isEmpty, and size.

	Your solution should run in O(N) time, where N is the number of elements of the stack.

1. Write a method called rearrangeDuplicates that takes a sorted queue of integers as a parameter and that moves any duplicate values to the end of the queue preserving the relative order of the values. You should assume that the queue you are passed as a parameter has been sorted in nondecreasing order. As a result, any duplicates will be grouped together. Suppose, for example, that a variable q stores these values:

	```
	front [-10, -5, -5, -5, 3, 3, 3, 18, 19, 23, 23, 23, 23, 405] back
	```

	This sequence has duplicates of -5, 3, and 23. If we make the call: `rearrangeDuplicates(q);` then the duplicates are moved to the end of the queue:

	```
	front [-10, -5, 3, 18, 19, 23, 405, -5, -5, 3, 3, 23, 23, 23] back
	        ^                       ^    ^                    ^
	        |                       |    |                    |
	        +-----unique values-----+    +-----duplicates-----+
	```

	Notice that the new sequence contains the unique values from the original sequence followed by the duplicates. Also notice that the two sublists are still in their original order.

	You are to use one stack as auxiliary storage to solve this problem. You may not use any other auxiliary data structures to solve this problem, although you can have as many simple variables as you like. You also may not solve the problem recursively. Your solution must run in O(n) time where n is the size of the queue. Use the Stack and Queue structures described in the cheat sheet and obey the restrictions described there (recall that you can't use the peek method or a foreach loop or iterator).

1. Write a method pushNumTimes that takes a Queue q as an argument and returns a Stack. Assume that q is storing Integer objects. Each integer value i at position n (where the object at the front of the queue has position 1) in the queue will be replaced by an Integer object with an integer value of (i * n) on the stack. The contents of the queue do not have to be preserved.

	For illustration purposes, let a queue’s contents be represented as a list of numbers, where the leftmost number represents the front of the queue; let a stack’s contents be represented as a list of numbers where the leftmost number represents the top of the stack. Suppose q initially contained [6, 4, 5, 3], then the stack returned from a call to pushNumTimes(q) will have [6, 8, 15, 12].

	```
	If q initially contained: 	6	4	5	3

	Then the returned stack would contain:
	6
	8
	15
	12
	```

1. Write a method hasAlternatingParity that accepts a stack of integers as a parameter and returns true if the elements in the stack have alternating parity (odd or evenness), and false otherwise. That is, each element in the stack must have a different parity from the elements surrounding it. For example, passing the following stack should return true because each consecutive number has an alternating parity in the form [even, odd, even, odd, …]

	```
	bottom [2, 5, 6, 3, 14, 13, 22] top
	```

	The call on hasAlternatingParity with the following stack will also return true because each consecutive number has an alternating parity in the form of [odd, even, odd, even … ]

	```
	bottom [15, 12, 15, 6, 5] top
	```

	The call on hasAlternatingParity with the following stack will return false because two consecutive numbers have the same parity (two odds in a row, see bold)

	```
	bottom [15, 7, 12, 5, 4] top
	```

	An empty or one-element stack is considered to have alternating parity, and your method should return true. When your method returns, the stack should be in the same state as when it was passed in. In other words, if your method modifies the stack, you must restore it before returning.

	You may assume the stack being passed in as a parameter is not null, and contains no negative values. There is additional workspace on the next page.

	You may use one queue as auxiliary storage. You may not use other structures (arrays, lists, etc.), but you can have as many simple variables as you like. Use the Queue interface and Stack/LinkedList classes discussed in class. Use stacks/queues in stack/queue-like ways only. You may only call add, remove, push, pop, isEmpty, and size. Do not use index-based methods such as get, or set, or for-each loops or iterators. Your solution should run in O(N) time, where N is the number of elements of the stack.

1. Write a method reverseFirstK that accepts an integer k and a queue of integers as parameters and reverses the order of the first k elements of the queue, leaving the other elements in the same relative order. For example, suppose a variable q stores the following elements:

	```
	front [10, 20, 30, 40, 50, 60, 70, 80, 90] back
	```

	The call of reverseFirstK(4, q); should change the queue to store the following elements in this order:

	```
	front [40, 30, 20, 10, 50, 60, 70, 80, 90] back
	```

	If k is 0 or negative, no change should be made to the queue. If the queue passed is null or does not contain at least k elements, your method should throw an IllegalArgumentException.

	You may use one queue or stack (but not both) as auxiliary storage. You may not use other structures (arrays, lists, etc.), but you can have as many simple variables as you like. Use the Queue interface and Stack/LinkedList classes discussed in lecture. Use stacks/queues in stack/queue-like ways only.  Do not call index-based methods such as get, search, or set (or for-each) on a stack/queue.  You may call only add, remove, push, pop, isEmpty, and size.

1. Write a method called maxToTop that takes a stack of integers as a parameter. You can assume that the stack does not contain any duplicates. The method should move the largest value in the stack to the top of the stack, leaving all other values in their original order. For example, suppose that a variable called s stores the following sequence of values:

	```
	bottom [7, 5, 1, 42, 6, -37, 8, 9, 21, 11, 12] top
	```

	and we make the following call:

	```java
	maxToTop(s);
	```

	Then s should store the following values after the call:

	```
	bottom [7, 5, 1, 6, -37, 8, 9, 21, 11, 12, 42] top
	```

	For example, if s stores this sequence:

	```
	bottom [7] top
	```

	and we make the following call:

	```java
	maxToTop(s);
	```

	Then s should store the following values after the call:

	```
	bottom [7] top
	```

	If the stack is empty, your method should not change it. You are to use one queue as auxiliary storage to solve this problem. You may not use any other auxiliary data structures to solve this problem, although you can have as many simple variables as you like. You may not use recursion to solve this problem and your solution must run in O(n) time.
