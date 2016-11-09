# Lecture Notes
## Week 1

### General
* You write Java code as text, you then __compile__ it into compiler instructions using a program called a compiler. When your code is compiled it turns into byte code. Then you can run the byte code using the Java Runtime Environment.
* In this class you will be writing your Java code in an Integrated Development Environment (IDE). IDE's allow you to type your code, compile your code, and run your code.
* Every piece of code you write needs to be inside of a class
* A class is executable only if it has a __main__ method
* Commands end with semicolons
* Escape sequences

  | __Escape sequence__   | __Description__       |
  | :-------------------- | :-------------------- |
  |  \n                   | Newline               |
  |  \t                   | Tab                   |
  |  \"                   | Double quote          |
  |  \\                   | Backslash             |
* Your goal for all assignments is to reduce redundancy
* You want main to be short, and give an good overview of what your program does
* Java precedence
 * unary operators (+, -)
 * multiplicative operators (*, /, %)
 * additive operators (+, -)
* Integer division: When dividing integers, all information after the decimal point is lost
* For now, use `System.out.println("text")` to display text to the console


### Style
  * Classes start with a capital letter, no spaces, all other words in name are also capitalized
  * Methods start with lowercase letters, no spaces, all other words in name are capitalized
  * Indentation is important, when you open a curly brace everything inside is indented
  
### Live Coding
Together we will write a Java Program called EggStop that prints the ASCII image below. We will practicing using methods and reducing redundancy.

```java
   _________
  /         \
 /           \
 \           /
  \_________/
 \           /
  \_________/
  +--------+
   _________
  /         \
 /           \
 |    STOP   |
 \           /
  \_________/
   
   _________
  /         \
 /           \
 ```
