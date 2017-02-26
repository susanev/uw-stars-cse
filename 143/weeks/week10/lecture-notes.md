_CSE 143_
# Lecture Notes
## Week 10

### Final Review
#### Types of Questions

| # | Points | Description |
| :--- | :--- | :--- |
| 1 | 6 | Binary Tree Traversal |
| 2 | 4 | Binary Search Tree |
| 3 | 5 | Collections Mystery |
| 4 | 5 | Collections Programming |
| 5 | 10 | Binary Trees |
| 6 | 10 | Collections Programming |
| 7 | 20 | Comparable class |
| 8 | 20 | Binary Trees |
| 9 | 20 | Linked Lists |

#### Tips
* Do the 20pt questions first, if you run out of time and do not get to these questions it will not be possible to pass the test
  * Use the mechanical problems as a break from the 20pt problems, if your brain needs it
* It's easy to make a mistake on the Binary Search Tree problem, and its difficult for the graders to award partial credit, do check this problem closely before moving on
  * Write the alphabet down on your paper (if you struggle with it, I do!)
  * You can verify by doing an inorder traversal and seeing if the output is ordered
* Practice, practice, practice the 10pt Collections Programming question, there are a lot of small syntax details that you need to get correct to get a high score
  * You will need to know when to use a HashSet vs a TreeSet
  * In order to use TreeSet or TreeMap keys the type must implement the Comparable interface, otherwise you should use HashSet or HashMap
  * Point does not implement Comparable
* Usually, the more difficult part of the 20pt Binary Tress question is figuring out the parameters for your private method; so put time and effort into determining your parameters
* Practice a lot for the Linked Lists questions, in the past students have lost the most points on this question
  * You cannot ask if curr.next != null unless you first know that curr is not null
* Sorted output usually means sorted structure


### IntList Case Study

#### Code
* [AbstractIntList](code/AbstractIntList.java)
* [ArrayIntList](code/ArrayIntList.java)
* [LinkedIntList](code/LinkedIntList.java)

#### IntList Interface

```java
public interface IntList extends Iterable<E> {
	public int size();
	public int get(int index);
	public int indexOf(int value);
	public boolean isEmpty();
	public boolean contains(int value);
	public void add(int value);
	public void add(int index, int value);
	public void addAll(IntList other);
	public void remove(int index);
	public void removeAll(IntList other);
	public void set(int index, int value);
	public void clear();
}
```

#### AbstractIntList
* We keep IntList as an interface, but we also introduce an abstract class that we can use to factor out common code between our two implementations

	```
	      AbstractIntList----(implements)----> IntList
	       /          \
	      /            \
	ArrayIntList  LinkedIntList
	```

* The abstract class allows us to eliminate any redundant code for our two implementations
* This pattern is so useful that you'll find it used throughout the collections framework
	* For example, there is a Map interface that has two implementations called TreeMap and HashMap and each of the implementations extend a class called AbstractMap
	* There is a similar structure for sets and lists

#### `addAll`

```java
// while loop version
public void addAll(IntList other) {
	Iterator<Integer> i = other.iterator();
	while (i.hasNext())
		add(i.next());
}

// for each version
public void addAll(IntList other) {
	for (int i: other)
		add(i);
}
```

#### `removeAll`
* The iterator's remove method is supposed to remove the value that was most recently returned by a call on next
* As a result, it's not legal to call remove two times in a row or to call remove before next has been called
* Note: You cannot remove when using a for each, so you need to use an iterator here

```java
public void removeAll(IntList other) {
	Iterator<Integer> i = iterator();
	while (i.hasNext())
		if (other.contains(i.next()))
			i.remove();
}
```

### Hashing

#### Time Analysis

| Structure | add | find | remove | Notes |
| :--- | :--- | :--- | :--- | :--- |
| unsorted array | O(1) | O(n) | O(n) | remove is expensive only because you have to first find the value |
| sorted array | O(n) | O(log n) | O(n) | add and remove are expensive because you have to shift values |
| unsorted linked list | O(1) | O(n) | O(n) | remove is expensive only because you have to first find the value |
| sorted linked list | O(n) | O(n) | O(n) | add and remove are expensive because you have to find the right spot |
| binary search tree | O(log n) | O(log n) | O(log n) | assuming tree is balanced |
| hash table | O(1) | O(1) | O(1) | |

