# Lecture Notes
## Week 1

### CSE 142 Review
* [142 Review Slides](https://courses.cs.washington.edu/courses/cse143/16wi/lectures/review.pdf)

### Upcoming Assignments
* The first two assignments will review arrays([week 7](../../../142/weeks/week7) and [week 8](../../../142/weeks/week8)), and [classes]([week 8](../../../142/weeks/week8) and [week 9](../../../142/weeks/week9))

### Constructors
* Every time you use the `new` keyword, Java calls a special method called a __constructor__.
* Constructor's have the same name as their class, and have no return type
* If you do not define a constructor, then Java provides one for you with no parameters
* Code to initialize fields should be placed in your constructor even though Java does auto-initialization the CSE142 Style standards require you to explicitly initialize your fields
* Do not restate the type of the fields you are initializing, this will cause a local variable to be declared and your field will not be initialized

### ArrayIntList
* `ArrayIntList` was discussed in detail, which is something that Stuart uses to introduce ArrayLists

#### Code 

```java
// ArrayIntList Client
public class ArrayIntListClient {
	public static void main(String[] args) {
		ArrayIntList list1 = new ArrayIntList(200);
		ArrayIntList list2 = new ArrayIntList(500);
		list1.add(1);
		list1.add(82);
		list1.add(97);
		list2.add(7);
		list2.add(-8);
		System.out.println(list1);
		System.out.println(list2);
	}
}
```

```java
// ArrayIntList Class
public class ArrayIntList {
	private int[] elementData;
	private int size;

	public ArrayIntList(int capacity) {
		// notice that we do not restate int[]
		elementData = new int[capacity];
		size = 0;
	}

	public void add(int value) {
		elementData[size] = value;
		size++;
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
}
```

### Encapsulation
* An object encapsulates state and behavior
	* In programming, state usually means variables (data) and behaviour usually means methods
* You can encapsulate the state by placing the `private` keyword before all of your fields

### toString
* You can explicitly call the toString method (e.g., `object.toString()`) but if you don't then Java will call it implicitly for you

### Pre/Post Conditions
* A way to describe the contract a method has with the client
* __Preconditions__ are assumptions that the method makes (i.e, dependencies)
	* It is important to document every precondition, every assumption that you are making about the method you are writing
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

### Constructors
* By default Java includes a constructor in all classes without one, that takes no parameters
	* But if you add a constructor, then this default constructor is no longer provided
* Constructors can be defined in terms of other constructors, and this is a good style solution 

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

### Updated ArrayIntList

#### Code

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
