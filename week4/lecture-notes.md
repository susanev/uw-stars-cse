# Lecture Notes
## Week 4

_More coming soon ..._

### Definitions
* token: A sequence of characters that are not white space (e.g., tabs, spaces, etc)

### User input

* We will be using `Scanner` for user input
* In order to use `Scanner` you need to add an import statement to the top of your code: `import java.util.*;`
* In main, you will use `Scanner console = new Scanner(System.in);` to create a Scanner object named console that you can pass to any of your methods that need user input
 * Note: The `console` name is arbitrary, if it makes sense use a different name

#### Scanner methods

| __Method__ | __Description__ |
| :--- | :--- |
| `nextInt()` | reads a token of user input as an `int`; can only read ints, otherwise error |
| `nextDouble()` | reads a token of user input as a `double`; can read doubles and ints (converts to double) |
| `next()` | reads a token of user input as a `String` |
| `nextLine()` | reads a line of user input as a `String`; will include white space characters |

#### Sample code

```java
System.out.print("How olde are you? ");
int age = console.nextInt();
System.out.println("You'll be 40 in " + (40 - age) + " years.");
```

### Relational operators
| __Operator__ | __Meaning__ | __Example__ | __Result__ |
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

