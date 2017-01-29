_CSE 143_
# Exercises
## Week 5

### Recursive Programming

1. Using recursion, write a method times that takes two integers `a` and `b` as parameters and returns their product, i.e., `a * b`. You are to multiply them by using a series of additions. You may use `+`, `-`, comparison operators (`>`, `>=`, `<`, `<=`, `==`, `!=`), and Boolean operators (`&&`, `||`). You may NOT use `*`, `/`, any loops (i.e., for or while) or any method from the Java library.

	You may find the following equality useful: `a * b = b + (a – 1) * b`

1. For this problem, write a method, mirrorString, that prints the parameter string both forward and backward on the same line as shown below. Notice in all cases that the final character in the string is only printed once (at the exact middle of the mirrored string) whereas all other characters are printed twice. If mirrorString is passed an empty string, it should not print anything.

	| Method call | Output produced |
	| :--- | :--- |
	| `mirrorString("");` | |
	| `mirrorString("a")` | `a` |
	| `mirrorString("bo")` | `bob` |
	| `mirrorString("How are you?")` | `How are you?uoy era woH` |

	You may assume that the String you are passed is not null. The String can contain any combination of characters and be of any length.

	You must use recursion for this problem; you may not use any loops.

1. Write a recursive method isReversal that takes two strings as parameters. The method should return true if the second string is the first string reversed. Your method should throw an IllegalArgumentException if the input strings are not the same length.

	You are not allowed to construct any structured objects other than Strings (no array, StringBuilder, ArrayList, etc) and you may not use a while loop, for loop or do/while loop to solve this problem; you must use recursion.

	`isReversal("foo","oof");` returns true
	`isReversal("foaob","boqof");` returns false

