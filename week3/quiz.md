# Quiz
## Week 3

1. For each expression in the left-hand column, indicate its value in the right-hand column. List a constant of appropriate type (e.g., 7.0 for a double, true or false for a boolean, Strings in "" quotes).

  | __Expression__ | __Value__ |
  | :--- | :--- |
  | `4.5 / 3 / 2 + 1` | |
  | `57 % 10 / 3 + 1.25 * 4` | |	
  | ` 5 * 6 / 4 % 3 - 23 / (14 % 6)` | |	
  | `8 - 4 + "17" + 7.5 * 2` | |
  | `46 / 3 / 2.0 / 3 * 4/5` | |
  
2. Given the following program

  ```
  public class MysteryWho {
      public static void main(String[] args) {
          String whom = "her";
          String who = "him";
          String it = "who";
          String he = "it";
          String she = "whom";

          sentence(he, she, it);
          sentence(she, he, who);
          sentence(who, she, who);
          sentence(it, "stu", "boo");
          sentence(it, whom, who);
      }

      public static void sentence(String she, String who, String whom) {
          System.out.println(who + " and " + whom + " like " + she);
      }
  }
  ```

  Write the output of each of the following calls.
  
  ```
  sentence(he, she, it);	
  sentence(she, he, who);	
  sentence(who, she, who);	
  sentence(it, "stu", "boo");	
  sentence(it, whom, who);
  ```
3. Consider the following method.

  ```
  public static void ifElseMystery1(int x, int y) {
      int z = 4;
      if (z <= x) { 
          z = x + 1; 
      } else { 
          z = z + 9; 
      } 
      if (z <= y) { 
          y++; 
      } 
      System.out.println(z + " " + y); 
  }
  ```

  For each call below, indicate what output is produced.

  ```
  ifElseMystery1(3, 20);	
  ifElseMystery1(4, 5);	
  ifElseMystery1(5, 5);	
  ifElseMystery1(6, 10);
  ```
