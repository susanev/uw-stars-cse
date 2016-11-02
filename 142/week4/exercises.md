# Exercises
## Week 4

1. Write a method named `smallestLargest` that asks the user to enter numbers, then prints the smallest and largest of all the numbers typed in by the user. You may assume the user enters a valid number greater than 0 for the number of numbers to read. Here is an example dialogue:

  ```
  How many numbers do you want to enter? 4
  Number 1: 5
  Number 2: 11
  Number 3: -2
  Number 4: 3
  Smallest = -2
  Largest = 11
  ```

2. Write a method named `hasMidpoint` that accepts three integers as parameters and returns true if one of the integers is the midpoint between the other two integers; that is, if one integer is exactly halfway between them. Your method should return false if no such midpoint relationship exists. The integers could be passed in any order; the midpoint could be the 1st, 2nd, or 3rd. You must check all cases.

  Calls such as the following should return true:
  ```java
  hasMidpoint(4, 6, 8);
  hasMidpoint(2, 10, 6);
  hasMidpoint(8, 8, 8);
  hasMidpoint(25, 10, -5);
  ```
  Calls such as the following should return false:

  ```java
  hasMidpoint(3, 1, 3)
  hasMidpoint(1, 3, 1)
  hasMidpoint(21, 9, 58)
  hasMidpoint(2, 8, 16)
  ```

3. Write a method named `printMultiples` that accepts an integer `n` and an integer `m` as parameters and that prints a complete line of output reporting the first m multiples of n. For example, the following calls:

  ```java
  printMultiples(3, 5);
  printMultiples(7, 3);
  ```
  should produce the following output:

  ```
  The first 5 multiples of 3 are 3, 6, 9, 12, 15
  The first 3 multiples of 7 are 7, 14, 21
  ```
  
  Notice that the multiples are separated by commas. You must exactly reproduce this format. You may assume that the number of multiples you will be asked to generate is greater than or equal to 1.


4. A "perfect number" is a positive integer that is the sum of all its proper factors (that is, factors including 1 but not the number itself). The first two perfect numbers are 6 and 28, since 1+2+3=6 and 1+2+4+7+14=28. Write a static method `perfectNumbers` that takes an integer max as an argument and prints out all perfect numbers that are less than or equal to max.

  Here is the console output from a call to `perfectNumbers(6);`

  ```
  Perfect numbers up to 6: 6 
  ```

  Here is the console output from a call to `perfectNumbers(500);`

  ```
  Perfect numbers up to 500: 6 28 496
  ```
