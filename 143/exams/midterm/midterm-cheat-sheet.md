_CSE 143_

# Midterm Cheat Sheet

Queues should be constructed using the `Queue<E>` interface and the `LinkedList<E>` implementation.  For example, to construct a queue of String values, you would say:

  ```java
  Queue<String> q = new LinkedList<String>();
  ```

Stacks should be constructed using the `Stack<E>` class (there is no interface). For example, to construct a stack of String values, you would say:

  ```java
  Stack<String> s = new Stack<String>();
  ```

To transfer from a queue to a stack:

  ```java
  while (!q.isEmpty()) {
    s.push(q.remove());
  }
  ```

To transfer from a stack to a queue:

  ```java
  while (!s.isEmpty()) {
    q.add(s.pop());
  }
  ```

---

For `Stack<E>`, you are limited to the following operations:

  ```java
  public void push(E value);  // push given value onto top of the stack
  public E pop();             // removes and returns the top of the stack
  public boolean isEmpty();   // returns whether or not stack is empty
  public int size();          // returns number of elements in the stack
  ```

For Queue<E> you are allowed the following operations:

  ```java
  public void add(E value);  // inserts given value at the end of the queue
  public E remove();         // removes and returns the front of the queue
  public boolean isEmpty();  // returns whether or not queue is empty
  public int size();         // returns number of elements in the queue
  ```

YOU ARE NOT ALLOWED TO USE FOREACH LOOPS OR ITERATORS FOR EITHER STRUCTURE.
---
