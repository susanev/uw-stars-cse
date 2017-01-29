W_CSE 143_
# Lecture Notes
## Week 1

### CSE 142 Review
* [142 Review Slides](https://courses.cs.washington.edu/courses/cse143/16wi/lectures/review.pdf)

### Upcoming Assignments
* The first two assignments will review arrays([week 7](../../../142/weeks/week7) and [week 8](../../../142/weeks/week8)), and classes([week 8](../../../142/weeks/week8) and [week 9](../../../142/weeks/week9))

### Classes
* Collect together, related data
* Fields of a class store the state of the class

### Constructors
* Every time you use the `new` keyword, Java calls a special method called a _constructor_
* Constructor's have the same name as their class, and have no return type
* If you do not define a constructor, then Java provides one for you with no parameters
* Code to initialize fields should be placed in your constructor even though Java does auto-initialization the CSE143 Style standards require you to explicitly initialize your fields inside of your constructor
* Do not restate the type of the fields you are initializing, this will cause a local variable to be declared and your field will not be initialized
* By default Java includes a constructor in all classes without one, that takes no parameters
	* But if you add a constructor, then this default constructor is no longer provided
* Constructors can be defined in terms of other constructors, and this is a good style solution 

	```java
	// Two constructors in the same class
	// first instructor calls the second using the this keyword
	// Note: constructors must be different, so they must take in different parameters
	public ArrayIntList() {
		this(100);
	}

	public ArrayIntList(int capacity) {
		elementData = new int[capacity];
		size = 0;
	}
	```

### ArrayIntList
* `ArrayIntList` was discussed in detail, which is something that Stuart uses to introduce ArrayLists

### Encapsulation
* An object encapsulates state and behavior
	* State is the data (the variables)
	* Behaviour is the methods
* You can encapsulate the state by placing the `private` keyword before all of your fields

### toString
* You can explicitly call the toString method (e.g., `object.toString()`) but if you don't, then Java will call it implicitly for you

### Pre/Post Conditions
* A way to describe the contract a method has with the client
* __Preconditions__ are assumptions that the method makes (i.e, dependencies)
	* It is important to document every precondition (assumption) that you are making about the method you are writing
	* You can throw an exception if the client violates a precondition
	* When an exception is thrown it will stop the method from executing
* __Postconditions__ describe what the method accomplishes assuming the preconditions are met

#### Example Code

```java
// pre : 0 <= index < size() (throws IndexOutOfBoundsException if not)
// post: returns the value at the given index
public int get(int index) {
	if (index < 0 || index >= size) {
	    throw new IndexOutOfBoundsException("index: " + index);
	}
  return elementData[index];
}
```

### Constants
* It is okay to have public constants, because they are declared to be final and cannot be changed

### Boolean Zen
* CSE 143 students are expected to use _boolean zen_ principles for all boolean variables and expressions

```java
// instead of this (not boolean zen)
if (indexOf(value) >= 0) {
	return true;
} else {
	return false'
}
```

```java
// use this! (boolean zen)
return indexOf(value) >= 0;
```

### ArrayIntList

```java
// ArrayIntList Client
public class ArrayIntListClient {
	public static void main(String[] args) {
		ArrayIntList list = new ArrayIntList(25);
		list.add(3);
		list.add(7);
		list.add(11);
		System.out.println("initial list = " + list);
		list.add(0, 2);
		list.add(2, 5);
		System.out.println("after some adds = " + list);
		System.out.print("index of:");
		for (int i = 1; i < 10; i += 2) {
			System.out.print("   " + i + " -> " + list.indexOf(i));
		}
		System.out.println();
		System.out.print("get:");
		for (int i = 0; i < list.size(); i++) {
			System.out.print("   " + i + " -> " + list.get(i));
		}
		System.out.println();
		System.out.println("list = " + list);
		while (list.size() > 0) {
			int i = (int) (Math.random() * list.size());
			list.remove(i);
			System.out.println("after removing at " + i + " list = " + list);
		}
	}
}
```

```java
// ArrayIntList Class
public class ArrayIntList {
	public static final int DEFAULT_CAPACITY = 100;

	private int[] elementData;
	private int size;

	// post: constructs an empty list of default capacity
	public ArrayIntList() {
		// calls the constructor above, passing 100
		this(DEFAULT_CAPACITY);
	}

	// pre : capacity >= 0 (throws IllegalArgumentException if not)
	// post: constructs an empty list with the given capacity
	public ArrayIntList(int capacity) {
		if (capacity < 0) {
			throw new IllegalArgumentException("capacity: " + capacity);
		}
		elementData = new int[capacity];
		size = 0;
	}

	// post: returns the current number of elements in the list
	public int size() {
		return size;
	}

	// pre : 0 <= index < size() (throws IndexOutOfBoundsException if not)
	// post: returns the value at the given index
	public int get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("index: " + index);
		}
		return elementData[index];
	}

	public String toString() {
		if (size == 0) {
			return "[]";
		} else {
			String result = "[" + elementData[0];
			for (int i = 1; i < size; i++) {
				result += ", " + elementData[i];
			}
			result += "]";
			return result;
		}
	}

	// post : returns the position of the first occurrence of the given
	//        value (-1 if not found)
	public int indexOf(int value) {
		for (int i = 0; i < size; i++) {
			if (elementData[i] == value) {
				return i;
			}
		}
		return -1;
	}

	// post: returns true if list is empty, false otherwise
	public boolean isEmpty() {
		return size == 0;
	}

	// post: returns true if the given value is contained in the list,
	//       false otherwise
	public boolean contains(int value) {
		return (indexOf(value) >= 0);
	}

	// pre : size() < capacity (throws IllegalStateException if not)
	// post: appends the given value to the end of the list
	public void add(int value) {
		add(size, value);
	}

	// pre : size() < capacity (throws IllegalStateException if not) &&
	//       0 <= index <= size() (throws IndexOutOfBoundsException if not)
	// post: inserts the given value at the given index, shifting subsequent
	//       values right
	public void add(int index, int value) {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("index: " + index);
		}
		if (size + 1 > elementData.length) {
			throw new IllegalStateException("would exceed list capacity");
		}
		for (int i = size; i > index; i--) {
			elementData[i] = elementData[i - 1];
		}
		elementData[index] = value;
		size++;
	}

	// pre : 0 <= index < size() (throws IndexOutOfBoundsException if not)
	// post: removes value at the given index, shifting subsequent values left
	public void remove(int index) {
		checkIndex(index);
		for (int i = index; i < size - 1; i++) {
			elementData[i] = elementData[i + 1];
		}
		size--;
	}

	// post: throws an IndexOutOfBoundsException if the given index is
	//       not a legal index of the current list
	private void checkIndex(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("index: " + index);
		}
	}
}
```

### ArrayList
* CSE 142 [ArrayList Lecture](https://uw.hosted.panopto.com/Panopto/Pages/Viewer.aspx?id=d303014e-610a-48fe-a1b0-eaa20661ec53)
* CSE 142 [ArrayList Notes](../../142/weeks/week10/lecture-notes.md)
* Reminder that Stuart created ArrayIntList to introduce you to ArrayLists
* Declare `ArrayList<E>` where `E` is some type (think of `E` as being short for "Element type")
	* The `E` is a type parameter that can be filled in with the name of any class (e.g., `ArrayList<String>`)

#### Construction Example

```java
ArrayList<String> list = new ArrayList<String>();
```

#### Traversal Loops
Traversal loops, loop through an entire data structure looking at and doing something with each element (in this case, printing each element).

```java
// standard traversal
for (int i = 0; i < list.size(); i++) {
	System.out.println(list.get(i));
}
```

```java
// foreach traversal
// cannot use to change contents of the list
for (String s : list) {
	System.out.println(s);
}
```

### Iterators
* You can use the iterator to gain access to everything in the structure, but it doesn't store the data itself
* It has full access to the underlying structure and it keeps track of how much of the structure it has traversed

| Method | Description |
| :--- | :--- |
| `hasNext()` | returns true if there are values left, otherwise false |
| `next()` | returns the next value and advances to the one beyond |
| `remove()` | removes from the structure the value that was most recently returned by a call on `next` |

#### Sample Code

```java
Iterator<String> itr = list.iterator();
while (itr.hasNext()) {
    System.out.println(itr.next());
}
```

### Interfaces
* An interface is a description of a set of behaviors
* To make your programs flexible, you should declare your variables, parameters, fields, and method return types using interfaces (not with specific Classes, like `ArrayList`)
* The two interfaces you should be aware of now are `List` and `Set`

```java
// instead of ...
ArrayList<String> list = new ArrayList<String>();

// use ...
List<String> list = new ArrayList<String>();
```

### Primitive data versus Objects
* Review the CSE 142 [Week 10 Lecture Notes](../../142/weeks/week10/lecture-notes.md)
* Even though we can construct an `ArrayList<E>` for any class `E`, we can't construct an `ArrayList<int>` because `int` is a primitive type, not a class
* To get around this problem, Java has a set of classes that are known as _wrapper_ classes that "wrap up" primitive values like ints to make them an object
* If you want to put `int` values into an `ArrayList`, use the type `ArrayList<Integer>` rather than `ArrayList<int>`
* Every primitive type has a corresponding _wrapper_ class

### Sets
* There is an interface that defines the behaviors of a set known as `Set<E>`
* For now, all of the sets we will construct will use the `TreeSet<E>` class
* Sets don't allow duplicates
* Sets are unordered
* Sets do not have the notion of indexing
* You cannot remove at an index, but can remove a specific value
* You can add to a set, get its size, ask for an iterator, use it with a foreach loop

#### Example Code

```java
int[] data = {18, 4, 97, 3, 4, 18, 72, 4, 42, 42, -3};
List<Integer> numbers1 = new ArrayList<Integer>();
Set<Integer> numbers2 = new TreeSet<Integer>();

for (int n : data) {
    numbers1.add(n);
    numbers2.add(n);
}

System.out.println("numbers1 = " + numbers1);
System.out.println("numbers2 = " + numbers2);
```

```java
Iterator<Integer> itr2 = numbers2.iterator();
while (itr2.hasNext()) {
	if (i2tr.next() % 3 == 0) {
		// note, we use the iterator to remove!
		itr2.remove();
	}
}
System.out.println("numbers2 = " + numbers2);
```