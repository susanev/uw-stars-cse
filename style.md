# Java Style
_This style is specific to the guidelines at UW when using Java, different languages will have different styles, and different schools and companies may have different styles as well. To ensure full-credit on your programming assignments follow these styles._

### General
* Every statement should be on its own line.
* No single line should be more than 100 characters.
* Use curly braces consistently 

### Naming 
* Start all __class names__ with an uppercase letter, every following word in the class name should also start with an uppercase letter (e.g., Box, FancyBox, SuperFancyBox).
* Start all __method names__ with a lowercase letter, every following word in the method name should start with an uppercase letter (.e.g., triangle, printTriangle, printFancyTriangle).
* Start all __variable names__ with a lowercase letter, every following word in the variable name should start with an uppercase letter (.e.g., border, borderColor).
* __Constants__ should be named in all uppercase letters, with the words separated by underscores (e.g., ROCKET_SIZE).

### Methods
* Reduce redundancy in your program by using __static methods__, but do not create methods that do too little.
* __main__ should be a short, summary of your program. Readers of your code should be able to look at your main method and know exactly what your entire program will do.
* There should be a blank line between every method in your entire program.
* There should be a single space between the closing paren of a method header and the opening curly brace of a method header (e.g., `public static void Hello() {`
  

### Printing
* To print a blank line use `System.out.println()`, do not use `System.out.println("")`.
* Use __println__ statements instead of print statements that end with `\n`.
* Combine print statements when necessary, for example use 

  ```
  // use this!
  System.out.println("*");
  ```
  
  instead of 
  
  ```
  // do not use these two lines!
  System.out.print("*"); 
  System.out.println();
  ```

### Variables
* If you do not need decimal precision use __int__ instead of __double__
* Variable names should clearly describe what the variable represents

### Constants
* Constants should only be used for single values that do not change
* Constants should not be passed as parameters

### for loops
* Do not use a for loop if it only runs 1 time
