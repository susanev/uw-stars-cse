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
 
 * _in place_ refers to solving an arary problem witout creating a new array, you are able to rearrange the array's elements in the original array

#### Array Mystery Problems
* Pay attention to the loop bounds, often they will not go until the length of an array
* You should reference the updated values of the array when evaluating the answer instead of the original array
* For extra practice with the array mystery problems check out the [practicum](https://olio.cs.washington.edu/csed/?lab=true&labNo=7)

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
  for (int i = 0; i < values.length; i++) {
    int temp = values[i];
    values[i] = values[values.length - 1 - i];
    values[values.length - 1 - i] = temp;
  }
}

