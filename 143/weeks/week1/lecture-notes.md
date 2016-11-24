_CSE 143_
# Lecture Notes
## Week 1

### CSE 142 Review
* [142 Review Slides](https://courses.cs.washington.edu/courses/cse143/16wi/lectures/review.pdf)

### Upcoming Assignments
* The first two assignments will review arrays([week 7](../../../142/weeks/week7) and [week 8](../../../142/weeks/week8)), and classes([week 8](../../../142/weeks/week8) and [week 9](../../../142/weeks/week9))

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

### ArrayList
* CSE 142 [ArrayList Lecture](https://uw.hosted.panopto.com/Panopto/Pages/Viewer.aspx?id=d303014e-610a-48fe-a1b0-eaa20661ec53)
* CSE 142 [ArrayList Notes](../../142/weeks/week10/lecture-notes.md)
* Reminder that ArrayIntList was created to introduce you to ArrayLists
* Declare ArrayList<E> where E is some type (think of E as being short for "Element type")
	* The "E" is a type parameter that can be filled in with the name of any class (e.g., `ArrayList<String>`)

#### Construction Example

```java
ArrayList<String> list = new ArrayList<String>();
```


Obviously this isn't the correct quote. We could fix the individual calls on the appending add method, but it was a more interesting exercise to explore how to fix the list after it is constructed.
The first problem is that there is a missing word. The word "and" should appear between "score" and "seven". We want to include it at index 2 in the structure, so we used this line of code to do so:

        list.add(2, "and");
The other problem is that it includes the string "what was next?". This was originally at index 4 of the list, but now that we have inserted a new value, it has been shifted over so that it appears at index 5. So we added this line of code:
        list.remove(5);
With those two lines of code added after constructing the list, the output is now correct:
        list = [four, score, and, seven, years, ago]
All of the methods we have seen with ArrayIntList are defined for ArrayList: the appending add, add at an index, remove, size, get, etc. I said that I wanted to explore all of the ways to traverse the list, printing the values one per line. The most basic is to use the standard traversal loop for a list that uses calls on the size and get methods:
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
I mentioned that another way to do this is with a foreach loop. Chapter 7 describes how to use the foreach loop for arrays and chapter 10 describes how to use it for an ArrayList. It is the best structure to use when you are performing a "read only" operation on a list that doesn't require keeping track of the index.
The foreach loop syntax is fairly simple:

        for (String s : list) {
            System.out.println(s);
        }
We read this loop as, "for each string s that is in list..." The choice of "s" is arbitrary. It defines a local variable for the loop. I could just as easily have called it "x" or "foo" or "value". Each time through the loop Java sets the variable s to the next value from the list. You don't have to test for the size of the list or to use a call on the get method. Java does that for you when you use a for-each loop.
There are some limitations of for-each loops. You can't use them to change the contents of the list. If you assign a value the variable s, you are just changing a local variable inside the loop. It has no effect on the list itself.

Then we explored a different approach to traversing a list using what is known as an iterator. In Java there are three fundamental operations that an iterator performs:

a "hasNext" method that tells you whether or not there are any values left
a "next" method that returns the next value and advances to the one beyond
a "remove" method that removes from the structure the value that was most recently returned by a call on "next"
We wrote the following code to use an iterator for printing our list elements:
        Iterator<String> i = list.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
Then I discussed the idea of interfaces. An interface is a description of a set of behaviors. For example, all of the behaviors we have just discussed that are included in the ArrayList<E> class are also included in an interface known as List<E>. The List<E> interface says that a list has to have an appending add method, a method to add at an index, a method to remove at an index, a get method, a size method, an indexOf method, and so on.
But there are different ways to implement a list. We have been looking at how to implement it using an array. Next week we will look at how to implement it using something called a linked list. To make your programs flexible, you should declare your variables, parameters, fields, and method return types using interfaces. So instead of saying:

        ArrayList<String> list = new ArrayList<String>();
you should instead say:
        List<String> list = new ArrayList<String>();
With this declaration, the variable list is more flexible. It can store a reference to any list, not just an ArrayList. I mentioned that the best analogy I have for interfaces is that they are similar to how we use the concept of certification. You can't claim to be a certified doctor unless you have been trained to do certain specific tasks. Similarly, to be a certified teacher you have to know how to behave like a teacher, to be a certified nurse you have to know how to behave like a nurse, and so on. In Java, if you want to claim to be a certified List<E>, then you have to have several different methods. I then mentioned that this is an idea that has been used throughout the collections classes in Java (the java.util package). This idea is stressed by Joshua Bloch, the author of Effective Java. Joshua Bloch was the primary architect of the collections framework and has influenced much of Sun's work.
In the collections framework, Bloch was careful to define data structure abstractions with interfaces. For example, there are interfaces for List, Set and Map which are abstractions that we'll be discussing this week. class web page (under "useful links"). His item 34 is to "Refer to objects by their interfaces." He says, "you should favor the use of interfaces rather than classes to refer to objects. If appropriate interface types exist, parameters, return values, variables and fields should all be declared using interface types." This last sentence was in bold face in the book, indicating how important Bloch thinks this is, and I've reproduced that here. He goes on to say that, "The only time you really need to refer to an object's class is when you're creating it."

For now, this will mostly be a style issue for us. In a few weeks we will look at how interfaces are actually defined. For now, just realize that we will require you to use interface types for defining variables, fields, parameters, and method return types.

Then I then spent a little time discussing the issue of primitive data versus objects. Even though we can construct an ArrayList<E> for any class E, we can't construct an ArrayList<int> because int is a primitive type, not a class. To get around this problem, Java has a set of classes that are known as "wrapper" classes that "wrap up" primitive values like ints to make them an object. It's very much like taking a candy and putting a wrapper around it. For the case of ints, there is a class known as Integer that can be used to store an individual int. Each Integer object has a single data field: the int that it wrapped up inside.

Java also has quite a bit of support that makes a lot of this invisible to programmers. If you want to put int values into an ArrayList, you have to remember to use the type ArrayList<Integer> rather than ArrayList<int>, but otherwise Java does a lot of things for you. For example, you can construct such a list and add simple int values to it:

        List<Integer> numbers1 = new ArrayList<Integer>();
        numbers.add(18);
        numbers.add(34);
In the two calls on add, we are passing simple ints as arguments to something that really requires an Integer. This is okay because Java will automatically "box" the ints for us (i.e., wrap them up in Integer objects). We can also refer to elements of this list and treat them as simple ints, as in:
        int product = numbers.get(0) * numbers.get(1);
The calls on list.get return references to Integer objects and normally you wouldn't be allowed to multiply two objects together. In this case Java automatically "unboxes" the values for you, unwrapping the Integer objects and giving you the ints that are contained inside.
Every primitive type has a corresponding wrapper class: Integer for int, Double for double, Character for char, Boolean for boolean, and so on.

Then I mentioned that we will be looking at a kind of structure known as a Set. There is an interface that defines the behaviors of a set known as Set<E>. For now, all of the sets we will construct all of our sets using the TreeSet<E> class. For example, I used an array of data to initialize both a list and a set by adding values from the array to each:

        int[] data = {18, 4, 97, 3, 4, 18, 72, 4, 42, 42, -3};
        List<Integer> numbers1 = new ArrayList<Integer>();
        Set<Integer> numbers2 = new TreeSet<Integer>();

        for (int n : data) {
            numbers1.add(n);
            numbers2.add(n);
        }
        System.out.println("numbers1 = " + numbers1);
        System.out.println("numbers2 = " + numbers2);
This produced the following output:
        numbers1 = [18, 4, 97, 3, 4, 18, 72, 4, 42, 42, -3]
        numbers2 = [-3, 3, 4, 18, 42, 72, 97]
There are two major differences between a set and a list. Sets don't allow duplicates. So the duplicate values like 42 and 4 in the array appear just once in the set. Sets also don't allow the client to control the order of elements. The TreeSet class keeps things in sorted order. So the numbers will always be in that order. If you want to control the order, then you should use a list instead.
Sets have many of the same methods that lists do. You can add to a set, get its size, ask for an iterator, use it with a foreach loop. But it doesn't have a notion of indexing. So you can't remove at an index. Instead you remove a specific value. For example, we wrote this code to remove the value 42 from the set:

        numbers2.remove(42);
        System.out.println("numbers2 = " + numbers2);
After executing this line of code, the set no longer had 42 in it:
        numbers2 = [-3, 3, 4, 18, 72, 97]
If you don't know exactly what values you want to remove from a set, you typically use an iterator to do the removal. We began by writing this code as an attempt to remove all of the multiples of 3 from the set:
        Iterator<Integer> i2 = numbers2.iterator();
        while (i2.hasNext()) {
            int n = i2.next();
            if (n % 3 == 0) {
                numbers2.remove(n);
            }
        }
This code doesn't work. It throws a ConcurrentModificationException. Java has a rule that you can't call a mutating method on a collection while you are iterating over it. You can potentially talk to two different objects: the set or the iterator. What Java doesn't want you to do is to ask the set to change its contents while you are also talking to an iterator.
The solution is to ask the iterator to do the removal so that all of your communication is with that one object:

        Iterator<Integer> i2 = numbers2.iterator();
        while (i2.hasNext()) {
            int n = i2.next();
            if (n % 3 == 0) {
                i2.remove();
            }
        }
        System.out.println("numbers2 = " + numbers2);
This code worked and produced the following output:
        now numbers2 = [4, 97]
This is the approach you need to take when you want to both examine and remove values from a set. Because you are not allowed to alter a set while you are iterating over it, you also can't modify it with a foreach loop. That is why the foreach loop is appropriate only if you are doing a "read only" operation.
An iterator is what we would call a lightweight object. You can use the iterator to gain access to everything in the structure, but it doesn't store the data itself. I gave the analogy that this is like going to a pharmacy and you'd really like to just jump over the counter and grab your prescription, but instead you have to talk to the a person behind the counter. The person behind the counter has access to everything in the pharmacy. But that person is not the pharmacy. The person has access to the pharmacy and you (the client) talk to the person behind the counter to get things done. That's how an iterator works. It has full access to the underlying structure and it keeps track of how much of the structure it has traversed, but that's not the same thing as being the structure.

I said that this would be much clearer in section when we practice writing code that manipulates sets. Chapter 13 also has a useful table of set operations.
