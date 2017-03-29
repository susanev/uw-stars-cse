_CSE 142_
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
