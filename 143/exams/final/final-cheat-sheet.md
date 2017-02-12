_CSE 143_

# Final Cheat Sheet
You will be provided a cheat sheet with the information below on your midterm. If you are interested in the actual format of the document, check out [last year's version](https://courses.cs.washington.edu/courses/cse143/16wi/handouts/27.html).


## Linked Lists
Below is an example of a method that could be added to the LinkedIntList class to compute the sum of the list:

	```java
	public int sum() {
		int sum = 0;
		ListNode current = front;
		while (current != null) {
			sum += current.data;
			current = current.next;
		}
		return sum;
	}
	```

## Math Methods
_Mathematical operations_

| Method | Description |
| :--- | :--- |
| `Math.abs(value)` | absolute value |
| `Math.min(v1, v2)` | smaller of two values |
| `Math.max(v1, v2)` | larger of two values |
| `Math.round(value)` | nearest whole number |
| `Math.pow(b, e)` | b to the e power |

## Two-dimensional Arrays
* construct a rectangular array with 4 rows and 6 columns:
	
	```java
	int[][] data = new int[4][6];
	```

* construct a jagged array with different numbers of columns in each row (3 rows that have 2, 3, and 5 columns):

	```java
	int[][] data = new int[3][];
	data[0] = new int[2];
	data[1] = new int[3];
	data[2] = new int[5];
	```

* Example values:

	| Code | Description |
	| :--- | :--- |
	| `data` | 
entire array
	| `data[2]` | row 2 |
	| `data[2][3]` | value in row 2 and column 3 |
	| `data.length` | number of rows |
	| `data[2].length` | number of columns in row 2 |

## Iterator<E> Methods
_An object that lets you examine the contents of any collection_

| Method | Description |
| :--- | :--- |
| `hasNext()` | returns true if there are more elements to be read from collection |
| `next()` | reads and returns the next element from the collection |
| `remove()` | removes the last element returned by next from the collection |

## List<E> Methods
_An ordered sequence of values_

| Method | Description |
| :--- | :--- |
| `add(value)` | appends value at end of list |
| `add(index, value)` | inserts given value at given index, shifting subsequent values right |
| `clear()` | removes all elements of the list |
| `indexOf(value)` | returns first index where given value is found in list (-1 if not found) |
| `get(index)` | returns the value at given index |
| `remove(index)` | removes/returns value at given index, shifting subsequent values left |
| `set(index, value)` | replaces value at given index with given value |
| `size()` | returns the number of elements in list |
| `isEmpty()` | returns true if the listÕs size is 0 |
| `addAll(collection)` | adds all elements from the given collection to the end of the list |
| `contains(value)` | returns true if the given value is found somewhere in this list |
| `remove(value)` | finds and removes the given value from this list |
| `removeAll(list)` | removes any elements found in the given collection from this list |
| `iterator()` | returns an object used to examine the contents of the list |

## Set<E> Methods
_ A fast-searchable set of unique values_

| Method | Description |
| :--- | :--- |
| `add(value)` | adds the given value to the set |
| `contains(value)` | returns true if the given value is found in the set |
| `remove(value)` | removes the given value from the set |
| `clear()` | removes all elements of the set |
| `size()` | returns the number of elements in the set |
| `isEmpty()` | returns true if the set's size is 0 |
| `addAll(collection)` | adds all elements from the given collection to the set |
| `containsAll(collection)` | returns true if set contains every element from given collection |
| `removeAll(collection)` | removes any elements found in the given collection from this set |
| `retainAll(collection)` | removes any elements not found in the given collection from this set |
| `iterator()` | returns an object used to examine the contents of the set |

## Map<K, V> Methods
_A fast mapping between a set of keys and a set of values_

| Method | Description |
| :--- | :--- |
| `put(key, value)` | adds a mapping from the given key to the given value |
| `get(key)` | returns the value mapped to the given key (null if none) |
| `containsKey(key)` | returns true if the map contains a mapping for the given key |
| `remove(key)` | removes any existing mapping for the given key |
| `clear()` | removes all key/value pairs from the map |
| `size()` | returns the number of key/value pairs in the map |
| `isEmpty()` | returns true if the map's size is 0 |
| `keySet()` | returns a Set of all keys in the map |
| `values()` | returns a Collection of all values in the map |
| `putAll(map)` | adds all key/value pairs from the given map to this map |

## Point Methods
_an object for storing integer x/y coordinates_

| Method | Description |
| :--- | :--- |
| `Point(x, y)` | constructs a new point with given x/y coordinates |
| `Point()` | constructs a new point with coordinates (0, 0) |
| `getX()` | returns the x-coordinate of this point |
| `getY()` | returns the y-coordinate of this point |
| `equals(other)` | returns true if this Point stores the same x/y values as the other |
| `translate(dx, dy)` | translates the coordinates by the given amount |

## String Methods
_An object for storing a sequence of characters_

| Method | Description |
| :--- | :--- |
| `length()` | returns the number of characters in the string |
| `charAt(index)` | returns the character at a specific index |
| `compareTo(other)` | returns how this string compares to the other |
| `equals(other)` | returns true if this string equals the other |
| `toUpperCase()` | returns a new string with all uppercase letters |
| `toLowerCase()` | returns a new string with all lowercase letters |
| `startsWith(other)` | returns true if this string starts with the given text |
| `substring(start, stop)` | returns a new string composed of characters from start index (inclusive) to stop index (exclusive) |

## Collections Implementations

| Collection | Implementation |
| :--- | :--- |
| `List<E>` | `ArrayList<E> and LinkedList<E>` |
| `Set<E>` | `HashSet<E> and TreeSet<E>` (values ordered) |
| `Map<K, V>` | `HashMap<K, V> and TreeMap<K, V>` (keys ordered) |