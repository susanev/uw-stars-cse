# Lecture Notes
## Week 8

### Value Semantics
* Value semantics are used with primite types in Java (e.g., int, char, boolean)
* If you set a variable equal to another it takes on that new value, but does not constantly update so those variables always have the same values

#### Code Examples

```java
int x = 3;
int y = 4;
int z = x;
z = 42; // z is set to 42, but x does not update to also be 42 (x is still 3)
```

```java
// a code snippet to swap to int values
Scanner console = new Scanner(System.in);
int x = console.nextInt();
int y = console.nextInt();
int temp = x; // needed so we still have the value of x after setting x to be the value in y
x = y;
y = temp;
```

### Arrays
* If you know the values of an array you want to define, you can use the array initializer syntax (e.g., `{2, 3, 5, 7, 11, 13, 17};`)
* `main` is being passed an array of Strings (named `args`), (.i.e, `main(String[] args)`)
* Arrays are objects, they behave different from prmitive types (e.g., int, char, boolean)
* Every object in Java has a special method named `toString()` that defines how that object should be converted into a `String`
 * The defult `toString()` method for arrays is to print the memory address of the array
 * Instead, you can use the `toString` method of the Arrays class to print your array (e.g., `Arrays.toString(name)` where _name_ is the name of the array you are printing
* Arrays use reference semantics (to contrast, the primitive types use value semantics)
 * We use references to where it is stored in memory, not the actual values
 
 ```java
 int[] values = {1, 2, 3};
 int[] values2 = values; // values and values2 point to the same array in memory
 values[0] = 7; // changes both the first value of values, and the first value of values2 to 7
 ```
 
 * Because of this fact, you do not need to return an array from a method to get its updated values, since both arrays refer to the same array in memory there is no reason to return the aray
 
 ```java
 int[] values = {4, 5, 6};
 triple(values);
 // values will now contain 12, 15, 18

 public static void triple(int [] values) {
    for (int i = 0; i < values.length; i++) {
       values[i] = values[i] * 3;
    }
 }
 ```
 
* _in place_ refers to solving an array problem witout creating a new array, you are able to rearrange the array's elements in the original array

#### Array Mystery Problems
* Pay attention to the loop bounds, often they will not go until the length of an array
* You should reference the updated values of the array when evaluating the answer instead of the original array
* For extra practice with the array mystery problems check out the [practicum](https://olio.cs.washington.edu/csed/?lab=true&labNo=7)

#### Methods of the `Arrays` class

| Method Name | Description |
| :--- | :--- |
| `binarySearch(array, value)` | returns the index of the given value in a sorted array (< 0 if not found) |
| `equals(array1, array2)` | returns `true` if the two arrays contain the same elements in the same order |
| `fill(array, value)` | sets every element in the array to have the given value |
| `sort(array)` | arranges the elements in the array into ascending order |
| `toString(array)` | returns a String representing the array |

#### Code Examples

```java
// return the sum of an array if integers
public static int sum(int[] values) {
  int sum = 0;
  for (int i = 0; i < values.length; i++) {
    sum += values[i];
  }
  return sum;
}
```

```java
// print the values of an array
int[] primes = {2, 3, 5, 7, 11, 13, 17};
System.out.println(Arrays.toString(primes));
```

```java
// reverse the elements of an array
public static void reverse(int[] values) {
  for (int i = 0; i < values.length / 2; i++) {
    int temp = values[i];
    values[i] = values[values.length - 1 - i];
    values[values.length - 1 - i] = temp;
  }
}
```

```java
// apply Math.abs to all elements of an array
public static void applyAbs(int[] values) {
  for (int i = 0; i < values.length; i++) {
    values[i] = Math.abs(values[i]);
  }
}
```

```java
// convert a String into an array of ints
public static int[] toIntArray(String line) {
  int[] result = new int[line.length];
  for (int i = 0; i < line.length; i++) {
    int[i] = Integer.parseInt("" + line.charAt(i));
  }
  return result;
}
```

### Strings

#### Code Examples

```java
public static String reverse(String text) {
  String output = "";
  for (int i = 0; i < text.length(); i++) {
    output = text.charAt(i) + output;
  }
  return output;
}
```

### Writing to Output Files
* Requires creation of a `PrintStream` object
* `PrintStream` is an object in the `java.io` package that lets you print output to a destination (e.g., a file)
* All the methods you have been using for `System.out` can also be used on `PrintStream` objects
* Important `PrintStream` details
  * If a a given file does not exist, then it will be created for you
  * If a given file already exists, then it will be overwritten
  * The output you print will no longer appear on the console (it will be written to the file instead)
  * Do not open the same file for both reading and writing at the same time

#### Code Example

```java
PrintStream output = new PrintStream(new File("output.txt"));
output.println("hello world");
```

### Object Oriented Programming (OOP)
* OOP: programs that perform their behaviour as interactions between objects
* Objects group together related variables
* An object is an entity that combines state and behaviour
  * An object is a blueprint for a new data type
  * An object is not executable
* A created object (using the new keyword) is an instance of a class
* A client program, is a program that uses objects (you have already been writing client programs)

#### Fields
* __Field__: A variable inside an object that is part of its state
  * Each object has its own copy of each field
* Clients can access and modify an object's field
  * To access use `<variable>.<field>`
  * To modify use `<variable>.<field> = <value>`
  
  ```java
  // An example of a client accessing and modifying the fileds of a class
  Point p1 = new Point();
  System.out.println(p1.x);
  p2.y = 13;
  ```

#### Behaviour
* Objects can tie related data and behaviour together
* __Instance method__: A method inside an object that operates on that object
* __Implicit parameter__: The object on which an instance method is called; can be referred to with the `this` keyword
* __Accessor__: An instance method that provides information about the state of an object; giving clients "read only" access to the object's fields
* __Mutator__: An instance method that modifies the object's internal state; giving clients both read and write access 

#### Code Example

```java
// point class
public class Point {
  int x;
  int y;
  
  public void translate(int dx, int dy) {
    x = x + dx;
    y = y + dy;
  }
  
  public double distanceFromOrigin() {
    return Math.sqrt(x * x, y * y);
  }
}
```

```java
// client code
public class PointClient {
  public static void main (String[] args) {
    Point p1 = new Point();
    p1.x = 3;
    p1.y = 5;
    p1.translate(2, -2);
    System.out.println(p1.distanceFromOrigin());
    
    Point p2 = new Point();
    p2.x = 12;
    p2.y = 4;
    p2.translate(0, 3);
    System.out.println(p2.distanceFromOrigin());
  }
}
```
