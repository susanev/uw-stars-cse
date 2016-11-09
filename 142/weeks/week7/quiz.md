# Quiz
## Week 7

1. Consider the following method:

  ```java
  public static int arrayMystery4(int[] list) {
      int x = 0;
      for (int i = 1; i < list.length; i++) {
          int y = list[i] - list[0];
          if (y > x) {
              x = y;
          }
      }
      return x;
  }
  ```
  For each array below, indicate what value would be returned if the method mystery were called and passed that array as its parameter.
  
  | Array | Value Returned |
  | :--- | :--- |
  | `{5}` | |
  | `{3, 12}` | |
  | `{4, 2, 10, 8}` | |
  | `{1, 9, 3, 5, 7}` | |
  | `{8, 2, 10, 4, 10, 9}` | |

2. Write a method named coinFlip that accepts as its parameter a Scanner for an input file. Assume that the input file data represents results of sets of coin flips that are either heads (H) or tails (T) in either upper or lower case, separated by at least one space. Your method should consider each line to be a separate set of coin flips and should output to the console the number of heads and the percentage of heads in that line, rounded to the nearest tenth. If this percentage is more than 50%, you should print a "You win" message. For example, consider the following input file:

  ```
  H T H H T
  T t   t T h  H
     h
  ```

  For the input above, your method should produce the following output:

  ```
  3 heads (60.0%)
  You win!

  2 heads (33.3%)

  1 heads (100.0%)
  You win!
  ```

  The format of your output must exactly match that shown above. You may assume that the Scanner contains at least 1 line of input, that each line contains at least one token, and that no tokens other than h, H, t, or T will be in the lines.
