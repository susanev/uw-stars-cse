_CSE 143_
# Check-in Meeting
## Week 5

1. Recursive Tracing

	```java
	public void mystery(int n) {
		if (n <= 0) {
			System.out.print('a');
		} else if (n % 2 == 1) {
			System.out.print((char)('a' + n));
			mystery(n - 1);
		} else {
			mystery(n - 1);
			System.out.print((char)('a' + n));
		}
	}
	```
	
	For each of the following method calls, indicate the output that is produced.

	| Call | Output |
	| :--- | :--- |
	| `mystery(0)` | |
	| `mystery(1)` | |
	| `mystery(2)` | |
	| `mystery(4)` | |
	| `mystery(7)` | |

1. Write a recursive method vowelsToEnd that takes a string as a parameter and returns a string in which all of the vowels have been moved to the end. The vowels should appear in reverse order of what they were in the original word.

	| Call |  Returned value |
	| :--- | :--- |
	| `vowelsToEnd("hello");` | `hlloe` |
	| `vowelsToEnd("abracadabra");` | `brcdbraaaaa` |
	| `vowelsToEnd("computer");` | `cmptreuo` |

	You may assume that the input string is non-null and the string only contains lowercase characters.

	You are not allowed to construct any structured objects other than Strings (no array, List, Scanner, etc.). You are not allowed to use the string replace or replaceAll methods. You may not use any loops to solve this problem; you must use recursion.

1. Fill in the "Code" column in the table providing a solution that will turn the "Before" picture into the "After" picture by modifying links between the nodes. You are not allowed to change any node's data field and you are not allowed to construct new nodes; you are allowed to declare and use variables of type ListNode ("temp" variables).

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
	Before                 After              Code
	---------------------------------------------------------------

	p->[1]->[2]            p->[1]->[3]

	q->[3]                 q->[2]

	----------------------------------------------------------------

	p->[1]->[2]            p->[1]->[3]


	q->[3]->[4]            q->[4]->[2]

	----------------------------------------------------------------

	p->[1]->[2]->[3]       p->[3]->[2]

	q                      q->[1]

	----------------------------------------------------------------

	p->[1]->[2]->[3]       p->[2]->[1]->[4]


	q->[4]->[5]            q->[3]->[5]

	----------------------------------------------------------------
	```
