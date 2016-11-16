# Final Cheat Sheet

_You will be provided a cheat sheet with the information below on your final. If you are interested in the actual format of the document, check out [last year's version](https://courses.cs.washington.edu/courses/cse142/15au/handouts/22.html)._

#### Construction Examples

```java
int[] data = new int[10];
Random r = new Random();
ArrayList<String>, ArrayList<Integer>
```

| __Math Method__ | __Description__ |
| :--- | :--- |
| `Math.abs(value)` | absolute value |
| `Math.min(v1, v2)` | smaller of two values |
| `Math.max(v1, v2)` | larger of two values |
| `Math.round(value)` | nearest whole number |
| `Math.pow(b, e)` | base to the exponent power |

| __Scanner Method__ | __Description__ |
| :--- | :--- |
| `nextInt()` | reads/returns token as `int` |
| `nextDouble()` | reads/returns token as `double` |
| `next()` | reads/returns token as `String` |
| `nextLine()` | reads/returns line as `String` |
| `hasNextInt()` | tests if reading an `int` will succeed |
| `hasNextDouble()` | tests if reading a `double` will succeed |
| `hasNext()` | tests if reading a token as a `String` will succeed |
| `hasNextLine()` | tests if reading a line as a `String` will succeed |


| __Random Method__ | __Description__ |
| :--- | :--- |
| `nextInt(max)` | random integer from 0 to `max-1` |

| __String Method__ | __Description__ |
| :--- | :--- |
| `contains(str)` | true if this string contains the other's characters inside it |
| `endsWith(str), startsWith(str)` | true if this string starts/ends with the other's characters
| `equals(str)` | true if this string is the same as str |
| `equalsIgnoreCase(str)` | true if this string is the same as str, ignoring capitalization |
| `indexOf(str)` | index in this string where given string begins (-1 if not found) |
| `length()` | number of characters in this string |
| `substring(i, j)` | characters in this string from index `i` (inclusive) to `j` (exclusive) |
| `substring(i)` | characters in this string from index `i` (inclusive) to end |
| `toLowerCase()`, `toUpperCase()` | a new string with all lowercase or uppercase letters |
| `charAt(i)` | returns `char` at index `i` |

| Arraylist Method | Description |
| :--- | :--- |
| `add(value)` | appends value at end of list |
| `add(index, value)` | inserts given value just before the given index, shifting subsequent values to the right |
| `get(index)` | returns the value at given index |
| `remove(index)` | removes/returns value at given index, shifting subsequent values to the left |
| `set(index, value)` | replaces value at given index with given value |
| `size()` | returns the number of elements in list |

#### Critter classes

```java
public class name extends Critter {
  // fields/constructor

  public Color getColor() {
      // statement(s) that return a Color (e.g., Color.RED, Color.BLUE, Color.GREEN)
  }

  public Action getMove(CritterInfo info) {
      // statement(s) that return Action.INFECT, Action.HOP, Action.RIGHT, or Action.LEFT
  }

  public String toString() {
      // statement(s) that return a String;
  }
}
```

| CritterInfo Method | Description |
| :--- | :--- |
| `getFront()`, `getBack()`, `getLeft()`, `getRight()` | returns one of `Neighbor.WALL`, `Neighbor.EMPTY`, `Neighbor.SAME`, `Neighbor.OTHER` |
| `getDirection()` | returns one of `Direction.NORTH`, `Direction.SOUTH`, `Direction.EAST`, `Direction.WEST` |
