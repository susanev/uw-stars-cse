_CSE 143_
# Practice Midterm 2

1. Recursive Tracing, 15 points.  Consider the following method:

	```java
	public static int mystery(int x, int y) {
		if (x < 0) {
			return -mystery(-x, y);
		} else if (y < 0) {
			return -mystery(x, -y);
		} else if (y < x) {
			return 0;
		} else {
			return 1 + mystery(x, y - x);
		}
	}
	```

	For each call below, indicate what value is returned:

	| Call | Output produced |
	| :--- | :--- |
	| `mystery(10, 28);` | |
	| `mystery(5, 17);` | |
	| `mystery(2, 10);` | |
	| `mystery(4, -15);` | |
	| `mystery(-3, -23);` | |

2. Recursive Programming, 15 points. Write a method printTwos that takes an integer n as a parameter and that prints an expression composed of a single odd number multiplied by twos that is equal to n. The twos should surround the odd number with an equal number of twos on either side if possible. For example, the call:

	```java
	printTwos(80);
	```

	should produce the following output:

	```java
	2 * 2 * 5 * 2 * 2
	```

	If the expression has an odd number of twos, then the "extra" two should appear at the front of the expression. For example, the call:

	```java
	printTwos(96);
	```

	should produce the following output:

	```java
	2 * 2 * 2 * 3 * 2 * 2
	```

	If the number is odd to begin with, it should simply be printed. It is possible that the odd number to print will be 1. For example, the following calls:

	```java
	printTwos(1);
	System.out.println(); // to complete the line of output
	printTwos(2);
	System.out.println(); // to complete the line of output
	printTwos(32);
	System.out.println(); // to complete the line of output
	```

	should produce the following output:

	```java
	1
	2 * 1
	2 * 2 * 2 * 1 * 2 * 2
	```

	You must exactly reproduce the format of the examples above. Your method should throw an IllegalArgumentException if passed a value less than 1.

	You may NOT use a while loop, for loop or do/while loop to solve this problem; you must use recursion.

3. Details of inheritance, 20 points.  Assuming that the following classes have been defined:

	```java
	public class Cup extends Box {
		public void method1() {
			System.out.println("Cup 1");
		}

		public void method2() {
			System.out.println("Cup 2");
			super.method2();
		}
	}

	public class Pill {
		public void method2() {
			System.out.println("Pill 2");
		}
	}

	public class Jar extends Box {
		public void method1() {
			System.out.println("Jar 1");
		}

		public void method2() {
			System.out.println("Jar 2");
		}
	}

	public class Box extends Pill {
		public void method2() {
			System.out.println("Box 2");
		}

		public void method3() {
			method2();
			System.out.println("Box 3");
		}
	}
	```

	And assuming the following variables have been defined:

	```java
	Box var1 = new Box();
	Pill var2 = new Jar();
	Box var3 = new Cup();
	Box var4 = new Jar();
	Object var5 = new Box();
	Pill var6 = new Pill();
	```

	In the table below, indicate in the right-hand column the output produced by the statement in the left-hand column. If the statement produces more than one line of output, indicate the line breaks with slashes as in "a/b/c" to indicate three lines of output with "a" followed by "b" followed by "c". If the statement causes an error, fill in the right-hand column with either the phrase "compiler error" or "runtime error" to indicate when the error would be detected (you may abbreviate these as "ce" and "re" or "c.e." and "r.e.").

	| Statement | Output |
	| :--- | :--- |
	| `var1.method2();` | |
	| `var2.method2();` | |
	| `var3.method2();` | |
	| `var4.method2();` | |
	| `var5.method2();` | |
	| `var6.method2();` | |
	| `var1.method3();` | |
	| `var2.method3();` | |
	| `var3.method3();` | |
	| `var4.method3();` | |
	| `((Cup)var1).method1();` | |
	| `((Jar)var2).method1();` | |
	| `((Cup)var3).method1();` | |
	| `((Cup)var4).method1();` | |
	| `((Jar)var4).method2();` | |
	| `((Box)var5).method2();` | |
	| `((Pill)var5).method3();` | |
	| `((Jar)var2).method3();` | |
	| `((Cup)var3).method3();` | |
	| `((Cup)var5).method3();` | |

