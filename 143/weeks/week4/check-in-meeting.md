_CSE 143_
# Check-in Meeting
## Week 4

1. Recursive Programming. Write a recursive method called collapseSequences that takes a string and a character as parameters and that returns a new string that has all sequences of the given character collapsed to one of that character. A sequence is a group of consecutive characters that are all the same. Consider the following call:

	```java
	collapseSequence("-this----has maaany--dashes---", '-');
	```

	The string has 5 sequences of dashes of varying lengths. Each is reduced to a single occurrence of the dash producing "-this-has maaany-dashes-". Notice that other characters are unchanged. If you make the call:

	```java
	collapseSequence("eecckk!!, he's meeeping meep", 'e');
	```

	the method should return "ecckk!!, he's meping mep". In implementing this method, you are restricted to the following string methods:

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

1. Linked Lists. Fill in the "code" column in the following table providing a solution that will turn the "before" picture into the "after" picture by modifying links between the nodes shown. You are not allowed to change any existing node's data field value and you are not allowed to construct any new nodes, but you are allowed to declare and use variables of type ListNode (often called "temp" variables). You are limited to at most two variables of type ListNode for each of the four subproblems below.

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
