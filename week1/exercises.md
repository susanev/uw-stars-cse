#Week1 Exercises

These exercises should be completed on the whiteboards by yourself, but feel free to help each other if that comes more naturally to you. Our goal though, is for everyone to be able to do these problems on their own.

1. What is the output of the program shown below. Record your process on the whiteboard
  ```
  public class Strange {
    public static void first() {
      System.out.println("Inside first method");
    }

    public static void second() {
      System.out.println("Inside second method");
      first();
    }

    public static void third() {
      System.out.println("Inside third method");
      first();
      second();
    }

    public static void main(String [] args) {
      first();
      third();
      second();
      third();
    }
  }
  ```

2. Write a program named __Egg__ that displays the output shown below.
```
  _______
 /       \
/         \
\         /
 \_______/

-"-'-"-'-"-
  _______
 /       \
/         \
\         /
 \_______/

-"-'-"-'-"- 
\         /
 \_______/
 ```
 
 
  

