# Programming (Hard) Answers
## Midterm Study Session

1. Below is one possible solution; but please note there are many correct solutions to this problem.

```java
public static boolean sameDashes(String str1, String str2) {
    for (int i = 0; i < str1.length(); i++) {
        if (str1.charAt(i) == '-') {
            if (i > str2.length() || str2.charAt(i) != '-') {
                return false;
            }
        }
    }
    for (int i = 0; i < str2.length(); i++) {
        if (str2.charAt(i) == '-') {
            if (i > str1.length() || str1.charAt(i) != '-') {
                return false;
            }
        }
    }
    return true;
}
```

2. Below are two possible solutions; but please note there are many correct solutions to this problem.

  ```java
   public static void printStripped(String s) {
      boolean inComment = false;
      for (int i = 0; i < s.length(); i++) {
          char next = s.charAt(i);
          if (next == '<') {
              inComment = true;
          } else if (inComment && next == '>') {
              inComment = false;
          } else if (!inComment) {
              System.out.print(next);
          }
      }
      System.out.println();
  }
  ```

  ```java
  public static void printStripped(String s) {
      int start = s.indexOf('<');
      while (start != -1) {
          int stop = s.indexOf('>', start + 1);
          s = s.substring(0, start) + s.substring(stop + 1);
          start = s.indexOf('<');
      }
      System.out.println(s);
  }
  ```

