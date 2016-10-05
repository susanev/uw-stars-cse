# Quiz
## Week 2

1. For each expression in the left-hand column, indicate its value in the right-hand column.  Be sure to list a constant of appropriate type (e.g., 7.0 rather than 7 for a double, Strings in quotes).

        | __Expression__ | __Value__ |
        | :--- | :--- |
        | '8 * 2 - 2 * 3' | ________________ |
        | '87 % 10 + 28 % 5 % 2' | ________________ |
        | '1 + 2 + "3" + 4 + 5 * 6' | ________________ |
        | ' 2 * 2.3 + 5 / 2 + 19 / 4 * 2.0' | ________________ |
        | '436 / 10 / 5 - 9 / 2 * 2.5 / 2' | ________________|

2. What are the values of first and second at the end of the following code? 

  ```
  int first = 8;
  int second = 19;
  first = first + second;
  second = first - second;
  first = first - second;
  ```

3. What is the output of the following sequence of loops?
  ```
  for(int i = 1; i <= 5; i++){
    for(int j = 1; j <= 10; j++){
      System.out.print((i * j) + " ");
    }
    System.out.println();
  }
  ```
  
4.  Consider the following program. what is the output produced by this program.

    ```
     public class Mystery {
         public static void main(String[] args) {
             String hear = "bad";
             String song = "good";
             String good = "hear";
             String walk = "talk";
             String talk = "feel";
             String feel = "walk";
    
             claim(feel, song, feel);
             claim(good, hear, song);
             claim(talk, "song", feel);
             claim(talk, "bad", walk);
         }
    
         public static void claim(String hear, String good, String song) {
             System.out.println("to " + hear + " the " + song + " is " + good);
         }
     }
     ```
