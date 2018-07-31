_CSE 142_
# Quiz
## Week 4

1. Expressions, 10 points.  For each expression in the left-hand column, indicate its value in the right-hand column.  Be sure to list a constant of appropriate type (e.g., 7.0 rather than 7 for a double, Strings in quotes).

    | __Expression__ | __Value__ |
    | :--- | --- |
    | `12 / 3 + 5 + 3 * -2` | |
    | `1 + 1 + "(1 + 1)" + 1 + 1`	| |
    | `13 / 2 - 38 / 5 / 2.0 + (15 / 10.0)`	| |
    | `11 < 3 + 4 \|\| !(5 / 2 == 2)`	| |
    | `20 % 6 + 6 % 20 + 6 % 6` | |

2. Parameter Mystery, 12 points.  Consider the following program.

    ```java
    public class ParameterMystery {
        public static void main(String[] args) {
            int a = 5;
            int b = 1;
            int c = 3;
            int three = a;
            int one = b + 1;

            axiom(a, b, c);
            axiom(c, three, 10);
            axiom(b + c, one + three, a + one);
            a++;
            b = 0;
            axiom(three, 2, one);
        }

        public static void axiom(int c, int b, int a) {
            System.out.println(a + " + " + c + " = " + b);
        }
    }
    ```

    List below the output produced by this program.

3. If/Else Simulation, 12 points.  Consider the following method.
    ```java
    public static void ifElseMystery(int a, int b) {
      if (a % 10 == 0) {
          b = b * 10;
          a = a + 10;
      }   
      if (a > b) {
          b = a;
      } else if (a == b) {
          b++;
      }
      System.out.println(a + " " + b);
    }
    ```

    For each call below, indicate what output is produced.

    | __Method Call__ | __Output__ |
    | :--- | :--- |
    | `ifElseMystery(20, 8);` | |	
    | `ifElseMystery(30, 30);` | |	
    | `ifElseMystery(4, 3);` | |	
    | `ifElseMystery(3, 4);` | |	
    | `ifElseMystery(30, 4);` | |	
    | `ifElseMystery(7, 7);` | |	

4. While Loop Simulation, 12 points.  Consider the following method:
    ```java
    public static void whileMystery(int i, int j) {
        int k = 0;
        while (i < j && k < j) {
            i = i + k;
            j--;
            k++;
            System.out.print(i + ", ");
        }

        System.out.println(k);
    }
    ```
    Write the output of each of the following calls.

    | __Method Call__ | __Output Produced__ |
    | :--- | :--- |
    | `whileMystery(3, 5);` | |	
    | `whileMystery(5, 3);` | |	
    | `whileMystery(-3, 6);` | |	
    | `whileMystery(2, 12);` | |	

5. Assertions, 15 points.  You will identify various assertions as being either always true, never true or sometimes true/sometimes false at various points in program execution.  The comments in the method below indicate the points of interest.

    ```java
    public static int mystery(int x) {
        if (x <= 0) {
            x = 42;
        }
        int y = 0;
        // Point A
        while (x != 1) {
            // Point B
            if (x % 2 == 0) {
                y++;
                x = x / 2;
                // Point C
            } else {
                x = 3 * x + 1;
                // Point D
            }
        }
        // Point E
        return y;
    }
    ```

    Fill in the table below with the words always(A), never(N) or sometimes(S).

    | | `x == 1` | `x % 2 == 1` | `y == 0`|
    | :--- | :--- | :--- | :--- |
    | Point A | | | |
    | Point B | | | |
    | Point C | | | |
    | Point D | | | |
    | Point E | | | |
