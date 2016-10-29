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

3. Below are three possible solutions; but please note there are many correct solutions to this problem.

    ```java
    public static void randomRects() {
        Random r = new Random();
        int last = 100; // can also be 0
        int count = 0;
        while (count < 4) {
            int w = r.nextInt(10) + 1;
            int h = r.nextInt(10) + 1;

            System.out.println("w: " + w + ", h: " + h + ", area: " + w * h);
            if (last < w * h) {
                count++;
            } else {
                count = 1; // need to count first rect in sequence
            }
            last = w * h;
        }
        System.out.println("Four rectangles of increasing area.");
    }
    ```
    
    ```java
    public static void randomRects() {
        Random r = new Random();
        int a1 = 0, a2 = 0, a3 = 0, a4 = 0;
        while (a1 == 0 || a1 >= a2 || a2 >= a3 || a3 >= a4) {
            int w = r.nextInt(10) + 1;
            int h = r.nextInt(10) + 1;
            a1 = a2;
            a2 = a3;
            a3 = a4;
            a4 = w * h;
            System.out.println("w: " + w + ", h: " + h + ", area: " + a4);
        }
        System.out.println("Four rectangles of increasing area.");
    }
    ```
    
    ```java
    public static void randomRects() {
        Random r = new Random();
        int area = 0;
        int last = 0;
        int count = 0;
        while (count != 4) {
            int w = r.nextInt(10) + 1;
            int h = r.nextInt(10) + 1;
            area = w * h;
            if (area <= last) {
                count = 1;
            } else {
                count++;
            }
            System.out.println("w: " + w + ", h: " + h + ", area: " + area);
            last = area;
        }
        System.out.println("Four rectangles of increasing area.");
    } 
    ```

4. Below are two possible solutions; but please note there are many correct solutions to this problem.

    ```java
    public static int countEvenDigits(int n) {
        int count = 0;
        while (n != 0) {
            int digit = n % 10;
            n = n / 10;
            if (digit % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    ```

    ```java
    public static int countEvenDigits(int n) {
        int count = 0;
        while (n > 0) {
            if (n % 2 == 0) {
                count++;
            }
            n = n / 10;
        }
        return count;
    } 
    ```

5. Below are two possible solutions; but please note there are many correct solutions to this problem.

    ```java
    public static void favoriteLetter(Scanner console, String letter) {
        System.out.println("Looking for two \"" + letter + "\" words in a row.");
        int count = 0;
        String word = "";
        while (count < 2) {
            System.out.print("Type a word: ");
            word = console.next();
            if (word.startsWith(letter)) {
                count++;
            } else {
                count = 0;
            }
        }
        System.out.println("\"" + letter + "\" is for \"" + word + "\"");
    }
    ```

    ```java
    public static void favoriteLetter(Scanner console, String letter) {
        System.out.println("Looking for two \"" + letter + "\" words in a row.");
        System.out.print("Type a word: ");
        String word1 = console.next();
        System.out.print("Type a word: ");
        String word2 = console.next();
        while (!(word1.startsWith(letter) && word2.startsWith(letter))) {
            word1 = word2;
            System.out.print("Type a word: ");
            word2 = console.next();
        }
        System.out.println("\"" + letter + "\" is for \"" + word2 + "\"");
    }
    ```

6. Below is one possible solution; but please note there are many correct solutions to this problem.

    ```java
    public static int digitRange(int n) {
        int min = n % 10;
        int max = n % 10;
        while (n > 0) {
            int digit = n % 10;
            n = n / 10;
            if (digit < min) {
                min = digit;
            }
            if (digit > max) {
                max = digit;
            }
        }
        return max - min;
    }
    ```
