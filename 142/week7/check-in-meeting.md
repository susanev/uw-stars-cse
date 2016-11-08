# Check-in Meeting
## Week 7

### General Items
* Check homework
* How did the midterm go?
* Is there anything that we should have practiced more together? Anything that you were suprised to see on the midterm?
* Have you started  A6?
* Reminders about academic honesty

### Problems
1. Consider the following method, mystery.

  ```java
  public static void mystery(int[] a, int[] b) {
      for (int i = 0; i < a.length; i++) {
          a[i] += b[b.length - 1 - i];
      }
  }
  ```

  What are the values of the elements in array a1 after the following code executes?

  ```java
  int[] a1 = {1, 3, 5, 7, 9};
  int[] a2 = {1, 4, 9, 16, 25};
  mystery(a1, a2);
  ```
  
2. Consider the following method, mystery.

  ```java
  public static void mystery2(int[] a, int[] b) {
      for (int i = 0; i < a.length; i++) {
          a[i] = a[2 * i % a.length] - b[3 * i % b.length];
      }
  }
  ```

  What are the values of the elements in array a1 after the following code executes?

  ```java
  int[] a1 = {2, 4, 6, 8, 10, 12, 14, 16};
  int[] a2 = {1, 1, 2, 3, 5, 8, 13, 21};
  mystery2(a1, a2);
  ```

3. Write a method called wordWrap that accepts a Scanner representing an input file as its parameter and outputs each line of the file to the console, word-wrapping all lines that are longer than 60 characters. For example, if a line contains 112 characters, the method should replace it with two lines: one containing the first 60 characters and another containing the final 52 characters. A line containing 217 characters should be wrapped into four lines: three of length 60 and a final line of length 37.
