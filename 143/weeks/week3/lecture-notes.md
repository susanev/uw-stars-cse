_CSE 143_
# Lecture Notes
## Week 3

### Creating new Nodes
* One most assignments or exam questions you will be limited to the amount of Nodes you can create, but you are not limited in the amount of ListNode variables you create
* If you use the `new` keyword, that is constructing a new Node, if you do not use the `new` keyword than you are making a variable

### Printing values of a Linked List
* Suppose we have a variable list that stores `[3, 5, 2]`

	```
	                +------+------+      +------+------+      +------+------+
	     +---+      | data | next |      | data | next |      | data | next |
	list | +-+--->  |   3  |   +--+--->  |   5  |   +--+--->  |   2  |   /  |
	     +---+      +------+------+      +------+------+      +------+------+
	```
	
* Create a local variable of type ListNode to move through the list

	```java
	ListNode current = list;
	```

	```
	                   +------+------+      +------+------+      +------+------+
	        +---+      | data | next |      | data | next |      | data | next |
	   list | +-+--->  |   3  |   +--+--->  |   5  |   +--+--->  |   2  |   /  |
	        +---+      +------+------+      +------+------+      +------+------+
	                          ^
	        +---+             |
	current | +-+------>------+
	        +---+
  ```

* Basic loop structure

	```java
	// while loop
	ListNode current = list;
	while (current != null) {
		System.out.println(current.data);
		current = current.next;
	}
	```

	```java
	// equivalent for loop
	for(ListNode current = list; current != null; current = current.next) {
		System.out.println(current.data);
	}
	```

* First time through the loop: prints 3 ...

	```
	                   +------+------+      +------+------+      +------+------+
	        +---+      | data | next |      | data | next |      | data | next |
	   list | +-+--->  |   3  |   +--+--->  |   5  |   +--+--->  |   2  |   /  |
	        +---+      +------+------+      +------+------+      +------+------+
	                                               ^
	        +---+                                  |
	current | +-+------>------>------>------>------+
	        +---+
	```

* Next time through the loop we print 5 ...

	```
	                   +------+------+      +------+------+      +------+------+
	        +---+      | data | next |      | data | next |      | data | next |
	   list | +-+--->  |   3  |   +--+--->  |   5  |   +--+--->  |   2  |   /  |
	        +---+      +------+------+      +------+------+      +------+------+
	                                                                    ^
	        +---+                                                       |
	current | +-+------>------>------>------>------>------>------>------+
	        +---+
  ```

* Next time through the loop we print 2 ...

	``` 
	                   +------+------+      +------+------+      +------+------+
	        +---+      | data | next |      | data | next |      | data | next |
	   list | +-+--->  |   3  |   +--+--->  |   5  |   +--+--->  |   2  |   /  |
	        +---+      +------+------+      +------+------+      +------+------+

	        +---+
	current | / |
	        +---+
	```

* Note that current is now pointing to null so we break out of the loop

        int i = 0;
        while (i < size) {
            System.out.println(elementData[i]);
            i++;
        }

* Common steps to follow when looking through a Linked List
	* Go to front of the list: `ListNode current = list;`
	* Test for more elements `current != null`
	* Do some action with the current value	`current.data`
	* Go to next element	`current = current.next;`

### LinkedIntList
* We will define a new class called LinkedIntList that will have the same methods as the ArrayIntList class
* Instead of storing values with an an array and a size, we will store them in a linked list
* Basic setup
	
	```java
	public class LinkedIntList {
		private ListNode front;

		<methods>
	}
  ```

* Reminder that the fields of LinkedIntList should be private but the fields of the Node class are allowed to be public
* With add method ...

	```java
	public class LinkedIntList {
		private ListNode front;

		// post: appends the value to the end of the list
		public void add(int value) {
			if (front == null)
				front = new ListNode(value);
			else {
				ListNode current = front;
				while (current.next != null)
					current = current.next;
				current.next = new ListNode(value);
			}
		}
	}
	```

### Ways to change a Linked List
* Change the value of `front`, in which case you are changing the starting point for the list
* Change the value of `<something>.next` that is already in the list, so that as we follow these links, we go along a different path than before

### Null pointer exceptions
* Null pointer exceptions happen, when you say `.next` on something that is `null`


### Constructors and duplicating code
* When you have multiple constructors in a class, they should call each other when appropriate so as not to duplicate code

### Linked list examples

#### New constructor
* Task: Write a constructor that takes an integer parameter n and that constructs a list that has the numbers 0 through n in descending order 
* Process
	* First, construct a node using the old value of front
	* Then, link it in by changing front
	* In code: `front = new ListNode(i, front);`
* Code

	```java
	// post : constructs a list of integers in descending order starting
	//        with n and ending with 0 (empty list if n is less than zero)
	public LinkedIntList(int n) {
		front = null;
		for (int i = 0; i <= n; i++) {
			front = new ListNode(i, front);
		}
	}
	```

#### addSorted

```java
// pre : list is in sorted (non-decreasing) order
// post: given value inserted into list so as to preserve sorted order
public void addSorted(int value) {
	if (front == null || value <= front.data)
		front = new ListNode(value, front);
	else {
		ListNode current = front;
		while (current.next != null && current.next.data < value)
			current = current.next;
		current.next = new ListNode(value, current.next);
	}
}
```
