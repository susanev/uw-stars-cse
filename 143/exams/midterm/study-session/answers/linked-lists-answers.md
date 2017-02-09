_CSE 143_

# Linked Lists Answers
## Midterm Study Session

_Answers will not be posted for these, since there are so many different ways to solve this type of problem. Instead a program is included below, you can adjust it and run it to make sure your solution is correct._

```java
public class Check {
	public static void main (String[] args) {
		// change the code below to match the problem
		ListNode p = new ListNode(1, new ListNode(2, new ListNode(6)));
		ListNode q = new ListNode(3, new ListNode(4, new ListNode(5)));
		System.out.println("Before");
		printList(p);
		printList(q);

		// include you solution code here

		System.out.println("After");
		printList(p);
		printList(q);
	}

	public static void printList(ListNode list) {
		ListNode curr = list;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.println("\n----");
	}
}

class ListNode {
	public int data;       
	public ListNode next; 

	public ListNode() {
		this(0, null);
	}

	public ListNode(int data) {
		this(data, null);
	}

	public ListNode(int data, ListNode next) {
		this.data = data;
		this.next = next;
	}
}
```