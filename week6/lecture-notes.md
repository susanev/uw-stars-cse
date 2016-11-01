# Lecture Notes
## Week 6

### boolean
* __boolean__: A logical type whose value is either true or false.
* You can create boolean variables, pass booleans as parameters, and return boolean values from methods

#### DeMorgan's Laws
Rules used to negate or reverse boolean expressions

| __Original Expression__ | __Negated Expression__ | __Alternative__ |
| :--- | :--- | :--- |
| `a && b` | `!a || !b` | `!(a && b)` |
| `a || b` | `!a && !b` | `!(a || b)` |

### Midterm Review Problems

1. Write a static method called `seven` that takes a `Random` object as a parameter and that uses the random object to generate up to 10 numbers between 1 and 30 inclusive, printing them and stopping if the "lucky numver" 7 comes up and returning whether or not that happened.

    ```java
    public static boolean seven(Random r) {
        for (int i = 0; i < 10; i++) {
            int next = r.nextInt(30) + 1;
            System.out.print(next + " ");
            
            if (next == 7) {
                System.out.println("You got a lucky number 7!");
                return true;
            }
        }
        return false;
    }
    ```

2. Write a static method called `digitSum` that takes an integer `n` as a parameter and that returns the sum of the digits of `n`. You may assume `n` is not negative.

    ```java
    public static int digitSum(int n) {
        int sum = 0;  
        while (n > 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }
    ```

3. Write a static method called `roll7` that simulates the rolling of two dice until their sum is equal to 7. The method should print each roll and its sum and show a count of how many rolls it took to get to 7, as in:
    
    ```
    3 + 5 = 8
    2 + 1 = 3
    1 + 4 = 5
    3 + 4 = 7
    sum of 7 after 4 rolls
    ```
    
    You must exactly reproduce the format of this sample execution.
    
    ```java
    public static void roll7() {
        Random r = new Random();
        int sum = 0;
        int rolls = 0;   
        while (sum != 7) {
            int roll1 = r.nextInt(6) + 1;
            int roll2 = r.nextInt(6) + 1;
            sum = roll1 + roll2;
            System.out.printf("%d + %d = %d\n", roll1, roll2, sum);
            rolls++;
        }
        System.out.printf("sum of 7 after %d rolls\n", rolls);
    }
    ```

3. Write a static method called `stutter` that takes a String as a parameter and that returns a new String where each letter of the original String has been replaced with two of that letter. For example, `stutter("hello")` should return `hheelllloo`.

    ```java
    public static String stutter(String s) {
        String output = "";
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            output = output + letter + letter;
        }
        return output;
    }
    ```
    
### Fencepost problems
* Spaces at the end are okay, you do not need to solve the fencepost problem for spaces
    
### Random Numbers
* When deciding on the formula to use with nextInt, first ask yourself how many nummbers do I need, then add the offset to that
 * e.g., random numbers between 1 and 30, so that is 30 numbers, offset by 1, so our forumla is r.nextInt(_num of numbers_) + offset, or in code `r.nextInt(30) + 1`

### File Processing
* To make a .txt file in jGRASP: File > New > Plain Text
* To use the `File` class you need to have an import statement, `import java.io.*;`
* `File f = new File("numbers.txt");` creates a new File object
* You can connect your file to a Scanner object with `Scanner input = new Scanner(f);`
* __absoulte path__: complete path to a file, can use that path anywhere on your system and it will locate the file
* __relative path__: path to the file from the current directly, if you used this path in a different directory it would not go to your file
* Scanner objects can only go forwards, they cannot read information backwards; if you need to read a file twice then you would need to create two Scanner objects
* Because of some exception rules in Java you need to add `throws FileNotFoundException` to any method that constructs a Scanner from a File object

#### File Example

```java
import java.io.*; // to use the File calss
import java.util.*; // to use the Scanner class

public class FileExample {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("numbers.txt"));
        double sum = 0.0;
        while (input.hasNextDouble()) {
            double n = input.nextDouble();
            System.out.println("n = " + n);
            sum+=n;
        }
        System.out.println("sum = " + sum);
    }
}
```

#### Common Methods

| __Method name__ | __Description__ |
| :--- | :--- |
| `f.canRead()` | returns whether the file f is able to be read |
| `f.delete()` | removes the file f from the disk |
| `f.exists()` | returns true if the file f exists, otherwise returns false |
| `f.getName()` | returns the name of file f |
| `f.length()` | returns the number of bytes in the file f |
| `f.renameTo(name)` | changes the name of file f to _name_ |

#### Common File Errors
* `InputMismatchException`: When you try and read a token of the wrong type
* `NoSuchElementException`: When you try and read a token that does not exist

#### Testing for valid input with Scanner
Assuming, a Scanner object has already been created named _input_

| __Method name__ | __Description__ |
| :--- | :--- |
| `input.hasNext()` | returns `true` if there are more tokens of input to read |
| `input.hasNextInt()` | returns `true` if there is a next token and it can be read as an `int` |
| `input.hasNextDouble()` | returns `true` if there is a next token and it can be read as an `double` |

#### Reading HTML from a webpage

```java
    import java.net.*; // to read from URL
    import java.util.*; // to be able to use Scanner
    
    public class WebExample {
        public static void main(String[] args) throws FileNotFoundException {
            Scanner input = new Scanner(new URL("http://www.cs.washington.edu/").openStream());
        }
    }
```
