# Check-in Meeting
## Week 4

1. Write a method called fractionSum that accepts an integer parameter `n` and returns as a double the sum of the first `n` terms of the sequence. In other words, the method should generate the following sequence: `1 + (1/2) + (1/3) + (1/4) + (1/5) + ...` You may assume that the parameter `n` is non-negative.

2. Write a method named repl that accepts a `String` and a number of repetitions as parameters and returns the `String` concatenated that many times. For example, the call `repl("hello", 3);` returns `"hellohellohello"`. If the number of repetitions is 0 or less, an empty string is returned.

3. Write a method named `evenSum` that prompts the user for a number of integers and prints the total even sum and maximum of the even numbers. You may assume that the user types at least one non-negative even integer.
  ```
  how many integers? 4
  next integer? 2
  next integer? 9
  next integer? 18
  next integer? 4
  even sum = 24
  even max = 18
  ```

4. Write a method named `numUnique` that takes three integers as parameters and returns the number of unique integers among the three. For example, the call `numUnique(18, 3, 4);` should return `3` because the parameters have 3 different values. By contrast, the call `numUnique(6, 7, 6);` would return `2` because there are only 2 unique numbers among the three parameters: 6 and 7.

5. A "perfect number" is a positive integer that is the sum of all its proper factors (that is, factors including 1 but not the number itself). The first two perfect numbers are 6 and 28, since 1+2+3=6 and 1+2+4+7+14=28. Write a static method `perfectNumbers` that takes an integer max as an argument and prints out all perfect numbers that are less than or equal to max.

Here is the console output from a call to `perfectNumbers(6);`

  ```
  Perfect numbers up to 6: 6 
  ```

Here is the console output from a call to `perfectNumbers(500);`

  ```
  Perfect numbers up to 500: 6 28 496
  ```
