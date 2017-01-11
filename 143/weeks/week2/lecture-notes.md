_CSE 143_
# Lecture Notes
## Week 2

### Concepts
* The keyword _null_ is a Java keyword that means _no object_

### Abstract Data Types (ADT)
* Often implemented as interfaces
* `List` and `Set` abstractions from the collections framework in Java are both ADTs

#### Stacks and Queues
* Ordered structure
* Ability to add something, remove something, check if its empty, and get its size, usually also a peek operation

##### Stacks
* LIFO (last-in-first-out)
* Works similarly to a stack of trays in a cafeteria
* Adding operation is called _push_
* Removing operation is called _pop_
* All operations occur at the top of the stack

###### Stack Methods
| Method | Description |
| :--- | :--- |
| `Stack<E>()` | Constructs a new stack with elements of type `E` |
| `push(val)` | Places val on top of the stack |
| `pop()` | Removes top value from the stack and returns it; throws `NoSuchElementException` if stack is empty |
| `peek()` | Returns top value from the stack without removing it; throws `NoSuchElementException` if stack is empty |
| `size()` | Returns the number of elements in the stack |
| `isEmpty()` | Returns true if the stack has no elements |


##### Queues
* FIFO (first-in-first-out)
* Works similarly to a line at a grocery store
* For `Queue<E>` we will use `LinkedList<E>` for the implementation (e.g., `Queue<Integer> q = new LinkedList<Integer>()`)

###### Queue with LinkedList implementation methods
| Method | Description |
| :--- | :--- |
| `public void add(E value);` | Adds val to the back of the queue |
| `public E remove();` | Removes the first value from the queue; throws a `NoSuchElementException` if the queue is empty |
| `public boolean isEmpty();` | Returns true if the queue has no elements |
| `public int size();` | Returns the number of elements in the queue | 

##### Example 1

```java
import java.util.*;

public class SimpleStackQueue {
	public static void main(String[] args) {
		String[] data = {"four", "score", "and", "seven", "years", "ago"};
		Queue<String> q = new LinkedList<String>();
		Stack<String> s = new Stack<String>();

		for (String str : data) {
			q.add(str);
			s.push(str);
		}

		System.out.println("initial queue = " + q);
		while (!q.isEmpty()) {
			String str = q.remove();
			System.out.println("removing " + str + ", now queue = " + q);
		}
		System.out.println();

		System.out.println("initial stack = " + s);
		while (!s.isEmpty()) {
			String str = s.pop();
			System.out.println("removing " + str + ", now stack = " + s);
		}
	}
}
```

###### Output  

```    
initial queue = [four, score, and, seven, years, ago]
removing four, now queue = [score, and, seven, years, ago]
removing score, now queue = [and, seven, years, ago]
removing and, now queue = [seven, years, ago]
removing seven, now queue = [years, ago]
removing years, now queue = [ago]
removing ago, now queue = []

initial stack = [four, score, and, seven, years, ago]
removing ago, now stack = [four, score, and, seven, years]
removing years, now stack = [four, score, and, seven]
removing seven, now stack = [four, score, and]
removing and, now stack = [four, score]
removing score, now stack = [four]
removing four, now stack = []
```

##### Example 2
_Note: This code does not use curly braces for loops with single statements; this is an okay style solution for CSE 143, but be careful, if you ever have more than one line of code, then you will need to add in the curly braces._

```java
	// Program that demonstrates some stack/queue operations

	import java.util.*;

	public class StackQueue {
		public static void main(String[] args) {
			Queue<Integer> q = makeQueueOfMultiples(6, 3);
			System.out.println("initial queue = " + q);
			System.out.println("sum = " + sum(q));
			System.out.println("after sum queue = " + q);
			System.out.println();

			Stack<Integer> s = new Stack<Integer>();
			queueToStack(q, s);
			System.out.println("after queueToStack:");
			System.out.println("    queue = " + q);
			System.out.println("    stack = " + s);
			System.out.println();

			s = makeStackOfMultiples(6, 5);
			System.out.println("initial stack = " + s);
			System.out.println("sum = " + sum(s));
			System.out.println("after sum stack = " + s);
			System.out.println();

			stackToQueue(s, q);
			System.out.println("after stackToQueue:");
			System.out.println("    stack = " + s);
			System.out.println("    queue = " + q);
		}

		// pre : count >= 0
		// post: returns a queue of count multiples of n
			public static Queue<Integer> makeQueueOfMultiples(int count, int n) {
			Queue<Integer> q = new LinkedList<Integer>();
			for (int i = 1; i <= count; i++)
			 	q.add(i * n);
			return q;
		}

		// pre : count >= 0
		// post: returns a stack of count multiples of n
		public static Stack<Integer> makeStackOfMultiples(int count, int n) {
			Stack<Integer> s = new Stack<Integer>();
			for (int i = 1; i <= count; i++)
				s.push(i * n);
			return s;
		}

		// post: Values from q moved to s (added in queue order, front to back);
		//       q is empty
		public static void queueToStack(Queue<Integer> q, Stack<Integer> s) {
			while (!q.isEmpty()) {
				int n = q.remove();
				s.push(n);
			}
		}

		// post: Values from s moved to q (added in stack order, top to bottom);
		//       s is empty
		public static void stackToQueue(Stack<Integer> s, Queue<Integer> q) {
			while (!s.isEmpty()) {
				int n = s.pop();
				q.add(n);
			}
		}

		// post: returns the sum of the values in q
		public static int sum(Queue<Integer> q) {
			int sum = 0;
			for (int i = 0; i < q.size(); i++) {
				int n = q.remove();
				sum = sum + n;
				q.add(n);
			}
			return sum;
		}

		// post: returns the sum of the values in s
		public static int sum(Stack<Integer> s) {
			int sum = 0;
			Queue<Integer> q = new LinkedList<Integer>();
			while (!s.isEmpty()) {
				int n = s.pop();
				sum = sum + n;
				q.add(n);
			}
			queueToStack(q, s);
			stackToQueue(s, q);
			queueToStack(q, s);
			return sum;
		}
	}
```

