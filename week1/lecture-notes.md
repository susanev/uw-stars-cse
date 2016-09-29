# Lecture Notes
[Slides](https://docs.google.com/presentation/d/1CyUM1R0l0_AaMqhVPHMm3u2lpsZ-cPJw68XqNFN96Og/edit?usp=sharing)

### General
* You write Java code as text, you then __compile__ it into compiler instructions using a porgram called a compiler. When your code is compiled it turns into bytecode. Then you can run the bytecode using the Java Runtime Environment.
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
* Integer division
* Must declare a variable before you use it, but can't declare it twice
* Understanding assignment statements
* Three main data types (you will learn more later)

 | __Data type__   | __Description__                                           |
 | :-----------|-------------------------------------------------------------- |
 | int         | integers, pos, zero, neg, up to 2^31-1                        |
 | double      | floating point numbers (real), pos, zero, neg, up to 10^308   |
 | String      | text characters                                               |
* Literals
 * int literal: number without a decimal, e.g., -7, 0, 103
 * double literal: number with a decimal, e.g., -7.0, 0.2, 103.5
 * String literal: characters surrounded by quotes, e.g., "hello world"
* For now, use `System.out.println("text")` to display text to the console


### Style
  * Classes start with a capital letter, no spaces, all other words in name are also capitalized
  * Methods start with lowercase letters, no spaces, all other words in name are capitalized
  * Indentation is important, when you open a curly brace everything inside is indented
  
### Live Coding
Together we will write a Java Program called EggStop that prints the ASCII image below. We will practicing using methods and reducing redundancy.

```
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