1. Write a recursive method nthFromEnd that takes two nonnegative integers, num and n, as parameters and returns the digit that is n places before the rightmost digit in num. (This is like we are treating the ones digit as index 0, the tens digit as index 1, etc. If n refers to a place in num that does not exist, then the method should return 0 (as if num is padded with invisible zeros in the front). So nthFromEnd(12, 5) should return 0.

	| Method Call | Value Returned |
	| :--- | :--- |
	| `nthFromEnd(2801, 3)` | `2` |
	| `nthFromEnd(5, 2)` | `0` |
	| `nthFromEnd(14978, 1)` | `7` |
	| `nthFromEnd(458, 0)` | `8` |
	| `nthFromEnd(0, 0)` | `0` |
	| `nthFromEnd(56, 2)` | `0` |
	| `nthFromEnd(1234567890, 9)` | `1` |

	Your method should throw an IllegalArgumentException if either of the two parameters is negative. You are not allowed to construct any structured objects to solve this problem (no array, String, StringBuilder, ArrayList, etc) and you may not use a while loop, for loop or do/while loop to solve this problem; you must use recursion.

1. Write a recursive method parenthesize that accepts an int n as a parameter and prints out the numbers 1 through n inclusive in a particular pattern that looks like a set of mathematical additions wrapped in parentheses. The order of the numbers should begin with all of the evens in downward order, followed by all of the odds upward from 1. Each time a number is added to the pattern, a new set of parentheses and a + sign are added too. You may assume that the number passed to your method is greater or equal to 0. Look at the pattern in the calls below to see the print format.

	| Call | Output |
	| :--- | :--- |
	| `parenthesize(0);` | `0` |
	| `parenthesize(1);` | `1` |
	| `parenthesize(2);` | `(2 + 1)` |
	| `parenthesize(3);` | `((2 + 1) + 3)` |
	| `parenthesize(4);` | `(4 + ((2 + 1) + 3))` |
	| `parenthesize(5);` | `((4 + ((2 + 1) + 3)) + 5)` |
	| `parenthesize(6);` | `(6 + ((4 + ((2 + 1) + 3)) + 5))` |
	| `parenthesize(7);` | `((6 + ((4 + ((2 + 1) + 3)) + 5)) + 7)` |
	| `parenthesize(8);` | `(8 + ((6 + ((4 + ((2 + 1) + 3)) + 5)) + 7))` |
	| `parenthesize(9);` | `((8 + ((6 + ((4 + ((2 + 1) + 3)) + 5)) + 7)) + 9)` |

	You are not allowed to construct any structure objects (no array, List, Scanner, etc.) and you may not use any loops to solve this problem; you must use recursion. If you like, you may declare other methods to help you solve this problem, subject to the previous rules.

1. Write a recursive method called sameDashes that takes two equal length strings as parameters and that returns whether or not they have dashes in the same positions (returning true if they do and returning false otherwise). For example, below are four pairs of strings that have the same pattern of dashes.

	```
	string1:    "hi--there-you."    "-15-389"    "criminal-plan"    "abc"
	               ||     |          |  |                 |   
	string2:    "12--(134)-7539"    "-xy-zzy"    "(206)555-1384"    "9.8"
	```

	Below are examples where the dashes don't match, sometimes because the number of dashes is different and sometimes because the positions of the dashes are different:

	```
	string1:    "is-this-okay?"     "1-2-3-4"    "a--b--c--d"    "384.5"
	string2:    "78--3421789!!"     "9876543"    "---1234---"    "718-3"
	```

	Your method should throw an IllegalArgumentException if the two strings are not of the same length.

	You are not allowed to construct any structured objects other than Strings (no array, ArrayList, StringBuilder, Scanner, etc) and you may not use a while loop, for loop or do/while loop to solve this problem; you must use recursion.

### LinkedLists
1. Fill in the second column in the following table by providing a solution that will turn the "before" picture into the "after" picture. You may introduce up to two ListNode variables per before/after subproblem to refer to any existing node, but you may not construct new list nodes or change an existing node’s data field.

	You are writing code for the ListNode class discussed in lecture:

	```java
	public class ListNode {             
	    public int data;       // data stored in this node             
	    public ListNode next;  // link to next node in the list              

	    public ListNode(int data, ListNode next) {
	        this.data = data;
	        this.next = next;
	    }
	} 
	```    

	As in the lecture examples, all lists are terminated by null.

	```
	        before                   after                      code
	-----------------------+-----------------------+-------------------------------
	                       |                       |
	 list1->[1]            | list1->[3]->[1]       |   
	                       |                       |   
	                       |                       |  
	 list2->[2]->[3]       | list2->[2]            |
	                       |                       |
	-----------------------+-----------------------+-------------------------------
	                       |                       |
	 list1->[1]->[2]       | list1->[1]->[4]       |
	                       |                       |
	                       |                       |
	 list2->[3]->[4]       | list2->[2]->[3]       |
	                       |                       |
	-----------------------+-----------------------+-------------------------------
	                       |                       |
	 list1->[1]            | list1->[2]->[4]       |
	                       |                       |
	                       |                       |
	 list2->[2]->[3]->[4]  | list2->[1]->[3]       |
	                       |                       |
	-----------------------+-----------------------+-------------------------------
	                       |                       |
	 list1->[1]->[2]       | list1->[1]->[4]       |
	                       |                       |
	                       |                       |
	 list2->[3]->[4]->[5]  | list2->[2]->[3]->[5]  |
	                       |                       |
	-----------------------+-----------------------+-------------------------------
	```

1. Fill in the second column in the following table by providing a solution that will turn the "before" picture into the "after" picture. You may not change any existing node’s data field values or create new nodes unless specified.

	You are writing code for the ListNode class discussed in lecture:

	```java
	public class ListNode {             
	    public int data;       // data stored in this node             
	    public ListNode next;  // link to next node in the list              

	    public ListNode(int data, ListNode next) {
	        this.data = data;
	        this.next = next;
	    }
	}  
	```   

	As in the lecture examples, all lists are terminated by null.

	```
	        before                   after                      code
	-----------------------+-----------------------+-------------------------------
	                       |                       |
	 list->[1]             |  list->[2]->[1]       |   
	                       |  (you must create a   |   
	                       |            new node)  |  
	                       |                       |
	-----------------------+-----------------------+-------------------------------
	                       |                       |
	 list->[1]->[2]        | list->[2]->[1]        |
	                       |                       |
	                       |                       |
	                       |                       |
	-----------------------+-----------------------+-------------------------------
	                       |                       |
	 list1->[1]->[2]       | list1->[3]->[2]       |
	                       |                       |
	                       |                       |
	 list2->[3]            | list2->[1]            |
	                       |                       |
	-----------------------+-----------------------+-------------------------------
	                       |                       |
	 list1->[1]->[2]->     | list1->[2]->[4]       |
	        [3]->[4]->[5]  |                       |
	                       |                       |
	                       |                       |
	 list2->               | list2->[3]->[1]->[5]  |
	                       |                       |
	-----------------------+-----------------------+-------------------------------
	```

### Stacks and Queues

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
