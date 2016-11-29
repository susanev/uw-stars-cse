# Lecture Notes
## Week 10

### Critters
* Be prepared to spend 5+ hours reading and understanding the assignment (with 1+ hours actually programming)
* The writeup defines four classes you should define, along with constructor and method details. You will need to determine what fields you need to define.
  * All fields you define should be private (Note: your code will compile and work if they are not private, but you will lose points!)
* Start runs the simulation
* Step takes one step into the simulation and allows you to test whether things are working correctly
* When testing your classes, use the paragraph descriptions in the writeup that describe what it should look like when you run a simulation
* When starting your classes it is suggested that you copy and start with the FlyTrap class so you have a good base, then make changes to change it into one of the new classes

### ArrayList

#### Constructing
* When constructing an `ArrayList` you must specify the type of elements it will contain
  * This type is called a _type parameter_ or a generic class
* You will need to use Wrapper classes when storing `int`, `double`, `char`, and `boolean`
  * A wrapper is an object whose sole purpose is to hold primitive value
  * Once you construct the list, use it with primitives as normal

  | Primitive Type | Wrapper Type |
  | :--- | :--- |
  | `int` | `Integer` |
  | `double` | `Double` |
  | `char` | `Character` |
  | `boolean` | `Boolean` |

##### Structure

```
ArrayList<Type> name = new ArrayList<Type>();
```

##### Example Code

```java
ArrayList<String> names = new ArrayList<String>();
names.add("susan evans");
names.add("peewee russell");
```

#### ArrayList Methods

| Method | Description |
| :--- | :--- |
| `add(value)` | appends value at end of list |
| `add(index, value)` | inserts given value just before the given index, shifting subsequent values to the right |
| `clear()` | removes all elements of the list |
| `indexOf(value)` | returns first index where given value is found in list (-1 if not found) |
| `get(index)` | returns the value at given index |
| `remove(index)` | removes/returns value at given index, shifting subsequent values to the left |
| `set(index, value)` | replaces value at given index with given value |
| `size()` | returns the number of elements in list |
| `toString()` | returns a string representation of the list such as `[3, 42, -7, 15]` |

#### ArrayList vs Array

| Description | Array | ArrayList |
| :--- | :--- | :--- |
| construction | `String[] names = new String[5];` | `ArrayList<String> list = new ArrayList<String>();` |
| storing a value | `names[0] = "Riley";` | `list.add("Riley");` |
| replace a value at an index | `names[i] = "Riley";` | `list.set("Riley", i)` |
| accessing a value | `String s = names[0];` | `String s = list.get(0);` |
| how many elements? | `names.length` | `list.size();` |

#### Code Examples

```java
// replaces every value in the list with two of that value
public static void stutter(ArrayList<String> list) {
  for (int i = 0; i < list.size(); i += 2) {
    String next = list.get(i);
    list.add(i, next);
  }
}
```

```java
// moves the minimum value to the front of the given list, otherwise preserving the order of the elements
public static void minToFront(ArrayList<Integer> list) {
  int min = 0;
  for (int i = 1; i < list.size(); i++) {
    if (list.get(i) < list.get(min)) {
      min = i;
    }
  }
  list.add(0, list.remove(min));
}
```

```java
// returns the length of the longest String in the given list
public static int maxLength(ArrayList<String> list) {
    int max = 0;
    for (int i = 0; i < list.size(); i++) {
        String s = list.get(i);
        if (s.length() > max) {
            max = s.length();
        }
    }
    return max;
}
```

```java
// removes from the list all strings of even length
public static void removeEvenLength(ArrayList<String> list) {
    int i = 0;
    while (i < list.size()) {
        String s = list.get(i);
        if (s.length() % 2 == 0) {
            list.remove(i);
        } else {
            i++;
        }
    }
}
```

### Inheritance
* __is-a relationship__: A hierarchical connection where one category can be treated as a specialized version of another
* __inheritance hierarchy__: A set of classes connected by is-a relationships that can share common code
* __inheritance__: A way to form new classes based on existing classes, taking on their attributes/behaviour
  * a way to group related classes
  * a way to share code between two or more classes
  * one class can extend another, absorbing its data/behaviour
* __superclass__: The parent class that is being extended
* __subclass__: The child class that extends that superclass and inherits its behaviour
* __override__: To write a new version of a method in a subclass that replaces the superclass's version
* Multiple levels of inheritance in a hierarchy are allowed
* __polymorphism__: Ability for the same code to be used with different types of objects and behave differently with each
* Note: In Stuart's version of CSE 142 you are not required to understand how to use `super.`, he will cover this in CSE 143
* All classes except for `Object` extend `Object`; you don't have to code it, Java automatically adds it in

#### Syntax

```
public class name extends superclass {
  ...
}
```

#### Example Code

```java
 public class Secretary extends Employee {
  ...
}
```

#### Test Taking Hints
* Draw the hierarchy first
* Make and fill in an inheritance table
  
  | Class | `toString()` | `method1()` | `method2()` |
  | :--- | :--- | :--- | :--- |
  | Class1 | | | |
  | Class2 | | | |
  | Class3 | | | |
  | Class4 | | | |
* But! Your table is not your answer, you need to write the output for the answer (do not label anything, you will lose points)
  * Usually the test will tell you to write it in columns
* Put a box around your final answer

