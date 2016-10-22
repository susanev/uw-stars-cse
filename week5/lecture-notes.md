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
