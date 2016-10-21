# Midterm Cheat Sheet

_You will be provided a cheat sheet with the information below on your midterm. If you are interested in the actual format of the document, check out [last year's version](https://courses.cs.washington.edu/courses/cse142/15au/handouts/09.html)._

```java
for (initialization; test; update) {
  statement(s);
}
```

```java
if (test) {
  statement(s);
} else if (test) {
  statement(s);
} else {
  statement(s);
}
```

```java
public static void name(parameters) {
  statement(s);
}
```

```java
public static type name(parameters) {
  statement(s);
  ...
  return expression;
}
```

```java
Scanner console = new Scanner(System.in);
Random r = new Random();
```

| __Math Method__ | __Description__ |
| :--- | :--- |
| `Math.abs(value)` | absolute value |
| `Math.min(v1, v2)` | smaller of two values |
| `Math.max(v1, v2)` | larger of two values |
| `Math.round(value)` | nearest whole number |
| `Math.sqrt(value)` | square root |
| `Math.pow(b, e)` | base to the exponent power |

| __Scanner Method__ | __Description__ |
| :--- | :--- |
| `nextInt()` | reads/returns input as `int` |
| `nextDouble()` | reads/returns input as `double` |
| `next()` | reads/returns input as `String` |

| __Random Method__ | __Description__ |
| :--- | :--- |
| `nextInt(max)` | random integer from 0 to `max-1` |

|__String Method__ | __Description__ |
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


