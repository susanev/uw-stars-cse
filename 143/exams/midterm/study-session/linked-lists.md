_CSE 143_

# Linked Lists
## Midterm Study Session

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