* The binary search tree seems to do well overall, this is why the Java class libraries include tree implementations of sets and maps
* But it turns out you can do even better, with a structure known as a hash table, you can get O(1) for each of these operations
* Note: HashSet and TreeSet are considerably faster than what you could get with an ArrayList and that HashSet is somewhat faster than TreeSet

#### Hash Functions
* We need some way to turn data into an int, the function that does this is known as your hash function:
  
	```
	hash function: data --> int
	```

* In Java, every object has a method called hashCode() that does this
* It is built into Java whether you define it or not
* Some classes have specialized hash functions
	* The String class, for example, overrides the hashCode method with a hash function that is particularly effective for Strings

##### Java's Hash Function for Strings

```java
public int hashCode() {
	int h = hash;
	if (h == 0 && count > 0) {
		int off = offset;
		char val[] = value;
		int len = count;

		for (int i = 0; i < len; i++) {
			h = 31*h + val[off++];
		}
		hash = h;
	}
	return h;
}
```

#### Load Factor
* One of the other basic ideas in hashing is to have a table that has extra room, relative to the data you are going to include
* There is a special value known as the load factor (sometimes referred to as lambda) that indicates how full the table is
* A typical value for load factor would be 0.5, indicating that the table is half full
* So if you wanted to have 5,000 values in the table, you'd make the table be 10,000 long

#### Example
* A hash table is typically allocated as an array
* Imagine allocating an array with 10,000 locations for storing our 5,000 values:

	```
	      +---------+
	  [0] |         |
	      +---------+
	  [1] |         |
	      +---------+
	  [2] |         |
	      +---------+
	  [3] |         |
	      +---------+
	[...] |   ...   |
	      +---------+
	[9999]|         |
	      +---------+
	```

* Suppose that we are including Strings and we want to put the String "Reges" into the table
* We use the hash function to turn the String into an int
* You can ask Java to tell you the value of: `"Reges".hashCode()`
* That turns out to be `78839842`, we take this and mod it by the size of our table to find a location (78839842 % 10000, which equals 9842); so we put the value in that location

	```
	      +---------+
	  [0] |         |
	      +---------+
	  [1] |         |
	      +---------+
	  [2] |         |
	      +---------+
	[...] |   ...   |
	      +---------+
	[9842]| "Reges" |
	      +---------+
	[...] |   ...   |
	      +---------+
	[9999]|         |
	      +---------+
	```

* Later, if someone asks me to find whether "Reges" is in the list, I again use the hash function and figure out that if it's in the list, it would have to be at location 9842
	* This allows me to quickly go to the exact spot in the list where it should be
* It's not quite that simple because two values might end up going into the same spot
	* Some other String might also end up belonging in array position 9842
	* That is known as a __collision__ and a lot of work has been done to figure out how to resolve collisions
	* One way to resolve the collision is to keep a linked list for each array value that has a list of all the values that went to that particular spot in the array
	* In other words, our array becomes an array of linked lists
	* This technique is called separate chaining and it is the technique used by Java's HashMap and HashSet classes

#### Hashing Performance
* Hashing will not perform well if you have a bad hash function
* For example, suppose that your hash function turns all of your data into the int 42
	* That is technically a hash function because it converts data into an int, but because everything goes to 42, the hash table falls apart
	* With separate chaining, we end up with a really long linked list at array index 42, which means we degenerate to the poor performance of an unsorted linked list
* In practice if you have a hash function that spreads things out and you have a good collision resolution strategy, you will end up examining only a few items on average (on the order of 2 or 3 values)

#### Java source code
* If you have installed the JDK on a Windows machine, then you have a copy of the Java source code
	* It will be in a folder with a name like "c:\Program Files\Java" in a subfolder with a name that begins with jdk
	* In that folder you will find a file called src.zip
	* That is the source code for many of the Java class libraries
	* To find the source code for HashMap which is in the java.util package, you would open src/java/util/HashMap.java
