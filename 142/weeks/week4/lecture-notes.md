_CSE 142_
# Lecture Notes
## Week 4

### User input

* We will be using `Scanner` for user input
* In order to use `Scanner` you need to add an import statement to the top of your code: `import java.util.*;`
* In main, you will use `Scanner console = new Scanner(System.in);` to create a Scanner object named console that you can pass to any of your methods that need user input
 * Note: The `console` name is arbitrary, if it makes sense use a different name
 * Note: You should only ever construct 1 Scanner object and pass it in as a parameter to only the methods that need it
* __token__: A sequence of characters that are not white space (e.g., tabs, spaces, etc)

#### Scanner methods

| __Method__ | __Description__ |
| :--- | :--- |
| `nextInt()` | reads a token of user input as an `int`; can only read ints, otherwise error |
| `nextDouble()` | reads a token of user input as a `double`; can read doubles and ints (converts to double) |
| `next()` | reads a token of user input as a `String` |
| `nextLine()` | reads a line of user input as a `String`; will include white space characters |

#### Sample code

```java
Scanner console = new Scanner(System.in);
System.out.print("How olde are you? ");
int age = console.nextInt();
System.out.println("You'll be 40 in " + (40 - age) + " years.");
```

### Relational operators
| __Operator__ | __Description__ | __Example__ | __Result__ |
| :--- | :--- | :--- | :--- |
| `==` | equals | `1 + 1 == 2` | `true` |
| `!=` | does not equal | `3.2 != 2.5` | `true` |
| `<` | less than | `10 < 5` | `false` |
| `>` | greater than | `10 > 5` | `true` |
| `<=` | less than or equal to | `126 <= 100` | `false` |
| `>=` | greater than or equal to | `5.0 >= 5.0` | `true` |
 
### Logical operators
| __Operator__ | __Description__ | __Example__ | __Result__ |
| :--- | :--- | :--- | :--- |
| `&&` | and | `(2 == 3) && (-1 < 5)` | `false`|
| `||` | or | `(2 == 3) || (-1 < 5)` | `true` |
| `!` | not | `!(2 == 3)` | `true` |

| __p__ | __q__ | __p && q__ | __p &#124;&#124; q__ |
| :--- | :--- | :--- | :--- |
| `true` | `true` | `true` | `true` |
| `true` | `false` | `false` | `true` |
| `false` | `true` | `false` | `true` |
| `false` | `false` | `false` | `false` |

| __p__ | __!p__ |
| :--- | :--- |
| `true` | `false` |
| `false` | `true` |

### Common Algorithms
_These are extremely common patterns in programming, super important to know!_

#### Cumulative Sum

```java
// returns the sum of integers from 1 up to n
public static int calculateSum(int n) {
   int sum = 0;
   for (int i = 1; i <= n; i++) {
     sum = sum + i;
   }
   return sum;
}
```

#### Max

```java
public static int findMax(Scanner console, int n) {
    int max = 0
    
    System.out.print("How many numbers? ");
    int nums = console.nextInt();
    
    for (int i = 0; i < nums; i++) {
        System.out.print("Enter an integer: ");
        int num = console.nextInt();
        
        if (num > max) {
            max = num;
        }
    }
}
```

#### Even or Odd

```java
public static void evenOrOdd(int n) {
    if (n % 2 == 0) {
        System.out.println(n + " is even.");
    } else {
        System.out.println(n + " is odd.");
    }
}
```

#### Replicate

```java
// returns a String containing n replications of s
public static String replicate(String s, int n) {
    String output = "";
    for (int i = 0; i < n; i++) {
      output = output + s;
    }
    return output;
}
```
#### Reverse String

```java
public static String reverse(String phrase) {
    String output = "";
    for (int i = 0; i < phrase.length(); i++) {
        output = phrase.charAt(i) + output;
    }
    return output;
}
```

### Conditionals
* `else` can only be used when paired with an if

#### Structure

```java
// independent tests; not exclusive
// 0, 1, or many of the statement(s) may execute
// every test in every if block is checked
if (test) {
    statement(s);
}
if (test) {
    statement(s);
}
if (test) }
    statement(s);
}
```

```java
// 0, or 1 of the if blocks may execute
// at most only 1 of the if blocks execute
// it could be the case that 0 if blocks execute because their is no else
if (test) {
    statement(s);
} else if (test) {
    statement(s);
} else if (test) {
    statement(s);
}
```

```java
// mutually exclusive
// exactly 1 of the if blocks will execute
if (test) {
    statement(s);
} else if (test) {
    statement(s);
} else {
    statement(s);
}
```
### Rounding
_If you want to round to 1 digit after the decimal use the below code, adjust the 10.0 to other multiples of 10 for different number of places after the decimal._

```java
// Note: This 1 line method is okay because it does a computation
public static double round(double n) {
    return Math.round(n * 10.0) / 10.0;
}
```

### Chaining
Chaining is bad and you will use points if you do it. It is the practice of calling methods which call other methods which call other methods and they rarely or never return a value back to the caller. Instead you should try and structure your code so that methods return back to their callers. 

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
| __Methods__ | __Description__ |
| :--- | :--- |
| `str1.equals(str2)` | tests whether str1 contains the same characters as str2 |
| `str1.equalsIgnoreCase(str2)` | tests whether str1 contains the same characters as str2, ignoring case |
| `str1.startsWith(str2)` | tesets whether str1 starts with the characters in str2 |
| `str1.endsWith(str2)` | tests whether str1 ends with the characters in str2 |
| `str1.contains(str2)` | tests whether str2 is found inside of str1 |

### Using printf
* The f in `printf` stands for formatted
* Allows you to format what you are printing

#### General structure

```java
System.out.printf(<format string>, <parameter>, ..., <parameter>);
```

#### Example

```java
int x = 38;
int y = 152;
// the below line will output: location: (38, 152)
System.out.printf("location: (%d, %d)\n", x, y); 
```

#### Common Format Specifiers
| __Specifier__ | __Result__ |
| :--- | :--- |
| `%d` | Integer |
| `%8d` | Integer, right-aligned, 8-space-wide field |
| `%6d` | Integer, left-aligned, 6-space-wide field |
| `%f` | Floating-point number |
| `%12f` | Floating-point number, right-aligned, 12-space-wide field |
| `%.2f` | Floating-point number, rounded to nearest hundredth |
| `%16.3f` | Floating-point number, rounded to nearest thousandth, 16-space-wide field |
| `%s` | String |
| `%8s` | String, right-aligned, 8-space-wide field |
| `%9s` | String, left-aligned, 9-space-wide field |


