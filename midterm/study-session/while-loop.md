# While Loop
# Midterm Study Session

1. While Loop Simulations. Consider the following method:

  ```java
  public static void mystery(int x) {
      int y = 1;
      int z = 2;
      while (x > z) {
          if (x % z == 0) {
              x = x / z;
              y++;
          } else {
              z++;
          }
      }
      System.out.println(y + " " + z);
  }
  ```

  For each call below, indicate what output is produced:

  | __Method Call__ | __Output Produced__ |
  | :--- | :--- |
  | `mystery(2);` | |
  | `mystery(5);` | |
  | `mystery(9);` | |
  | `mystery(12);` | |

2. While Loop Simulations. Consider the following method:

  ```java
  public static void mystery(int n) {
      int x = 1;
      int y = 2;
      while (y < n) {
          if (n % y == 0) {
              n = n / y;
              x++;
          } else {
              y++;
          }
      }
      System.out.println(x + " " + n);
  }
  ```

  For each call below, indicate what output is produced:

  | __Method Call__ | __Output Produced__ |
  | :--- | :--- |
  | `mystery(4);` | |
  | `mystery(5);` | |
  | `mystery(24);` | |
  | `mystery(28);` | |

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
  | `mystery(5, 0);` | |
  | `mystery(3, 2);` | |
  | `mystery(16, 5);` | |
  | `mystery(80, 9);` | |
  | `mystery(1600, 40);` | |
