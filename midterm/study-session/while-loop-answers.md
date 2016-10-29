# While Loop Answers
# Midterm Study Session

1. 
  | __Method Call__ | __Output Produced__ |
  | :--- | :--- |
  | `mystery(2);` | `1 2` |
  | `mystery(5);` | `1 5` |
  | `mystery(9);` | `2 3` |
  | `mystery(12);` | `3 3` |

2. While Loop Simulations. Consider the following method:

  | __Method Call__ | __Output Produced__ |
  | :--- | :--- |
  | `mystery(4);` | `2 2` |
  | `mystery(5);` | `1 5` |
  | `mystery(24);` | `4 3` |
  | `mystery(28);` | `3 7` |

3. While Loop Simulations. Consider the following method:

  ```java
  public static void mystery(int i, int j) {
      while (i != 0 && j != 0) {
          i = i / j;
          j = (j - 1) / 2;
          System.out.print(i + " " + j + " ");
      }
      System.out.println(i);
  }
  ```

  For each call below, indicate what output is produced:

  | __Method Call__ | __Output Produced__ |
  | :--- | :--- |
  | `mystery(5, 0);` | `5` |
  | `mystery(3, 2);` | `1 0 1` |
  | `mystery(16, 5);` | `3 2 1 0 1` |
  | `mystery(80, 9);` | `8 4 2 1 2 0 2` |
  | `mystery(1600, 40);` | `40 19 2 9 0 4 0` |
