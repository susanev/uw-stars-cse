_CSE 142_
# Quiz Answers
## Week 1

1. Below is a program, but it is not executable. Explain what executable means, why the program below is not executable, and what you need to add to make it executable?
    ```java
        public class Hello {

        }
    ```
__The class Hello needs a main method in order for it to be executable, and for it to run in the Java Runtime Environment.__

2. Write an executable program that prints "Hello World!"
    ```java
    public class Hello {
        public static void main(String[] args) {
           System.out.println("Hello world!");
        }
    }
   ```

3. Describe the errors in the program below.
    ```java
    public MyProgram {
       public static void main(String[] args) {
           System.out.println("This is a test of the")
           System.out.Println("emergency broadcast system.");
       }
   }
   ```
   __The errors are, missing the class on the first line; missing the semiconon on the first print statement, and needs a lowercase 'P' on the second print statement.__

4. What is the name of the character shown: `\`
__Backslash__

5. What is the name of the character shown: `/`
__Forward slash, also sometimes called 'slash'__

6. Fill in the escape sequence that matches each character described in the table below.

    | Escape sequence   | Description      |
    | -------------------- | :-------------------- |
    |  __\n__                     | Newline        |
    |  __\t__                     | Tab            |
    |  __\"__                     | Double quote   |
    |  __\\__                     | Backslash      |
    
7. What will be printed to the console when the program below is run?

    `System.out.println("\"Quotes\"");`
    
    __"Quotes"__
8. What will be printed to the console when the program below is run?

    `System.out.println("Slashes \\//");`
    
    __Slashes \//__
9. Fill in the table below, evaluating the expressions

    | Expression                 | What does it evaluate to   |
    |-----------------------------  | :----------------------------- |
    | `3 + 4 + " 2 + 2"`             | __"7 2 + 2"__                 |
    | `4.0 / 2 * 9 / 2`              | __9.0__                       |
    | `8 / 5 + 13 / 2 / 3.0`         | __3.0__                       |
    | `"hello 34 " + 2 * 4`          | __"hello 34 8"__              |
    