### Interfaces
* Interfaces specify certain behaviours without actually implementing them; they specify the _what_ without specifying the _how_
* In Java, the interface must explicitly state the interfaces they implement

#### IntList Interface

```java
	public interface IntList {
		public int size();
		public int get(int index);
		public String toString();
		public int indexOf(int value);
		public void add(int value);
		public void add(int index, int value);
		public void remove(int index);
	}
```

#### Headers for classes that implement the interface

```java
public class ArrayIntList implements IntList {
	...
}

public class LinkedIntList implements IntList {
	...
}
```

#### Example main method

```java
public static void main(String[] args) {
	IntList list1 = new ArrayIntList();
	processList(list1);

	IntList list2 = new LinkedIntList();
	processList(list2);
}
```

### Constructing objects
* Neither `Point[] points;` nor `Point[] points = new Point[5];` create any `Points` objects; they must instead be explicitly constructed

	```java
	// this code will create an array of Points
	// in which the Point objects are actually created
	// Creates the array
	Point[] points = new Point[5];
	// Stores each Point into the array
	for (int i = 0; i < points.length; i++) {
		points[i] = new Point(2 * i, 2 * i + 1);
	}

	// Prints each Point
	for (Point p : points) {
		System.out.println(p);
	}
	```

### Assignment suggestions (Guitar Hero)

#### Methods
* a playNote method that plays a specific note given its pitch
* a hasString method that can be used to test whether the guitar recognizes a certain character as corresponding to one of its strings
* a pluck method that plucks one of the strings
* a sample method that will return the current sound sample
* a tic method that will advance the simulation one step
* a time method that will return the number of times tic has been called

#### Interface

```java
public interface Guitar {
	public void playNote(int pitch);
	public boolean hasString(char string);
	public void pluck(char string);
	public double sample();
	public void tic();
	public int time();
}
```

#### Constructing a GuitarLite object

```java
Guitar g = new GuitarLite();
Guitar g2 = new Guitar37();
```

### Linked Lists
* Linked Lists have _sequential access_
* Accessing elements in the middle of a linked list is slow
* But inserting or removing from the middle is fast
* Composed of individual elements called nodes
* When using Linked Lists you need a variable that stores a reference to the first node

#### LinkedList Nodes
* Nodes are objects with two data fields: one for storing a single item of data and one for storing a reference to the next node in the list

##### Visualization of a node

```
+------+------+
| data | next |
|  18  |  +---+--->
+------+------+
```

##### Node Class

```java
// ListNode is a class for storing a single node of a linked list 
// It has two public data fields for the data and the link to
// the next node in the list and has three constructors:
//   public ListNode()
//     creates node with data 0, null link
//   public ListNode(int data)
//     creates node with given data, null link
//   public ListNode(int data, ListNode next)
//     creates node with given data and given link

public class ListNode {
	public int data;       // data stored in this node
	public ListNode next;  // link to next node in the list

	// post: constructs a node with data 0 and null link
	public ListNode() {
		this(0, null);
	}

	// post: constructs a node with given data and null link
	public ListNode(int data) {
		this(data, null);
	}

	// post: constructs a node with given data and given link
	public ListNode(int data, ListNode next) {
		this.data = data;
		this.next = next;
	}
}
```

```java
public class ListTest {
	public static void main(String[] args) {
		ListNode dummy = new ListNode(1);
		ListNode p = new ListNode(2, new ListNode(4));
		ListNode q = new ListNode(3, new ListNode(9));
		p.next.next = q;
		q = q.next;
		p.next.next.next = null;
	}
}
```
