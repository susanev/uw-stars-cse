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

