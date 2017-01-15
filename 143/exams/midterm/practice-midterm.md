_CSE 143_
# Practice Midterm
## Week 4

1. Recursive Tracing, 15 points.  Consider the following method:

	```java
	public static int mystery(int n, int m) {
		if (n == 0 || m == 0) {
			return 0;
		}
		else if (n % 10 == m % 10) {
			return 1 + mystery(n / 10, m / 10);
		}
		else {
			return mystery(n / 10, m / 10);
		}
	}
	```

	For each call below, indicate what output is produced:

	| Call | Output produced |
	| :--- | :--- |
	| `mystery(18, 0);` | |
	| `mystery(8, 18);` | |
	| `mystery(25, 21);` | |
	| `mystery(305, 315);` | |
	| `mystery(20734, 1724);` | |

2. Recursive Programming, 15 points. Write a recursive method called separate that takes a String as a parameter and returns a new string in which all the characters are lowercase and separated by dashes.

	| Method call | Returned value |
	| :--- | :--- |
	| `separate("hEllO");` | "h-e-l-l-o" |
	| `separate("OHNOES");` | "o-h-n-o-e-s" |
	| `separate("Computer");` | "c-o-m-p-u-t-e-r" |

	In implementing this method, you are restricted to the following string methods:

	```
	charAt(index)            returns the character at the given index
	length()                 returns the length of the string
	substring(start, stop)   returns a new string composed of characters
	                         from start index (inclusive) to stop index
	                         (exclusive)
	substring(start)         returns a new string composed of characters
	                         from start index (inclusive) to the string end
	```

	You are not allowed to construct any structured objects other than Strings (no array, ArrayList, StringBuilder, Scanner, etc) and you may not use a while loop, for loop or do/while loop to solve this problem; you must use recursion.

3. Details of inheritance, 20 points.  Assuming that the following classes have
   been defined:

	```java
	public class Computer extends Mineral {
		public void b() {
			System.out.println("Computer b");
			super.b();
		}

		public void c() {
			System.out.println("Computer c");
		}
	}
	public class Mineral extends Vegetable {
		public void b() {
			System.out.println("Mineral b");
			a();
		}
	}
	public class Animal extends Mineral {
		public void a() {
			System.out.println("Animal a");
		}

		public void c() {
			b();
			System.out.println("Animal c");
		}
	}
	public class Vegetable {
		public void a() {
			System.out.println("Vegetable a");
		}
		public void b() {
			System.out.println("Vegetable b");
		}
	}
	```

	and that the following variables are defined:

	```java
	Vegetable var1 = new Computer();
	Mineral var2 = new Animal();
	Vegetable var3 = new Mineral();
	Object var4 = new Mineral();
	```

	In the table below, indicate in the right-hand column the output produced by the statement in the left-hand column. If the statement produces more than one line of output, indicate the line breaks with slashes as in "a/b/c" to indicate three lines of output with "a" followed by "b" followed by "c". If the statement causes an error, fill in the right-hand column with either the phrase "compiler error" or "runtime error" to indicate when the error would be detected (you may abbreviate these as "ce" and "re" or "c.e." and "r.e.").

	| Statement | Output |
	| :--- | :--- |
	| `var1.a();` | |
	| `var1.b();` | |
	| `var1.c();` | |
	| `var2.a();` | |
	| `var2.b();` | |
	| `var3.a();` | |
	| `var3.b();` | |
	| `var4.a();` | |
	| `((Computer) var1).b();` | |
	| `((Computer) var1).c();` | |
	| `((Computer) var2).c();` | |
	| `((Animal) var2).c();` | |
	| `((Computer) var3).b();` | |
	| `((Vegetable) var4).b();` | |
	| `((Animal) var4).c();` | |

