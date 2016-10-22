# Lecture Notes
## Week 5

### Fencepost problems
* Sometimes illustrated as `|-|-|-|-|` with the `|` representing a fence post and the `-` representing the wire of the fence
* The idea is that you need 1 more post than you do wire sections; you begin with a post and end with a post
* Also sometimes called a "loop-and-a-half"
* Common solutions usually have the loop run one less times than needed and then handle the last post outside of the loop

#### Examples
```java
// handles the first post outside the loop
// prints a comma separated list of numbers from 1 up to max
public static void printNumbers(int max) {
    System.out.print(1);
    for(int i = 2; i <= max; i++) {
        System.out.print(", " + i );
    }
    System.out.println();
}
```

```java
// handles the last post ouside the loop
// prints a comma separated list of numbers from 1 up to max
public static void printNumbers(int max) {
    for(int i = 1; i <= max - 1; i++) {
        System.out.print(i + ", ");
    }
    System.out.println(max);
}
```

### `while` loop
* Repeatedly executes its body as long as a logical test is true
* Note: The `for` loop is a sepcialized form of the `while` loop
* Use `while` when it is __unknown__ how many times the loop will repeat (meaning you don't know right now, even if you could put in some time and effort to figure out the exact amount)
* Use `for` when it is __known__ how many times the loop will repeat

#### Structure
```java
while (test) {
    statement(s);
}
```

#### Sentinel values
* A value that singals the end of user input
* __sentinel loop__: A loop that repeats until a sentinel value is seen

##### Example

```java
// The redundancy here is valid because we are also solving a fencepost problem
// Alternatively, you could move the repeated lines into another method
public static void sum() {
    int sum = 0;
    System.out.print("Enter an integer (-1 to quit): ");
    int number = console.nextInt();
    while (number != -1) {
        sum = sum + number;
        
        System.out.print("Enter an integer (-1 to quit): ");
        number = console.nextInt();
    }
}
```
### Boolean
* boolean is a type
* boolean variables can hold either `true` or `false`

### String
* Strings in Java are objects
* Strings can contain the same characters but not be equal because in Java they are stored as different objects (even though they have the same characters)
 * Because of this, you should use `.equals()` when comparing Strings and not `==`
    ```java
    // word1 and word2 are different objects
    String word1 = "hello";
    String word2 = "hello";

    // do not use!
    if (word1 == word2) {
       ...
    }

    // use this instead!
    if (word1.equals(word2)) {
       ...
    }

    // you could also have use this; it does the same as the one directly above
    if (word2.equals(word1)) {
       ...
    }
    ```

#### String test methods
_Note: These notes are repeated from [week4](../week4/lecture-notes.md) beacause they were discussed in more detail this week._

| __Methods__ | __Description__ |
| :--- | :--- |
| `str1.equals(str2)` | tests whether str1 contains the same characters as str2 |
| `str1.equalsIgnoreCase(str2)` | tests whether str1 contains the same characters as str2, ignoring case |
| `str1.startsWith(str2)` | tesets whether str1 starts with the characters in str2 |
| `str1.endsWith(str2)` | tests whether str1 ends with the characters in str2 |
| `str1.contains(str2)` | tests whether str2 is found inside of str1 |

### Random class
* A `Random` object generates pseudo-random numbers
* pseudo-random means simulated randomness, but not truly random
* In order to use the Random class you will need to import the util package: `import java.util.*;`

#### Random methods
| __Method Name__ | __Description__ |
| :--- | :--- |
| `nextInt()` | returns a random integer |
| `nextInt(max)` | returns a random integer in the range [0, max) (i.e., 0 to `max - 1` inclusdive) |
| `nextDouble()` | returns a random real number in the range [0.0, 1.0) |

#### Structure
_To get a number in an inclusive range of min to max_

```java
nextInt(max - min + 1) + min
```

#### Example code

```java
Random rand = new Random();
// randomNumber1 will store a random number in the range 0 – 9
int randomNumber1 = rand.nextInt(10);
// randomNumber2 will store a random number in the range 1 - 20
int randomNumber2 = rand.nextInt(20) + 1;
// randomNumber3 will store the first 5 even numbers (0, 2, 4, 6, 8)
int randomNumber3 = rand.nextInt(5) * 2;
```
