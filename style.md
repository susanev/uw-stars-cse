# Java Style
_This style is specific to the guidelines at UW when using Java, different languages will have different styles, and different schools and companies may have different styles as well. To ensure full-credit on your programming assignments follow these styles._

### General
* Every statement should be on its own line.
* No single line should be more than 100 characters.

### Naming 
* Start all __class names__ with an uppercase letter, every following word in the class name should also start with an uppercase letter (e.g., Box, FancyBox, SuperFancyBox).
* Start all __method names__ with a lowercase letter, every following word in the method name should start with an uppercase letter (.e.g., triangle, printTriangle, printFancyTriangle).

### Methods
* Reduce redundancy in your program by using __static methods__, but do not create methods that do too little.
* __main__ should be a short, summary of your program. Readers of your code should be able to look at your main method and know exactly what your entire program will do.
* There should be a blank line between every method in your entire program.

### Printing
* To print a blank line use `System.out.println()'`, do not use `System.out.println("")`.
* Use __println__ statements over a print statement that ends with `\n`.
* Combine print statements when necessary, for example use 

  `System.out.println("*"); // use this!` 
  
  instead of 
  
  ```
  System.out.print("*"); // do not use these two lines!
  System.out.println();
  ```
