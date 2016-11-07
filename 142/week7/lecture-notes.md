# Week 7
## Lecture Notes

* [Sample File-Processing Program](Movies.java)

### File Processing
* `Scanner` is the main tool to use for file processing
* When doing both token-based processing and line-based processing use two different `Scanner` objects

#### Token-based Processing
* Processes the data in tokens using `nextInt()`, `nextDouble()`, and `next()`
* Skips past any newline characters
* Should not be used if your input is line-based, because token-based processing ignores the line breaks and looks only at the tokens

#### Line-based Processing
* Process data by line using `nextLine()`
* When doing line-based processing you often use a while loop, because you are unsure of the number of lines you will read in; an example method is shown below. Note that the method below returns the empty string if nothing is found, this is a good 142 solution.

  ```java
  // searches for and returns the next line of the given input that contains
  // the given phrase; returns an empty string if not found
  public static String find(Scanner input, String phrase) {
      while (input.hasNextLine()) {
          String line = input.nextLine();
          if (line.toLowerCase().contains(phrase)) {
              return line;
          }
      }
      return "";
  }
  ```

#### Hybrid Approach
* Use line-based processing on the file, but then usd token-based processing for the individual lines of the file
* Do this by passing the line itself (a String) into a new Scanner object to use token-based processing
* An example of this approach is shown below

  ```java
  public static void print(String line) {
      Scanner data = new Scanner(line);
      int rank = data.nextInt();
      int votes = data.nextInt();
      double rating = data.nextDouble();
      System.out.print(rank + "\t" + rating + "\t" + votes + "\t");
      while (data.hasNext()) {
          System.out.print(data.next() + " ");
      }
      System.out.println();
  }
  ```

### Arrays
* __array__: an object that stores many values of the same type
* __element__: one value in an array
* __index__: a zero-based integer to access an element from an array

  | _index_ | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |
  | :--- | :--- | :--- | :--- | :--- | :--- | :--- | :--- | :--- | :--- | :--- |
  | _value_ | 12 | 49 | -2 | 26 | 5 | 17 | -6 | 84 | 72 | 3 |
  
  In the array above, 12 is stored as element 0, 5 is stored as element 4, and 3 is stored as element 9
* To declare and initialize an array use `type[] name = new type[length];`

  ```java
  int[] numbers = new int[10]; // creates a new int array to hold 10 values; all starting at zero
  ```
* Different array types have different default values; the default values for common types are shown in the table below

  | __Type__ | __Default Value__ |
  | :--- | :--- |
  | `int` | 0 |
  | `double` | 0.0 |
  | `boolean` | `false` |
  | `String` | `null` |

* To access elements use `name[index]`
* To modify elements use `name[index] = value`
* The legal indexes of an array are between 0 and the array's length - 1. If you read or write outside of this range you will generate an `ArrayIndexOutOfBoundsException`
* Arrays and for loops are best friends
* An array's length field stores the number of elements, `name.length`, notice that there are no parens after length because it is a field and not a method

#### Code Examples

  ```java
  // print out the elements of an array
  for (int i = 0; i < numbers.length; i++) {
    System.out.print(numbers[i] + " ");
  }
  Ssytem.out.println();

  // multiply every value in an array by 2
  for (int i = 0; i < numbers.length; i++) {
    numbers[i] = 2 * i;
  }

  // using an array to count tallies
  int num = 229231007;
  int[] counts = new int[10];
  while (num > 0) {
    int digit = num % 10;
    counts[digit]++;
    num = num / 10;
  }
  ```
