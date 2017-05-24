_CSE 142_
# Exercises
## Week 7
_This week you will be completing the whiteboard problems in groups. Work together to solve the problems. You may complete the problems in any order._

1. Write a method named coinFlip that accepts as its parameter a Scanner for an input file. Assume that the input file data represents results of sets of coin flips that are either heads (H) or tails (T) in either upper or lower case, separated by at least one space. Your method should consider each line to be a separate set of coin flips and should output to the console the number of heads and the percentage of heads in that line, rounded to the nearest tenth. If this percentage is more than 50%, you should print a "You win" message. For example, consider the following input file:

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
  
2. Write a method named groceries that accepts as its parameter a Scanner for an input file. The data in the file represents grocery items purchased along with their price and their discount category. Your method should compute and return a real number representing the total cost of the grocery items.

    Each item is represented by three tokens starting with the name of the item (a single word) followed by its discount category ("red", "blue" or "none") followed by its full price. The discount category may include capitalization. The different discount options are:

    ```
    red: 10% off full price
    blue: 25% off full price
    none: full price
    ```

    For example, if a Scanner named input refers to an input file containing the following text:

    ```
    avocado RED 1  blueberries none 5 milk blue 
       2.00       cream                   red 1.00    cereal None 1.29
    ```

    The call on groceries(input) should return 9.59. The avocado will cost $0.9 because a discount of 10% off of $1 is $0.1. Blueberries cost the full price of $5. Milk will cost $1.50 because it receives a discount of 25% off of $2.00. Cream will cost $0.9 and cereal will cost the full price of $1.29. The total is 0.9 + 5 + 1.5 + .9 + 1.29 = 9.59.

    Notice that the input may span multiple lines and may have different spacing between tokens. The entire file represents a single grocery bill.

    You may assume that the input file exists and has the format described above. The file will always contain at least one grocery item and will always contain a number of tokens that is a multiple of 3. The second token in every triple will always be one of "red", "blue" or "none", case-insensitive.
  
3. Write a method called countInRange that accepts an array of integers, a minimum value, and a maximum value as parameters and returns the count of how many elements from the array fall between the minimum and maximum (inclusive).

    For example, in the array `{14, 1, 22, 17, 36, 7, -43, 5}`, there are four elements whose values fall between 4 and 17.

4. Write a method named isUnique that takes an array of integers as a parameter and that returns a boolean value indicating whether or not the values in the array are unique (true for yes, false for no). The values in the list are considered unique if there is no pair of values that are equal. For example, if a variable called list stores the following values:

    ```java
    int[] list = {3, 8, 12, 2, 9, 17, 43, -8, 46, 203, 14, 97, 10, 4};
    ```

    Then the call of isUnique(list) should return true because there are no duplicated values in this list. If instead the list stored these values:

    ```java
    int[] list = {4, 7, 2, 3, 9, 12, -47, -19, 308, 3, 74};
    ```

    Then the call should return false because the value 3 appears twice in this list. Notice that given this definition, a list of 0 or 1 elements would be considered unique.
