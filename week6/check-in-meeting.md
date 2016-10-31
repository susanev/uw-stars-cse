# Check in Meeting
## Week 6

1. Write a method named `printAverage` that accepts a `Scanner` for the console as a parameter and repeatedly prompts the user for numbers. Once any number less than zero is typed, the average of all non-negative numbers typed is displayed. Display the average as a double, and do not round it. If the first number typed is negative, do not print an average.

  An example call might look like ...
  
  ```java
  Scanner console = new Scanner(System.in);
  printAverage(console);
  ```
  
  And the output might look like ..
  
  ```
  Type a number: 7
  Type a number: 4
  Type a number: 16
  Type a number: -4
  Average wa 9.0
  ```
  

2. Write a method named `hasAnOddDigit` that returns whether any digit of an integer is odd. Your method should return `true` if the number has at least one odd digit and false if none of its digits are odd. 0, 2, 4, 6, and 8 are even digits and 1, 3, 5, 6, 9 are odd digits. You should not use `String` to solve this problem. Some example calls are below.

  | __Call__ | __Value Returned__ |
  | :--- | :--- |
  | `hasAnOddDigit(4822116);` | `true` |
  | `hasAnOddDigit(2448);` | `false` |
  | `hasAnOddDigit(-7004);` | `true` |

3. Write a method named `isAllVowels` that returns whether a `String` consists entirely of vowels (a, e, i, o, u)—case-insensitvely. If every character of the `String` is a vowel, your method should return `true`. If any character of the String is a non-vowel, your method should return false. Your method should return true if passed the empty string, since it does not contain any non-vowel characters.

  Below are some sample calls.
  
  | __Call__ | __Value Returned__ |
  | :--- | :--- |
  | `isAllVowels("eIEiO");` | `true` |
  | `isAllVowels("oink");` | `false` |
