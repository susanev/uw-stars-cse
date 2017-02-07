_CSE 143_

# Midterm Cheat Sheet
You will be provided a cheat sheet with the information below on your midterm. If you are interested in the actual format of the document, check out [this year's version](http://courses.cs.washington.edu/courses/cse143/17wi/exams/cheat-mid.pdf).

## Math Methods
_Mathematical operations_

| Method | Description |
| :--- | :--- |
| `Math.abs(value)` | absolute value |
| `Math.min(v1, v2)` | smaller of two values |
| `Math.max(v1, v2)` | larger of two values |
| `Math.round(value)` | nearest whole number |
| `Math.pow(b, e)` | b to the e power |

## Stacks and Queues
_LIFO and FIFO structures_

Queues should be constructed using the `Queue<E>` interface and the `LinkedList<E>` implementation (you may not pass any arguments to the constructor). For example, to construct a queue of String values, you would say:

  ```java
  Queue<String> q = new LinkedList<String>();
  ```

Stacks should be constructed using the `Stack<E>` class (there is no interface).

  ```java
  Stack<String> s = new Stack<String>();
  ```

For `Stack<E>`, you are limited to the following operations:

| Method | Description |
| :--- | :--- |
| `push(value);` | pushes the given value onto top of the stack |
| `pop();` | removes and returns the top of the stack |
| `isEmpty();` | returns true if the stack is empty |
| `size();` | returns number of elements in the stack |

For Queue<E> you are allowed the following operations:

| Method | Description |
| :--- | :--- |
| `add(value);` | adds the given value at the end of the queue |
| `remove();` | removes and returns the front of the queue |
| `isEmpty();` | returns true if the queue is empty |
| `size();` | returns number of elements in the queue |

## String Methods
_An object for storing a sequence of characters_

| Method | Description |
| :--- | :--- |
| `length()` | returns the number of characters in the string |
| `charAt(index)` | returns the character at a specific index |
| `equals(other)` | returns true if this string equals the other |
| `toUpperCase()` | returns a new string with all uppercase letters |
| `toLowerCase()` | returns a new string with all lowercase letters |
| `startsWith(other)` | returns true if this string starts with the given text |
| `substring(start, stop)` | returns a new string composed of characters from start index (inclusive) to stop index (exclusive) |
| `substring(start)` | returns a new string composed of characters from start index (inclusive) to the end of the string |