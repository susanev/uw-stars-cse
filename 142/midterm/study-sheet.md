# Study Sheet
## Midterm

### Programming Problems
####Concepts
_You should plan to be fully prepared for everything listed below_

* Using `Random` objects

  ```java
  Random r = new Random();
  r.nextInt(10); // 0 – 9
  r.nextInt(10) + 1; // 1 – 10
  r.nextInt(30) + 10; // 10 – 39
  ```

* Using `Scanner` objects

  ```java
  Scanner console = new Scanner(System.in);
  String word = console.next(); // reads in as a String; all characters
  int x = console.nextInt(); // reads in as an int
  double y = console.nextDouble(); // reads in as a double
  ```

* Solving fencepost problems

  _Tips: Usually needs a loop._
  
  ```java
  // Print out the values x – y (inclusive) in a comma separated list
  public static void printList(int x, int y) {
    // print first value before the loop
    System.out.print(x);
    // loop through the rest, printing comma first; notice i starts +1 of x
    for (int i = x + 1; i <= y; i++) {
      System.out.print(", " + i);
    }
    System.out.println();
  }
  ```
  
* Solving cumulative sum problems
  
  _Tips: Usually needs a sum variable, a loop, and an update variable statement inside of the loop._
    
  ```java
  // Return sum of int values x – y (inclusive); ignoring Gauss : [
  public static int sum(int x, int y) {
    // declare a sum variable
    int sum = 0;
    // loop through values, adding to sum
    for (int i = x; i <= y; i++) {
      sum = sum + i;
    }
    return sum;
  }
  ```
  
* Solving counting problems

  _Tips: Usually needs a count variable, a loop, and an increment statement inside the loop._
    
  ```java
  // return the number of values entered by the user greater than max
  // the user will enter -1 to stop
  public static int greaterThan(int max) {
    Scanner console = new Scanner(System.in);
    System.out.print("Enter a number (-1) to quit: ");
    int num = console.nextInt();
    int count = 0;
    while(num != -1) {
      if (num > max) {
        count++;
      }
      System.out.print("Enter a number (-1) to quit: ");
      int num = console.nextInt();
    }
    return count;
  }
  ```
  
* Finding the max and min in a set of values

  _Tips: Usually needs a min variable and a max variable, a loop, and if statements inside the loop._
    
  ```java
  // Print the max and min of the values entered by the user
  // the user will enter 0 to stop
  public static void maxMin() {
    Scanner console = new Scanner(System.in);
    System.out.print("Enter a number (0) to quit: ");
    int num = console.nextInt();
    int max = num; 
    int min = num;
    while(num != 0) {
      if (num > max) {
        max = num;
      } else if (num < min) {
        min = num;
      }
      System.out.print("Enter a number (0) to quit: ");
      int num = console.nextInt();
    }
    System.out.printf("Max: %d Min: %d", max, min);
  }
  ```

* Being able to look at the individual digits of a number using integer arithmetic

  _Tips: Look thorugh the number from right – left, not from left – right_
  
  ```java
  // Return the smallest digit in a number
  public static int smallestDigit(int value) {
    // special case; for if 0 is passed as value
    if (value == 0) {
      return 0;
    }
    
    int min = 10; // no digit bigger than 9
    while (value != 0) {
      int digit = value % 10;
      if (digit < min) {
        min = digit;
      }
      value = value / 10;
    }
    return min;
  }
  ```
* Being able to look through the individual characters in a String

  _Tips: Usually needs a for loop that goes until the length of the String_  

  ```java
  // return the String will all a's removed
  public static String removeAs(String word) {
    String output = "";
    for (int i = 0; i < word.length(); i++) {
      char letter = word.charAt(i);
      if (letter != 'a') {
        output = output + letter;
      }
    }
    return output;
  }
  ```

#### Tips
* Write the method header first, with the correct return value, name, and parameters along with open curly brace and closing curly brace (this will usually earn you a minimum of 1pt)
* Complete problems 1 – 7, write the method header for 8 (the hard programming problem) and any other details you know are in the solution (loop, if block, return statement, etc.), then go back and check your solutions for 1 – 7, and finally work on the solution for 8.
* If you cannot solve a programming problem, solve a simpler verison instead (this will earn you lots of partial credit)
* Do not open your test before told to begin, and stop writing when time is called; don't lose these points .. its never worth it.
* Do not abbreviate anything on the exame, except for A/S/N on the assertion questions

#### Reminders
* Know where your seat is before you arrive
* Bring your ID
* Bring pencils, not pens (and optional highlighter—recommended!)
* Do not bring calculators or other electronics
* Turn in your exam when you are done and leave the room
