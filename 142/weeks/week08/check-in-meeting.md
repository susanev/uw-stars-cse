_CSE 142_
# Check-in Meeting
## Week 8

1. Reference Mystery.  Consider the following program.

    ```java
    import java.util.*;

    public class ReferenceMystery {
        public static void main(String[] args) {
            int x = 3;
            int y = 6;
            int[] data = {3, 5, 7};

            y = mystery1(x, data);
            System.out.println(x + " " + Arrays.toString(data));

            mystery2(x, y);
            System.out.println(x + " " + y);
        }

        public static int mystery1(int x, int[] data) {
            x++;
            data[1] = 2 * x;
            System.out.println(x + " " + Arrays.toString(data));
            return data[0] + data[1];
        }

        public static void mystery2(int x, int y) {
            x = 2 * x;
            y++;
        }
    }
    ```

    List below the output produced by this program.
   
1. Write a static method called underline that takes a Scanner containing an input file as a parameter and that prints to System.out the same text with certain lines underlined. The lines to be underlined all begin with a period. The period should not be printed.  You should print the text that follows the period on a line by itself followed by a line of dashes equal in length to the text that follows the period. For example, consider the following input:

    ```
    .Statement of Purpose
    I didn't expect to major in computer science until I took cse142.
    I liked it more than I expected and that got me hooked on cs.

    .High School Performance
    I got very good grades in high school, graduating in the top 10% of
    my class.

    .College Performance
    I have done well in my college classes, with an overall gpa of 3.5.
    ```

    If the text above is stored in a Scanner called input and we make this call:

    ```java
    underline(input);
    ```

    the method should print the following output to System.out:
  
    ```
    Statement of Purpose
    --------------------
    I didn't expect to major in computer science until I took cse142.
    I liked it more than I expected and that got me hooked on cs.

    High School Performance
    -----------------------
    I got very good grades in high school, graduating in the top 10% of
    my class.

    College Performance
    -------------------
    I have done well in my college classes, with an overall gpa of 3.5.
    ```

    Notice that some of the input lines can be blank lines.

4. Write a method named stringLengths that takes an array of strings as a parameter and returns an array of integers whose elements are the lengths of the corresponding strings in the array parameter.

    For example, given the following arrays:

    ```java
     String[] array1 = { "you", "say", "goodbye", "and", "i", "say", "hello" };
     String[] array2 = { "i", "love", "CSE", "142" };
     String[] array3 = { "thisisaverylongstring" };
     String[] array4 = { "strings", "strings", "everywhere" };
    ```

    Calling stringLengths will result in the following values:

    | Call | Value Returned |
    | :--- | :--- |
    | `stringLengths(array1)` | `{3, 3, 7, 3, 1, 3, 5}` |
    | `stringLengths(array2)` | `{1, 4, 3, 3}` |
    | `stringLengths(array3)` | `{21}` |
    | `stringLengths(array4)` | `{7, 7, 10}` |
