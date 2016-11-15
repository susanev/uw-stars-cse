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
| `indexOf(value)` | returns first index where given value is found
in list (-1 if not found) |
| `get(index)` | returns the value at given index |
| `remove(index)` | removes/returns value at given index, shifting subsequent values to the left |
| `set(index, value)` | replaces value at given index with given value |
| `size()` | returns the number of elements in list |
| `toString()` | returns a string representation of the list such as "[3, 42, -7, 15]" |

#### ArrayList vs Array

| Description | Array | ArrayList |
| :--- | :--- | :--- |
| construction | 'String[] names = new String[5];' | `ArrayList<String> list = new ArrayList<String>();` |
| storing a value | `names[0] = "Riley";` | `list.add("Riley");` |
| accessing a value | `String s = names[0];` | `String s = list.get(0);` |
| how many elements? | `names.length` | `list.size();` |

