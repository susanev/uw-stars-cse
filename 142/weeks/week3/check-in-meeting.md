# Check-in Meeting
## Week 3

### Expressions
1. `8 + 6 * -2 + 4 + "0" + (2 + 5)`
2. `1 + 1 + "8 - 2" + (8 - 2) + 1 + 1`

### Parameter Mystery
1. Given the code below, what will the output be?
  ```java
  public class MysteryTouch {
    public static void main(String [] args) {
      String head = "shoulders";
      String knees = "toes";
      String elbow = "head";
      String eye = "eyes and ears";
      String ear = "eye";

      touch(ear, elbow);
      touch(head, "elbow");
      touch(head, "knees " + knees);
   }

   public static void touch(String elbow, String ear) {
      System.out.println("touch your " + elbow + " to your " + ear);
   }
  ```

2. Given the code below, what will the output be?
  ```java
  public class MysteryTouch {
    public static void main(String [] args) {
      String head = "shoulders";
      String knees = "toes";
      String elbow = "head";
      String eye = "eyes and ears";
      String ear = "eye";

      touch(elbow, ear);
      touch(knees, "Toes");
      touch(eye, eye);
   }

   public static void touch(String elbow, String ear) {
      System.out.println("touch your " + elbow + " to your " + ear);
   }
```

### Programming
1. Write a method named __lastDigit__ that returns the last digit of an integer. For example, lastDigit(3572) should return 2. It should work for negative numbers as well. For example, lastDigit(-947) should return 7.

2. Write a method called __printPowersOfN__ that accepts a base and an exponent as arguments and prints each power of the base from base0 (1) up to that maximum power, inclusive. For example, consider the following calls:
  ```java
  printPowersOfN(4, 3);
  printPowersOfN(5, 6);
  printPowersOfN(-2, 8);
  ```
  These calls should produce the following output:
  ```java
  1 4 16 64
  1 5 25 125 625 3125 15625
  1 -2 4 -8 16 -32 64 -128 256
  ```
