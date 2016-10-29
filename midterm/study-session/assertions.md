# Assertions
# Midterm Study Session

1. Assertions. You will identify various assertions as being either always true, never true or sometimes true/sometimes false at various points in program execution. The comments in the method below indicate the points of interest.

	```java
  public static void mystery(Scanner console) {
      int y = 42;
      int z = 0;
      // Point A
      while (y != 0) {
          // Point B
          y = console.nextInt();
          if (y % 2 == 0) {
              z++;
              // Point C
              y--;
          }
          // Point D
          y--;
      }
      // Point E
      System.out.println("z = " + z);
  }
	```

	Fill in the table below with the words ALWAYS, NEVER or SOMETIMES.

	| | `y == 0` | `y % 2 == 0` | `z == 0` |
	| :--- | :--- | :--- | :--- |
	| Point A | | | |
	| Point B | | | |
	| Point C | | | |
	| Point D | | | |
	| Point E | | | |

2. Assertions. You will identify various assertions as being either always true, never true or sometimes true/sometimes false at various points in program execution. The comments in the method below indicate the points of interest.

	```java
  public static void mystery(int x, int y) {
      int z = 0;
      // Point A
      while (x != y) {
          // Point B
          z++;
          if (x > y) {
              // Point C
              x = x / 10;
          } else {
              // Point D
              y = y / 10;
          }
      }
      // Point E
      System.out.println(x + " " + y + " " + z);
  }
	```

	Fill in the table below with the words ALWAYS, NEVER or SOMETIMES.

	| | `x > y` | `z == 0` | `x == y` |
	| :--- | :--- | :--- | :--- |
	| Point A | | | |
	| Point B | | | |
	| Point C | | | |
	| Point D | | | |
	| Point E | | | |

3. Assertions. You will identify various assertions as being either always true, never true or sometimes true/sometimes false at various points in program execution. The comments in the method below indicate the points of interest.

	```java
  public static int assertions(int n) {
      int x = 2;
      // Point A
      while (x < n) {
          // Point B
          if (n % x == 0) {
              n = n / x;
              x = 2;
              // Point C
          } else {
              x++;
              // Point D
          }
      }
      // Point E
      return n;
  }
	```

	Fill in the table below with the words ALWAYS, NEVER or SOMETIMES.

	| | `x > 2` | `x < n` | `n % x == 0` |
	| :--- | :--- | :--- | :--- |
	| Point A | | | |
	| Point B | | | |
	| Point C | | | |
	| Point D | | | |
	| Point E | | | |
