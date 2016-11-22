# Lecture Notes
## Week 9

### Definitions
__Implicit__: Something that is called or returned automatically without you having to state it

__Explicit__: Something that you call or return by specifically stating it

### toString()
* By convention, when you print an object Java will always call the `toString()` method of that class
  * This is because every single object inherits from the `Object` class in Java, and within that `Object` class there is a `toString()` method
* By default, Java includes a `toString()` method that returns a String containing the memory address of that object
* You can override the `toString()` method to customize the String that it returns

#### Example Code

```java
public class Point {
  private int x;
  private int y;

  pubic Point(int initialX, int initialY) {
    x = initialX;
    y = initialY;
  }

  public String toString() {
    return "(" + x + ", " + y + ")";
  }
}
```

```java
// same as above, but uses this
public class Point {
  private int x;
  private int y;

  pubic Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public String toString() {
    return "(" + x + ", " + y + ")";
  }
}
```

### Initializing Objects

Last week, if we wanted to create an object it required 3 lines
  
  ```java
  Point p = new Point();
  p.x = 3;
  p.y = 8;
  ```

Instead, we can define a constructor that allows you to pass in values as parameters when creating an object.

  ```java
  Point p = new Point(3, 8);
  ```

### Constructors
* The constructor's name needs to be the same as the name of the class itself
* Initializes the state of new objects
* Runs when the client uses the `new` keyword
* Does not specify a return type
* Implicitly returns the new object that was created
* Every class needs a constructor, but if you do not define a constructor then Java gives it a default constructor with no parameters and sets all fields to zero
* A class can have multiple constructors, but they each have to have a unique set of parameters
  * If you do have multiple constructors it is possible for one constructor to call another constructor

#### Structure

```
public type(parameters) {
  statements;
}
```

#### Example Code

```java
public class Point {
  int x;
  int y;

  // constructor
  pubic Point(int initialX, int initialY) {
    x = initialX;
    y = initialY;
  }
}
```

### Encapsulation
* Hiding implementation details of an object from its clients
* Implemented with the `private` keyword before fields; which stops code outside of the class from being able to access it
* If you then want to give access, you add an accessor and mutator method
* Encapsulation provides abstraction between an object and its clients
* Encapsulation protects objects from unwanted access by clients
* Every field for the final two assignments in CSE 142 should be declared to be private as shown in the example below.

#### Example Code

```java
public class Point {
  private int x;
  private int y;

  pubic Point(int initialX, int initialY) {
    x = initialX;
    y = initialY;
  }

  public int getX() {
    return x;
  }

  public void setX(int newX) {
    x = newX;
  }
}
```
### Java8 Material
_You are not required to know this .. just some extra fun. Note: You are not allowed to use any of this on the homeworks or the final exam._

#### for each loop


```java
// prints the numbers in the array each on its own line
int[] numbers = {3, 4, 7};
for (int n : numbers) {
  System.out.println(n);
}
```

#### Anonymous Functions

```java
// print all the numbers
int[] numbers = {3, 4, 7};
Arrays.stream(numbers)
  .forEach(n -> System.out.print(" " + n));
System.out.println();
```

```java
// print the even numbers
int[] numbers = {3, 4, 7, 8};
Arrays.stream(numbers)
  .filter(n -> n % 2 == 0)
  .forEach(n -> System.out.print(" " + n));
System.out.println();
```

```java
// print the sorted even numbers
int[] numbers = {10, 3, 4, 7, 8};
Arrays.stream(numbers)
  .filter(n -> n % 2 == 0)
  .sorted()
  .forEach(n -> System.out.print(" " + n));
System.out.println();
```

```java
// print the distinct sorted even numbers
int[] numbers = {10, 3, 2, 2, 4, 7, 8};
Arrays.stream(numbers)
  .filter(n -> n % 2 == 0)
  .sorted()
  .distinct()
  .forEach(n -> System.out.print(" " + n));
System.out.println();
```

```java
// print the squares of the distinct sorted even numbers
int[] numbers = {10, 3, 2, 2, 4, 7, 8};
Arrays.stream(numbers)
  .filter(n -> n % 2 == 0)
  .sorted()
  .distinct()
  .map(n -> n * n)
  .forEach(n -> System.out.print(" " + n));
System.out.println();
```

```java
// store the sum of the squares of the distinct sorted even numbers
int[] numbers = {10, 3, 2, 2, 4, 7, 8};
int sum = Arrays.stream(numbers)
  .filter(n -> n % 2 == 0)
  .sorted()
  .distinct()
  .map(n -> n * n)
  .reduce(0, (a, b) -> a + b);
System.out.printf("sum %d", sum);
```

```java
// same as directly above, but uses sum()
int[] numbers = {10, 3, 2, 2, 4, 7, 8};
int sum = Arrays.stream(numbers)
  .filter(n -> n % 2 == 0)
  .sorted()
  .distinct()
  .map(n -> n * n)
  .sum();
System.out.printf("sum %d", sum);
```

```java
public static boolean isPrime(int n) {
  return IntStream.range(1, n + 1)
    .filter(x -> n % x == 0)
    .count() == 2
}
```

```java
// note that printSum adds all prime numbers in the range
printSum(IntStream.range(1, 20001).parallel());
```
