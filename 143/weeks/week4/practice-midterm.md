_CSE 143_
# Practice Midterm
## Week 4

1. Recursive Tracing, 15 points. Consider the following method:

	```java
	public static int mystery(int x, int y) {
		if (x > y) {
			return 0;
		} else {
			return mystery(x + 1, y) + 2 * x - 1;
		}
	}
	```

	For each call below, indicate what output is produced:

	| Method Call | Output Produced |
	| :--- | :--- |
	| `mystery(1, 3);` | |
	| `mystery(4, 4);` | |
	| `mystery(3, 5);` | |
	| `mystery(1, 5);` | |
	| `mystery(4, 7);` | |

2. Recursive Programming, 15 points.  Write a recursive method called collapseSequences that takes a string and a character as parameters and that returns a new string that has all sequences of the given character collapsed to one of that character. A sequence is a group of consecutive characters that are all the same.  Consider the following call:
	
	```java
	collapseSequence("-this----has maaany--dashes---", '-');
	```

	The string has 5 sequences of dashes of varying lengths. Each is reduced to a single occurrence of the dash producing "-this-has maaany-dashes-". Notice that other characters are unchanged. If you make the call:

	```java
	collapseSequence("eecckk!!, he's meeeping meep", 'e');
	```

	the method should return "ecckk!!, he's meping mep". In implementing this method, you are restricted to the following string methods:

	| Method | Description |
	| :--- | :--- |
  | `charAt(index)` | returns the character at the given index |
  | `length()` | returns the length of the string |
  | `substring(start, stop)` | returns a new string composed of characters from start index (inclusive) to stop index (exclusive) |
  | `substring(start)` | returns a new string composed of characters from start index (inclusive) to the string end |

	You are not allowed to construct any structured objects other than Strings (no array, ArrayList, StringBuilder, Scanner, etc) and you may not use a while loop, for loop or do/while loop to solve this problem; you must use recursion.

3. Details of inheritance, 20 points. Assuming that the following classes have been defined:

	```java
	public class Horse extends Cat {
		public void method1() {
			System.out.println("Horse 1");
			super.method2();
		}

		public void method2() {
			System.out.println("Horse 2");
		}
	}

	public class Dog {
		public void method2() {
			System.out.println("Dog 2");
		}
	}

	public class Pig extends Horse {
		public void method2() {
			System.out.println("Pig 2");
		}
	}

	public class Cat extends Dog {
		public void method3() {
			System.out.println("Cat 3");
			method2();
		}
	}

	And assuming the following variables have been defined:

	```java
	Cat var1 = new Pig();
	Dog var2 = new Dog();
	Dog var3 = new Cat();
	Object var4 = new Horse();
	Cat var5 = new Horse();
	Horse var6 = new Pig();
	```

	In the table below, indicate in the right-hand column the output produced by the statement in the left-hand column. If the statement produces more than one line of output, indicate the line breaks with slashes as in "a/b/c" to indicate three lines of output with "a" followed by "b" followed by "c". If the statement causes an error, fill in the right-hand column with either the phrase "compiler error" or "runtime error" to indicate when the error would be detected.

	| Statement | Output |
	| :--- | :--- |
	| `var1.method2();` | |
	| `var2.method2();` | |
	| `var3.method2(); ` | |
	| `var4.method2();` | |
	| `var5.method2(); ` | |
	| `var6.method2(); ` | |
	| `var1.method3();` | |
	| `var2.method3();` | |
	| `var3.method3();` | |
	| `var4.method3();` | |
	| `var5.method3();` | |
	| `var6.method3(); ` | |
	| `((Pig)var5).method1();` | |
	| `((Cat)var3).method3();` | |
	| `((Cat)var4).method1();` | |
	| `((Pig)var1).method1();` | |
	| `((Horse)var4).method1();` | |
	| `((Cat)var2).method3();` | |
	| `((Horse)var3).method1();` | |
	| `((Dog)var4).method2(); ` | |

4. Linked Lists, 15 points. Fill in the "code" column in the following table providing a solution that will turn the "before" picture into the "after" picture by modifying links between the nodes shown. You are not allowed to change any existing node's data field value and you are not allowed to construct any new nodes, but you are allowed to declare and use variables of type ListNode (often called "temp" variables). You are limited to at most two variables of type ListNode for each of the four subproblems below.

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
	                       |                       |
	 p->[1]->[2]->[3]      | p->[1]->[2]           |
	                       |                       |
	                       |                       |
	 q                     | q->[3]                |
	                       |                       |
	-----------------------+-----------------------+-------------------------------
	                       |                       |
	                       |                       |
	 p->[1]->[3]           | p->[1]->[2]->[3]      |
	                       |                       |
	                       |                       |
	 q->[2]                | q                     |
	                       |                       |
	-----------------------+-----------------------+-------------------------------
	                       |                       |
	                       |                       |
	 p->[1]->[2]           | p->[2]->[4]           |
	                       |                       |
	                       |                       |
	 q->[3]->[4]           | q->[3]->[1]           |
	                       |                       |
	                       |                       |
	                       |                       |
	                       |                       |
	-----------------------+-----------------------+-------------------------------
	                       |                       |
	                       |                       |
	 p->[1]->[2]->[3]      | p->[2]->[1]->[4]      |
	                       |                       |
	                       |                       |
	 q->[4]->[5]           | q->[3]->[5]           |
	                       |                       |
	                       |                       |
	                       |                       |
	                       |                       |
	                       |                       |
	                       |                       |
	                       |                       |
	-----------------------+-----------------------+-------------------------------
	```

5. Stacks/Queues, 25 points. Write a method called parityMatches that takes two stacks of integers as parameters and that returns a count of the number of elements in corresponding positions that have the same parity. Two numbers are considered to have the same parity if they are either both even or both odd. Suppose, for example, that two stacks store these values:

	```
	s1: bottom [3, 4, 5] top        s2: bottom [37, 14, 24] top
	```

	The method compares values in corresponding positions in the two stacks (3 and 37, 4 and 14, 5 and 24). Of these pairs, two have the same parity. The third pair (5 and 24) do not have the same parity. Therefore the method call parityMatches(s1, s2) would return 2.

	You may assume that the two stacks store the same number of values (your method should throw an IllegalArgumentException if they have different numbers of elements). You may also assume that all of the numbers stored in the list are greater than or equal to 0. Your method is to examine the two stacks but must return them to their original state before terminating.

	You are to use one queue as auxiliary storage to solve this problem. You may not use any other auxiliary data structures to solve this problem, although you can have as many simple variables as you like. You also may not solve the problem recursively. Your solution must run in O(n) time where n is the size of the stacks. Use the Stack and Queue structures described in the cheat sheet and obey the restrictions described there (recall that you can't use the peek method or a foreach loop or iterator).

6. Array Programming, 10 points. Write a method called stutter that doubles the size of a list of integers by replacing every integer in the list with two of that integer. For example, if a variable called list stores the following:

	```
	[1, 8, 19, 4, 17]
	```

	and we make the following call:

	```java
	list.stutter();
	```

	then it should store the following sequence of integers after the call:

	```
	[1, 1, 8, 8, 19, 19, 4, 4, 17, 17]
	```

	You are writing a method for the ArrayIntList class discussed in lecture:

	```java
	public class ArrayIntList {
		private int[] elementData; // list of integers
		private int size;          // current # of elements in the list

		<methods>
	}
	```

	You may not call any other methods of the ArrayIntList class to solve this problem, you are not allowed to define any auxiliary data structures (no array, String, ArrayList, etc), and your solution must run in O(n) time. You may assume that elementData is large enough to fit the longer list.