4. Linked Lists, 15 points.  Fill in the "code" column in the following table
   providing a solution that will turn the "before" picture into the "after"
   picture by modifying links between the nodes shown.  You are not allowed to
   change any existing node's data field value and you are not allowed to
   construct any new nodes, but you are allowed to declare and use variables of
   type ListNode (often called "temp" variables).  You are limited to at most
   two variables of type ListNode for each of the four subproblems below.

   You are writing code for the ListNode class discussed in lecture:

        public class ListNode {
            public int data;       // data stored in this node
            public ListNode next;  // link to next node in the list

            <constructors>
        }

   As in the lecture examples, all lists are terminated by null and the
   variables p and q have the value null when they do not point to anything.

        before                   after                      code
-----------------------+-----------------------+-------------------------------
                       |                       |
                       |                       |
 p->[1]->[2]->[3]      | p->[2]->[3]           |
                       |                       |
                       |                       |
 q                     | q->[1]                |
                       |                       |
-----------------------+-----------------------+-------------------------------
                       |                       |
                       |                       |
 p->[1]->[2]->[3]      | p->[1]->[3]           |
                       |                       |
                       |                       |
 q                     | q->[2]                |
                       |                       |
-----------------------+-----------------------+-------------------------------
                       |                       |
                       |                       |
 p->[1]->[2]           | p->[3]->[2]->[1]      |
                       |                       |
                       |                       |
 q->[3]->[4]           | q->[4]                |
                       |                       |
                       |                       |
                       |                       |
                       |                       |
-----------------------+-----------------------+-------------------------------
                       |                       |
                       |                       |
 p->[1]->[2]->[3]      | p->[2]->[5]->[3]      |
                       |                       |
                       |                       |
 q->[4]->[5]           | q->[4]->[1]           |
                       |                       |
                       |                       |
                       |                       |
                       |                       |
                       |                       |
                       |                       |
                       |                       |
-----------------------+-----------------------+-------------------------------

5. Stacks/Queues, 25 points. Write a method isReverseAlphabetical that takes a Stack of chars as a parameter and returns true if the stack is in reverse alphabetical order (and false otherwise). Reverse alphabetical order means that no characters are missing (and there are no repeats) between the top and bottom.

	| Stack | Method call | Value returned |
	| :--- | :--- | :--- |
	| `s1: bottom ['a', 'b', 'c'] top` | `isReverseAlphabetical(s1);` | true |
	| `s2: bottom ['q', 'r', 's'] top` | `isReverseAlphabetical(s2);` | true |
	| `s3: bottom ['c', 'b'] top` | `isReverseAlphabetical(s3);` | false |
	| `s4: bottom ['q', 's'] top` | `isReverseAlphabetical(s4);` | false |

	You may assume any input stack with fewer than two letters is reverse alphabetical. You may assume the input stack only contains lowercase alphabetic letters. Your method is to examine the stack but must return it to its original state before terminating. You are to use one queue as auxiliary storage to solve this problem.  You may not use any other auxiliary data structures to solve this problem, although you can have as many simple variables as you like.  You also may not solve the problem recursively.  Your solution must run in O(n) time where n is the size of the stacks.

6. Array Programming, 10 points. Add a method moreSevens to the ArrayIntList class that takes an integer as an argument and replaces all occurrences of that integer with the number 7. If there are none of the provided integer in the list, it should remain unchanged.

	| Before call to moreSevens(3) | After call to moreSevens(3) |
	| :--- | :--- |
	| `[1, 3, 2, 7]` | `[1, 7, 2, 7]` |
	| `[2, 2, 2, 2]` | `[2, 2, 2, 2]` |
	| `[3, 1, 3, 1]` | `[7, 1, 7, 1]` |

	You are writing a method for the ArrayIntList class discussed in lecture:

	```java
	public class ArrayIntList {
		private int[] elementData; // list of integers
		private int size;          // current # of elements in the list

		<methods>
	}
	```

	You may not call any other methods of the ArrayIntList class to solve this problem, you are not allowed to define any auxiliary data structures (no array, String, ArrayList, etc), and your solution must run in O(n) time. You may assume that elementData is large enough to fit the longer list.