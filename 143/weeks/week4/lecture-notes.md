_CSE 143_
# Lecture Notes
## Week 4

### Searching
#### Binary search
* With binary search, you can quickly locate a value in a sorted list of numbers
* Guess in the middle, than eliminate half and repeat until the value is found

	```
	n / 2 / 2 / 2 ... / 2 = 1
	n / 2^? = 1
	n = 2^?
	? = log2(n)
	```

* Faster than linear search


#### Linear search
* Looking for an item by starting at the beginning and going one-by-one until it is found

### Complexity
* The resources (time and space) required to execute a piece of code
	* Time: How long the algorithm/code takes to execute
	* Space: How much computer memory the algorithm/code consumes
* We can generally make a program work with less memory if we're willing to have it take more time to run
* We can also generally get programs to run faster if we're willing to allocate some extra memory to the task
* The resource that computer scientists most often refer to when talking about complexity is time (specifically the growth rate as the input size increases)
* When calculating the complexity, ignore constant multipliers and lower order terms—focus on the main term

| Complexity | Name | Description | Example |
| :--- | :--- | :--- | :--- |
| O(1) | Constant | The time does not depend on `n` | |
| O(log n) | Logarithmic |  | Binary search |
| O(n) | Linear |  If you double `n`, the number of steps doubles | Linear search |
| O(n log n) | Log-linear | | Merge sort |
| O(n&#178;) | Quadratic | If you double `n`, the number of steps quadruples | Insertion sort |
| O(n&#179;) | Cubic algorithms | |
| O(2<sup>n</sup>) | Exponential | Usually not practical | |

#### Example
Given an array, find the maximum sum of a contiguous sequence. Suppose you have an array that stores these values:

```
  [0]   [1]   [2]   [3]   [4]   [5]   [6]   [7]   [8]   [9]
+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+
|  14 |  8  | -23 |  4  |  6  |  10 | -18 |  5  |  5  |  11 |
+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+
```

The maximum sum is obtained by adding up the values from index [3] through [9]:

```
4 + 6 + 10 + -18 + 5 + 5 + 11 = 23
```

##### O(n&#179;) Solution

```java
int max = list[0];
int maxStart = 0;
int maxStop = 0;
for (int start = 0; start < list.length; start++)
	for (int stop = start; stop < list.length; stop++) {
		int sum = 0;
		for (int i = start; i <= stop; i++) {
			sum += list[i];
		}
		if (sum > max) {
			max = sum;
			maxStart = start;
			maxStop = stop;
		}
	}
}
```

##### O(n&#178;) solution

```java
int max = list[0];
int maxStart = 0;
int maxStop = 0;
for (int start = 0; start < list.length; start++) {
	int sum = 0;
	for (int stop = start; stop < list.length; stop++) {
		sum += list[stop];
		if (sum > max) {
			max = sum;
			maxStart = start;
			maxStop = stop;
		}
	}
}
```

##### O(n) solution

```java
int max = list[0];
int maxStart = 0;
int maxStop = 0;
int start = 0;
int sum = 0;
for (int i = 0; i < list.length; i++) {
	if (sum < 0) {
		start = i;
		sum = 0;
	}
	sum += list[i];
	if (sum > max) {
		max = sum;
		maxStart = start;
		maxStop = i;
	}
}
```

_Note: [MaxSum.java](code/MaxSum.java) has the code altogether in one file

### Sets
* Unordered collection of unique values
* No repeats, only adds unique values
* In Java `Set` is an interface
* `TreeSet` implementation is fast, and maintains the elements in sorted order
* `HashSet` is faster, but does not maintain the elements in any order

#### Set Methods

| Method | Description |
| :--- | :--- |
| `add(val)` | Adds val to the set |
| `contains(val) | Returns true if val is a member of the set | 
| `remove(val) | Removes val from the set |
| `clear() | Removes all elements from the set |
| `size() | Returns the number of elements in the set |
| `isEmpty() | Returns true whenever the set contains no elements |
| `toString() | Returns a string representation |

#### Iterating over a set

```java
Set<Integer> set = new HashSet<Integer>();
set.add(5);
set.add(5);
set.add(5);
set.add(10);
set.add(12);
for (int i : set) {
	System.out.println(i);
}
```

#### Counting unique words

```java
Set<String> words = new TreeSet<String>();
while (input.hasNext()) {
	String next = input.next().toLowerCase();
	words.add(next);
}
System.out.println("Total words = " + words.size());
```


### Maps
* Maps keep track of key/value pairs
* Keys are unique
* Java has a `Map` interface
* `TreeMap` implementation is fast, and maintains the keys in sorted order
* `HashMap` is faster, but does not maintain the keys in any order

#### Creating a Map

```java
// Replace K and V with Object Types
// HashMap
Map map<K, V> = new HashMap<K,V>();
// TreeMap
Map map<K, V> = new TreeMap<K,V>();
```

#### Map Methods

| Method | Description |
| :--- | :--- |
| `put(key,val)` | Adds a mapping from key to val; if key already maps to a value, that mapping is replaced with val |
| `get(key)` | Returns the value mapped to by the given key or null if there is no such mapping in the map |
| `containsKey(key)` | Returns true if the map contains a mapping for key |
| `remove(key)` | Removes any existing mapping for key from the map |
| `clear()` | Removes all key/value pairs from the map |
| `size()` | Returns the number of key/value pairs in the map |
| `isEmpty()` | Returns true whenever the map contains no mappings |
| `toString()` | Returns a string representation |
| `keySet()` | Returns a set of all keys in the map |
| `values()` | Returns a collection of all values in the map |
| `putAll(map)` | Adds all key/value pairs from the given map to this map |
| `equals(map)` | Returns true if given map has the same mappings as this |

#### Counting individual words
* Using a map from the collections framework is a good solution
* In this case we want to keep track of the word, and the count of the number of times we have seen that word
* Map initialization code: `Map<String, Integer> count = new TreeMap<String, Integer>();`

##### Creating the Map
```java
Map<String, Integer> count = new TreeMap<String, Integer>();
while (input.hasNext()) {
	String next = input.next().toLowerCase();
	if (!count.containsKey(next)) {
		count.put(next, 1);
	} else {
		count.put(next, count.get(next) + 1);
	}
}
```

##### Printing the values in the map

```java
for (String word : count.keySet()) {
	System.out.println(count.get(word) + "\t" + word);
}
```

### Friends Code Example
_Note: [Friends.java](code/Friends.java) has a finished version of this code_
 
```java

import java.io.*;
import java.util.*;

public class Friends1 {
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Welcome to the cse143 friend finder.");
		Scanner input = new Scanner(new File("friends.dot"));
		Map<String, Set<String>> friends = readFile(input);
		System.out.println(friends);

		// more to do
	}

	public static Map<String, Set<String>> readFile(Scanner input) {
		Map<String, Set<String>> friends = new TreeMap<String, Set<String>>();
		while (input.hasNextLine()) {
			String line = input.nextLine();
			if (line.contains("--")) {
				Scanner lineData = new Scanner(line);
				String name1 = lineData.next();
				lineData.next();  // this skips the "--" token
				String name2 = lineData.next();
				addTo(friends, name1, name2);
				addTo(friends, name2, name1);
			}
		}
		return friends;
	}

	public static void addTo(Map<String, Set<String>> friends, String name1, 
	 String name2) {
		if (!friends.containsKey(name1)) {
			Set<String> theFriends = new TreeSet<String>();
			friends.put(name1, theFriends);
			theFriends.add(name2);
		} else {
			Set<String> theFriends = friends.get(name1);
			theFriends.add(name2);
		}
	}
}
```

#### A more concise `addTo` method
```java
public static void addTo(Map<String, Set<String>> friends, String name1, 
String name2) {
	if (!friends.containsKey(name1)) {
		friends.put(name1, new TreeSet<String>());
	}
	friends.get(name1).add(name2);
}
```

### String Review (Helpful for Evil Hangman)

#### Example: Insert dashes

```java
// pre: s is not an empty string
public static String dashes(String s) {
	String result = "" + s.charAt(0);
	for (int i = 1; i < s.length(); i++) {
		result = result + "-" + s.charAt(i);
	}
	return result;
}
```

### Assignment Reminders
* If you create a method that is not described in the assignment writeup (often called a _helper method_) that method should be `private` instead of `public`
