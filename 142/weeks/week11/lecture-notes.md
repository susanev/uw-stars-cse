# Lecture Notes
## Week 11

### Final Exam Tips
* You do not need to know how to use `super.` on Reges' version of the final
* You are only allowed to use ArrayList on the ArrayList question, and you have to use an ArrayList on that question
* Critters is the only question where you will have to build a class with instance variables and instance methods
  * The Critters question will be graded on style

### Example Code

```java
// isSorted takes an array of integers and returns true if the integers appear in sorted (nondecreasing) order
public static boolean isSorted(int[] list) {
  for (int i = 0; i < list.length - 1; i++) {
    if (list[i] > list[i + 1]) {
      return false;
    }
  }
  return true;
}
```

```java
// rotateLeft takes an array of integers and returns all values to the left by one position
// rotating the first to the back.
public static void rotateLeft(int[] list) {
  if (list.length > 0) {
    int temp = list[0];
    for(int i = 1; i < list.length; i++) {
      list[i - 1] = list[i];
    }
    list[list.length - 1] = temp;
  }
}
```

```java
// another version of rotateLeft
public static void rotateLeft(int[] list) {
  if (list.length > 0) {
    int curr = list[list.length - 1];
    for(int i = list.length - 2; i > -1; i--) {
      int temp = list[i];
      list[i] = curr;
      curr = temp;
    }
    list[list.length -1] = curr;
  }
}
```

```java
// interleave takes two arrays of integers and returns a new array
// that contains the result of interleaving the elements of the two arrays
public static int[] interleave(int[] a1, int[] a2) {
  int bounds = Math.min(a1.length, a2.length);
  int[] result = new int[bounds * 2];
  int index = 0;
  for (int i = 0; i < bounds; i++) {
    result[index++] = a1[i];
    result[index++] = a2[i];
  }
  return result;
}
```