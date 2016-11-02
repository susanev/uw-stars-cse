# Plan
## Week 6
* Outstanding questions?
* [Midterm Evaluation](midterm-evaluation.md)
* Weave walk-through
  ```java
  // weave(128,394); => 132984
  // weave(394,128); => 319248
  // weave(2384, 12); => 20308142
  // (weave(9, 318); => 30198
  public static int weave(int x, int y) {
    int weaved = 0;
    int place = 1;
    while (x != 0 || y != 0) {
       int digitX = x % 10;
       int digitY = y % 10;

       weaved = weaved + digitY * place;
       place = place * 10;
       weaved = weaved + digitX * place;
       place = place * 10;

       x = x / 10;
       y = y / 10;
    }

    return weaved;
  }
  ```
* Review midterm [study sheet](../midterm/study-sheet.md)
* [Quiz](quiz.md) (3 programming problems)
* Live whiteboard code of Quiz solutions
* Free time for midterm preparation
