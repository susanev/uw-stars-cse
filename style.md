# Java Style
_This style is specific to the guidelines at UW when using Java, different languages will have different styles, and different schools and companies may have different styles as well. To ensure full-credit on your programming assignments follow these styles._

Note: New additions for this week are __bolded__

### General
* Every statement should be on its own line
* No single line should contain more than 100 characters (this includes white space)
* Use curly braces consistently 
* Put a single space on both sides of all binary operations (e.g., `2 + 3`, `int x = y`)
* __Put a single space after any commas in method calls or parameter lists (e.g., `String word, int num`)__
* Do not use `break` statements

### Classes 
* Start all class names with an uppercase letter, every following word in the class name should also start with an uppercase letter (e.g., Box, FancyBox, SuperFancyBox)
* There should be a comment block at the top of your programs with your name, date, class, TA name, assignment name, a blank line, followed by a brief description of what the program does
 * Note: The brief description should describe what the program does, not how the program does it
 * Note: This comment block should use single line comments, not block comments
* There should be a blank line between your top comment block and the start of your code

### Methods
* Start all method names with a lowercase letter, every following word in the method name should start with an uppercase letter (.e.g., triangle, printTriangle, printFancyTriangle)
* Directly above every method (except for main) there should be a comment that describes what it does, any parameters it takes in, and any values it returns
* Reduce redundancy in your program by using static methods, but do not create methods that do too little
* `main` should be a short summary of your program. Readers of your code should be able to look at your main method and know exactly what your entire program will do
* There should be exactly one blank line between every method in your entire program
* There should be a single space between the closing paren of a method header and the opening curly brace of a method header (e.g., `public static void Hello() {`)
* Do not create a method for a single print statement

### Printing
* `main` should generally not contain any print statments
* To print a blank line use `System.out.println()`, do not use `System.out.println("")`
* Use `println` statements instead of `print` statements that end with `\n`
* Combine print statements when necessary, for example use 

  ```java
  // use this!
  System.out.println("*");
  ```
  
  instead of 
  
  ```java
  // do not use these two lines!
  System.out.print("*"); 
  System.out.println();
  ```

### Variables
* Start all variable names with a lowercase letter, every following word in the variable name should start with an uppercase letter (.e.g., border, borderColor)
* Variable names should clearly describe what the variable represents
* If you do not need decimal precision use `int` instead of `double`

### Constants
* Constants should be named in all uppercase letters, with the words separated by underscores (e.g., ROCKET_SIZE)
* Contstants must start with `public static final`
* Constants should only be used for single values that do not change
* Constants should not be passed as parameters
* Every constant should have a comment above it explaing what it represents and what happens when you change it

### for loops
* Do not use a `for` loop if it only runs 1 time
* There should be a space between `for` and `)`,(e.g., `for (int i = 1 ...`)
* Use descriptive loop variable names, __OR__ use the `i`, `j`, `k` convention—if loops are not nested they should use only the `i` variable

### Comments
* All complicated parts of your code should include comments
* There should be a space between the comment character and your actual comment (e.g., `// comment`)
* Comments should directly line up with the code they describe

 ```java
 // prints "Hello"
 public static void hello() {
    System.out.println("Hello");
 }
 ```
 
 ### import statements
 * __They belong after the top comment block, and before the class__
