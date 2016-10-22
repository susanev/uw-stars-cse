# Check In Meeting
## Week 5

1. 	Indicate whether the assertions at each point are Always(A), Sometimes(S), or Never(N) true.

  ```java
  public static int mystery(Scanner console) {
    int prev = 0;
    int count = 0;
    int next = console.nextInt();
    // Point A
    while (next != 0) {
      // Point B
      if (next == prev) {
        // Point C
        count++;
      }
      prev = next;
      next = console.nextInt();
      // Point D
    }
    // Point E
    return count;
  }
  ```

  | __Point__ | __`next == 0`__ | __`prev == 0`__ | __`next == prev`__ |
  | :--- | :--- | :--- | :---- |
  | Point A | | | |
  | Point B | | | |
  | Point C | | | |
  | Point D | | | |
  | Point E | | | |

2. Write a method called `printNumbers` that takes a `Random` object as a parameter and that prints a list of randomly generated numbers ranging from 1 to 50 inclusive (each number being equally likely). The list should be surrounded by square brackets and the numbers should be separated by commas. The method should randomly generate numbers until it generates one that ends in 5.

   A typical call would look like this:
   
      ```java
      Random r = new Random();
      printNumbers(r);
      ```
        
   The method might fairly quickly generate a number ending in 5:

    `[43, 34, 27, 2, 2, 25]`

   Or it might take a while to get to a number ending in 5:

    `[23, 8, 13, 1, 37, 37, 9, 34, 23, 34, 4, 9, 16, 44, 49, 43, 49, 3, 45]`

   It is also possible that it will immediately generate a number ending in 5:

    `[35]`

   You must exactly reproduce the format of these examples.

3. Write a static method named `longestName` that reads names typed by the user and prints the longest name (the name that contains the most characters) in the format shown below. Your method should accept a console Scanner and an integer `n` as parameters and should then prompt for n names.

  The longest name should be printed with its first letter capitalized and all subsequent letters in lowercase, regardless of the capitalization the user used when typing in the name.

  If there is a tie for longest between two or more names, use the tied name that was typed earliest. Also print a message saying that there was a tie. It's possible that some shorter names will tie in length, sbut don't print a message unless the tie is between the longest names.

  You may assume that `n` is at least 1, that each name is at least 1 character long, and that the user will type single-word names consisting of only letters. The following table shows two sample calls and their output.

4. Write a method `digitSum` that takes a non-negative integer as a parameter and that returns the sum of its digits.  For example, `digitSum(20879);` should return `26` because 2 + 0 + 8 + 7 + 9 is 26.  You may assume that the method is passed a value greater than or equal to 0.  You may not use a String to solve this problem; you must solve it using integer arithmetic.