4. Linked Lists, 15 points.  Fill in the "code" column in the following table
   providing a solution that will turn the "before" picture into the "after"
   picture by modifying links between the nodes shown. You are not allowed to
   change any existing node's data field value and you are not allowed to
   construct any new nodes, but you are allowed to declare and use variables of
   type ListNode (often called "temp" variables). You are limited to at most
   two variables of type ListNode for each of the four subproblems below.

	You are writing code for the ListNode class discussed in lecture:

	```java
	public class ListNode {
		public int data;       // data stored in this node
		public ListNode next;  // link to next node in the list

		<constructors>
	}
	```

	As in the lecture examples, all lists are terminated by null and the variables p and q have the value null when they do not point to anything.

	```
		     before                   after                      code
	-----------------------+-----------------------+-------------------------------
	                       |                       |
	 p->[1]->[2]           | p->                   |
		               |                       |
		               |                       |
	 q->[3]                | q->[1]->[2]->[3]      |
		               |                       |
	-----------------------+-----------------------+-------------------------------
	                       |                       |
	 p->[1]->[2]->[3]      | p->[1]->[3]           |
	                       |                       |
	                       |                       |
	 q->                   | q->[2]                |
	                       |                       |
	-----------------------+-----------------------+-------------------------------
	                       |                       |
	                       |                       |
	 p->[1]->[2]           | p->[1]->[4]           |
	                       |                       |
	                       |                       |
	 q->[3]->[4]           | q->[2]->[3]           |
	                       |                       |
	                       |                       |
	                       |                       |
	                       |                       |
	-----------------------+-----------------------+-------------------------------
	                       |                       |
	                       |                       |
	 p->[1]->[2]->[3]      | p->[5]->[1]           |
	                       |                       |
	                       |                       |
	 q->[4]->[5]           | q->[2]->[3]->[4]      |
	                       |                       |
	                       |                       |
	                       |                       |
	                       |                       |
	                       |                       |
	                       |                       |
	                       |                       |
	                       |                       |
	                       |                       |
	-----------------------+-----------------------+-------------------------------
	```

5. Array Programming, 10 points. Write a method named removeLast that accepts an integer parameter n. Your method should remove the last occurrence of n found in this list and return its index. If n is not in this list, your method should return -1.

	For example, given the following list named list:

	```
	[23, 34, -6, 98, -12, 7, 44, 23, 67, 23, 12] 
	```

	The call list.removeLast(23) returns 9 because the last occurrence of 23 is found at index 9. After the call, the list should contain the following values:

	```
	[23, 34, -6, 98, -12, 7, 44, 23, 67, 12] 
	```

	If the same call is made again, it returns 7 and removes the 23 at index 7. The list then becomes:

	```
	[23, 34, -6, 98, -12, 7, 44, 67, 12] 
	```

	If n does not appear in the list, then the method should leave the list unchanged and return -1.

	You are writing a method for the ArrayIntList class discussed in lecture:

	```java
	public class ArrayIntList {
	    private int[] elementData; // list of integers
	    private int size;          // current # of elements in the list
	    
	    <methods>
	}
	```

	You may not call any other methods of the ArrayIntList class to solve this problem, you are not allowed to define any auxiliary data structures (no array, String, ArrayList, etc), and your solution must run in O(n) time.

6. Stacks/Queues, 25 points. Write a method called removeMin that takes a stack of integers as a parameter and that removes and returns the smallest value from the stack. For example, if a variable called s stores the following sequence of values:

	```
	bottom [2, 8, 3, 19, 7, 3, 2, 42, 9, 3, 2, 7, 12, -8, 4] top
	```

	and you make the following call:

	```java
	int n = removeMin(s);
	```

	the method removes and returns the value -8 from the stack, so that the variable n will be -8 after the call and s will store the following values:

	```
	bottom [2, 8, 3, 19, 7, 3, 2, 42, 9, 3, 2, 7, 12, 4] top
	```

	If the minimum value appears more than once, all occurrences of the minimum should be removed from the stack. For example, given the ending value of the stack above, if we again call removeMin(s), the method would return 2 and would leave the stack in the following state:

	```
	bottom [8, 3, 19, 7, 3, 42, 9, 3, 7, 12, 4] top
	```

	You are to use one queue as auxiliary storage to solve this problem. You may not use any other auxiliary data structures to solve this problem, although you can have as many simple variables as you like. You also may not solve the problem recursively. Your solution must run in O(n) time where n is the size of the stack. This means that your solution should not contain nested loops. Use the Stack and Queue structures described in the cheat sheet and obey the restrictions described there. You may assume that the stack is not empty.
